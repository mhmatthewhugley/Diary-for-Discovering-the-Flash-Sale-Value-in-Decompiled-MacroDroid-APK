package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r */
/* compiled from: DescriptorVisibility.kt */
public abstract class C14077r extends C14141u {

    /* renamed from: a */
    private final C14068m1 f62687a;

    public C14077r(C14068m1 m1Var) {
        C13706o.m87929f(m1Var, "delegate");
        this.f62687a = m1Var;
    }

    /* renamed from: b */
    public C14068m1 mo72570b() {
        return this.f62687a;
    }

    /* renamed from: c */
    public String mo72571c() {
        return mo72570b().mo62371b();
    }

    /* renamed from: f */
    public C14141u mo72572f() {
        C14141u j = C14127t.m89528j(mo72570b().mo62372d());
        C13706o.m87928e(j, "toDescriptorVisibility(delegate.normalize())");
        return j;
    }
}
