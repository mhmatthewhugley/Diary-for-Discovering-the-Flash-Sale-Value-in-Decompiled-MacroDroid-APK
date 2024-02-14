package com.arlosoft.macrodroid.triggers.receivers.widget;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class WidgetPressedService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0144 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            super.onStart(r1, r2)
            java.lang.String r1 = r20.getAction()
            r3 = 3
            if (r1 != 0) goto L_0x001b
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "The action was null in WidgetPressedService"
            r1.<init>(r2)
            p148q0.C8151a.m33873n(r1)
            return r3
        L_0x001b:
            java.lang.String[] r4 = com.arlosoft.macrodroid.triggers.WidgetPressedTrigger.m23713n3()
            r5 = 1
            r4 = r4[r5]
            boolean r4 = r1.equals(r4)
            r6 = 0
            r7 = 2
            r8 = 4
            if (r4 == 0) goto L_0x002d
            r4 = 0
            goto L_0x0058
        L_0x002d:
            java.lang.String[] r4 = com.arlosoft.macrodroid.triggers.WidgetPressedTrigger.m23713n3()
            r4 = r4[r7]
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003b
            r4 = 1
            goto L_0x0058
        L_0x003b:
            java.lang.String[] r4 = com.arlosoft.macrodroid.triggers.WidgetPressedTrigger.m23713n3()
            r4 = r4[r3]
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0049
            r4 = 2
            goto L_0x0058
        L_0x0049:
            java.lang.String[] r4 = com.arlosoft.macrodroid.triggers.WidgetPressedTrigger.m23713n3()
            r4 = r4[r8]
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0057
            r4 = 3
            goto L_0x0058
        L_0x0057:
            r4 = 4
        L_0x0058:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r10 = "Widget Pressed"
            p148q0.C8151a.m33860a(r10)
            com.arlosoft.macrodroid.macro.n r10 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r10 = r10.mo29679I()
            java.util.Iterator r10 = r10.iterator()
        L_0x006e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0100
            java.lang.Object r11 = r10.next()
            com.arlosoft.macrodroid.macro.Macro r11 = (com.arlosoft.macrodroid.macro.Macro) r11
            java.util.ArrayList r12 = r11.getTriggerListWithAwaitingActions()
            java.util.Iterator r12 = r12.iterator()
        L_0x0082:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x006e
            java.lang.Object r13 = r12.next()
            com.arlosoft.macrodroid.triggers.Trigger r13 = (com.arlosoft.macrodroid.triggers.Trigger) r13
            boolean r14 = r13 instanceof com.arlosoft.macrodroid.triggers.WidgetPressedTrigger
            if (r14 == 0) goto L_0x0082
            r14 = r13
            com.arlosoft.macrodroid.triggers.WidgetPressedTrigger r14 = (com.arlosoft.macrodroid.triggers.WidgetPressedTrigger) r14
            int r14 = r14.mo31660m3()
            if (r14 != r4) goto L_0x0082
            if (r4 != r8) goto L_0x00e8
            r14 = 44
            int r14 = r1.indexOf(r14)     // Catch:{ Exception -> 0x00d3 }
            int r14 = r14 + r5
            java.lang.String r14 = r1.substring(r14)     // Catch:{ Exception -> 0x00d3 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x00d3 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x00d3 }
            long r14 = com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity.m24060b2(r0, r14)     // Catch:{ Exception -> 0x00d3 }
            long r16 = r11.getGUID()     // Catch:{ Exception -> 0x00d3 }
            int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r18 != 0) goto L_0x0082
            boolean r14 = r13.mo31374R2()     // Catch:{ Exception -> 0x00d3 }
            if (r14 == 0) goto L_0x0082
            r11.setTriggerThatInvoked(r13)     // Catch:{ Exception -> 0x00d3 }
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = r11.getTriggerContextInfo()     // Catch:{ Exception -> 0x00d3 }
            boolean r13 = r11.canInvoke(r13)     // Catch:{ Exception -> 0x00d3 }
            if (r13 == 0) goto L_0x006e
            r9.add(r11)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x006e
        L_0x00d3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Failed to identify widget id from action: "
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)
            goto L_0x0082
        L_0x00e8:
            boolean r14 = r13.mo31374R2()
            if (r14 == 0) goto L_0x0082
            r11.setTriggerThatInvoked(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r12 = r11.getTriggerContextInfo()
            boolean r12 = r11.canInvoke(r12)
            if (r12 == 0) goto L_0x006e
            r9.add(r11)
            goto L_0x006e
        L_0x0100:
            boolean r1 = com.arlosoft.macrodroid.settings.C5163j2.m20313z2(r19)
            java.util.Iterator r4 = r9.iterator()
        L_0x0108:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x014c
            java.lang.Object r5 = r4.next()
            com.arlosoft.macrodroid.macro.Macro r5 = (com.arlosoft.macrodroid.macro.Macro) r5
            if (r1 == 0) goto L_0x0130
            java.util.ArrayList r8 = r5.getActions()
            java.util.Iterator r8 = r8.iterator()
        L_0x011e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0130
            java.lang.Object r9 = r8.next()
            com.arlosoft.macrodroid.action.Action r9 = (com.arlosoft.macrodroid.action.Action) r9
            boolean r9 = r9 instanceof com.arlosoft.macrodroid.action.VibrateAction
            if (r9 == 0) goto L_0x011e
            r8 = 0
            goto L_0x0131
        L_0x0130:
            r8 = r1
        L_0x0131:
            if (r8 == 0) goto L_0x0144
            java.lang.String r8 = "vibrator"
            java.lang.Object r8 = r0.getSystemService(r8)
            android.os.Vibrator r8 = (android.os.Vibrator) r8
            long[] r9 = new long[r7]
            r9 = {0, 40} // fill-array
            r10 = -1
            r8.vibrate(r9, r10)
        L_0x0144:
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r5.getTriggerContextInfo()
            r5.invokeActions(r8)
            goto L_0x0108
        L_0x014c:
            r0.stopSelf(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.receivers.widget.WidgetPressedService.onStartCommand(android.content.Intent, int, int):int");
    }
}
