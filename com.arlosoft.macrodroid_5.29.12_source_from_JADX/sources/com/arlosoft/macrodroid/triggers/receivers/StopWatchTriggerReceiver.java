package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.StopwatchTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class StopWatchTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        int intExtra = intent.getIntExtra("alarmId", -1);
        C4878b.m18879r("Stopwatch trigger wakeup - alarm id = " + intExtra);
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof StopwatchTrigger) {
                    StopwatchTrigger stopwatchTrigger = (StopwatchTrigger) next2;
                    if (intExtra == stopwatchTrigger.mo31510v3()) {
                        stopwatchTrigger.mo31509s3();
                        if (next2.mo31374R2()) {
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
}
