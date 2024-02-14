package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p289ic.C12515b;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\n\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0010H\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo71668d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/d;", "", "block", "c", "(JLqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "U", "Lkotlinx/coroutines/y2;", "coroutine", "b", "(Lkotlinx/coroutines/y2;Lqa/p;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z2 */
/* compiled from: Timeout.kt */
public final class C15576z2 {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.TimeoutKt", mo71894f = "Timeout.kt", mo71895l = {100}, mo71896m = "withTimeoutOrNull")
    /* renamed from: kotlinx.coroutines.z2$a */
    /* compiled from: Timeout.kt */
    static final class C15577a<T> extends C13656d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C15577a(C13635d<? super C15577a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15576z2.m94763c(0, (C16269p) null, this);
        }
    }

    /* renamed from: a */
    public static final TimeoutCancellationException m94761a(long j, C15561w1 w1Var) {
        return new TimeoutCancellationException("Timed out waiting for " + j + " ms", w1Var);
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m94762b(C15572y2<U, ? super T> y2Var, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar) {
        C15575z1.m94758f(y2Var, C15552u0.m94700b(y2Var.f64696d.getContext()).mo74506j(y2Var.f64815f, y2Var, y2Var.getContext()));
        return C12515b.m83624c(y2Var, y2Var, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m94763c(long r7, p370qa.C16269p<? super kotlinx.coroutines.C15478k0, ? super kotlin.coroutines.C13635d<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.C13635d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.C15576z2.C15577a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.z2$a r0 = (kotlinx.coroutines.C15576z2.C15577a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.z2$a r0 = new kotlinx.coroutines.z2$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.d0 r7 = (kotlin.jvm.internal.C13684d0) r7
            java.lang.Object r8 = r0.L$0
            qa.p r8 = (p370qa.C16269p) r8
            p297ja.C13332o.m85685b(r10)     // Catch:{ TimeoutCancellationException -> 0x0032 }
            goto L_0x006b
        L_0x0032:
            r8 = move-exception
            goto L_0x006e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            p297ja.C13332o.m85685b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.d0 r10 = new kotlin.jvm.internal.d0
            r10.<init>()
            r0.L$0 = r9     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.L$1 = r10     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.J$0 = r7     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.label = r4     // Catch:{ TimeoutCancellationException -> 0x006c }
            kotlinx.coroutines.y2 r2 = new kotlinx.coroutines.y2     // Catch:{ TimeoutCancellationException -> 0x006c }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
            r10.element = r2     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r7 = m94762b(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C13652d.m87832c()     // Catch:{ TimeoutCancellationException -> 0x006c }
            if (r7 != r8) goto L_0x0067
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
        L_0x0067:
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r10 = r7
        L_0x006b:
            return r10
        L_0x006c:
            r8 = move-exception
            r7 = r10
        L_0x006e:
            kotlinx.coroutines.w1 r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L_0x0075
            return r3
        L_0x0075:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15576z2.m94763c(long, qa.p, kotlin.coroutines.d):java.lang.Object");
    }
}
