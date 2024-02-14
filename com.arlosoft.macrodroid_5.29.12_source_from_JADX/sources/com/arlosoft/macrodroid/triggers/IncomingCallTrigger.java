package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p112j2.C7439d0;
import p119k3.C7534n0;
import p136n3.C7973e;

public class IncomingCallTrigger extends CallBasedTrigger {
    public static final Parcelable.Creator<IncomingCallTrigger> CREATOR = new C5661a();
    /* access modifiers changed from: private */
    public static C7973e sIncomingCallTriggerReceiver;
    private static int s_triggerCounter;
    private Contact m_incomingCallFrom;
    private List<Contact> m_incomingCallFromList;

    /* renamed from: com.arlosoft.macrodroid.triggers.IncomingCallTrigger$a */
    class C5661a implements Parcelable.Creator<IncomingCallTrigger> {
        C5661a() {
        }

        /* renamed from: a */
        public IncomingCallTrigger createFromParcel(Parcel parcel) {
            return new IncomingCallTrigger(parcel, (C5661a) null);
        }

        /* renamed from: b */
        public IncomingCallTrigger[] newArray(int i) {
            return new IncomingCallTrigger[i];
        }
    }

    /* synthetic */ IncomingCallTrigger(Parcel parcel, C5661a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m22344J3() {
        Binder.clearCallingIdentity();
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(sIncomingCallTriggerReceiver, 32);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.trigger_incoming_call), true, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public void mo31015D3(Contact contact) {
        this.m_incomingCallFrom = contact;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0 && sIncomingCallTriggerReceiver != null) {
            try {
                ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(sIncomingCallTriggerReceiver, 0);
            } catch (SecurityException unused) {
                C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.trigger_incoming_call), true, false);
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7534n0.m31351u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        this.m_incomingCallFrom = null;
        ArrayList arrayList = new ArrayList();
        for (Contact next : this.m_incomingCallFromList) {
            if (next.mo27709b().equals("-1")) {
                arrayList.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
            } else if (next.mo27709b().equals("-2")) {
                arrayList.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
            } else if (next.mo27709b().equals("-3")) {
                arrayList.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
            } else if (next.mo27709b().equals("-4")) {
                arrayList.add(0, new Contact("-4", C4061t1.f10627g, "-4"));
            }
        }
        this.m_incomingCallFromList = arrayList;
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (sIncomingCallTriggerReceiver == null) {
            try {
                sIncomingCallTriggerReceiver = new C7973e();
            } catch (Exception unused) {
                new Handler(mo27827K0().getMainLooper()).post(C6004m3.f14190a);
            }
        }
        if (s_triggerCounter == 0) {
            new Handler(mo27827K0().getMainLooper()).post(new C5992l3(this));
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: p3 */
    public Contact mo31016p3() {
        return this.m_incomingCallFrom;
    }

    /* renamed from: q3 */
    public List<Contact> mo31017q3() {
        if (this.m_incomingCallFrom != null) {
            ArrayList arrayList = new ArrayList();
            this.m_incomingCallFromList = arrayList;
            arrayList.add(this.m_incomingCallFrom);
        }
        return this.m_incomingCallFromList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_incomingCallFrom, i);
        Contact[] contactArr = new Contact[this.m_incomingCallFromList.size()];
        this.m_incomingCallFromList.toArray(contactArr);
        parcel.writeParcelableArray(contactArr, i);
    }

    public IncomingCallTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public IncomingCallTrigger() {
        this.m_incomingCallFromList = new ArrayList();
    }

    private IncomingCallTrigger(Parcel parcel) {
        super(parcel);
        this.m_incomingCallFromList = new ArrayList();
        this.m_incomingCallFrom = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            this.m_incomingCallFromList = arrayList;
            Collections.addAll(arrayList, (Contact[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, Contact[].class));
        }
    }
}
