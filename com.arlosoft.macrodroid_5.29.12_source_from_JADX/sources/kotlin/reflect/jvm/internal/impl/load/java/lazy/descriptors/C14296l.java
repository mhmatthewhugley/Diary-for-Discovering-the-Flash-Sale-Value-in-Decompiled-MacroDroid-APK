package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14274j;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p288ib.C12503r;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l */
/* compiled from: LazyJavaStaticScope.kt */
public abstract class C14296l extends C14274j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14296l(C14301g gVar) {
        super(gVar, (C14274j) null, 2, (C13695i) null);
        C13706o.m87929f(gVar, "c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C14274j.C14275a mo72829H(C12503r rVar, List<? extends C13950e1> list, C14900e0 e0Var, List<? extends C13966i1> list2) {
        C13706o.m87929f(rVar, "method");
        C13706o.m87929f(list, "methodTypeParameters");
        C13706o.m87929f(e0Var, "returnType");
        C13706o.m87929f(list2, "valueParameters");
        return new C14274j.C14275a(e0Var, (C14900e0) null, list2, list, false, C13614t.m87748j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo72837s(C16157f fVar, Collection<C14140t0> collection) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(collection, "result");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C14146w0 mo72842z() {
        return null;
    }
}
