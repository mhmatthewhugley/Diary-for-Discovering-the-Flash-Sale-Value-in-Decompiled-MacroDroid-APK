package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.y */
/* compiled from: FunctionDescriptor */
public interface C14154y extends C13936b {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.y$a */
    /* compiled from: FunctionDescriptor */
    public interface C14155a<D extends C14154y> {
        /* renamed from: a */
        C14155a<D> mo72494a();

        /* renamed from: b */
        C14155a<D> mo72495b(List<C13966i1> list);

        D build();

        /* renamed from: c */
        C14155a<D> mo72497c(C14146w0 w0Var);

        /* renamed from: d */
        C14155a<D> mo72498d();

        /* renamed from: e */
        C14155a<D> mo72499e(C14146w0 w0Var);

        /* renamed from: f */
        C14155a<D> mo72500f(C14936j1 j1Var);

        /* renamed from: g */
        <V> C14155a<D> mo72501g(C13908a.C13909a<V> aVar, V v);

        /* renamed from: h */
        C14155a<D> mo72502h(C14141u uVar);

        /* renamed from: i */
        C14155a<D> mo72503i();

        /* renamed from: j */
        C14155a<D> mo72504j(C16157f fVar);

        /* renamed from: k */
        C14155a<D> mo72505k(C13945d0 d0Var);

        /* renamed from: l */
        C14155a<D> mo72506l();

        /* renamed from: m */
        C14155a<D> mo72507m(C14900e0 e0Var);

        /* renamed from: n */
        C14155a<D> mo72508n(C13936b bVar);

        /* renamed from: o */
        C14155a<D> mo72509o(boolean z);

        /* renamed from: p */
        C14155a<D> mo72510p(List<C13950e1> list);

        /* renamed from: q */
        C14155a<D> mo72511q(C14064m mVar);

        /* renamed from: r */
        C14155a<D> mo72512r(C13936b.C13937a aVar);

        /* renamed from: s */
        C14155a<D> mo72513s(C13921g gVar);

        /* renamed from: t */
        C14155a<D> mo72514t();
    }

    /* renamed from: B */
    boolean mo62204B();

    /* renamed from: C0 */
    boolean mo72317C0();

    /* renamed from: F0 */
    boolean mo72320F0();

    /* renamed from: a */
    C14154y mo72233a();

    /* renamed from: b */
    C14064m mo62163b();

    /* renamed from: c */
    C14154y mo72267c(C14945l1 l1Var);

    /* renamed from: d */
    Collection<? extends C14154y> mo72234d();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    /* renamed from: s0 */
    C14154y mo72331s0();

    /* renamed from: t */
    C14155a<? extends C14154y> mo72401t();
}
