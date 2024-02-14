package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.action.services.AndroidWearService;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.AndroidWearTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.utils.e */
/* compiled from: AndroidWearHelper.kt */
public final class C6375e {

    /* renamed from: a */
    public static final C6375e f14968a = new C6375e();

    private C6375e() {
    }

    /* renamed from: c */
    public static final void m24619c(Context context, boolean z) {
        C13706o.m87929f(context, "context");
        MacroDroidService.f7040a.mo24640e().mo32491b(Void.class, new C6372d(context, z), 500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m24620d(Context context, boolean z) {
        C13706o.m87929f(context, "$context");
        new Handler(Looper.getMainLooper()).post(new C6369c(context, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m24621e(Context context, boolean z) {
        C13706o.m87929f(context, "$context");
        List<Macro> z2 = C4934n.m18998M().mo29710z();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Set<String> J = C5163j2.m19991J(context);
        for (Macro next : z2) {
            if (next.isEnabled() && !J.contains(next.getCategory())) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (it.hasNext()) {
                    Trigger next2 = it.next();
                    if ((next2 instanceof AndroidWearTrigger) && ((AndroidWearTrigger) next2).mo30904i3() == 0 && next2.mo31374R2()) {
                        String name = next.getName();
                        C13706o.m87928e(name, "macro.name");
                        arrayList.add(name);
                        String k3 = ((AndroidWearTrigger) next2).mo30905k3();
                        C13706o.m87928e(k3, "trigger.resourceName");
                        arrayList2.add(k3);
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array2 = arrayList2.toArray(new String[0]);
        C13706o.m87927d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        AndroidWearService.m14329l(context, (String[]) array, (String[]) array2, z);
    }
}
