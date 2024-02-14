package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.SilentModeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class SilentModeTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f14372a = -1;

    /* renamed from: b */
    private static long f14373b;

    public void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            boolean z = true;
            if (!(intExtra == 0 || 1 == intExtra)) {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (intExtra != f14372a || f14373b + 1000 <= currentTimeMillis) {
                f14373b = currentTimeMillis;
                f14372a = intExtra;
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Trigger next2 = it.next();
                        if ((next2 instanceof SilentModeTrigger) && ((SilentModeTrigger) next2).mo31488h3() == z && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Macro macro = (Macro) it2.next();
                    macro.invokeActions(macro.getTriggerContextInfo());
                }
                return;
            }
            C4878b.m18864c("Ignoring duplicate SilentModeTriggerReceiver broadcast: " + intExtra);
        }
    }
}
