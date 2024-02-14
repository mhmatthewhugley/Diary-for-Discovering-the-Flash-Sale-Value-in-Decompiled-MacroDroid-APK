package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.List;

public class WifiScanCompleteReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static List<ScanResult> f14392a = new ArrayList();

    /* renamed from: b */
    private static long f14393b;

    /* renamed from: a */
    private String m24048a(String str) {
        return (str == null || str.length() <= 0 || !str.startsWith("\"") || !str.endsWith("\"")) ? str : str.substring(1, str.length() - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019a, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r18, android.content.Intent r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.content.Context r2 = r18.getApplicationContext()
            java.lang.String r3 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = f14393b
            r7 = 5000(0x1388, double:2.4703E-320)
            long r5 = r5 + r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x001e
            return
        L_0x001e:
            f14393b = r3
            java.util.List r0 = r2.getScanResults()     // Catch:{ SecurityException -> 0x0204, Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "Wifi scan results returned null"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return
        L_0x002c:
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r2 = r2.mo29679I()
            java.util.Iterator r5 = r2.iterator()
        L_0x0038:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r6 = r5.next()
            com.arlosoft.macrodroid.macro.Macro r6 = (com.arlosoft.macrodroid.macro.Macro) r6
            java.util.ArrayList r6 = r6.getTriggerListWithAwaitingActions()
            java.util.Iterator r6 = r6.iterator()
        L_0x004c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0038
            java.lang.Object r7 = r6.next()
            com.arlosoft.macrodroid.triggers.Trigger r7 = (com.arlosoft.macrodroid.triggers.Trigger) r7
            boolean r8 = r7 instanceof com.arlosoft.macrodroid.triggers.WifiSSIDTrigger
            if (r8 == 0) goto L_0x004c
            boolean r7 = r7.mo27822G1()
            if (r7 == 0) goto L_0x004c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 400(0x190, float:5.6E-43)
            r5.<init>(r6)
            java.lang.String r6 = "WIFI SCAN: "
            r5.append(r6)
            int r6 = r0.size()
            r7 = 0
        L_0x0073:
            if (r7 >= r6) goto L_0x00ba
            java.lang.Object r8 = r0.get(r7)
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
            java.lang.String r8 = r8.SSID
            r5.append(r8)
            java.lang.Object r8 = r0.get(r7)
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
            java.lang.String r8 = r8.BSSID
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00ad
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "("
            r8.append(r9)
            java.lang.Object r9 = r0.get(r7)
            android.net.wifi.ScanResult r9 = (android.net.wifi.ScanResult) r9
            java.lang.String r9 = r9.BSSID
            r8.append(r9)
            java.lang.String r9 = ")"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            goto L_0x00af
        L_0x00ad:
            java.lang.String r8 = ""
        L_0x00af:
            r5.append(r8)
            java.lang.String r8 = ", "
            r5.append(r8)
            int r7 = r7 + 1
            goto L_0x0073
        L_0x00ba:
            java.lang.String r5 = r5.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r5)
        L_0x00c1:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00ca:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x01ce
            java.lang.Object r6 = r2.next()
            com.arlosoft.macrodroid.macro.Macro r6 = (com.arlosoft.macrodroid.macro.Macro) r6
            java.util.ArrayList r7 = r6.getTriggerListWithAwaitingActions()
            java.util.Iterator r7 = r7.iterator()
        L_0x00de:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ca
            java.lang.Object r8 = r7.next()
            com.arlosoft.macrodroid.triggers.Trigger r8 = (com.arlosoft.macrodroid.triggers.Trigger) r8
            boolean r9 = r8 instanceof com.arlosoft.macrodroid.triggers.WifiSSIDTrigger
            if (r9 == 0) goto L_0x01c6
            r9 = r8
            com.arlosoft.macrodroid.triggers.WifiSSIDTrigger r9 = (com.arlosoft.macrodroid.triggers.WifiSSIDTrigger) r9
            boolean r10 = r9.mo31673A3()
            java.util.List r9 = r9.mo31675z3()
            java.util.List<android.net.wifi.ScanResult> r11 = f14392a
            int r11 = r11.size()
            r12 = 0
        L_0x0100:
            if (r12 >= r11) goto L_0x014f
            java.util.List<android.net.wifi.ScanResult> r13 = f14392a
            java.lang.Object r13 = r13.get(r12)
            android.net.wifi.ScanResult r13 = (android.net.wifi.ScanResult) r13
            java.lang.String r14 = r13.SSID
            java.lang.String r14 = r1.m24048a(r14)
            java.util.Iterator r15 = r9.iterator()
        L_0x0114:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x014c
            java.lang.Object r16 = r15.next()
            com.arlosoft.macrodroid.data.WifiCellInfo r16 = (com.arlosoft.macrodroid.data.WifiCellInfo) r16
            java.lang.String r3 = r16.getSsid()
            java.lang.String r3 = r1.m24048a(r3)
            if (r14 == 0) goto L_0x0114
            java.lang.String r4 = r14.toLowerCase()
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0114
            java.lang.String r3 = r16.getBssid()
            if (r3 == 0) goto L_0x014a
            java.lang.String r3 = r16.getBssid()
            java.lang.String r4 = r13.BSSID
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0114
        L_0x014a:
            r3 = 1
            goto L_0x0150
        L_0x014c:
            int r12 = r12 + 1
            goto L_0x0100
        L_0x014f:
            r3 = 0
        L_0x0150:
            if (r3 == 0) goto L_0x0155
            if (r10 == 0) goto L_0x0155
            goto L_0x00de
        L_0x0155:
            r4 = 0
        L_0x0156:
            int r11 = r0.size()
            if (r4 >= r11) goto L_0x01a4
            java.lang.Object r11 = r0.get(r4)
            android.net.wifi.ScanResult r11 = (android.net.wifi.ScanResult) r11
            java.lang.String r12 = r11.SSID
            java.lang.String r12 = r1.m24048a(r12)
            java.util.Iterator r13 = r9.iterator()
        L_0x016c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x019f
            java.lang.Object r14 = r13.next()
            com.arlosoft.macrodroid.data.WifiCellInfo r14 = (com.arlosoft.macrodroid.data.WifiCellInfo) r14
            java.lang.String r15 = r14.getBssid()
            if (r12 == 0) goto L_0x019c
            java.lang.String r1 = r12.toLowerCase()
            java.lang.String r14 = r14.getSsid()
            java.lang.String r14 = r14.toLowerCase()
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x019c
            if (r15 == 0) goto L_0x019a
            java.lang.String r1 = r11.BSSID
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x019c
        L_0x019a:
            r1 = 1
            goto L_0x01a5
        L_0x019c:
            r1 = r17
            goto L_0x016c
        L_0x019f:
            int r4 = r4 + 1
            r1 = r17
            goto L_0x0156
        L_0x01a4:
            r1 = 0
        L_0x01a5:
            if (r10 == 0) goto L_0x01a9
            if (r1 != 0) goto L_0x01af
        L_0x01a9:
            if (r10 != 0) goto L_0x01c6
            if (r1 != 0) goto L_0x01c6
            if (r3 == 0) goto L_0x01c6
        L_0x01af:
            boolean r1 = r8.mo31374R2()
            if (r1 == 0) goto L_0x01c6
            r6.setTriggerThatInvoked(r8)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r6.getTriggerContextInfo()
            boolean r1 = r6.canInvoke(r1)
            if (r1 == 0) goto L_0x01c6
            r5.add(r6)
            goto L_0x01ca
        L_0x01c6:
            r1 = r17
            goto L_0x00de
        L_0x01ca:
            r1 = r17
            goto L_0x00ca
        L_0x01ce:
            java.util.Iterator r1 = r5.iterator()
        L_0x01d2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01e6
            java.lang.Object r2 = r1.next()
            com.arlosoft.macrodroid.macro.Macro r2 = (com.arlosoft.macrodroid.macro.Macro) r2
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r3 = r2.getTriggerContextInfo()
            r2.invokeActions(r3)
            goto L_0x01d2
        L_0x01e6:
            f14392a = r0
            return
        L_0x01e9:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to get wifi scan results: "
            r0.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            return
        L_0x0204:
            r1 = 2131955525(0x7f130f45, float:1.954758E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            r3 = 0
            r4 = 1
            p112j2.C7439d0.m30909o0(r0, r2, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.WifiScanCompleteReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
