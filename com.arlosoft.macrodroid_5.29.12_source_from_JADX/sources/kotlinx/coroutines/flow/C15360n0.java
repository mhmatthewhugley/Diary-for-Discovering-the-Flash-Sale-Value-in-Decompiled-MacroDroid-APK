package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BB\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"Lkotlinx/coroutines/flow/n0;", "T", "Lkotlinx/coroutines/flow/z;", "Lkotlinx/coroutines/flow/g;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/flow/z;", "sharedFlow", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lja/u;", "", "action", "<init>", "(Lkotlinx/coroutines/flow/z;Lqa/p;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.n0 */
/* compiled from: Share.kt */
final class C15360n0<T> implements C15406z<T> {

    /* renamed from: a */
    private final C15406z<T> f64576a;

    /* renamed from: c */
    private final C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> f64577c;

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.SubscribedSharedFlow", mo71894f = "Share.kt", mo71895l = {409}, mo71896m = "collect")
    /* renamed from: kotlinx.coroutines.flow.n0$a */
    /* compiled from: Share.kt */
    static final class C15361a extends C13656d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C15360n0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15361a(C15360n0<T> n0Var, C13635d<? super C15361a> dVar) {
            super(dVar);
            this.this$0 = n0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect((C15288g) null, this);
        }
    }

    public C15360n0(C15406z<? extends T> zVar, C16269p<? super C15288g<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        this.f64576a = zVar;
        this.f64577c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r6, kotlin.coroutines.C13635d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15360n0.C15361a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.n0$a r0 = (kotlinx.coroutines.flow.C15360n0.C15361a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.n0$a r0 = new kotlinx.coroutines.flow.n0$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            p297ja.C13332o.m85685b(r7)
            goto L_0x0046
        L_0x0031:
            p297ja.C13332o.m85685b(r7)
            kotlinx.coroutines.flow.z<T> r7 = r5.f64576a
            kotlinx.coroutines.flow.m0 r2 = new kotlinx.coroutines.flow.m0
            qa.p<kotlinx.coroutines.flow.g<? super T>, kotlin.coroutines.d<? super ja.u>, java.lang.Object> r4 = r5.f64577c
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15360n0.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
    }
}
