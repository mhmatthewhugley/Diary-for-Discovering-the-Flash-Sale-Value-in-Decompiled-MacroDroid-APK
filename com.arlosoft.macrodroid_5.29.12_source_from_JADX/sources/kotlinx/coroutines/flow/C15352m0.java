package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BB\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/flow/m0;", "T", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/g;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "action", "<init>", "(Lkotlinx/coroutines/flow/g;Lqa/p;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.m0 */
/* compiled from: Share.kt */
public final class C15352m0<T> implements C15288g<T> {

    /* renamed from: a */
    private final C15288g<T> f64570a;

    /* renamed from: c */
    private final C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> f64571c;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo71894f = "Share.kt", mo71895l = {419, 423}, mo71896m = "onSubscription")
    /* renamed from: kotlinx.coroutines.flow.m0$a */
    /* compiled from: Share.kt */
    static final class C15353a extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C15352m0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15353a(C15352m0<T> m0Var, C13635d<? super C15353a> dVar) {
            super(dVar);
            this.this$0 = m0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo74707a(this);
        }
    }

    public C15352m0(C15288g<? super T> gVar, C16269p<? super C15288g<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        this.f64570a = gVar;
        this.f64571c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74707a(kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15352m0.C15353a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.m0$a r0 = (kotlinx.coroutines.flow.C15352m0.C15353a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.m0$a r0 = new kotlinx.coroutines.flow.m0$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p297ja.C13332o.m85685b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.internal.r r2 = (kotlinx.coroutines.flow.internal.C15329r) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.m0 r4 = (kotlinx.coroutines.flow.C15352m0) r4
            p297ja.C13332o.m85685b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            p297ja.C13332o.m85685b(r7)
            kotlinx.coroutines.flow.internal.r r2 = new kotlinx.coroutines.flow.internal.r
            kotlinx.coroutines.flow.g<T> r7 = r6.f64570a
            kotlin.coroutines.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            qa.p<kotlinx.coroutines.flow.g<? super T>, kotlin.coroutines.d<? super ja.u>, java.lang.Object> r7 = r6.f64571c     // Catch:{ all -> 0x007d }
            r0.L$0 = r6     // Catch:{ all -> 0x007d }
            r0.L$1 = r2     // Catch:{ all -> 0x007d }
            r0.label = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.g<T> r7 = r4.f64570a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.C15352m0
            if (r2 == 0) goto L_0x007a
            kotlinx.coroutines.flow.m0 r7 = (kotlinx.coroutines.flow.C15352m0) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.mo74707a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x007a:
            ja.u r7 = p297ja.C13339u.f61331a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15352m0.mo74707a(kotlin.coroutines.d):java.lang.Object");
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        return this.f64570a.emit(t, dVar);
    }
}
