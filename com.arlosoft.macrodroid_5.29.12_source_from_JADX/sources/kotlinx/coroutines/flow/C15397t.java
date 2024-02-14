package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.flow.internal.C15315i;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16270q;
import p370qa.C16273t;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a¼\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00040\u00062:\u0010\u000f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\u0013\"\u0004\b\u0000\u0010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo71668d2 = {"T1", "T2", "T3", "T4", "T5", "R", "Lkotlinx/coroutines/flow/f;", "flow", "flow2", "flow3", "flow4", "flow5", "Lkotlin/Function6;", "Lkotlin/coroutines/d;", "", "transform", "b", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/f;Lqa/t;)Lkotlinx/coroutines/flow/f;", "T", "Lkotlin/Function0;", "", "c", "()Lqa/a;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.t */
/* compiled from: Zip.kt */
final /* synthetic */ class C15397t {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.t$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15398a implements C15285f<R> {

        /* renamed from: a */
        final /* synthetic */ C15285f[] f64606a;

        /* renamed from: c */
        final /* synthetic */ C16273t f64607c;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/g;", "", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", mo71894f = "Zip.kt", mo71895l = {333, 333}, mo71896m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.t$a$a */
        /* compiled from: Zip.kt */
        public static final class C15399a extends C13665l implements C16270q<C15288g<? super R>, Object[], C13635d<? super C13339u>, Object> {
            final /* synthetic */ C16273t $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15399a(C13635d dVar, C16273t tVar) {
                super(3, dVar);
                this.$transform$inlined = tVar;
            }

            /* renamed from: h */
            public final Object invoke(C15288g<? super R> gVar, Object[] objArr, C13635d<? super C13339u> dVar) {
                C15399a aVar = new C15399a(dVar, this.$transform$inlined);
                aVar.L$0 = gVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(C13339u.f61331a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.g} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r1 = r11.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    p297ja.C13332o.m85685b(r12)
                    goto L_0x005d
                L_0x0012:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001a:
                    java.lang.Object r1 = r11.L$0
                    kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
                    p297ja.C13332o.m85685b(r12)
                    goto L_0x0051
                L_0x0022:
                    p297ja.C13332o.m85685b(r12)
                    java.lang.Object r12 = r11.L$0
                    r1 = r12
                    kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
                    java.lang.Object r12 = r11.L$1
                    java.lang.Object[] r12 = (java.lang.Object[]) r12
                    qa.t r4 = r11.$transform$inlined
                    r5 = 0
                    r5 = r12[r5]
                    r6 = r12[r3]
                    r7 = r12[r2]
                    r8 = 3
                    r8 = r12[r8]
                    r9 = 4
                    r9 = r12[r9]
                    r11.L$0 = r1
                    r11.label = r3
                    r12 = 6
                    kotlin.jvm.internal.C13705n.m87923c(r12)
                    r10 = r11
                    java.lang.Object r12 = r4.mo28012e(r5, r6, r7, r8, r9, r10)
                    r3 = 7
                    kotlin.jvm.internal.C13705n.m87923c(r3)
                    if (r12 != r0) goto L_0x0051
                    return r0
                L_0x0051:
                    r3 = 0
                    r11.L$0 = r3
                    r11.label = r2
                    java.lang.Object r12 = r1.emit(r12, r11)
                    if (r12 != r0) goto L_0x005d
                    return r0
                L_0x005d:
                    ja.u r12 = p297ja.C13339u.f61331a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15397t.C15398a.C15399a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C15398a(C15285f[] fVarArr, C16273t tVar) {
            this.f64606a = fVarArr;
            this.f64607c = tVar;
        }

        public Object collect(C15288g gVar, C13635d dVar) {
            Object a = C15315i.m94183a(gVar, this.f64606a, C15397t.m94259c(), new C15399a((C13635d) null, this.f64607c), dVar);
            if (a == C13652d.m87832c()) {
                return a;
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"T", "", "a", "()Ljava/lang/Void;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.t$b */
    /* compiled from: Zip.kt */
    static final class C15400b extends C13708q implements C16254a {

        /* renamed from: a */
        public static final C15400b f64608a = new C15400b();

        C15400b() {
            super(0);
        }

        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: b */
    public static final <T1, T2, T3, T4, T5, R> C15285f<R> m94258b(C15285f<? extends T1> fVar, C15285f<? extends T2> fVar2, C15285f<? extends T3> fVar3, C15285f<? extends T4> fVar4, C15285f<? extends T5> fVar5, C16273t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super C13635d<? super R>, ? extends Object> tVar) {
        return new C15398a(new C15285f[]{fVar, fVar2, fVar3, fVar4, fVar5}, tVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final <T> C16254a<T[]> m94259c() {
        return C15400b.f64608a;
    }
}
