package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.net.wifi.WifiInfo;

public class WifiConnectionTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static long f14390a;

    /* renamed from: b */
    private static WifiInfo f14391b;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        r19 = r3;
        r21 = r5;
        r22 = r7;
        r23 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r31, android.content.Intent r32) {
        /*
            r30 = this;
            r0 = r31
            r1 = r32
            android.content.Context r2 = r31.getApplicationContext()
            java.lang.String r3 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            java.lang.String r3 = r32.getAction()
            boolean r4 = r30.isInitialStickyBroadcast()
            java.lang.String r5 = "android.net.wifi.STATE_CHANGE"
            if (r4 == 0) goto L_0x0029
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x0028
            android.net.wifi.WifiInfo r0 = r2.getConnectionInfo()
            f14391b = r0
        L_0x0028:
            return
        L_0x0029:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.net.wifi.WifiInfo r6 = f14391b
            com.arlosoft.macrodroid.macro.n r7 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r7 = r7.mo29679I()
            java.util.Iterator r7 = r7.iterator()
        L_0x003c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x036c
            java.lang.Object r8 = r7.next()
            com.arlosoft.macrodroid.macro.Macro r8 = (com.arlosoft.macrodroid.macro.Macro) r8
            java.util.ArrayList r9 = r8.getTriggerListWithAwaitingActions()
            java.util.Iterator r9 = r9.iterator()
        L_0x0050:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x035c
            java.lang.Object r10 = r9.next()
            com.arlosoft.macrodroid.triggers.Trigger r10 = (com.arlosoft.macrodroid.triggers.Trigger) r10
            boolean r11 = r10 instanceof com.arlosoft.macrodroid.triggers.WifiConnectionTrigger
            if (r11 == 0) goto L_0x0348
            r11 = r10
            com.arlosoft.macrodroid.triggers.WifiConnectionTrigger r11 = (com.arlosoft.macrodroid.triggers.WifiConnectionTrigger) r11
            java.lang.String r12 = "wifi_state"
            r13 = 0
            int r12 = r1.getIntExtra(r12, r13)
            r14 = 1
            if (r12 != r14) goto L_0x008a
            int r15 = r11.mo31667r3()
            if (r15 != r14) goto L_0x008a
            boolean r15 = r10.mo31374R2()
            if (r15 == 0) goto L_0x008a
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r10 = r8.getTriggerContextInfo()
            boolean r10 = r8.canInvoke(r10)
            if (r10 == 0) goto L_0x0050
            r4.add(r8)
            goto L_0x0050
        L_0x008a:
            r15 = 3
            if (r12 != r15) goto L_0x00ab
            int r16 = r11.mo31667r3()
            if (r16 != 0) goto L_0x00ab
            boolean r16 = r10.mo31374R2()
            if (r16 == 0) goto L_0x00ab
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r10 = r8.getTriggerContextInfo()
            boolean r10 = r8.canInvoke(r10)
            if (r10 == 0) goto L_0x0050
            r4.add(r8)
            goto L_0x035c
        L_0x00ab:
            java.util.List r16 = r11.mo31666p3()
            java.util.Iterator r16 = r16.iterator()
        L_0x00b3:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0348
            java.lang.Object r17 = r16.next()
            r15 = r17
            java.lang.String r15 = (java.lang.String) r15
            r3.hashCode()
            r17 = -1
            int r18 = r3.hashCode()
            switch(r18) {
                case -1875733435: goto L_0x00e4;
                case -343630553: goto L_0x00da;
                case 68995823: goto L_0x00ce;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x00ef
        L_0x00ce:
            java.lang.String r14 = "android.net.wifi.supplicant.CONNECTION_CHANGE"
            boolean r14 = r3.equals(r14)
            if (r14 != 0) goto L_0x00d7
            goto L_0x00ef
        L_0x00d7:
            r17 = 2
            goto L_0x00ef
        L_0x00da:
            boolean r14 = r3.equals(r5)
            if (r14 != 0) goto L_0x00e1
            goto L_0x00ef
        L_0x00e1:
            r17 = 1
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r14 = "android.net.wifi.WIFI_STATE_CHANGED"
            boolean r14 = r3.equals(r14)
            if (r14 != 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r17 = 0
        L_0x00ef:
            java.lang.String r14 = "Any Network"
            switch(r17) {
                case 0: goto L_0x02e8;
                case 1: goto L_0x0109;
                case 2: goto L_0x0102;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            r19 = r3
            r21 = r5
            r22 = r7
            r23 = r9
            r1 = 1
            r5 = 3
            r17 = 0
            goto L_0x0339
        L_0x0102:
            java.lang.String r13 = "connected"
            r14 = 0
            r1.getBooleanExtra(r13, r14)
            goto L_0x00f4
        L_0x0109:
            r17 = 0
            java.lang.String r13 = "networkInfo"
            android.os.Parcelable r13 = r1.getParcelableExtra(r13)
            android.net.NetworkInfo r13 = (android.net.NetworkInfo) r13
            if (r13 != 0) goto L_0x012a
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "WifiConnectionTriggerReceiver: No Networkinfo extra!"
            r13.<init>(r14)
            p148q0.C8151a.m33873n(r13)
            r19 = r3
            r21 = r5
            r22 = r7
            r23 = r9
        L_0x0127:
            r1 = 1
            goto L_0x0338
        L_0x012a:
            android.net.wifi.WifiInfo r19 = r2.getConnectionInfo()
            r20 = 0
            if (r19 == 0) goto L_0x013b
            java.lang.String r19 = r19.getSSID()
            r1 = r19
            r19 = r3
            goto L_0x013f
        L_0x013b:
            r19 = r3
            r1 = r20
        L_0x013f:
            android.net.NetworkInfo$DetailedState r3 = android.net.NetworkInfo.DetailedState.CONNECTED
            r21 = r5
            android.net.NetworkInfo$DetailedState r5 = r13.getDetailedState()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x01d1
            java.lang.String r3 = "<unknown ssid>"
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0165
            boolean r22 = r1.equals(r5)
            if (r22 != 0) goto L_0x0165
            boolean r22 = r1.equals(r3)
            if (r22 == 0) goto L_0x0160
            goto L_0x0165
        L_0x0160:
            r22 = r7
            r23 = r9
            goto L_0x0198
        L_0x0165:
            r22 = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r23 = r9
            r9 = 27
            if (r7 < r9) goto L_0x0198
            boolean r7 = com.arlosoft.macrodroid.utils.C6407n0.m24663a(r31)
            if (r7 != 0) goto L_0x0198
            long r24 = java.lang.System.currentTimeMillis()
            long r26 = f14390a
            r28 = 60000(0xea60, double:2.9644E-319)
            long r26 = r26 + r28
            int r7 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r7 <= 0) goto L_0x0198
            r7 = 2131952445(0x7f13033d, float:1.9541333E38)
            java.lang.String r9 = r0.getString(r7)
            boolean r7 = r15.equals(r9)
            if (r7 != 0) goto L_0x0198
            f14390a = r24
            java.lang.String r7 = "Could not get SSID, location services must be enabled on Android 8.1+"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r7)
        L_0x0198:
            if (r6 == 0) goto L_0x01b4
            java.lang.String r7 = r6.getSSID()
            if (r7 == 0) goto L_0x01b4
            java.lang.String r7 = r6.getSSID()
            android.net.wifi.WifiInfo r9 = r2.getConnectionInfo()
            java.lang.String r9 = r9.getSSID()
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x01b4
            goto L_0x0339
        L_0x01b4:
            if (r1 == 0) goto L_0x01d5
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x01d5
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01d5
            java.lang.String r3 = "0x"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x01d5
            android.net.wifi.WifiInfo r1 = r2.getConnectionInfo()
            f14391b = r1
            goto L_0x01d5
        L_0x01d1:
            r22 = r7
            r23 = r9
        L_0x01d5:
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.CONNECTED
            android.net.NetworkInfo$DetailedState r3 = r13.getDetailedState()
            boolean r1 = r1.equals(r3)
            java.lang.String r3 = "\""
            if (r1 == 0) goto L_0x0255
            int r1 = r11.mo31667r3()
            r5 = 2
            if (r1 != r5) goto L_0x0255
            android.net.wifi.WifiInfo r1 = r2.getConnectionInfo()
            java.lang.String r1 = r1.getSSID()
            if (r1 == 0) goto L_0x020a
            boolean r5 = r1.startsWith(r3)
            if (r5 == 0) goto L_0x020a
            boolean r3 = r1.endsWith(r3)
            if (r3 == 0) goto L_0x020a
            int r3 = r1.length()
            r5 = 1
            int r3 = r3 - r5
            java.lang.String r1 = r1.substring(r5, r3)
        L_0x020a:
            boolean r3 = r15.equals(r14)
            if (r3 != 0) goto L_0x021d
            r3 = 2131952445(0x7f13033d, float:1.9541333E38)
            java.lang.String r3 = r0.getString(r3)
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0235
        L_0x021d:
            boolean r3 = r10.mo31374R2()
            if (r3 == 0) goto L_0x0235
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r3 = r8.getTriggerContextInfo()
            boolean r3 = r8.canInvoke(r3)
            if (r3 == 0) goto L_0x0235
            r4.add(r8)
            goto L_0x0350
        L_0x0235:
            if (r1 == 0) goto L_0x0127
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0127
            boolean r1 = r10.mo31374R2()
            if (r1 == 0) goto L_0x0127
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r8.getTriggerContextInfo()
            boolean r1 = r8.canInvoke(r1)
            if (r1 == 0) goto L_0x0127
            r4.add(r8)
            goto L_0x0350
        L_0x0255:
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.DISCONNECTED
            android.net.NetworkInfo$DetailedState r5 = r13.getDetailedState()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0127
            int r1 = r11.mo31667r3()
            r5 = 3
            if (r1 != r5) goto L_0x02e4
            if (r6 == 0) goto L_0x026f
            java.lang.String r1 = r6.getSSID()
            goto L_0x0271
        L_0x026f:
            r1 = r20
        L_0x0271:
            if (r1 == 0) goto L_0x0289
            boolean r5 = r1.startsWith(r3)
            if (r5 == 0) goto L_0x0289
            boolean r3 = r1.endsWith(r3)
            if (r3 == 0) goto L_0x0289
            int r3 = r1.length()
            r5 = 1
            int r3 = r3 - r5
            java.lang.String r1 = r1.substring(r5, r3)
        L_0x0289:
            boolean r3 = r15.equals(r14)
            if (r3 != 0) goto L_0x029c
            r3 = 2131952445(0x7f13033d, float:1.9541333E38)
            java.lang.String r3 = r0.getString(r3)
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x02c4
        L_0x029c:
            if (r1 == 0) goto L_0x02c4
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x02c4
            java.lang.String r3 = "\"\""
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x02c4
            boolean r1 = r10.mo31374R2()
            if (r1 == 0) goto L_0x02e4
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r8.getTriggerContextInfo()
            boolean r1 = r8.canInvoke(r1)
            if (r1 == 0) goto L_0x02e4
            r4.add(r8)
            goto L_0x0350
        L_0x02c4:
            if (r1 == 0) goto L_0x02e4
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x02e4
            boolean r1 = r10.mo31374R2()
            if (r1 == 0) goto L_0x02e4
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r8.getTriggerContextInfo()
            boolean r1 = r8.canInvoke(r1)
            if (r1 == 0) goto L_0x02e4
            r4.add(r8)
            goto L_0x0350
        L_0x02e4:
            f14391b = r20
            goto L_0x0127
        L_0x02e8:
            r19 = r3
            r21 = r5
            r22 = r7
            r23 = r9
            r1 = 1
            r17 = 0
            if (r12 != r1) goto L_0x0338
            int r3 = r11.mo31667r3()
            r5 = 3
            if (r3 != r5) goto L_0x0339
            if (r6 == 0) goto L_0x0339
            java.lang.String r3 = r6.getSSID()
            if (r3 == 0) goto L_0x0339
            java.lang.String r3 = r6.getSSID()
            boolean r3 = r3.equals(r15)
            if (r3 != 0) goto L_0x0321
            boolean r3 = r15.equals(r14)
            if (r3 != 0) goto L_0x0321
            r3 = 2131952445(0x7f13033d, float:1.9541333E38)
            java.lang.String r3 = r0.getString(r3)
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0339
        L_0x0321:
            boolean r3 = r10.mo31374R2()
            if (r3 == 0) goto L_0x0339
            r8.setTriggerThatInvoked(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r3 = r8.getTriggerContextInfo()
            boolean r3 = r8.canInvoke(r3)
            if (r3 == 0) goto L_0x0339
            r4.add(r8)
            goto L_0x0350
        L_0x0338:
            r5 = 3
        L_0x0339:
            r1 = r32
            r3 = r19
            r5 = r21
            r7 = r22
            r9 = r23
            r13 = 0
            r14 = 1
            r15 = 3
            goto L_0x00b3
        L_0x0348:
            r19 = r3
            r21 = r5
            r22 = r7
            r23 = r9
        L_0x0350:
            r1 = r32
            r3 = r19
            r5 = r21
            r7 = r22
            r9 = r23
            goto L_0x0050
        L_0x035c:
            r19 = r3
            r21 = r5
            r22 = r7
            r1 = r32
            r3 = r19
            r5 = r21
            r7 = r22
            goto L_0x003c
        L_0x036c:
            java.util.Iterator r0 = r4.iterator()
        L_0x0370:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0384
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r2 = r1.getTriggerContextInfo()
            r1.invokeActions(r2)
            goto L_0x0370
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.WifiConnectionTriggerReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
