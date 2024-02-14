package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.SimChangeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: SimChangeReceiver.kt */
public final class SimChangeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C6074a f14374a = new C6074a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f14375b;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.SimChangeReceiver$a */
    /* compiled from: SimChangeReceiver.kt */
    public static final class C6074a {
        private C6074a() {
        }

        public /* synthetic */ C6074a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo31974a() {
            SimChangeReceiver.f14375b = false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        if (!f14375b) {
            f14375b = true;
            return;
        }
        String stringExtra = intent.getStringExtra("ss");
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof SimChangeTrigger) {
                    SimChangeTrigger simChangeTrigger = (SimChangeTrigger) next2;
                    if (((simChangeTrigger.mo31493h3() == 0 && C13706o.m87924a(stringExtra, "READY")) || (simChangeTrigger.mo31493h3() == 1 && C13706o.m87924a(stringExtra, "ABSENT") && next2.mo31374R2())) && next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                        next.setTriggerThatInvoked(next2);
                        break;
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
