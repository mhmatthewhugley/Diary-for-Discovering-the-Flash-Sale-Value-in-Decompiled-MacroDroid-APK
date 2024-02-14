package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15549t2;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, mo71668d2 = {"Lkotlin/coroutines/g;", "context", "", "b", "countOrElement", "c", "oldState", "Lja/u;", "a", "Lkotlinx/coroutines/internal/a0;", "Lkotlinx/coroutines/internal/a0;", "NO_THREAD_ELEMENTS", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.e0 */
/* compiled from: ThreadContext.kt */
public final class C15437e0 {

    /* renamed from: a */
    public static final C15429a0 f64642a = new C15429a0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C16269p<Object, C13640g.C13643b, Object> f64643b = C15438a.f64646a;

    /* renamed from: c */
    private static final C16269p<C15549t2<?>, C13640g.C13643b, C15549t2<?>> f64644c = C15439b.f64647a;

    /* renamed from: d */
    private static final C16269p<C15450j0, C13640g.C13643b, C15450j0> f64645d = C15440c.f64648a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "countOrElement", "Lkotlin/coroutines/g$b;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/g$b;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.e0$a */
    /* compiled from: ThreadContext.kt */
    static final class C15438a extends C13708q implements C16269p<Object, C13640g.C13643b, Object> {

        /* renamed from: a */
        public static final C15438a f64646a = new C15438a();

        C15438a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, C13640g.C13643b bVar) {
            if (!(bVar instanceof C15549t2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlinx/coroutines/t2;", "found", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlinx/coroutines/t2;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/t2;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.e0$b */
    /* compiled from: ThreadContext.kt */
    static final class C15439b extends C13708q implements C16269p<C15549t2<?>, C13640g.C13643b, C15549t2<?>> {

        /* renamed from: a */
        public static final C15439b f64647a = new C15439b();

        C15439b() {
            super(2);
        }

        /* renamed from: a */
        public final C15549t2<?> invoke(C15549t2<?> t2Var, C13640g.C13643b bVar) {
            if (t2Var != null) {
                return t2Var;
            }
            if (bVar instanceof C15549t2) {
                return (C15549t2) bVar;
            }
            return null;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlinx/coroutines/internal/j0;", "state", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlinx/coroutines/internal/j0;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/internal/j0;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.e0$c */
    /* compiled from: ThreadContext.kt */
    static final class C15440c extends C13708q implements C16269p<C15450j0, C13640g.C13643b, C15450j0> {

        /* renamed from: a */
        public static final C15440c f64648a = new C15440c();

        C15440c() {
            super(2);
        }

        /* renamed from: a */
        public final C15450j0 invoke(C15450j0 j0Var, C13640g.C13643b bVar) {
            if (bVar instanceof C15549t2) {
                C15549t2 t2Var = (C15549t2) bVar;
                j0Var.mo74791a(t2Var, t2Var.mo74777z(j0Var.f64663a));
            }
            return j0Var;
        }
    }

    /* renamed from: a */
    public static final void m94360a(C13640g gVar, Object obj) {
        if (obj != f64642a) {
            if (obj instanceof C15450j0) {
                ((C15450j0) obj).mo74792b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f64644c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C15549t2) fold).mo74775r(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m94361b(C13640g gVar) {
        Object fold = gVar.fold(0, f64643b);
        C13706o.m87926c(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m94362c(C13640g gVar, Object obj) {
        if (obj == null) {
            obj = m94361b(gVar);
        }
        if (obj == 0) {
            return f64642a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new C15450j0(gVar, ((Number) obj).intValue()), f64645d);
        }
        return ((C15549t2) obj).mo74777z(gVar);
    }
}
