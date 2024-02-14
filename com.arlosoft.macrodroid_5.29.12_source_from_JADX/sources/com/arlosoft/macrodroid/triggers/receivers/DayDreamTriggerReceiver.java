package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.DayDreamTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class DayDreamTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (Settings.Secure.getInt(context.getContentResolver(), "screensaver_enabled", 0) != 0) {
            boolean equals = intent.getAction().equals("android.intent.action.DREAMING_STARTED");
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof DayDreamTrigger) && ((DayDreamTrigger) next2).mo31070g3() == equals && next2.mo31374R2()) {
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                            next.setTriggerThatInvoked(next2);
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
}
