package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.OutgoingCallTriggerReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p119k3.C7504g1;

public class OutgoingCallTrigger extends CallBasedTrigger {
    public static final Parcelable.Creator<OutgoingCallTrigger> CREATOR = new C5713a();
    private static OutgoingCallTriggerReceiver s_outgoingCallTriggerReceiver;
    private static int s_triggerCounter;
    private Contact m_outgoingCallTo;
    private List<Contact> m_outgoingCallToList;

    /* renamed from: com.arlosoft.macrodroid.triggers.OutgoingCallTrigger$a */
    class C5713a implements Parcelable.Creator<OutgoingCallTrigger> {
        C5713a() {
        }

        /* renamed from: a */
        public OutgoingCallTrigger createFromParcel(Parcel parcel) {
            return new OutgoingCallTrigger(parcel, (C5713a) null);
        }

        /* renamed from: b */
        public OutgoingCallTrigger[] newArray(int i) {
            return new OutgoingCallTrigger[i];
        }
    }

    /* synthetic */ OutgoingCallTrigger(Parcel parcel, C5713a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public void mo31015D3(Contact contact) {
        this.m_outgoingCallTo = contact;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            mo27827K0().unregisterReceiver(s_outgoingCallTriggerReceiver);
            s_outgoingCallTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7504g1.m31205u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_outgoingCallTriggerReceiver = new OutgoingCallTriggerReceiver();
            mo27827K0().registerReceiver(s_outgoingCallTriggerReceiver, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"));
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.PROCESS_OUTGOING_CALLS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: p3 */
    public Contact mo31016p3() {
        return this.m_outgoingCallTo;
    }

    /* renamed from: q3 */
    public List<Contact> mo31017q3() {
        if (this.m_outgoingCallTo != null) {
            ArrayList arrayList = new ArrayList();
            this.m_outgoingCallToList = arrayList;
            arrayList.add(this.m_outgoingCallTo);
        }
        return this.m_outgoingCallToList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_outgoingCallTo, i);
        Contact[] contactArr = new Contact[this.m_outgoingCallToList.size()];
        this.m_outgoingCallToList.toArray(contactArr);
        parcel.writeParcelableArray(contactArr, i);
    }

    public OutgoingCallTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public OutgoingCallTrigger() {
        this.m_outgoingCallToList = new ArrayList();
    }

    private OutgoingCallTrigger(Parcel parcel) {
        super(parcel);
        this.m_outgoingCallToList = new ArrayList();
        this.m_outgoingCallTo = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            this.m_outgoingCallToList = arrayList;
            Collections.addAll(arrayList, (Contact[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, Contact[].class));
        }
    }
}
