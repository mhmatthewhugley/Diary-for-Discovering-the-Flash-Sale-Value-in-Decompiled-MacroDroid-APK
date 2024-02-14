package com.arlosoft.macrodroid.triggers.receivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.PriorityModeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: PriorityModeReceiver.kt */
public final class PriorityModeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C6073a f14370a = new C6073a((C13695i) null);

    /* renamed from: b */
    private static int f14371b = -1;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.PriorityModeReceiver$a */
    /* compiled from: PriorityModeReceiver.kt */
    public static final class C6073a {
        private C6073a() {
        }

        public /* synthetic */ C6073a(C13695i iVar) {
            this();
        }
    }

    public void onReceive(Context context, Intent intent) {
        ArrayList<Macro> arrayList = new ArrayList<>();
        Object systemService = context != null ? context.getSystemService("notification") : null;
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
        if (currentInterruptionFilter != f14371b) {
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof PriorityModeTrigger) && next2.mo27845e0((TriggerContextInfo) null) && ((PriorityModeTrigger) next2).mo31413g3() == currentInterruptionFilter - 1) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            C13706o.m87928e(next, "macro");
                            arrayList.add(next);
                        }
                    }
                }
            }
            for (Macro macro : arrayList) {
                macro.invokeActions(macro.getTriggerContextInfo());
            }
            f14371b = currentInterruptionFilter;
        }
    }
}
