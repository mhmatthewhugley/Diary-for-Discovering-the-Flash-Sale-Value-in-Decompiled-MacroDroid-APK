package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.CallBasedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseCallCheckerService extends IntentService {

    /* renamed from: a */
    private List<Contact> f14422a;

    public BaseCallCheckerService(String str) {
        super(str);
    }

    /* renamed from: b */
    private void m24077b(String str, CallBasedTrigger callBasedTrigger, Macro macro, List<Macro> list) {
        List<String> s3 = callBasedTrigger.mo31019s3();
        if (s3.size() > 0) {
            StringBuilder sb = new StringBuilder("(");
            for (int i = 0; i < s3.size(); i++) {
                sb.append(s3.get(i));
                if (i < s3.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            ContentResolver contentResolver = getContentResolver();
            Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"data1", "contact_id"}, "data1 IN " + sb.toString(), (String[]) null, (String) null);
            ArrayList<String> arrayList = new ArrayList<>();
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex("contact_id"));
                if (!arrayList.contains(string)) {
                    arrayList.add(string);
                }
            }
            query.close();
            for (String T : arrayList) {
                if (C4061t1.m16011p(str, C4061t1.m15974T(MacroDroidApplication.m14845u(), T)) && callBasedTrigger.mo31374R2()) {
                    macro.setTriggerThatInvoked(callBasedTrigger);
                    macro.setTriggerContextInfo(new TriggerContextInfo((Trigger) callBasedTrigger, str));
                    if (macro.canInvoke(macro.getTriggerContextInfo())) {
                        list.add(macro);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24078c(java.lang.String r8, com.arlosoft.macrodroid.triggers.CallBasedTrigger r9, com.arlosoft.macrodroid.macro.Macro r10, java.util.List<com.arlosoft.macrodroid.macro.Macro> r11) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r9.mo31020t3()
            r1 = 0
            java.lang.String r1 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r7, r0, r1, r10)
            boolean r2 = android.telephony.PhoneNumberUtils.compare(r1, r8)
            java.lang.String r3 = ", Incoming="
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0032
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Basic number compare match. Contact="
            r2.append(r6)
            r2.append(r0)
            r2.append(r3)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 != 0) goto L_0x005e
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r1 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r1, r5)
            boolean r2 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r8, r1, r5)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Regex number compare match. Regex="
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
            goto L_0x005f
        L_0x005e:
            r4 = r0
        L_0x005f:
            boolean r0 = r9.mo31018r3()
            if (r4 == r0) goto L_0x0083
            boolean r0 = r9.mo31374R2()
            if (r0 == 0) goto L_0x0083
            r10.setTriggerThatInvoked(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r9, (java.lang.String) r8)
            r10.setTriggerContextInfo(r0)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r10.getTriggerContextInfo()
            boolean r8 = r10.canInvoke(r8)
            if (r8 == 0) goto L_0x0083
            r11.add(r10)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.BaseCallCheckerService.m24078c(java.lang.String, com.arlosoft.macrodroid.triggers.CallBasedTrigger, com.arlosoft.macrodroid.macro.Macro, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m24079g(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo32006d(Trigger trigger);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo32007e(Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo32008f(Intent intent) {
        return intent.getStringExtra("PhoneNumber");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = r18.mo32008f(r19)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.arlosoft.macrodroid.app.MacroDroidApplication r3 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r4 = "android.permission.READ_CONTACTS"
            int r5 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r4)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0024
            r1 = 2131955446(0x7f130ef6, float:1.954742E38)
            java.lang.String r1 = r3.getString(r1)
            p112j2.C7439d0.m30909o0(r3, r4, r1, r7, r6)
            return
        L_0x0024:
            com.arlosoft.macrodroid.macro.n r3 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r3 = r3.mo29679I()
            java.util.Iterator r3 = r3.iterator()
        L_0x0030:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r4 = r3.next()
            com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4
            java.util.ArrayList r5 = r4.getTriggerListWithAwaitingActions()
            java.util.Iterator r5 = r5.iterator()
        L_0x0044:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01d1
            java.lang.Object r8 = r5.next()
            com.arlosoft.macrodroid.triggers.Trigger r8 = (com.arlosoft.macrodroid.triggers.Trigger) r8
            boolean r9 = r0.mo32006d(r8)
            if (r9 == 0) goto L_0x01ce
            r9 = r8
            com.arlosoft.macrodroid.triggers.CallBasedTrigger r9 = (com.arlosoft.macrodroid.triggers.CallBasedTrigger) r9
            int r10 = r9.mo31021u3()
            r11 = 3
            if (r10 != r11) goto L_0x0080
            boolean r10 = r9.mo31374R2()
            if (r10 == 0) goto L_0x0094
            r4.setTriggerThatInvoked(r8)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r5 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r5.<init>((com.arlosoft.macrodroid.triggers.Trigger) r8, (java.lang.String) r1)
            r4.setTriggerContextInfo(r5)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r5 = r4.getTriggerContextInfo()
            boolean r5 = r4.canInvoke(r5)
            if (r5 == 0) goto L_0x01d1
            r2.add(r4)
            goto L_0x01d1
        L_0x0080:
            int r10 = r9.mo31021u3()
            r12 = 2
            if (r10 != r12) goto L_0x008b
            r0.m24078c(r1, r9, r4, r2)
            goto L_0x0094
        L_0x008b:
            int r10 = r9.mo31021u3()
            if (r10 != r7) goto L_0x0097
            r0.m24077b(r1, r9, r4, r2)
        L_0x0094:
            r10 = 0
            goto L_0x01ad
        L_0x0097:
            boolean r10 = r9.mo31022w3()
            java.util.List r13 = r9.mo31017q3()
            java.util.Iterator r13 = r13.iterator()
        L_0x00a3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01ad
            java.lang.Object r14 = r13.next()
            com.arlosoft.macrodroid.common.Contact r14 = (com.arlosoft.macrodroid.common.Contact) r14
            java.lang.String r15 = r14.mo27709b()
            r15.hashCode()
            r16 = -1
            int r17 = r15.hashCode()
            java.lang.String r6 = "-1"
            switch(r17) {
                case 1444: goto L_0x00e6;
                case 1445: goto L_0x00da;
                case 1446: goto L_0x00ce;
                case 1447: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00ef
        L_0x00c2:
            java.lang.String r11 = "-4"
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L_0x00cb
            goto L_0x00ef
        L_0x00cb:
            r16 = 3
            goto L_0x00ef
        L_0x00ce:
            java.lang.String r11 = "-3"
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L_0x00d7
            goto L_0x00ef
        L_0x00d7:
            r16 = 2
            goto L_0x00ef
        L_0x00da:
            java.lang.String r11 = "-2"
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L_0x00e3
            goto L_0x00ef
        L_0x00e3:
            r16 = 1
            goto L_0x00ef
        L_0x00e6:
            boolean r11 = r15.equals(r6)
            if (r11 != 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r16 = 0
        L_0x00ef:
            switch(r16) {
                case 0: goto L_0x0150;
                case 1: goto L_0x0149;
                case 2: goto L_0x0150;
                case 3: goto L_0x0142;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            java.util.List<com.arlosoft.macrodroid.common.Contact> r6 = r0.f14422a
            if (r6 != 0) goto L_0x00fc
            java.util.ArrayList r6 = com.arlosoft.macrodroid.common.C4061t1.m16031z(r18)
            r0.f14422a = r6
        L_0x00fc:
            java.util.List<com.arlosoft.macrodroid.common.Contact> r6 = r0.f14422a
            java.util.Iterator r6 = r6.iterator()
        L_0x0102:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x013b
            java.lang.Object r11 = r6.next()
            com.arlosoft.macrodroid.common.Contact r11 = (com.arlosoft.macrodroid.common.Contact) r11
            java.lang.String r15 = r11.mo27709b()
            java.lang.String r12 = r14.mo27709b()
            boolean r12 = r15.equals(r12)
            if (r12 != 0) goto L_0x012a
            java.lang.String r12 = r11.mo27712f()
            java.lang.String r15 = r14.mo27712f()
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0139
        L_0x012a:
            java.lang.String r11 = r11.mo27714h()
            boolean r11 = com.arlosoft.macrodroid.common.C4061t1.m16009o(r1, r11)
            if (r11 == 0) goto L_0x0139
            boolean r10 = r9.mo31022w3()
            r10 = r10 ^ r7
        L_0x0139:
            r12 = 2
            goto L_0x0102
        L_0x013b:
            boolean r6 = r9.mo31022w3()
            if (r10 == r6) goto L_0x01a8
            goto L_0x01ad
        L_0x0142:
            if (r1 != 0) goto L_0x01a8
            boolean r6 = r9.mo31022w3()
            goto L_0x014d
        L_0x0149:
            boolean r6 = r9.mo31022w3()
        L_0x014d:
            r10 = r6 ^ 1
            goto L_0x01ad
        L_0x0150:
            java.lang.String r11 = r14.mo27709b()
            boolean r6 = r11.equals(r6)
            java.util.List<com.arlosoft.macrodroid.common.Contact> r11 = r0.f14422a
            if (r11 != 0) goto L_0x0162
            java.util.ArrayList r11 = com.arlosoft.macrodroid.common.C4061t1.m16031z(r18)
            r0.f14422a = r11
        L_0x0162:
            java.util.List<com.arlosoft.macrodroid.common.Contact> r11 = r0.f14422a
            java.util.Iterator r11 = r11.iterator()
        L_0x0168:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01a0
            java.lang.Object r12 = r11.next()
            com.arlosoft.macrodroid.common.Contact r12 = (com.arlosoft.macrodroid.common.Contact) r12
            java.lang.String r14 = r12.mo27714h()
            boolean r14 = com.arlosoft.macrodroid.common.C4061t1.m16009o(r1, r14)
            if (r14 == 0) goto L_0x0168
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "Call Checker matched number: "
            r11.append(r14)
            r11.append(r1)
            java.lang.String r14 = " to contact: "
            r11.append(r14)
            java.lang.String r12 = r12.mo27713g()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r11)
            r11 = 1
            goto L_0x01a1
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            if (r11 != r6) goto L_0x01a8
            boolean r6 = r9.mo31022w3()
            goto L_0x014d
        L_0x01a8:
            r6 = 0
            r11 = 3
            r12 = 2
            goto L_0x00a3
        L_0x01ad:
            if (r10 == 0) goto L_0x01ce
            boolean r6 = r9.mo31374R2()
            if (r6 == 0) goto L_0x01ce
            r4.setTriggerThatInvoked(r8)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r5 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r5.<init>((com.arlosoft.macrodroid.triggers.Trigger) r8, (java.lang.String) r1)
            r4.setTriggerContextInfo(r5)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r5 = r4.getTriggerContextInfo()
            boolean r5 = r4.canInvoke(r5)
            if (r5 == 0) goto L_0x01d1
            r2.add(r4)
            goto L_0x01d1
        L_0x01ce:
            r6 = 0
            goto L_0x0044
        L_0x01d1:
            r6 = 0
            goto L_0x0030
        L_0x01d4:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            com.arlosoft.macrodroid.triggers.services.a r3 = new com.arlosoft.macrodroid.triggers.services.a
            r3.<init>(r2)
            r1.post(r3)
            r18.mo32007e(r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.BaseCallCheckerService.onHandleIntent(android.content.Intent):void");
    }
}
