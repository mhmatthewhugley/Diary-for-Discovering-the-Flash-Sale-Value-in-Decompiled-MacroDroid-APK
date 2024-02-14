package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.HotspotTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class HotspotTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Trigger next;
        if (!isInitialStickyBroadcast()) {
            int intExtra = intent.getIntExtra("wifi_state", 0);
            ArrayList arrayList = new ArrayList();
            for (Macro next2 : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    if (next instanceof HotspotTrigger) {
                        HotspotTrigger hotspotTrigger = (HotspotTrigger) next;
                        if ((hotspotTrigger.mo31196g3() && intExtra - 10 == 3) || (!hotspotTrigger.mo31196g3() && intExtra - 10 == 1)) {
                        }
                    }
                }
                if (next.mo31374R2() && next2.canInvoke(next2.getTriggerContextInfo())) {
                    arrayList.add(next2);
                    next2.setTriggerThatInvoked(next);
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
