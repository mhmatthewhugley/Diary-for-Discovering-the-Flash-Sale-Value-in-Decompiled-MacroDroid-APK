package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.i */
/* compiled from: Annotations.kt */
public final class C13926i {
    /* renamed from: a */
    public static final C13921g m88508a(C13921g gVar, C13921g gVar2) {
        C13706o.m87929f(gVar, "first");
        C13706o.m87929f(gVar2, "second");
        if (gVar.isEmpty()) {
            return gVar2;
        }
        if (gVar2.isEmpty()) {
            return gVar;
        }
        return new C13929k(gVar, gVar2);
    }
}
