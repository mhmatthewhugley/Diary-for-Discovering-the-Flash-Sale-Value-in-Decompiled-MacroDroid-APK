package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.GPSEnabledTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class GPSEnabledTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static boolean f14359a;

    /* renamed from: a */
    public static void m24027a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            try {
                f14359a = locationManager.isProviderEnabled("gps");
            } catch (Exception unused) {
                f14359a = false;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
            try {
                z = ((LocationManager) context.getSystemService("location")).isProviderEnabled("gps");
            } catch (SecurityException unused) {
                z = false;
            }
            if (f14359a != z) {
                f14359a = z;
                ArrayList arrayList = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Trigger next2 = it.next();
                        if ((next2 instanceof GPSEnabledTrigger) && ((GPSEnabledTrigger) next2).mo31167g3() == z && next2.mo31374R2()) {
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
}
