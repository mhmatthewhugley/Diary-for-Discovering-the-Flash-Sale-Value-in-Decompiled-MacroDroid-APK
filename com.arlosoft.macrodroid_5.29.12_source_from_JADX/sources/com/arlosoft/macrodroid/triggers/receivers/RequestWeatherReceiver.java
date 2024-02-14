package com.arlosoft.macrodroid.triggers.receivers;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.WeatherTrigger;
import com.arlosoft.macrodroid.triggers.services.WeatherService;
import java.util.Iterator;

public class RequestWeatherReceiver extends WakefulBroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            for (Macro triggerListWithAwaitingActions : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = triggerListWithAwaitingActions.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof WeatherTrigger) {
                            WakefulBroadcastReceiver.startWakefulService(context, new Intent(context, WeatherService.class));
                            return;
                        }
                    }
                }
            }
        } catch (IllegalStateException e) {
            C4878b.m18868g("Could not request weather data - foreground service not enabled? " + e.toString());
        }
    }
}
