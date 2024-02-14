package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.C15412g1;
import kotlinx.coroutines.C15558v2;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\r8\u0002X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u0012\u0004\b\u0013\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo71668d2 = {"T", "Lkotlin/coroutines/d;", "Lja/n;", "result", "Lkotlin/Function1;", "", "Lja/u;", "onCancellation", "b", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lqa/l;)V", "Lkotlinx/coroutines/internal/f;", "", "d", "Lkotlinx/coroutines/internal/a0;", "a", "Lkotlinx/coroutines/internal/a0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.g */
/* compiled from: DispatchedContinuation.kt */
public final class C15443g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C15429a0 f64657a = new C15429a0("UNDEFINED");

    /* renamed from: b */
    public static final C15429a0 f64658b = new C15429a0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo74514L0() != false) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m94380b(kotlin.coroutines.C13635d<? super T> r6, java.lang.Object r7, p370qa.C16265l<? super java.lang.Throwable, p297ja.C13339u> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C15441f
            if (r0 == 0) goto L_0x00b6
            kotlinx.coroutines.internal.f r6 = (kotlinx.coroutines.internal.C15441f) r6
            java.lang.Object r8 = kotlinx.coroutines.C15260e0.m94021c(r7, r8)
            kotlinx.coroutines.h0 r0 = r6.f64650f
            kotlin.coroutines.g r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f64652o = r8
            r6.f64813d = r1
            kotlinx.coroutines.h0 r7 = r6.f64650f
            kotlin.coroutines.g r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto L_0x00b9
        L_0x0026:
            kotlinx.coroutines.v2 r0 = kotlinx.coroutines.C15558v2.f64805a
            kotlinx.coroutines.g1 r0 = r0.mo74921b()
            boolean r2 = r0.mo74722H()
            if (r2 == 0) goto L_0x003b
            r6.f64652o = r8
            r6.f64813d = r1
            r0.mo74719C(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo74721E(r1)
            r2 = 0
            kotlin.coroutines.g r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.w1$b r4 = kotlinx.coroutines.C15561w1.f64808x     // Catch:{ all -> 0x00a9 }
            kotlin.coroutines.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.w1 r3 = (kotlinx.coroutines.C15561w1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo74487b()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo74612g()     // Catch:{ all -> 0x00a9 }
            r6.mo74764b(r8, r3)     // Catch:{ all -> 0x00a9 }
            ja.n$a r8 = p297ja.C13329n.f61327a     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p297ja.C13332o.m85684a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p297ja.C13329n.m85676a(r8)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            kotlin.coroutines.d<T> r8 = r6.f64651g     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f64653p     // Catch:{ all -> 0x00a9 }
            kotlin.coroutines.g r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.C15437e0.m94362c(r4, r3)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.a0 r5 = kotlinx.coroutines.internal.C15437e0.f64642a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            kotlinx.coroutines.b3 r8 = kotlinx.coroutines.C15408g0.m94275g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            kotlin.coroutines.d<T> r5 = r6.f64651g     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            ja.u r7 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo74514L0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.C15437e0.m94360a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo74514L0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.C15437e0.m94360a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo74725L()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo74927g(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo74727o(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo74727o(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C15443g.m94380b(kotlin.coroutines.d, java.lang.Object, qa.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m94381c(C13635d dVar, Object obj, C16265l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m94380b(dVar, obj, lVar);
    }

    /* renamed from: d */
    public static final boolean m94382d(C15441f<? super C13339u> fVar) {
        C13339u uVar = C13339u.f61331a;
        C15412g1 b = C15558v2.f64805a.mo74921b();
        if (b.mo74723J()) {
            return false;
        }
        if (b.mo74722H()) {
            fVar.f64652o = uVar;
            fVar.f64813d = 1;
            b.mo74719C(fVar);
            return true;
        }
        b.mo74721E(true);
        try {
            fVar.run();
            do {
            } while (b.mo74725L());
        } catch (Throwable th) {
            b.mo74727o(true);
            throw th;
        }
        b.mo74727o(true);
        return false;
    }
}
