package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.DialNumberTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import p148q0.C8151a;

public class DialNumberTriggerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
        if (stringExtra != null) {
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if (next2 instanceof DialNumberTrigger) {
                        DialNumberTrigger dialNumberTrigger = (DialNumberTrigger) next2;
                        if (dialNumberTrigger.mo31086i3() == null) {
                            C8151a.m33873n(new RuntimeException("Dial Number Trigger has a null number set"));
                        } else if (dialNumberTrigger.mo31086i3().equals(stringExtra) && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                                if (!dialNumberTrigger.mo31087l3()) {
                                    setResultData((String) null);
                                    abortBroadcast();
                                }
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
