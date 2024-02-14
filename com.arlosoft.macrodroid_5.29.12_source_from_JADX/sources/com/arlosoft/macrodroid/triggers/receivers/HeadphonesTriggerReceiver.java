package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.HeadphonesTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class HeadphonesTriggerReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private boolean m24028a(@NonNull HeadphonesTrigger headphonesTrigger, boolean z) {
        if (!headphonesTrigger.mo31186k3() || headphonesTrigger.mo31187l3() == 0) {
            return true;
        }
        return headphonesTrigger.mo31187l3() == 1 ? !z : z;
    }

    public void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            boolean z = true;
            boolean z2 = intent.getIntExtra("state", -1) != 0;
            if (intent.getIntExtra("microphone", -1) == 0) {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if (next2 instanceof HeadphonesTrigger) {
                        HeadphonesTrigger headphonesTrigger = (HeadphonesTrigger) next2;
                        if (headphonesTrigger.mo31186k3() == z2 && m24028a(headphonesTrigger, z) && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
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
}
