package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.i */
/* compiled from: OverridingStrategy.kt */
public abstract class C14657i {
    /* renamed from: a */
    public abstract void mo72455a(C13936b bVar);

    /* renamed from: b */
    public abstract void mo73766b(C13936b bVar, C13936b bVar2);

    /* renamed from: c */
    public abstract void mo73767c(C13936b bVar, C13936b bVar2);

    /* renamed from: d */
    public void mo72684d(C13936b bVar, Collection<? extends C13936b> collection) {
        C13706o.m87929f(bVar, "member");
        C13706o.m87929f(collection, "overridden");
        bVar.mo72262D0(collection);
    }
}
