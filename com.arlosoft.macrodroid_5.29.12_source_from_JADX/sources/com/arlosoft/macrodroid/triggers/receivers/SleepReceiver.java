package com.arlosoft.macrodroid.triggers.receivers;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.SleepTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.google.android.gms.location.SleepClassifyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: SleepReceiver.kt */
public final class SleepReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C6075a f14376a = new C6075a((C13695i) null);

    /* renamed from: b */
    private static C6076b f14377b = C6076b.NONE;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.SleepReceiver$a */
    /* compiled from: SleepReceiver.kt */
    public static final class C6075a {
        private C6075a() {
        }

        public /* synthetic */ C6075a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final PendingIntent mo31976a(Context context) {
            C13706o.m87929f(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, SleepReceiver.class), C6368b1.f14959b | 268435456);
            C13706o.m87928e(broadcast, "getBroadcast(\n          …G_IMMUTABLE\n            )");
            return broadcast;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.SleepReceiver$b */
    /* compiled from: SleepReceiver.kt */
    public enum C6076b {
        NONE,
        AWAKE,
        ASLEEP,
        UNCERTAIN
    }

    public void onReceive(Context context, Intent intent) {
        C6076b bVar;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        ArrayList<Macro> arrayList = new ArrayList<>();
        if (SleepClassifyEvent.m64692p2(intent)) {
            List<SleepClassifyEvent> l2 = SleepClassifyEvent.m64691l2(intent);
            C13706o.m87928e(l2, "extractEvents(intent)");
            Iterator<SleepClassifyEvent> it = l2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SleepClassifyEvent next = it.next();
                if (next.mo54209m2() >= C5163j2.m20105Z1(context)) {
                    bVar = C6076b.ASLEEP;
                } else if (next.mo54209m2() <= C5163j2.m20113a2(context)) {
                    bVar = C6076b.AWAKE;
                } else {
                    bVar = C6076b.NONE;
                }
                C4878b.m18879r("Sleep confidence = {" + next + ".confidence}/100. Motion = " + next.mo54211o2() + "/6, light =" + next.mo54210n2() + "/6 (" + bVar + ')');
                if (bVar != f14377b && bVar != C6076b.UNCERTAIN) {
                    for (Macro next2 : C4934n.m18998M().mo29679I()) {
                        Iterator<Trigger> it2 = next2.getTriggerListWithAwaitingActions().iterator();
                        while (it2.hasNext()) {
                            Trigger next3 = it2.next();
                            if (next3 instanceof SleepTrigger) {
                                SleepTrigger sleepTrigger = (SleepTrigger) next3;
                                if (((sleepTrigger.mo31498u3() && bVar == C6076b.AWAKE) || (!sleepTrigger.mo31498u3() && bVar == C6076b.ASLEEP)) && next3.mo31374R2()) {
                                    next2.setTriggerThatInvoked(next3);
                                    if (next2.canInvoke(next2.getTriggerContextInfo())) {
                                        C13706o.m87928e(next2, "macro");
                                        arrayList.add(next2);
                                    }
                                }
                            }
                        }
                    }
                    f14377b = bVar;
                }
            }
        }
        for (Macro macro : arrayList) {
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }
}
