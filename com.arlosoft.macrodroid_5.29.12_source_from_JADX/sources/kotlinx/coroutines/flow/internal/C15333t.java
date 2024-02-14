package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.internal.C15471y;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0010¨\u0006\b"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/r;", "Lkotlin/coroutines/g;", "currentContext", "Lja/u;", "a", "Lkotlinx/coroutines/w1;", "collectJob", "b", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.t */
/* compiled from: SafeCollector.common.kt */
public final class C15333t {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "count", "Lkotlin/coroutines/g$b;", "element", "a", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.internal.t$a */
    /* compiled from: SafeCollector.common.kt */
    static final class C15334a extends C13708q implements C16269p<Integer, C13640g.C13643b, Integer> {
        final /* synthetic */ C15329r<?> $this_checkContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15334a(C15329r<?> rVar) {
            super(2);
            this.$this_checkContext = rVar;
        }

        /* renamed from: a */
        public final Integer mo74693a(int i, C13640g.C13643b bVar) {
            C13640g.C13645c key = bVar.getKey();
            C13640g.C13643b bVar2 = this.$this_checkContext.collectContext.get(key);
            if (key != C15561w1.f64808x) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
            }
            C15561w1 w1Var = (C15561w1) bVar2;
            C15561w1 b = C15333t.m94196b((C15561w1) bVar, w1Var);
            if (b == w1Var) {
                if (w1Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + w1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo74693a(((Number) obj).intValue(), (C13640g.C13643b) obj2);
        }
    }

    /* renamed from: a */
    public static final void m94195a(C15329r<?> rVar, C13640g gVar) {
        if (((Number) gVar.fold(0, new C15334a(rVar))).intValue() != rVar.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + rVar.collectContext + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final C15561w1 m94196b(C15561w1 w1Var, C15561w1 w1Var2) {
        while (w1Var != null) {
            if (w1Var == w1Var2 || !(w1Var instanceof C15471y)) {
                return w1Var;
            }
            w1Var = ((C15471y) w1Var).mo74832K0();
        }
        return null;
    }
}
