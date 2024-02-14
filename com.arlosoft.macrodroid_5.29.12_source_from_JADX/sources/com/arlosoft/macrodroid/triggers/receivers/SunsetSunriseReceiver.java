package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.SunriseSunsetTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.Iterator;

public class SunsetSunriseReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Context context2;
        Intent intent2 = intent;
        boolean booleanExtra = intent2.getBooleanExtra("is_sunrise", false);
        long longExtra = intent2.getLongExtra("trigger_guid", 0);
        Macro macro = null;
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2.mo27847f1() == longExtra) {
                    SunriseSunsetTrigger sunriseSunsetTrigger = (SunriseSunsetTrigger) next2;
                    if (((sunriseSunsetTrigger.mo31519k3() == 0 && booleanExtra) || (sunriseSunsetTrigger.mo31519k3() == 1 && !booleanExtra)) && next.canInvoke(next.getTriggerContextInfo())) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > sunriseSunsetTrigger.mo31518j3() + 5000 && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            sunriseSunsetTrigger.mo31521r3(currentTimeMillis);
                            context2 = context;
                            macro = next;
                            sunriseSunsetTrigger.mo31520q3(context2);
                        }
                    }
                    context2 = context;
                    sunriseSunsetTrigger.mo31520q3(context2);
                } else {
                    Context context3 = context;
                }
            }
            Context context4 = context;
        }
        if (macro != null) {
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }
}
