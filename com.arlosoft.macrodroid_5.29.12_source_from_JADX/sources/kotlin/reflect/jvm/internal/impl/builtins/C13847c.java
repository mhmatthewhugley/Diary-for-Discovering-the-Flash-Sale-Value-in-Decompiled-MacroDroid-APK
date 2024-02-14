package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.c */
/* compiled from: CompanionObjectMapping.kt */
public final class C13847c {

    /* renamed from: a */
    public static final C13847c f62065a = new C13847c();

    /* renamed from: b */
    private static final Set<C16151b> f62066b;

    static {
        Set<C13859i> set = C13859i.f62087c;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(set, 10));
        for (C13859i c : set) {
            arrayList.add(C13902k.m88456c(c));
        }
        C16152c l = C13902k.C13903a.f62253h.mo78579l();
        C13706o.m87928e(l, "string.toSafe()");
        List r0 = C13566b0.m87443r0(arrayList, l);
        C16152c l2 = C13902k.C13903a.f62257j.mo78579l();
        C13706o.m87928e(l2, "_boolean.toSafe()");
        List r02 = C13566b0.m87443r0(r0, l2);
        C16152c l3 = C13902k.C13903a.f62275s.mo78579l();
        C13706o.m87928e(l3, "_enum.toSafe()");
        List<C16152c> r03 = C13566b0.m87443r0(r02, l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16152c m : r03) {
            linkedHashSet.add(C16151b.m96975m(m));
        }
        f62066b = linkedHashSet;
    }

    private C13847c() {
    }

    /* renamed from: a */
    public final Set<C16151b> mo72108a() {
        return f62066b;
    }

    /* renamed from: b */
    public final Set<C16151b> mo72109b() {
        return f62066b;
    }
}
