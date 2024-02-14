package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ApplicationInstalledRemovedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class ApplicationInstalledRemovedTriggerReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private boolean m24023a(ApplicationInstalledRemovedTrigger applicationInstalledRemovedTrigger, String str) {
        if (applicationInstalledRemovedTrigger.mo30913o3()) {
            return true;
        }
        for (String equals : applicationInstalledRemovedTrigger.mo30916s3()) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void onReceive(Context context, Intent intent) {
        boolean equals = intent.getAction().equals("android.intent.action.PACKAGE_ADDED");
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        String dataString = intent.getDataString();
        if (dataString.startsWith("package:")) {
            dataString = dataString.substring(8);
        }
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof ApplicationInstalledRemovedTrigger) {
                    ApplicationInstalledRemovedTrigger applicationInstalledRemovedTrigger = (ApplicationInstalledRemovedTrigger) next2;
                    if (applicationInstalledRemovedTrigger.mo30915q3()) {
                        if (equals && booleanExtra && m24023a(applicationInstalledRemovedTrigger, dataString) && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            next.setTriggerContextInfo(new TriggerContextInfo(next2, dataString));
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    } else if (applicationInstalledRemovedTrigger.mo30914p3() == equals && !booleanExtra && m24023a(applicationInstalledRemovedTrigger, dataString) && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        next.setTriggerContextInfo(new TriggerContextInfo(next2, dataString));
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
