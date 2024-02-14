package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TimerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class AlarmReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        String stringExtra = intent.getStringExtra("alarmId");
        C4878b.m18879r("Alarm fired: " + stringExtra);
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof TimerTrigger) {
                    TimerTrigger timerTrigger = (TimerTrigger) next2;
                    if (stringExtra != null && stringExtra.equals(timerTrigger.mo31535g3())) {
                        if (next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                        timerTrigger.mo31536i3(false);
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
