package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.PowerButtonToggleTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class PowerButtonToggleTriggerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private Date f14368a = null;

    /* renamed from: b */
    private int f14369b = 0;

    /* renamed from: a */
    private int m24041a(Context context) {
        if (this.f14368a == null) {
            this.f14368a = new Date();
            this.f14369b = 1;
        } else if (new Date().getTime() - this.f14368a.getTime() < ((long) C5163j2.m20192k1(context))) {
            this.f14369b++;
        } else {
            this.f14368a = new Date();
            this.f14369b = 1;
        }
        return this.f14369b;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (((TelephonyManager) context.getSystemService("phone")).getCallState() != 0) {
                return;
            }
        } catch (Exception unused) {
        }
        int a = m24041a(context);
        if (a >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof PowerButtonToggleTrigger) && ((PowerButtonToggleTrigger) next2).mo31408g3() == a && next2.mo31374R2()) {
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                            next.setTriggerThatInvoked(next2);
                        }
                        this.f14368a = null;
                        this.f14369b = 0;
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
