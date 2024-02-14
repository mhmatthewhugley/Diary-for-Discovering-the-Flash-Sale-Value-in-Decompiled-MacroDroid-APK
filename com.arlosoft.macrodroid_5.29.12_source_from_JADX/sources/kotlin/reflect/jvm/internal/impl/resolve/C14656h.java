package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.h */
/* compiled from: OverridingStrategy.kt */
public abstract class C14656h extends C14657i {
    /* renamed from: b */
    public void mo73766b(C13936b bVar, C13936b bVar2) {
        C13706o.m87929f(bVar, "first");
        C13706o.m87929f(bVar2, "second");
        mo72456e(bVar, bVar2);
    }

    /* renamed from: c */
    public void mo73767c(C13936b bVar, C13936b bVar2) {
        C13706o.m87929f(bVar, "fromSuper");
        C13706o.m87929f(bVar2, "fromCurrent");
        mo72456e(bVar, bVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo72456e(C13936b bVar, C13936b bVar2);
}
