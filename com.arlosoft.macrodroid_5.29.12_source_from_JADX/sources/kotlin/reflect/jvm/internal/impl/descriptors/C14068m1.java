package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m1 */
/* compiled from: Visibility.kt */
public abstract class C14068m1 {

    /* renamed from: a */
    private final String f62685a;

    /* renamed from: b */
    private final boolean f62686b;

    protected C14068m1(String str, boolean z) {
        C13706o.m87929f(str, "name");
        this.f62685a = str;
        this.f62686b = z;
    }

    /* renamed from: a */
    public Integer mo62370a(C14068m1 m1Var) {
        C13706o.m87929f(m1Var, "visibility");
        return C14054l1.f62671a.mo72564a(this, m1Var);
    }

    /* renamed from: b */
    public String mo62371b() {
        return this.f62685a;
    }

    /* renamed from: c */
    public final boolean mo72568c() {
        return this.f62686b;
    }

    /* renamed from: d */
    public C14068m1 mo62372d() {
        return this;
    }

    public final String toString() {
        return mo62371b();
    }
}
