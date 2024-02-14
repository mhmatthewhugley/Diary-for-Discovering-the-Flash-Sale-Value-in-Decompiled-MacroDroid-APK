package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BatteryLevelTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class BatteryLevelTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f14352a = -1;

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        intent.getIntExtra("temperature", 0);
        if (action.equals("android.intent.action.BATTERY_CHANGED")) {
            int intExtra = (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
            int i = f14352a;
            if (i >= 0 && i != intExtra) {
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (it.hasNext()) {
                        Trigger next2 = it.next();
                        if (next2 instanceof BatteryLevelTrigger) {
                            BatteryLevelTrigger batteryLevelTrigger = (BatteryLevelTrigger) next2;
                            boolean z = true;
                            if (batteryLevelTrigger.mo30946o3() == 1 && next2.mo31374R2()) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            } else if (batteryLevelTrigger.mo30946o3() == 0) {
                                if (f14352a <= intExtra) {
                                    z = false;
                                }
                                if (!batteryLevelTrigger.mo30945n3() || !z) {
                                    if (!batteryLevelTrigger.mo30945n3() && !z && f14352a < batteryLevelTrigger.mo30944m3() && intExtra >= batteryLevelTrigger.mo30944m3() && next2.mo31374R2()) {
                                        next.setTriggerThatInvoked(next2);
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    }
                                } else if (f14352a > batteryLevelTrigger.mo30944m3() && intExtra <= batteryLevelTrigger.mo30944m3() && next2.mo31374R2()) {
                                    next.setTriggerThatInvoked(next2);
                                    if (next.canInvoke(next.getTriggerContextInfo())) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Macro macro = (Macro) it2.next();
                    macro.invokeActions(macro.getTriggerContextInfo());
                }
            }
            f14352a = intExtra;
        }
    }
}
