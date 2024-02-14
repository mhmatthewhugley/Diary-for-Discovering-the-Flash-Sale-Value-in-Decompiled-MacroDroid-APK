package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.o */
/* compiled from: UnsignedType.kt */
public final class C13907o {

    /* renamed from: a */
    public static final C13907o f62302a = new C13907o();

    /* renamed from: b */
    private static final Set<C16157f> f62303b;

    /* renamed from: c */
    private static final Set<C16157f> f62304c;

    /* renamed from: d */
    private static final HashMap<C16151b, C16151b> f62305d = new HashMap<>();

    /* renamed from: e */
    private static final HashMap<C16151b, C16151b> f62306e = new HashMap<>();

    /* renamed from: f */
    private static final HashMap<C13905m, C16157f> f62307f = C13615t0.m87761k(C13337s.m85692a(C13905m.UBYTEARRAY, C16157f.m97019i("ubyteArrayOf")), C13337s.m85692a(C13905m.USHORTARRAY, C16157f.m97019i("ushortArrayOf")), C13337s.m85692a(C13905m.UINTARRAY, C16157f.m97019i("uintArrayOf")), C13337s.m85692a(C13905m.ULONGARRAY, C16157f.m97019i("ulongArrayOf")));

    /* renamed from: g */
    private static final Set<C16157f> f62308g;

    static {
        C13906n[] values = C13906n.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C13906n f : values) {
            arrayList.add(f.mo72227f());
        }
        f62303b = C13566b0.m87407K0(arrayList);
        C13905m[] values2 = C13905m.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (C13905m d : values2) {
            arrayList2.add(d.mo72224d());
        }
        f62304c = C13566b0.m87407K0(arrayList2);
        C13906n[] values3 = C13906n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C13906n d2 : values3) {
            linkedHashSet.add(d2.mo72225d().mo78552j());
        }
        f62308g = linkedHashSet;
        for (C13906n nVar : C13906n.values()) {
            f62305d.put(nVar.mo72225d(), nVar.mo72226e());
            f62306e.put(nVar.mo72226e(), nVar.mo72225d());
        }
    }

    private C13907o() {
    }

    /* renamed from: d */
    public static final boolean m88472d(C14900e0 e0Var) {
        C13961h c;
        C13706o.m87929f(e0Var, "type");
        if (!C14956n1.m93007v(e0Var) && (c = e0Var.mo73702N0().mo62183c()) != null) {
            return f62302a.mo72230c(c);
        }
        return false;
    }

    /* renamed from: a */
    public final C16151b mo72228a(C16151b bVar) {
        C13706o.m87929f(bVar, "arrayClassId");
        return f62305d.get(bVar);
    }

    /* renamed from: b */
    public final boolean mo72229b(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return f62308g.contains(fVar);
    }

    /* renamed from: c */
    public final boolean mo72230c(C14064m mVar) {
        C13706o.m87929f(mVar, "descriptor");
        C14064m b = mVar.mo62163b();
        return (b instanceof C14050k0) && C13706o.m87924a(((C14050k0) b).mo72551e(), C13902k.f62196r) && f62303b.contains(mVar.getName());
    }
}
