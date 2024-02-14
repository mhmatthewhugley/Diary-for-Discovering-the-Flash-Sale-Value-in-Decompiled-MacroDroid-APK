package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ExternalPowerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class ExternalPowerTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static boolean f14357a = false;

    /* renamed from: b */
    private static int f14358b = -99;

    public void onReceive(Context context, Intent intent) {
        boolean z;
        intent.getAction();
        int intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra != f14358b) {
            f14358b = intExtra;
            if (!f14357a) {
                f14357a = true;
                return;
            }
            boolean z2 = intExtra != 0;
            boolean z3 = intExtra == 4;
            boolean z4 = intExtra == 2;
            boolean z5 = intExtra == 1;
            if (z2) {
                C4878b.m18879r("Power connected - chargePlug = " + intExtra);
            } else {
                C4878b.m18879r("Power disconnected");
            }
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if (next2 instanceof ExternalPowerTrigger) {
                        ExternalPowerTrigger externalPowerTrigger = (ExternalPowerTrigger) next2;
                        boolean[] n3 = externalPowerTrigger.mo31111n3();
                        if (externalPowerTrigger.mo31110m3() != z2 || (z2 && ((!n3[0] || !z5) && ((!n3[1] || !z3) && ((!n3[2] || !z4) && (!n3[0] || !n3[1] || !n3[2])))))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
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
}
