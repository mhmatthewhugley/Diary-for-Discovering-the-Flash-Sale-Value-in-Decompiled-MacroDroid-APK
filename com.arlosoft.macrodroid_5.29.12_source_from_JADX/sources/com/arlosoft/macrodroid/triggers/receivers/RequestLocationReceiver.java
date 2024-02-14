package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.LocationTriggerService;
import java.util.Iterator;

public class RequestLocationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (it.hasNext()) {
                    Trigger next2 = it.next();
                    if ((next2 instanceof LocationTrigger) && next2.mo31374R2() && next.canInvoke((TriggerContextInfo) null)) {
                        context.startService(new Intent(context, LocationTriggerService.class));
                        LocationTrigger.m22612s3(context, false);
                        return;
                    }
                }
            }
        }
        LocationTrigger.m22612s3(context, false);
    }
}
