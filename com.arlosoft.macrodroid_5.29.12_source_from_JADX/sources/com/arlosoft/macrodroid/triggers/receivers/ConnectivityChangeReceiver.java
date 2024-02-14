package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.DataOnOffTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class ConnectivityChangeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static boolean f14355a = false;

    /* renamed from: b */
    private static boolean f14356b = false;

    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        if (!f14356b || f14355a != z) {
            f14356b = true;
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof DataOnOffTrigger) && ((DataOnOffTrigger) next2).mo31065g3() == z && next2.mo31374R2()) {
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
            f14355a = z;
        }
    }
}
