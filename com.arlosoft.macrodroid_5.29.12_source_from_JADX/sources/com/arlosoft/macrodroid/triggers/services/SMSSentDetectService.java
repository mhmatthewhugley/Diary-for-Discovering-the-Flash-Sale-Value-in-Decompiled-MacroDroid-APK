package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.sms.SMSMessage;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import p112j2.C7439d0;
import p148q0.C8151a;

public class SMSSentDetectService extends Service {

    /* renamed from: a */
    private static SMSSentReceiver f14550a = null;

    /* renamed from: c */
    private static C6120a f14551c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14552d = "";

    public class SMSSentReceiver extends BroadcastReceiver {
        public SMSSentReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("SmsSentIntent")) {
                SMSSentDetectService.m24230d((SMSMessage) intent.getExtras().get("SmsMessageExtra"));
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.SMSSentDetectService$a */
    public static class C6120a extends ContentObserver {

        /* renamed from: a */
        private boolean f14554a = false;

        public C6120a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            if (ContextCompat.checkSelfPermission(MacroDroidApplication.m14845u(), "android.permission.READ_SMS") != 0) {
                C7439d0.m30909o0(MacroDroidApplication.m14845u(), "android.permission.READ_SMS", MacroDroidApplication.m14845u().getString(C17541R$string.trigger_sms_sent), true, false);
                return;
            }
            Cursor query = MacroDroidApplication.m14845u().getContentResolver().query(Uri.parse("content://sms"), (String[]) null, (String) null, (String[]) null, (String) null);
            try {
                if (query.getCount() > 0) {
                    query.moveToNext();
                    query.getString(query.getColumnIndex("protocol"));
                    int i = query.getInt(query.getColumnIndex("type"));
                    String string = query.getString(query.getColumnIndex("address"));
                    String string2 = query.getString(query.getColumnIndex("body"));
                    String string3 = query.getString(query.getColumnIndex(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID));
                    if (i == 6) {
                        this.f14554a = true;
                    }
                    if (i == 2 && !SMSSentDetectService.f14552d.equals(string3)) {
                        SMSSentDetectService.m24230d(new SMSMessage(string, string2, false, 0));
                        this.f14554a = false;
                        String unused = SMSSentDetectService.f14552d = string3;
                    }
                }
            } catch (CursorIndexOutOfBoundsException e) {
                C8151a.m33873n(new RuntimeException("SMSSentDetectService: CursorIndexOutOfBoundsException: " + e.toString()));
                if (query == null) {
                    return;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
            query.close();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r12 = r4 ^ r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        r8 = r18;
        r4 = r19;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24230d(com.arlosoft.macrodroid.action.sms.SMSMessage r26) {
        /*
            java.lang.String r0 = "display_name"
            java.lang.String r1 = r26.mo26855f()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.arlosoft.macrodroid.macro.n r4 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r4 = r4.mo29679I()
            java.util.Iterator r4 = r4.iterator()
            java.lang.String r5 = ""
            r8 = r5
            r7 = 0
        L_0x0020:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0291
            java.lang.Object r9 = r4.next()
            com.arlosoft.macrodroid.macro.Macro r9 = (com.arlosoft.macrodroid.macro.Macro) r9
            java.util.ArrayList r10 = r9.getTriggerList()
            java.util.Iterator r10 = r10.iterator()
            r12 = 0
        L_0x0035:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0289
            java.lang.Object r13 = r10.next()
            com.arlosoft.macrodroid.triggers.Trigger r13 = (com.arlosoft.macrodroid.triggers.Trigger) r13
            boolean r14 = r13 instanceof com.arlosoft.macrodroid.triggers.SMSSentTrigger
            if (r14 == 0) goto L_0x027e
            boolean r14 = r13.mo31374R2()
            if (r14 == 0) goto L_0x027e
            r14 = r13
            com.arlosoft.macrodroid.triggers.SMSSentTrigger r14 = (com.arlosoft.macrodroid.triggers.SMSSentTrigger) r14
            boolean r15 = r14.mo31445t3()
            if (r15 == 0) goto L_0x0055
            r12 = 1
        L_0x0055:
            java.util.List r15 = r14.mo31442q3()
            java.util.Iterator r15 = r15.iterator()
        L_0x005d:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0121
            java.lang.Object r16 = r15.next()
            r11 = r16
            com.arlosoft.macrodroid.common.Contact r11 = (com.arlosoft.macrodroid.common.Contact) r11
            java.lang.String r6 = r11.mo27709b()
            r6.hashCode()
            r17 = -1
            int r18 = r6.hashCode()
            r19 = r4
            java.lang.String r4 = "-1"
            switch(r18) {
                case 1444: goto L_0x009f;
                case 1445: goto L_0x0091;
                case 1446: goto L_0x0082;
                default: goto L_0x007f;
            }
        L_0x007f:
            r18 = r8
            goto L_0x00aa
        L_0x0082:
            r18 = r8
            java.lang.String r8 = "-3"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x008d
            goto L_0x00aa
        L_0x008d:
            r6 = 2
            r17 = 2
            goto L_0x00aa
        L_0x0091:
            r18 = r8
            java.lang.String r8 = "-2"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            r17 = 1
            goto L_0x00aa
        L_0x009f:
            r18 = r8
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r17 = 0
        L_0x00aa:
            switch(r17) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00c9;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            com.arlosoft.macrodroid.app.MacroDroidApplication r4 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.util.List r4 = com.arlosoft.macrodroid.common.C4061t1.m15973S(r4, r11)
            boolean r4 = com.arlosoft.macrodroid.common.C4061t1.m16011p(r1, r4)
            if (r4 == 0) goto L_0x011b
            boolean r4 = r14.mo31445t3()
        L_0x00bf:
            r6 = 1
            goto L_0x00c6
        L_0x00c1:
            r6 = 1
            boolean r4 = r14.mo31445t3()
        L_0x00c6:
            r4 = r4 ^ r6
            r12 = r4
            goto L_0x0125
        L_0x00c9:
            java.lang.String r6 = r11.mo27709b()
            boolean r4 = r6.equals(r4)
            if (r7 != 0) goto L_0x00dc
            com.arlosoft.macrodroid.app.MacroDroidApplication r6 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.util.List r6 = com.arlosoft.macrodroid.common.C4061t1.m15950D(r6)
            r7 = r6
        L_0x00dc:
            java.util.Iterator r6 = r7.iterator()
            r8 = 0
        L_0x00e1:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0114
            java.lang.Object r11 = r6.next()
            com.arlosoft.macrodroid.common.Contact r11 = (com.arlosoft.macrodroid.common.Contact) r11
            r17 = r6
            java.lang.String r6 = r11.mo27709b()
            java.lang.Object r6 = r3.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x010a
            com.arlosoft.macrodroid.app.MacroDroidApplication r6 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.util.List r6 = com.arlosoft.macrodroid.common.C4061t1.m15973S(r6, r11)
            java.lang.String r11 = r11.mo27709b()
            r3.put(r11, r6)
        L_0x010a:
            boolean r6 = com.arlosoft.macrodroid.common.C4061t1.m16011p(r1, r6)
            if (r6 == 0) goto L_0x0111
            r8 = 1
        L_0x0111:
            r6 = r17
            goto L_0x00e1
        L_0x0114:
            if (r8 != r4) goto L_0x011b
            boolean r4 = r14.mo31445t3()
            goto L_0x00bf
        L_0x011b:
            r8 = r18
            r4 = r19
            goto L_0x005d
        L_0x0121:
            r19 = r4
            r18 = r8
        L_0x0125:
            if (r12 == 0) goto L_0x027c
            android.net.Uri r4 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI
            java.lang.String r6 = com.arlosoft.macrodroid.common.C4061t1.m15953E0(r1)
            android.net.Uri r21 = android.net.Uri.withAppendedPath(r4, r6)
            com.arlosoft.macrodroid.app.MacroDroidApplication r4 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r6 = "android.permission.READ_CONTACTS"
            int r8 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r6)
            if (r8 == 0) goto L_0x014a
            r0 = 2131955446(0x7f130ef6, float:1.954742E38)
            java.lang.String r0 = r4.getString(r0)
            r1 = 0
            r2 = 1
            p112j2.C7439d0.m30909o0(r4, r6, r0, r2, r1)
            return
        L_0x014a:
            com.arlosoft.macrodroid.app.MacroDroidApplication r6 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ IllegalArgumentException -> 0x0161 }
            android.content.ContentResolver r20 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0161 }
            java.lang.String[] r22 = new java.lang.String[]{r0}     // Catch:{ IllegalArgumentException -> 0x0161 }
            r23 = 0
            r24 = 0
            r25 = 0
            android.database.Cursor r6 = r20.query(r21, r22, r23, r24, r25)     // Catch:{ IllegalArgumentException -> 0x0161 }
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            if (r6 == 0) goto L_0x0181
            boolean r8 = r6.moveToFirst()
            if (r8 == 0) goto L_0x017b
            int r8 = r6.getColumnIndex(r0)
            java.lang.String r8 = r6.getString(r8)
            if (r8 == 0) goto L_0x017b
            int r11 = r8.length()
            if (r11 <= 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r8 = r18
        L_0x017d:
            r6.close()
            goto L_0x0183
        L_0x0181:
            r8 = r18
        L_0x0183:
            com.arlosoft.macrodroid.common.IncomingSMS r6 = new com.arlosoft.macrodroid.common.IncomingSMS
            java.lang.String r11 = r26.mo26852d()
            r6.<init>(r8, r11, r1)
            java.lang.String r11 = r14.mo31443r3()
            if (r11 == 0) goto L_0x025e
            java.lang.String r11 = r14.mo31443r3()
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01a4
            boolean r11 = r13.mo31374R2()
            if (r11 == 0) goto L_0x01a4
            goto L_0x025e
        L_0x01a4:
            java.lang.String r11 = r14.mo31443r3()
            r15 = 0
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r4, r11, r15, r9)
            java.lang.String r11 = r4.toLowerCase()
            r15 = 0
            java.lang.String r11 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r11, r15)
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r4 = com.arlosoft.macrodroid.utils.C6460y1.m24790b(r4, r15)
            boolean r16 = r14.mo31446u3()
            if (r16 == 0) goto L_0x01f6
            java.lang.String r11 = r26.mo26852d()
            java.lang.String r11 = r11.toLowerCase()
            boolean r4 = r11.matches(r4)
            if (r4 != 0) goto L_0x0285
            boolean r4 = r13.mo31374R2()
            if (r4 == 0) goto L_0x0285
            r9.setTriggerThatInvoked(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r11 = r9.getTriggerThatInvoked()
            r4.<init>((com.arlosoft.macrodroid.triggers.Trigger) r11, (com.arlosoft.macrodroid.common.IncomingSMS) r6)
            r9.setTriggerContextInfo(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = r9.getTriggerContextInfo()
            boolean r4 = r9.canInvoke(r4)
            if (r4 == 0) goto L_0x0285
            r2.add(r9)
            goto L_0x028d
        L_0x01f6:
            boolean r14 = r14.mo31444s3()
            if (r14 == 0) goto L_0x022d
            boolean r14 = r13.mo31374R2()
            if (r14 == 0) goto L_0x022d
            java.lang.String r4 = r26.mo26852d()
            java.lang.String r4 = r4.toLowerCase()
            boolean r4 = r4.matches(r11)
            if (r4 == 0) goto L_0x0285
            r9.setTriggerThatInvoked(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r11 = r9.getTriggerThatInvoked()
            r4.<init>((com.arlosoft.macrodroid.triggers.Trigger) r11, (com.arlosoft.macrodroid.common.IncomingSMS) r6)
            r9.setTriggerContextInfo(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = r9.getTriggerContextInfo()
            boolean r4 = r9.canInvoke(r4)
            if (r4 == 0) goto L_0x0285
            r2.add(r9)
            goto L_0x028d
        L_0x022d:
            java.lang.String r11 = r26.mo26852d()
            java.lang.String r11 = r11.toLowerCase()
            boolean r4 = r11.matches(r4)
            if (r4 == 0) goto L_0x0285
            boolean r4 = r13.mo31374R2()
            if (r4 == 0) goto L_0x0285
            r9.setTriggerThatInvoked(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r11 = r9.getTriggerThatInvoked()
            r4.<init>((com.arlosoft.macrodroid.triggers.Trigger) r11, (com.arlosoft.macrodroid.common.IncomingSMS) r6)
            r9.setTriggerContextInfo(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = r9.getTriggerContextInfo()
            boolean r4 = r9.canInvoke(r4)
            if (r4 == 0) goto L_0x0285
            r2.add(r9)
            goto L_0x028d
        L_0x025e:
            r15 = 0
            r9.setTriggerThatInvoked(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r11 = r9.getTriggerThatInvoked()
            r4.<init>((com.arlosoft.macrodroid.triggers.Trigger) r11, (com.arlosoft.macrodroid.common.IncomingSMS) r6)
            r9.setTriggerContextInfo(r4)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r4 = r9.getTriggerContextInfo()
            boolean r4 = r9.canInvoke(r4)
            if (r4 == 0) goto L_0x0285
            r2.add(r9)
            goto L_0x028d
        L_0x027c:
            r15 = 0
            goto L_0x0283
        L_0x027e:
            r19 = r4
            r18 = r8
            goto L_0x027c
        L_0x0283:
            r8 = r18
        L_0x0285:
            r4 = r19
            goto L_0x0035
        L_0x0289:
            r19 = r4
            r18 = r8
        L_0x028d:
            r4 = r19
            goto L_0x0020
        L_0x0291:
            java.util.Iterator r0 = r2.iterator()
        L_0x0295:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02a9
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r2 = r1.getTriggerContextInfo()
            r1.invokeActions(r2)
            goto L_0x0295
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.SMSSentDetectService.m24230d(com.arlosoft.macrodroid.action.sms.SMSMessage):void");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        f14551c = new C6120a(new Handler());
        getContentResolver().registerContentObserver(Uri.parse("content://sms"), true, f14551c);
        IntentFilter intentFilter = new IntentFilter("SmsSentIntent");
        SMSSentReceiver sMSSentReceiver = new SMSSentReceiver();
        f14550a = sMSSentReceiver;
        registerReceiver(sMSSentReceiver, intentFilter);
    }

    public void onDestroy() {
        getContentResolver().unregisterContentObserver(f14551c);
        unregisterReceiver(f14550a);
        super.onDestroy();
    }
}
