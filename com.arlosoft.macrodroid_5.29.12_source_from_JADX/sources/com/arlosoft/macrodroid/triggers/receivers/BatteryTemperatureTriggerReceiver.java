package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BatteryTemperatureTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class BatteryTemperatureTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f14353a = -1;

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
            int intExtra = intent.getIntExtra("temperature", 0) / 10;
            int i = f14353a;
            if (i >= 0 && i != intExtra) {
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (it.hasNext()) {
                        Trigger next2 = it.next();
                        if (next2 instanceof BatteryTemperatureTrigger) {
                            BatteryTemperatureTrigger batteryTemperatureTrigger = (BatteryTemperatureTrigger) next2;
                            boolean z = true;
                            if (batteryTemperatureTrigger.mo30960n3() == 1 && next2.mo31374R2()) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            } else if (batteryTemperatureTrigger.mo30960n3() == 0) {
                                if (f14353a <= intExtra) {
                                    z = false;
                                }
                                if (!batteryTemperatureTrigger.mo30959m3() || !z) {
                                    if (!batteryTemperatureTrigger.mo30959m3() && !z && f14353a < batteryTemperatureTrigger.mo30961p3() && intExtra >= batteryTemperatureTrigger.mo30961p3() && next2.mo31374R2()) {
                                        next.setTriggerThatInvoked(next2);
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            arrayList.add(next);
                                        }
                                    }
                                } else if (f14353a > batteryTemperatureTrigger.mo30961p3() && intExtra <= batteryTemperatureTrigger.mo30961p3() && next2.mo31374R2()) {
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
            f14353a = intExtra;
        }
    }
}
