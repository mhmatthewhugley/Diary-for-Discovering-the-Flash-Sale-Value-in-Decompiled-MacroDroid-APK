package com.arlosoft.macrodroid.triggers.receivers;

import android.content.Context;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.PebbleTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.util.PebbleDictionary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class PebbleBatteryUpdateReceiver extends PebbleKit.PebbleDataReceiver {

    /* renamed from: b */
    private static int f14367b = -1;

    public PebbleBatteryUpdateReceiver(UUID uuid) {
        super(uuid);
    }

    /* renamed from: b */
    public static int m24039b() {
        return f14367b;
    }

    /* renamed from: a */
    public void mo31400a(Context context, int i, PebbleDictionary pebbleDictionary) {
        int i2;
        PebbleKit.m26087h(MacroDroidApplication.m14845u(), i);
        if (pebbleDictionary.mo34299n(2)) {
            int intValue = pebbleDictionary.mo34300p(2).intValue();
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof PebbleTrigger) && next2.mo31374R2()) {
                        PebbleTrigger pebbleTrigger = (PebbleTrigger) next2;
                        if (pebbleTrigger.mo31397x3() == 3 && (i2 = f14367b) >= 0 && i2 != intValue) {
                            boolean z = i2 > intValue;
                            if (!pebbleTrigger.mo31396w3() || !z) {
                                if (!pebbleTrigger.mo31396w3() && !z && f14367b < pebbleTrigger.mo31395u3() && intValue >= pebbleTrigger.mo31395u3()) {
                                    next.setTriggerThatInvoked(next2);
                                    if (next.canInvoke(next.getTriggerContextInfo())) {
                                        arrayList.add(next);
                                    }
                                }
                            } else if (f14367b > pebbleTrigger.mo31395u3() && intValue <= pebbleTrigger.mo31395u3()) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                }
            }
            f14367b = intValue;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Macro macro = (Macro) it2.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }
    }
}
