package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.CallEndedTriggerReceiver;
import com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p112j2.C7439d0;
import p119k3.C7539p;
import p136n3.C7972d;

public class CallEndedTrigger extends CallBasedTrigger {
    public static final Parcelable.Creator<CallEndedTrigger> CREATOR = new C5619a();
    private static final String PHONE_STATE_ACTION = "android.intent.action.PHONE_STATE";
    private static CallEndedTriggerReceiver s_endCallTriggerReceiver;
    private static C7972d s_incomingCallMonitor;
    private static OutgoingCallMonitor s_outgoingCallMonitor;
    private static int s_triggerCounter;
    private List<Contact> m_contactList;

    /* renamed from: com.arlosoft.macrodroid.triggers.CallEndedTrigger$a */
    class C5619a implements Parcelable.Creator<CallEndedTrigger> {
        C5619a() {
        }

        /* renamed from: a */
        public CallEndedTrigger createFromParcel(Parcel parcel) {
            return new CallEndedTrigger(parcel, (C5619a) null);
        }

        /* renamed from: b */
        public CallEndedTrigger[] newArray(int i) {
            return new CallEndedTrigger[i];
        }
    }

    /* synthetic */ CallEndedTrigger(Parcel parcel, C5619a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m21891H3() {
        Binder.clearCallingIdentity();
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(s_incomingCallMonitor, 32);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.trigger_call_ended), true, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D3 */
    public void mo31015D3(Contact contact) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* renamed from: S2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30885S2() {
        /*
            r5 = this;
            int r0 = s_triggerCounter
            r1 = 1
            int r0 = r0 - r1
            s_triggerCounter = r0
            if (r0 != 0) goto L_0x004d
            com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor r0 = s_outgoingCallMonitor     // Catch:{ Exception -> 0x0046 }
            if (r0 == 0) goto L_0x0015
            android.content.Context r0 = r5.mo27827K0()     // Catch:{ Exception -> 0x0046 }
            com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor r2 = s_outgoingCallMonitor     // Catch:{ Exception -> 0x0046 }
            r0.unregisterReceiver(r2)     // Catch:{ Exception -> 0x0046 }
        L_0x0015:
            n3.d r0 = s_incomingCallMonitor     // Catch:{ Exception -> 0x0046 }
            if (r0 == 0) goto L_0x003c
            android.content.Context r0 = r5.mo27827K0()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0046 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0046 }
            r2 = 0
            n3.d r3 = s_incomingCallMonitor     // Catch:{ SecurityException -> 0x002c }
            r0.listen(r3, r2)     // Catch:{ SecurityException -> 0x002c }
            goto L_0x003c
        L_0x002c:
            android.content.Context r0 = r5.mo27827K0()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            r4 = 2131955194(0x7f130dfa, float:1.9546909E38)
            java.lang.String r4 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r4)     // Catch:{ Exception -> 0x0046 }
            p112j2.C7439d0.m30909o0(r0, r3, r4, r1, r2)     // Catch:{ Exception -> 0x0046 }
        L_0x003c:
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0046 }
            com.arlosoft.macrodroid.triggers.receivers.CallEndedTriggerReceiver r1 = s_endCallTriggerReceiver     // Catch:{ Exception -> 0x0046 }
            r0.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)
        L_0x004a:
            r0 = 0
            s_endCallTriggerReceiver = r0
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.CallEndedTrigger.mo30885S2():void");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7539p.m31376u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        ArrayList arrayList = new ArrayList();
        for (Contact next : this.m_contactList) {
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
        this.m_contactList = arrayList;
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_endCallTriggerReceiver = new CallEndedTriggerReceiver();
            if (s_outgoingCallMonitor == null) {
                s_outgoingCallMonitor = new OutgoingCallMonitor();
            }
            if (s_incomingCallMonitor == null) {
                s_incomingCallMonitor = new C7972d();
            }
            IntentFilter intentFilter = new IntentFilter(PHONE_STATE_ACTION);
            intentFilter.setPriority(Integer.MAX_VALUE);
            MacroDroidApplication.m14845u().registerReceiver(s_endCallTriggerReceiver, intentFilter);
            mo27827K0().registerReceiver(s_outgoingCallMonitor, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"));
            new Handler(mo27827K0().getMainLooper()).post(new C6171w1(this));
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3 */
    public Contact mo31016p3() {
        return null;
    }

    /* renamed from: q3 */
    public List<Contact> mo31017q3() {
        if (this.m_contactList == null) {
            this.m_contactList = new ArrayList();
        }
        return this.m_contactList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Contact[] contactArr = new Contact[this.m_contactList.size()];
        this.m_contactList.toArray(contactArr);
        parcel.writeParcelableArray(contactArr, i);
    }

    public CallEndedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public CallEndedTrigger() {
        this.m_contactList = new ArrayList();
    }

    private CallEndedTrigger(Parcel parcel) {
        super(parcel);
        this.m_contactList = new ArrayList();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            this.m_contactList = arrayList;
            Collections.addAll(arrayList, (Contact[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, Contact[].class));
        }
    }
}
