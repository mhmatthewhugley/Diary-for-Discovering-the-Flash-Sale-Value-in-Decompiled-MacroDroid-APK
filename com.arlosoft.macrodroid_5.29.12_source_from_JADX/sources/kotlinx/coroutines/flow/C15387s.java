package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13680b0;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\u001a\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo71668d2 = {"", "T", "Lkotlinx/coroutines/flow/f;", "a", "Lkotlin/collections/k0;", "c", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lja/u;", "action", "b", "(Lkotlinx/coroutines/flow/f;Lqa/p;)Lkotlinx/coroutines/flow/f;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.s */
/* compiled from: Transform.kt */
final /* synthetic */ class C15387s {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.s$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15388a implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64597a;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"T", "R", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.s$a$a */
        /* compiled from: Emitters.kt */
        public static final class C15389a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C15288g f64598a;

            @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
            @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", mo71894f = "Transform.kt", mo71895l = {223}, mo71896m = "emit")
            /* renamed from: kotlinx.coroutines.flow.s$a$a$a */
            /* compiled from: Emitters.kt */
            public static final class C15390a extends C13656d {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C15389a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C15390a(C15389a aVar, C13635d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            }

            public C15389a(C15288g gVar) {
                this.f64598a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.C15387s.C15388a.C15389a.C15390a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    kotlinx.coroutines.flow.s$a$a$a r0 = (kotlinx.coroutines.flow.C15387s.C15388a.C15389a.C15390a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.s$a$a$a r0 = new kotlinx.coroutines.flow.s$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p297ja.C13332o.m85685b(r6)
                    goto L_0x0041
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p297ja.C13332o.m85685b(r6)
                    kotlinx.coroutines.flow.g r6 = r4.f64598a
                    if (r5 == 0) goto L_0x0041
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15387s.C15388a.C15389a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C15388a(C15285f fVar) {
            this.f64597a = fVar;
        }

        public Object collect(C15288g gVar, C13635d dVar) {
            Object collect = this.f64597a.collect(new C15389a(gVar), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.s$b */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15391b implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64599a;

        /* renamed from: c */
        final /* synthetic */ C16269p f64600c;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"T", "R", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.s$b$a */
        /* compiled from: Emitters.kt */
        public static final class C15392a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C15288g f64601a;

            /* renamed from: c */
            final /* synthetic */ C16269p f64602c;

            @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
            @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", mo71894f = "Transform.kt", mo71895l = {223, 224}, mo71896m = "emit")
            /* renamed from: kotlinx.coroutines.flow.s$b$a$a */
            /* compiled from: Emitters.kt */
            public static final class C15393a extends C13656d {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C15392a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C15393a(C15392a aVar, C13635d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            }

            public C15392a(C15288g gVar, C16269p pVar) {
                this.f64601a = gVar;
                this.f64602c = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15387s.C15391b.C15392a.C15393a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    kotlinx.coroutines.flow.s$b$a$a r0 = (kotlinx.coroutines.flow.C15387s.C15391b.C15392a.C15393a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.s$b$a$a r0 = new kotlinx.coroutines.flow.s$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    p297ja.C13332o.m85685b(r7)
                    goto L_0x006a
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.L$1
                    kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.C15288g) r6
                    java.lang.Object r2 = r0.L$0
                    p297ja.C13332o.m85685b(r7)
                    goto L_0x005c
                L_0x003e:
                    p297ja.C13332o.m85685b(r7)
                    kotlinx.coroutines.flow.g r7 = r5.f64601a
                    qa.p r2 = r5.f64602c
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    r4 = 6
                    kotlin.jvm.internal.C13705n.m87923c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.C13705n.m87923c(r4)
                    if (r2 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r2 = r6
                    r6 = r7
                L_0x005c:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    ja.u r6 = p297ja.C13339u.f61331a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15387s.C15391b.C15392a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C15391b(C15285f fVar, C16269p pVar) {
            this.f64599a = fVar;
            this.f64600c = pVar;
        }

        public Object collect(C15288g gVar, C13635d dVar) {
            Object collect = this.f64599a.collect(new C15392a(gVar, this.f64600c), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/s$c", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.s$c */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15394c implements C15285f<C13592k0<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64603a;

        public C15394c(C15285f fVar) {
            this.f64603a = fVar;
        }

        public Object collect(C15288g<? super C13592k0<? extends T>> gVar, C13635d<? super C13339u> dVar) {
            Object collect = this.f64603a.collect(new C15395d(gVar, new C13680b0()), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"T", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.s$d */
    /* compiled from: Transform.kt */
    static final class C15395d<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ C15288g<C13592k0<? extends T>> f64604a;

        /* renamed from: c */
        final /* synthetic */ C13680b0 f64605c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", mo71894f = "Transform.kt", mo71895l = {65}, mo71896m = "emit")
        /* renamed from: kotlinx.coroutines.flow.s$d$a */
        /* compiled from: Transform.kt */
        static final class C15396a extends C13656d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15395d<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15396a(C15395d<? super T> dVar, C13635d<? super C15396a> dVar2) {
                super(dVar2);
                this.this$0 = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        C15395d(C15288g<? super C13592k0<? extends T>> gVar, C13680b0 b0Var) {
            this.f64604a = gVar;
            this.f64605c = b0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r8, kotlin.coroutines.C13635d<? super p297ja.C13339u> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.C15387s.C15395d.C15396a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.flow.s$d$a r0 = (kotlinx.coroutines.flow.C15387s.C15395d.C15396a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.s$d$a r0 = new kotlinx.coroutines.flow.s$d$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p297ja.C13332o.m85685b(r9)
                goto L_0x004e
            L_0x0029:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0031:
                p297ja.C13332o.m85685b(r9)
                kotlinx.coroutines.flow.g<kotlin.collections.k0<? extends T>> r9 = r7.f64604a
                kotlin.collections.k0 r2 = new kotlin.collections.k0
                kotlin.jvm.internal.b0 r4 = r7.f64605c
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L_0x0051
                r2.<init>(r5, r8)
                r0.label = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L_0x004e
                return r1
            L_0x004e:
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            L_0x0051:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15387s.C15395d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> C15285f<T> m94254a(C15285f<? extends T> fVar) {
        return new C15388a(fVar);
    }

    /* renamed from: b */
    public static final <T> C15285f<T> m94255b(C15285f<? extends T> fVar, C16269p<? super T, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        return new C15391b(fVar, pVar);
    }

    /* renamed from: c */
    public static final <T> C15285f<C13592k0<T>> m94256c(C15285f<? extends T> fVar) {
        return new C15394c(fVar);
    }
}
