package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aJ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "", "count", "b", "d", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "c", "(Lkotlinx/coroutines/flow/g;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "e", "(Lkotlinx/coroutines/flow/f;Lqa/p;)Lkotlinx/coroutines/flow/f;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.o */
/* compiled from: Limit.kt */
final /* synthetic */ class C15362o {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/o$a", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15363a implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64578a;

        /* renamed from: c */
        final /* synthetic */ int f64579c;

        public C15363a(C15285f fVar, int i) {
            this.f64578a = fVar;
            this.f64579c = i;
        }

        public Object collect(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
            Object collect = this.f64578a.collect(new C15364b(new C13680b0(), this.f64579c, gVar), dVar);
            if (collect == C13652d.m87832c()) {
                return collect;
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"T", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o$b */
    /* compiled from: Limit.kt */
    static final class C15364b<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ C13680b0 f64580a;

        /* renamed from: c */
        final /* synthetic */ int f64581c;

        /* renamed from: d */
        final /* synthetic */ C15288g<T> f64582d;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", mo71894f = "Limit.kt", mo71895l = {25}, mo71896m = "emit")
        /* renamed from: kotlinx.coroutines.flow.o$b$a */
        /* compiled from: Limit.kt */
        static final class C15365a extends C13656d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15364b<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15365a(C15364b<? super T> bVar, C13635d<? super C15365a> dVar) {
                super(dVar);
                this.this$0 = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        C15364b(C13680b0 b0Var, int i, C15288g<? super T> gVar) {
            this.f64580a = b0Var;
            this.f64581c = i;
            this.f64582d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15362o.C15364b.C15365a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                kotlinx.coroutines.flow.o$b$a r0 = (kotlinx.coroutines.flow.C15362o.C15364b.C15365a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.o$b$a r0 = new kotlinx.coroutines.flow.o$b$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p297ja.C13332o.m85685b(r7)
                goto L_0x0047
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                p297ja.C13332o.m85685b(r7)
                kotlin.jvm.internal.b0 r7 = r5.f64580a
                int r2 = r7.element
                int r4 = r5.f64581c
                if (r2 < r4) goto L_0x004a
                kotlinx.coroutines.flow.g<T> r7 = r5.f64582d
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0047
                return r1
            L_0x0047:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            L_0x004a:
                int r2 = r2 + r3
                r7.element = r2
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15362o.C15364b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo71894f = "Limit.kt", mo71895l = {73}, mo71896m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: kotlinx.coroutines.flow.o$c */
    /* compiled from: Limit.kt */
    static final class C15366c<T> extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C15366c(C13635d<? super C15366c> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15362o.m94240c((C15288g) null, null, this);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/o$d", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o$d */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15367d implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64583a;

        /* renamed from: c */
        final /* synthetic */ int f64584c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", mo71894f = "Limit.kt", mo71895l = {115}, mo71896m = "collect")
        /* renamed from: kotlinx.coroutines.flow.o$d$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C15368a extends C13656d {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15367d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15368a(C15367d dVar, C13635d dVar2) {
                super(dVar2);
                this.this$0 = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C15288g) null, this);
            }
        }

        public C15367d(C15285f fVar, int i) {
            this.f64583a = fVar;
            this.f64584c = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r7, kotlin.coroutines.C13635d<? super p297ja.C13339u> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C15362o.C15367d.C15368a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                kotlinx.coroutines.flow.o$d$a r0 = (kotlinx.coroutines.flow.C15362o.C15367d.C15368a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.o$d$a r0 = new kotlinx.coroutines.flow.o$d$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
                p297ja.C13332o.m85685b(r8)     // Catch:{ AbortFlowException -> 0x0051 }
                goto L_0x0055
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                p297ja.C13332o.m85685b(r8)
                kotlin.jvm.internal.b0 r8 = new kotlin.jvm.internal.b0
                r8.<init>()
                kotlinx.coroutines.flow.f r2 = r6.f64583a     // Catch:{ AbortFlowException -> 0x0051 }
                kotlinx.coroutines.flow.o$e r4 = new kotlinx.coroutines.flow.o$e     // Catch:{ AbortFlowException -> 0x0051 }
                int r5 = r6.f64584c     // Catch:{ AbortFlowException -> 0x0051 }
                r4.<init>(r8, r5, r7)     // Catch:{ AbortFlowException -> 0x0051 }
                r0.L$0 = r7     // Catch:{ AbortFlowException -> 0x0051 }
                r0.label = r3     // Catch:{ AbortFlowException -> 0x0051 }
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch:{ AbortFlowException -> 0x0051 }
                if (r7 != r1) goto L_0x0055
                return r1
            L_0x0051:
                r8 = move-exception
                kotlinx.coroutines.flow.internal.C15323m.m94186a(r8, r7)
            L_0x0055:
                ja.u r7 = p297ja.C13339u.f61331a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15362o.C15367d.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"T", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o$e */
    /* compiled from: Limit.kt */
    static final class C15369e<T> implements C15288g {

        /* renamed from: a */
        final /* synthetic */ C13680b0 f64585a;

        /* renamed from: c */
        final /* synthetic */ int f64586c;

        /* renamed from: d */
        final /* synthetic */ C15288g<T> f64587d;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", mo71894f = "Limit.kt", mo71895l = {61, 63}, mo71896m = "emit")
        /* renamed from: kotlinx.coroutines.flow.o$e$a */
        /* compiled from: Limit.kt */
        static final class C15370a extends C13656d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15369e<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15370a(C15369e<? super T> eVar, C13635d<? super C15370a> dVar) {
                super(dVar);
                this.this$0 = eVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        C15369e(C13680b0 b0Var, int i, C15288g<? super T> gVar) {
            this.f64585a = b0Var;
            this.f64586c = i;
            this.f64587d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15362o.C15369e.C15370a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                kotlinx.coroutines.flow.o$e$a r0 = (kotlinx.coroutines.flow.C15362o.C15369e.C15370a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.o$e$a r0 = new kotlinx.coroutines.flow.o$e$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                p297ja.C13332o.m85685b(r7)
                goto L_0x005f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                p297ja.C13332o.m85685b(r7)
                goto L_0x0051
            L_0x0038:
                p297ja.C13332o.m85685b(r7)
                kotlin.jvm.internal.b0 r7 = r5.f64585a
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.f64586c
                if (r2 >= r7) goto L_0x0054
                kotlinx.coroutines.flow.g<T> r7 = r5.f64587d
                r0.label = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            L_0x0054:
                kotlinx.coroutines.flow.g<T> r7 = r5.f64587d
                r0.label = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.C15362o.m94240c(r7, r6, r0)
                if (r6 != r1) goto L_0x005f
                return r1
            L_0x005f:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15362o.C15369e.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/o$f", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o$f */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15371f implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64588a;

        /* renamed from: c */
        final /* synthetic */ C16269p f64589c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", mo71894f = "Limit.kt", mo71895l = {124}, mo71896m = "collect")
        /* renamed from: kotlinx.coroutines.flow.o$f$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C15372a extends C13656d {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15371f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15372a(C15371f fVar, C13635d dVar) {
                super(dVar);
                this.this$0 = fVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C15288g) null, this);
            }
        }

        public C15371f(C15285f fVar, C16269p pVar) {
            this.f64588a = fVar;
            this.f64589c = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15362o.C15371f.C15372a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                kotlinx.coroutines.flow.o$f$a r0 = (kotlinx.coroutines.flow.C15362o.C15371f.C15372a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.o$f$a r0 = new kotlinx.coroutines.flow.o$f$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r6 = r0.L$0
                kotlinx.coroutines.flow.o$g r6 = (kotlinx.coroutines.flow.C15362o.C15373g) r6
                p297ja.C13332o.m85685b(r7)     // Catch:{ AbortFlowException -> 0x002d }
                goto L_0x0053
            L_0x002d:
                r7 = move-exception
                goto L_0x0050
            L_0x002f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0037:
                p297ja.C13332o.m85685b(r7)
                kotlinx.coroutines.flow.f r7 = r5.f64588a
                kotlinx.coroutines.flow.o$g r2 = new kotlinx.coroutines.flow.o$g
                qa.p r4 = r5.f64589c
                r2.<init>(r4, r6)
                r0.L$0 = r2     // Catch:{ AbortFlowException -> 0x004e }
                r0.label = r3     // Catch:{ AbortFlowException -> 0x004e }
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x004e }
                if (r6 != r1) goto L_0x0053
                return r1
            L_0x004e:
                r7 = move-exception
                r6 = r2
            L_0x0050:
                kotlinx.coroutines.flow.internal.C15323m.m94186a(r7, r6)
            L_0x0053:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15362o.C15371f.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"kotlinx/coroutines/flow/o$g", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.o$g */
    /* compiled from: Limit.kt */
    public static final class C15373g implements C15288g<T> {

        /* renamed from: a */
        final /* synthetic */ C16269p f64590a;

        /* renamed from: c */
        final /* synthetic */ C15288g f64591c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", mo71894f = "Limit.kt", mo71895l = {143, 144}, mo71896m = "emit")
        /* renamed from: kotlinx.coroutines.flow.o$g$a */
        /* compiled from: Limit.kt */
        public static final class C15374a extends C13656d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15373g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15374a(C15373g gVar, C13635d dVar) {
                super(dVar);
                this.this$0 = gVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public C15373g(C16269p pVar, C15288g gVar) {
            this.f64590a = pVar;
            this.f64591c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r8, kotlin.coroutines.C13635d<? super p297ja.C13339u> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.C15362o.C15373g.C15374a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.flow.o$g$a r0 = (kotlinx.coroutines.flow.C15362o.C15373g.C15374a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.o$g$a r0 = new kotlinx.coroutines.flow.o$g$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r8 = r0.L$0
                kotlinx.coroutines.flow.o$g r8 = (kotlinx.coroutines.flow.C15362o.C15373g) r8
                p297ja.C13332o.m85685b(r9)
                goto L_0x007c
            L_0x0030:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0038:
                java.lang.Object r8 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.o$g r2 = (kotlinx.coroutines.flow.C15362o.C15373g) r2
                p297ja.C13332o.m85685b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L_0x0063
            L_0x0046:
                p297ja.C13332o.m85685b(r9)
                qa.p r9 = r7.f64590a
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                r2 = 6
                kotlin.jvm.internal.C13705n.m87923c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.C13705n.m87923c(r2)
                if (r9 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r2 = r9
                r9 = r8
                r8 = r7
            L_0x0063:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x007b
                kotlinx.coroutines.flow.g r2 = r8.f64591c
                r0.L$0 = r8
                r5 = 0
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L_0x007c
                return r1
            L_0x007b:
                r4 = 0
            L_0x007c:
                if (r4 == 0) goto L_0x0081
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            L_0x0081:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15362o.C15373g.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* renamed from: b */
    public static final <T> C15285f<T> m94239b(C15285f<? extends T> fVar, int i) {
        if (i >= 0) {
            return new C15363a(fVar, i);
        }
        throw new IllegalArgumentException(C13706o.m87936m("Drop count should be non-negative, but had ", Integer.valueOf(i)).toString());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m94240c(kotlinx.coroutines.flow.C15288g<? super T> r4, T r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C15362o.C15366c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.o$c r0 = (kotlinx.coroutines.flow.C15362o.C15366c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.o$c r0 = new kotlinx.coroutines.flow.o$c
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.C15288g) r4
            p297ja.C13332o.m85685b(r6)
            goto L_0x0043
        L_0x0035:
            p297ja.C13332o.m85685b(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15362o.m94240c(kotlinx.coroutines.flow.g, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: d */
    public static final <T> C15285f<T> m94241d(C15285f<? extends T> fVar, int i) {
        if (i > 0) {
            return new C15367d(fVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    /* renamed from: e */
    public static final <T> C15285f<T> m94242e(C15285f<? extends T> fVar, C16269p<? super T, ? super C13635d<? super Boolean>, ? extends Object> pVar) {
        return new C15371f(fVar, pVar);
    }
}
