package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.DayTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class DayTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof DayTrigger) {
                    DayTrigger dayTrigger = (DayTrigger) next2;
                    String stringExtra = intent.getStringExtra("alarmId");
                    if (stringExtra != null && stringExtra.equals(dayTrigger.mo31075h3()) && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                        dayTrigger.mo31076j3(false);
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
