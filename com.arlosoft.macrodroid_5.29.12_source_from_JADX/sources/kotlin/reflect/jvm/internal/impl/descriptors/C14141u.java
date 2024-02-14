package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13706o;
import p416vb.C16756f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.u */
/* compiled from: DescriptorVisibility.kt */
public abstract class C14141u {
    protected C14141u() {
    }

    /* renamed from: a */
    public final Integer mo72659a(C14141u uVar) {
        C13706o.m87929f(uVar, "visibility");
        return mo72570b().mo62370a(uVar.mo72570b());
    }

    /* renamed from: b */
    public abstract C14068m1 mo72570b();

    /* renamed from: c */
    public abstract String mo72571c();

    /* renamed from: d */
    public final boolean mo72660d() {
        return mo72570b().mo72568c();
    }

    /* renamed from: e */
    public abstract boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z);

    /* renamed from: f */
    public abstract C14141u mo72572f();

    public final String toString() {
        return mo72570b().toString();
    }
}
