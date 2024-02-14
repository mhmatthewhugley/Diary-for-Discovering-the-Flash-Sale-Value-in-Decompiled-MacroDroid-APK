package p289ic;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.internal.C15443g;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001al\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u00032\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo71668d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "receiver", "completion", "Lkotlin/Function1;", "", "Lja/u;", "onCancellation", "c", "(Lqa/p;Ljava/lang/Object;Lkotlin/coroutines/d;Lqa/l;)V", "fatalCompletion", "b", "e", "a", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: ic.a */
/* compiled from: Cancellable.kt */
public final class C12514a {
    /* renamed from: a */
    private static final void m83618a(C13635d<?> dVar, Throwable th) {
        C13329n.C13330a aVar = C13329n.f61327a;
        dVar.resumeWith(C13329n.m85676a(C13332o.m85684a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m83619b(C13635d<? super C13339u> dVar, C13635d<?> dVar2) {
        try {
            C13635d b = C13649c.m87831b(dVar);
            C13329n.C13330a aVar = C13329n.f61327a;
            C15443g.m94381c(b, C13329n.m85676a(C13339u.f61331a), (C16265l) null, 2, (Object) null);
        } catch (Throwable th) {
            m83618a(dVar2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m83620c(C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar, R r, C13635d<? super T> dVar, C16265l<? super Throwable, C13339u> lVar) {
        try {
            C13635d b = C13649c.m87831b(C13649c.m87830a(pVar, r, dVar));
            C13329n.C13330a aVar = C13329n.f61327a;
            C15443g.m94380b(b, C13329n.m85676a(C13339u.f61331a), lVar);
        } catch (Throwable th) {
            m83618a(dVar, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m83621d(C16269p pVar, Object obj, C13635d dVar, C16265l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m83620c(pVar, obj, dVar, lVar);
    }
}
