package p136n3;

import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.CallActiveTrigger;
import com.arlosoft.macrodroid.triggers.SignalOnOffTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.services.CallStateOffHookService;
import com.arlosoft.macrodroid.utils.C6398k0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n3.h */
/* compiled from: SignalOnOffTriggerReceiver */
public class C7976h extends PhoneStateListener {

    /* renamed from: a */
    private static boolean f19132a = false;

    public void onCallStateChanged(int i, String str) {
        if (i == 2) {
            Intent intent = new Intent(MacroDroidApplication.m14845u(), CallStateOffHookService.class);
            intent.putExtra("lastCallNumber", C6398k0.f15004a);
            MacroDroidApplication.m14845u().startService(intent);
        }
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        int state = serviceState.getState();
        boolean z = true;
        if (state != 0) {
            if (state != 1) {
            }
            z = false;
        }
        if (f19132a != z) {
            f19132a = z;
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof SignalOnOffTrigger) && !(next2 instanceof CallActiveTrigger) && ((SignalOnOffTrigger) next2).mo31483h3() == z && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
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
