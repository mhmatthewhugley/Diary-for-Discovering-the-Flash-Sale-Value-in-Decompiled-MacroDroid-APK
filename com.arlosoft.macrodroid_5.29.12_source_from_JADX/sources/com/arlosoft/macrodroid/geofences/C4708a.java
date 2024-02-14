package com.arlosoft.macrodroid.geofences;

import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.Iterator;
import p125l3.C7665a;

/* renamed from: com.arlosoft.macrodroid.geofences.a */
/* compiled from: GeofenceHelper */
public class C4708a {
    /* renamed from: a */
    public static void m18258a(@NonNull String str) {
        for (Macro triggerListWithAwaitingActions : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = triggerListWithAwaitingActions.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                if (next instanceof C7665a) {
                    C7665a aVar = (C7665a) next;
                    if (str.equals(aVar.mo31173o())) {
                        aVar.mo31172H();
                        next.mo31543T2();
                        next.mo27818D2(false);
                    }
                }
            }
        }
    }
}
