package com.arlosoft.macrodroid.triggers.receivers;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.C17541R$string;
import java.util.ArrayList;
import java.util.List;

public class MacroDroidDeviceAdminReceiver extends DeviceAdminReceiver {

    /* renamed from: a */
    private static final List<Long> f14360a = new ArrayList();

    public CharSequence onDisableRequested(Context context, Intent intent) {
        return context.getString(C17541R$string.disable_macrodroid_device_administration);
    }

    public void onDisabled(Context context, Intent intent) {
    }

    public void onEnabled(Context context, Intent intent) {
    }

    public void onPasswordChanged(Context context, Intent intent) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPasswordFailed(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List<java.lang.Long> r15 = f14360a
            int r0 = r15.size()
            r1 = 1
            if (r0 <= 0) goto L_0x0029
            int r0 = r15.size()
            int r0 = r0 - r1
            java.lang.Object r15 = r15.get(r0)
            java.lang.Long r15 = (java.lang.Long) r15
            long r2 = r15.longValue()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 100
            long r2 = r2 + r6
            int r15 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x0029
            return
        L_0x0029:
            com.arlosoft.macrodroid.macro.n r15 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r15 = r15.mo29679I()
            java.util.Iterator r15 = r15.iterator()
            r0 = 0
            r2 = 0
        L_0x0037:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r3 = r15.next()
            com.arlosoft.macrodroid.macro.Macro r3 = (com.arlosoft.macrodroid.macro.Macro) r3
            java.util.ArrayList r4 = r3.getTriggerListWithAwaitingActions()
            java.util.Iterator r4 = r4.iterator()
        L_0x004b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0037
            java.lang.Object r5 = r4.next()
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5
            boolean r6 = r5 instanceof com.arlosoft.macrodroid.triggers.FailedLoginTrigger
            if (r6 == 0) goto L_0x004b
            java.util.List<java.lang.Long> r6 = f14360a
            int r7 = r6.size()
            r8 = 3
            if (r7 <= r8) goto L_0x0067
            r6.remove(r8)
        L_0x0067:
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.add(r0, r7)
            r7 = r5
            com.arlosoft.macrodroid.triggers.FailedLoginTrigger r7 = (com.arlosoft.macrodroid.triggers.FailedLoginTrigger) r7
            int r8 = r7.mo31116j3()
            int r7 = r7.mo31117k3()
            if (r8 != r1) goto L_0x0081
        L_0x007f:
            r6 = 1
            goto L_0x00a8
        L_0x0081:
            int r6 = r6.size()
            if (r8 > r6) goto L_0x00a7
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            long r6 = (long) r7
            long r9 = r9 - r6
            r6 = 0
        L_0x0091:
            if (r6 >= r8) goto L_0x007f
            java.util.List<java.lang.Long> r7 = f14360a
            java.lang.Object r7 = r7.get(r6)
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            int r6 = r6 + 1
            goto L_0x0091
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            if (r6 == 0) goto L_0x004b
            boolean r6 = r5.mo31374R2()
            if (r6 == 0) goto L_0x004b
            r3.setTriggerThatInvoked(r5)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r2 = r3.getTriggerContextInfo()
            boolean r2 = r3.canInvoke(r2)
            if (r2 == 0) goto L_0x00c0
            r14.add(r3)
        L_0x00c0:
            r2 = 1
            goto L_0x0037
        L_0x00c3:
            java.util.Iterator r14 = r14.iterator()
        L_0x00c7:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00db
            java.lang.Object r15 = r14.next()
            com.arlosoft.macrodroid.macro.Macro r15 = (com.arlosoft.macrodroid.macro.Macro) r15
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r15.getTriggerContextInfo()
            r15.invokeActions(r0)
            goto L_0x00c7
        L_0x00db:
            if (r2 == 0) goto L_0x00e2
            java.util.List<java.lang.Long> r14 = f14360a
            r14.clear()
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver.onPasswordFailed(android.content.Context, android.content.Intent):void");
    }

    public void onPasswordSucceeded(Context context, Intent intent) {
        f14360a.clear();
    }
}
