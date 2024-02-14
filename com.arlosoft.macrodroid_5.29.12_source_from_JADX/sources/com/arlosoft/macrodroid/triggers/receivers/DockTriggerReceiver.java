package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.DockTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class DockTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.intent.extra.DOCK_STATE", -1);
        boolean z = false;
        boolean z2 = intExtra == 2;
        if (intExtra == 1 || intExtra == 3 || intExtra == 4) {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof DockTrigger) {
                    int g3 = ((DockTrigger) next2).mo31095g3();
                    if (((intExtra == 0 && g3 == 3) || ((intExtra != 0 && g3 == 0) || ((z2 && g3 == 2) || (z && g3 == 1)))) && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                            break;
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
