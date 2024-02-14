package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r0 */
/* compiled from: typeParameterUtils.kt */
public final class C14078r0 {

    /* renamed from: a */
    private final C13964i f62688a;

    /* renamed from: b */
    private final List<C14926g1> f62689b;

    /* renamed from: c */
    private final C14078r0 f62690c;

    public C14078r0(C13964i iVar, List<? extends C14926g1> list, C14078r0 r0Var) {
        C13706o.m87929f(iVar, "classifierDescriptor");
        C13706o.m87929f(list, "arguments");
        this.f62688a = iVar;
        this.f62689b = list;
        this.f62690c = r0Var;
    }

    /* renamed from: a */
    public final List<C14926g1> mo72573a() {
        return this.f62689b;
    }

    /* renamed from: b */
    public final C13964i mo72574b() {
        return this.f62688a;
    }

    /* renamed from: c */
    public final C14078r0 mo72575c() {
        return this.f62690c;
    }
}
