package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u001aP\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a_\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/d;", "Lja/u;", "", "action", "e", "(Lkotlinx/coroutines/flow/f;Lqa/p;)Lkotlinx/coroutines/flow/f;", "Lkotlin/Function3;", "", "d", "(Lkotlinx/coroutines/flow/f;Lqa/q;)Lkotlinx/coroutines/flow/f;", "b", "cause", "c", "(Lkotlinx/coroutines/flow/g;Lqa/q;Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.n */
/* compiled from: Emitters.kt */
final /* synthetic */ class C15354n {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", mo71894f = "Emitters.kt", mo71895l = {216}, mo71896m = "invokeSafely$FlowKt__EmittersKt")
    /* renamed from: kotlinx.coroutines.flow.n$a */
    /* compiled from: Emitters.kt */
    static final class C15355a<T> extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C15355a(C13635d<? super C15355a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15354n.m94235c((C15288g) null, (C16270q) null, (Throwable) null, this);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/n$b", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.n$b */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15356b implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C15285f f64572a;

        /* renamed from: c */
        final /* synthetic */ C16270q f64573c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", mo71894f = "Emitters.kt", mo71895l = {114, 121, 128}, mo71896m = "collect")
        /* renamed from: kotlinx.coroutines.flow.n$b$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C15357a extends C13656d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15356b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15357a(C15356b bVar, C13635d dVar) {
                super(dVar);
                this.this$0 = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C15288g) null, this);
            }
        }

        public C15356b(C15285f fVar, C16270q qVar) {
            this.f64572a = fVar;
            this.f64573c = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r9, kotlin.coroutines.C13635d<? super p297ja.C13339u> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.C15354n.C15356b.C15357a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                kotlinx.coroutines.flow.n$b$a r0 = (kotlinx.coroutines.flow.C15354n.C15356b.C15357a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.n$b$a r0 = new kotlinx.coroutines.flow.n$b$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0054
                if (r2 == r5) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r9 = r0.L$0
                kotlinx.coroutines.flow.internal.r r9 = (kotlinx.coroutines.flow.internal.C15329r) r9
                p297ja.C13332o.m85685b(r10)     // Catch:{ all -> 0x0034 }
                goto L_0x0088
            L_0x0034:
                r10 = move-exception
                goto L_0x0092
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.L$0
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                p297ja.C13332o.m85685b(r10)
                goto L_0x00ac
            L_0x0046:
                java.lang.Object r9 = r0.L$1
                kotlinx.coroutines.flow.g r9 = (kotlinx.coroutines.flow.C15288g) r9
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.n$b r2 = (kotlinx.coroutines.flow.C15354n.C15356b) r2
                p297ja.C13332o.m85685b(r10)     // Catch:{ all -> 0x0052 }
                goto L_0x0067
            L_0x0052:
                r9 = move-exception
                goto L_0x0098
            L_0x0054:
                p297ja.C13332o.m85685b(r10)
                kotlinx.coroutines.flow.f r10 = r8.f64572a     // Catch:{ all -> 0x0096 }
                r0.L$0 = r8     // Catch:{ all -> 0x0096 }
                r0.L$1 = r9     // Catch:{ all -> 0x0096 }
                r0.label = r5     // Catch:{ all -> 0x0096 }
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch:{ all -> 0x0096 }
                if (r10 != r1) goto L_0x0066
                return r1
            L_0x0066:
                r2 = r8
            L_0x0067:
                kotlinx.coroutines.flow.internal.r r10 = new kotlinx.coroutines.flow.internal.r
                kotlin.coroutines.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                qa.q r9 = r2.f64573c     // Catch:{ all -> 0x008e }
                r0.L$0 = r10     // Catch:{ all -> 0x008e }
                r0.L$1 = r6     // Catch:{ all -> 0x008e }
                r0.label = r3     // Catch:{ all -> 0x008e }
                r2 = 6
                kotlin.jvm.internal.C13705n.m87923c(r2)     // Catch:{ all -> 0x008e }
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch:{ all -> 0x008e }
                r0 = 7
                kotlin.jvm.internal.C13705n.m87923c(r0)     // Catch:{ all -> 0x008e }
                if (r9 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r9 = r10
            L_0x0088:
                r9.releaseIntercepted()
                ja.u r9 = p297ja.C13339u.f61331a
                return r9
            L_0x008e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L_0x0092:
                r9.releaseIntercepted()
                throw r10
            L_0x0096:
                r9 = move-exception
                r2 = r8
            L_0x0098:
                kotlinx.coroutines.flow.o0 r10 = new kotlinx.coroutines.flow.o0
                r10.<init>(r9)
                qa.q r2 = r2.f64573c
                r0.L$0 = r9
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C15354n.m94235c(r10, r2, r9, r0)
                if (r10 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15354n.C15356b.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/n$c", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.n$c */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15358c implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ C16269p f64574a;

        /* renamed from: c */
        final /* synthetic */ C15285f f64575c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", mo71894f = "Emitters.kt", mo71895l = {116, 120}, mo71896m = "collect")
        /* renamed from: kotlinx.coroutines.flow.n$c$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C15359a extends C13656d {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15358c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15359a(C15358c cVar, C13635d dVar) {
                super(dVar);
                this.this$0 = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C15288g) null, this);
            }
        }

        public C15358c(C16269p pVar, C15285f fVar) {
            this.f64574a = pVar;
            this.f64575c = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r7, kotlin.coroutines.C13635d<? super p297ja.C13339u> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C15354n.C15358c.C15359a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                kotlinx.coroutines.flow.n$c$a r0 = (kotlinx.coroutines.flow.C15354n.C15358c.C15359a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.n$c$a r0 = new kotlinx.coroutines.flow.n$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                p297ja.C13332o.m85685b(r8)
                goto L_0x0083
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                java.lang.Object r7 = r0.L$2
                kotlinx.coroutines.flow.internal.r r7 = (kotlinx.coroutines.flow.internal.C15329r) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.g r2 = (kotlinx.coroutines.flow.C15288g) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.n$c r4 = (kotlinx.coroutines.flow.C15354n.C15358c) r4
                p297ja.C13332o.m85685b(r8)     // Catch:{ all -> 0x0044 }
                goto L_0x006e
            L_0x0044:
                r8 = move-exception
                goto L_0x008a
            L_0x0046:
                p297ja.C13332o.m85685b(r8)
                kotlinx.coroutines.flow.internal.r r8 = new kotlinx.coroutines.flow.internal.r
                kotlin.coroutines.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                qa.p r2 = r6.f64574a     // Catch:{ all -> 0x0086 }
                r0.L$0 = r6     // Catch:{ all -> 0x0086 }
                r0.L$1 = r7     // Catch:{ all -> 0x0086 }
                r0.L$2 = r8     // Catch:{ all -> 0x0086 }
                r0.label = r4     // Catch:{ all -> 0x0086 }
                r4 = 6
                kotlin.jvm.internal.C13705n.m87923c(r4)     // Catch:{ all -> 0x0086 }
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch:{ all -> 0x0086 }
                r4 = 7
                kotlin.jvm.internal.C13705n.m87923c(r4)     // Catch:{ all -> 0x0086 }
                if (r2 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x006e:
                r7.releaseIntercepted()
                kotlinx.coroutines.flow.f r7 = r4.f64575c
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x0083:
                ja.u r7 = p297ja.C13339u.f61331a
                return r7
            L_0x0086:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x008a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15354n.C15358c.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* renamed from: b */
    public static final void m94234b(C15288g<?> gVar) {
        if (gVar instanceof C15375o0) {
            throw ((C15375o0) gVar).f64592a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m94235c(kotlinx.coroutines.flow.C15288g<? super T> r4, p370qa.C16270q<? super kotlinx.coroutines.flow.C15288g<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.C13635d<? super p297ja.C13339u>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C15354n.C15355a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.n$a r0 = (kotlinx.coroutines.flow.C15354n.C15355a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.n$a r0 = new kotlinx.coroutines.flow.n$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            p297ja.C13332o.m85685b(r7)     // Catch:{ all -> 0x0047 }
            goto L_0x0044
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            p297ja.C13332o.m85685b(r7)
            r0.L$0 = r6     // Catch:{ all -> 0x0047 }
            r0.label = r3     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x0047 }
            if (r4 != r1) goto L_0x0044
            return r1
        L_0x0044:
            ja.u r4 = p297ja.C13339u.f61331a
            return r4
        L_0x0047:
            r4 = move-exception
            if (r6 == 0) goto L_0x004f
            if (r6 == r4) goto L_0x004f
            p297ja.C13315b.m85661a(r4, r6)
        L_0x004f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15354n.m94235c(kotlinx.coroutines.flow.g, qa.q, java.lang.Throwable, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: d */
    public static final <T> C15285f<T> m94236d(C15285f<? extends T> fVar, C16270q<? super C15288g<? super T>, ? super Throwable, ? super C13635d<? super C13339u>, ? extends Object> qVar) {
        return new C15356b(fVar, qVar);
    }

    /* renamed from: e */
    public static final <T> C15285f<T> m94237e(C15285f<? extends T> fVar, C16269p<? super C15288g<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        return new C15358c(pVar, fVar);
    }
}
