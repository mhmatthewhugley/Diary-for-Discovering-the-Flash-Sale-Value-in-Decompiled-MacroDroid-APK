package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.VpnTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: VpnChangeReceiver.kt */
public final class VpnChangeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C6078a f14388a = new C6078a((C13695i) null);

    /* renamed from: b */
    private static boolean f14389b;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.VpnChangeReceiver$a */
    /* compiled from: VpnChangeReceiver.kt */
    public static final class C6078a {
        private C6078a() {
        }

        public /* synthetic */ C6078a(C13695i iVar) {
            this();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getSystemService("connectivity");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        C13706o.m87928e(allNetworks, "cm.allNetworks");
        int length = allNetworks.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!f14389b) {
            f14389b = true;
            if (!z) {
                return;
            }
        }
        if (z != C5163j2.m20289w2(context)) {
            C5163j2.m20197k6(context, z);
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof VpnTrigger) && ((VpnTrigger) next2).mo31605h3() == z && next2.mo31374R2()) {
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
        }
    }
}
