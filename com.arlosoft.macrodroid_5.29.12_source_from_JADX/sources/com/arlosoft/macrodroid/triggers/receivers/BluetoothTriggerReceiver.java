package com.arlosoft.macrodroid.triggers.receivers;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.os.PowerManager;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BluetoothTrigger;
import java.util.ArrayList;
import java.util.Iterator;

public class BluetoothTriggerReceiver extends BroadcastReceiver {
    /* renamed from: b */
    private boolean m24025b(BluetoothDevice bluetoothDevice, BluetoothTrigger bluetoothTrigger) {
        if (bluetoothDevice == null || bluetoothTrigger == null) {
            return false;
        }
        String name = bluetoothDevice.getName();
        String k3 = bluetoothTrigger.mo30974k3();
        if (name == null || k3 == null) {
            return false;
        }
        if ((!name.equals(k3) || bluetoothTrigger.mo30973j3() != null) && (bluetoothTrigger.mo30973j3() == null || !bluetoothTrigger.mo30973j3().equals(bluetoothDevice.getAddress()))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m24026c(ArrayList arrayList, PowerManager.WakeLock wakeLock) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Macro macro = (Macro) it.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        } finally {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0043, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = r18.getAction()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Bluetooth Event: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18864c(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.arlosoft.macrodroid.macro.n r4 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r4 = r4.mo29679I()
            java.util.Iterator r4 = r4.iterator()
        L_0x002d:
            boolean r5 = r4.hasNext()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x01eb
            java.lang.Object r5 = r4.next()
            com.arlosoft.macrodroid.macro.Macro r5 = (com.arlosoft.macrodroid.macro.Macro) r5
            java.util.ArrayList r8 = r5.getTriggerListWithAwaitingActions()
            java.util.Iterator r8 = r8.iterator()
        L_0x0043:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x002d
            java.lang.Object r9 = r8.next()
            com.arlosoft.macrodroid.triggers.Trigger r9 = (com.arlosoft.macrodroid.triggers.Trigger) r9
            boolean r10 = r9 instanceof com.arlosoft.macrodroid.triggers.BluetoothTrigger
            if (r10 == 0) goto L_0x0043
            r10 = r9
            com.arlosoft.macrodroid.triggers.BluetoothTrigger r10 = (com.arlosoft.macrodroid.triggers.BluetoothTrigger) r10
            r2.hashCode()
            r11 = -1
            int r12 = r2.hashCode()
            r13 = 2
            switch(r12) {
                case -1530327060: goto L_0x0079;
                case -301431627: goto L_0x006e;
                case 1821585647: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0083
        L_0x0063:
            java.lang.String r12 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L_0x006c
            goto L_0x0083
        L_0x006c:
            r11 = 2
            goto L_0x0083
        L_0x006e:
            java.lang.String r12 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L_0x0077
            goto L_0x0083
        L_0x0077:
            r11 = 1
            goto L_0x0083
        L_0x0079:
            java.lang.String r12 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r11 = 0
        L_0x0083:
            java.lang.String r12 = "Any Device"
            java.lang.String r14 = "Bluetooth Device: "
            java.lang.String r15 = "android.bluetooth.device.extra.DEVICE"
            switch(r11) {
                case 0: goto L_0x018d;
                case 1: goto L_0x0104;
                case 2: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0043
        L_0x008d:
            android.os.Parcelable r11 = r1.getParcelableExtra(r15)
            android.bluetooth.BluetoothDevice r11 = (android.bluetooth.BluetoothDevice) r11
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r13)
            if (r11 == 0) goto L_0x0043
            java.lang.String r13 = r11.getName()
            if (r13 == 0) goto L_0x0043
            java.lang.String r13 = r10.mo30974k3()
            if (r13 == 0) goto L_0x0043
            int r13 = r10.mo30975m3()
            r14 = 3
            if (r13 != r14) goto L_0x0043
            boolean r13 = r0.m24025b(r11, r10)
            if (r13 != 0) goto L_0x00dc
            boolean r13 = r10.mo30976n3()
            if (r13 != 0) goto L_0x00dc
            java.lang.String r13 = r10.mo30974k3()
            java.lang.String r14 = com.arlosoft.macrodroid.common.C4061t1.f10622b
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x00dc
            java.lang.String r10 = r10.mo30974k3()
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0043
        L_0x00dc:
            boolean r10 = r9.mo31374R2()
            if (r10 == 0) goto L_0x0043
            r5.setTriggerThatInvoked(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r10 = r5.getTriggerThatInvoked()
            java.lang.String r11 = r11.getName()
            r9.<init>((com.arlosoft.macrodroid.triggers.Trigger) r10, (java.lang.String) r11)
            r5.setTriggerContextInfo(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = r5.getTriggerContextInfo()
            boolean r9 = r5.canInvoke(r9)
            if (r9 == 0) goto L_0x0043
            r3.add(r5)
            goto L_0x002d
        L_0x0104:
            android.os.Parcelable r11 = r1.getParcelableExtra(r15)
            android.bluetooth.BluetoothDevice r11 = (android.bluetooth.BluetoothDevice) r11
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            java.lang.String r14 = r11.getName()
            r15.append(r14)
            java.lang.String r14 = " ("
            r15.append(r14)
            java.lang.String r14 = r11.getAddress()
            r15.append(r14)
            java.lang.String r14 = ")"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r14)
            java.lang.String r14 = r11.getName()
            if (r14 == 0) goto L_0x0043
            java.lang.String r14 = r10.mo30974k3()
            if (r14 == 0) goto L_0x0043
            int r14 = r10.mo30975m3()
            if (r14 != r13) goto L_0x0043
            boolean r13 = r0.m24025b(r11, r10)
            if (r13 != 0) goto L_0x0165
            boolean r13 = r10.mo30976n3()
            if (r13 != 0) goto L_0x0165
            java.lang.String r13 = r10.mo30974k3()
            java.lang.String r14 = com.arlosoft.macrodroid.common.C4061t1.f10622b
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0165
            java.lang.String r10 = r10.mo30974k3()
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0043
        L_0x0165:
            boolean r10 = r9.mo31374R2()
            if (r10 == 0) goto L_0x0043
            r5.setTriggerThatInvoked(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            com.arlosoft.macrodroid.triggers.Trigger r10 = r5.getTriggerThatInvoked()
            java.lang.String r11 = r11.getName()
            r9.<init>((com.arlosoft.macrodroid.triggers.Trigger) r10, (java.lang.String) r11)
            r5.setTriggerContextInfo(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = r5.getTriggerContextInfo()
            boolean r9 = r5.canInvoke(r9)
            if (r9 == 0) goto L_0x0043
            r3.add(r5)
            goto L_0x002d
        L_0x018d:
            java.lang.String r11 = "android.bluetooth.adapter.extra.STATE"
            r12 = 10
            int r11 = r1.getIntExtra(r11, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Bluetooth State: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r13)
            if (r11 != r12) goto L_0x01c9
            int r12 = r10.mo30975m3()
            if (r12 != r7) goto L_0x01c9
            boolean r12 = r9.mo31374R2()
            if (r12 == 0) goto L_0x01c9
            r5.setTriggerThatInvoked(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = r5.getTriggerContextInfo()
            boolean r9 = r5.canInvoke(r9)
            if (r9 == 0) goto L_0x0043
            r3.add(r5)
            goto L_0x002d
        L_0x01c9:
            r12 = 12
            if (r11 != r12) goto L_0x0043
            int r10 = r10.mo30975m3()
            if (r10 != 0) goto L_0x0043
            boolean r10 = r9.mo31374R2()
            if (r10 == 0) goto L_0x0043
            r5.setTriggerThatInvoked(r9)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = r5.getTriggerContextInfo()
            boolean r9 = r5.canInvoke(r9)
            if (r9 == 0) goto L_0x0043
            r3.add(r5)
            goto L_0x002d
        L_0x01eb:
            java.lang.String r1 = "power"
            r2 = r17
            java.lang.Object r1 = r2.getSystemService(r1)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            java.lang.String r2 = "macrodroid:BluetoothTriggerReceiver"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r7, r2)
            r1.setReferenceCounted(r6)
            r4 = 1500(0x5dc, double:7.41E-321)
            r1.acquire(r4)
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>(r4)
            n3.a r4 = new n3.a
            r4.<init>(r3, r1)
            r5 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.BluetoothTriggerReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
