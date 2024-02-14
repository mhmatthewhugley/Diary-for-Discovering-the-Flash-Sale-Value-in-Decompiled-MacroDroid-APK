package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.NetworkRoamingChangedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class NetworkRoamingChangedTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static boolean f14365a;

    /* renamed from: a */
    public static void m24037a(Context context) {
        f14365a = ((TelephonyManager) context.getSystemService("phone")).isNetworkRoaming();
    }

    public void onReceive(Context context, Intent intent) {
        boolean isNetworkRoaming = ((TelephonyManager) context.getSystemService("phone")).isNetworkRoaming();
        if (isNetworkRoaming != f14365a) {
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof NetworkRoamingChangedTrigger) && ((NetworkRoamingChangedTrigger) next2).mo31355h3() == isNetworkRoaming && next2.mo31374R2()) {
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
        }
        f14365a = isNetworkRoaming;
    }
}
