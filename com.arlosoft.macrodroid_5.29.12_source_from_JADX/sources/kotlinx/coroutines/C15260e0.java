package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"T", "Lja/n;", "Lkotlin/Function1;", "", "Lja/u;", "onCancellation", "", "c", "(Ljava/lang/Object;Lqa/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/n;", "caller", "b", "(Ljava/lang/Object;Lkotlinx/coroutines/n;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/d;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e0 */
/* compiled from: CompletionState.kt */
public final class C15260e0 {
    /* renamed from: a */
    public static final <T> Object m94019a(Object obj, C13635d<? super T> dVar) {
        if (obj instanceof C15196b0) {
            C13329n.C13330a aVar = C13329n.f61327a;
            return C13329n.m85676a(C13332o.m85684a(((C15196b0) obj).f64404a));
        }
        C13329n.C13330a aVar2 = C13329n.f61327a;
        return C13329n.m85676a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m94020b(Object obj, C15492n<?> nVar) {
        Throwable c = C13329n.m85678c(obj);
        return c == null ? obj : new C15196b0(c, false, 2, (C13695i) null);
    }

    /* renamed from: c */
    public static final <T> Object m94021c(Object obj, C16265l<? super Throwable, C13339u> lVar) {
        Throwable c = C13329n.m85678c(obj);
        if (c != null) {
            return new C15196b0(c, false, 2, (C13695i) null);
        }
        if (lVar != null) {
            return new C15201c0(obj, lVar);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m94022d(Object obj, C16265l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m94021c(obj, lVar);
    }
}
