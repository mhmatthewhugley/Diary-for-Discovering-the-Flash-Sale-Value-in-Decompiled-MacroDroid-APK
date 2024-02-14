package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13684d0;
import kotlinx.coroutines.flow.internal.C15328q;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/flow/f;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/f;Lqa/l;Lqa/p;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.e */
/* compiled from: Distinct.kt */
final class C15281e<T> implements C15285f<T> {

    /* renamed from: a */
    private final C15285f<T> f64510a;

    /* renamed from: c */
    public final C16265l<T, Object> f64511c;

    /* renamed from: d */
    public final C16269p<Object, Object, Boolean> f64512d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"T", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.e$a */
    /* compiled from: Distinct.kt */
    static final class C15282a<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ C15281e<T> f64513a;

        /* renamed from: c */
        final /* synthetic */ C13684d0<Object> f64514c;

        /* renamed from: d */
        final /* synthetic */ C15288g<T> f64515d;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo71894f = "Distinct.kt", mo71895l = {81}, mo71896m = "emit")
        /* renamed from: kotlinx.coroutines.flow.e$a$a */
        /* compiled from: Distinct.kt */
        static final class C15283a extends C13656d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15282a<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15283a(C15282a<? super T> aVar, C13635d<? super C15283a> dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        C15282a(C15281e<T> eVar, C13684d0<Object> d0Var, C15288g<? super T> gVar) {
            this.f64513a = eVar;
            this.f64514c = d0Var;
            this.f64515d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15281e.C15282a.C15283a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                kotlinx.coroutines.flow.e$a$a r0 = (kotlinx.coroutines.flow.C15281e.C15282a.C15283a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.e$a$a r0 = new kotlinx.coroutines.flow.e$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p297ja.C13332o.m85685b(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                p297ja.C13332o.m85685b(r7)
                kotlinx.coroutines.flow.e<T> r7 = r5.f64513a
                qa.l<T, java.lang.Object> r7 = r7.f64511c
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.d0<java.lang.Object> r2 = r5.f64514c
                T r2 = r2.element
                kotlinx.coroutines.internal.a0 r4 = kotlinx.coroutines.flow.internal.C15328q.f64550a
                if (r2 == r4) goto L_0x0058
                kotlinx.coroutines.flow.e<T> r4 = r5.f64513a
                qa.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f64512d
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            L_0x0058:
                kotlin.jvm.internal.d0<java.lang.Object> r2 = r5.f64514c
                r2.element = r7
                kotlinx.coroutines.flow.g<T> r7 = r5.f64515d
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15281e.C15282a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public C15281e(C15285f<? extends T> fVar, C16265l<? super T, ? extends Object> lVar, C16269p<Object, Object, Boolean> pVar) {
        this.f64510a = fVar;
        this.f64511c = lVar;
        this.f64512d = pVar;
    }

    public Object collect(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        C13684d0 d0Var = new C13684d0();
        d0Var.element = C15328q.f64550a;
        Object collect = this.f64510a.collect(new C15282a(this, d0Var, gVar), dVar);
        return collect == C13652d.m87832c() ? collect : C13339u.f61331a;
    }
}
