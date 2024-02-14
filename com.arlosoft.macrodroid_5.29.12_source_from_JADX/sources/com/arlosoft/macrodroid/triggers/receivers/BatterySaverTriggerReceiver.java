package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BatterySaverTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class BatterySaverTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ArrayList<Macro> arrayList = new ArrayList<>();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof BatterySaverTrigger) {
                    BatterySaverTrigger batterySaverTrigger = (BatterySaverTrigger) next2;
                    if (batterySaverTrigger.mo30954g3() == 0 && powerManager.isPowerSaveMode() && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                    } else if (batterySaverTrigger.mo30954g3() == 1 && !powerManager.isPowerSaveMode() && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        for (Macro macro : arrayList) {
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }
}
