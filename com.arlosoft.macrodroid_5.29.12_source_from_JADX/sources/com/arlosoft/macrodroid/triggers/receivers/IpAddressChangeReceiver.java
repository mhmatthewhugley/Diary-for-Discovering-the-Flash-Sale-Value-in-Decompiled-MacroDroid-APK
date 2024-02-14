package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.IpAddressChangeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class IpAddressChangeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        String M = C4061t1.m15967M();
        String l1 = C5163j2.m20200l1(context);
        if (!M.equals("?") && !M.equals(l1)) {
            if (l1 == null) {
                C5163j2.m20101Y4(context, M);
                return;
            }
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof IpAddressChangeTrigger) && next2.mo31374R2()) {
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
            C5163j2.m20101Y4(context, M);
        }
    }
}
