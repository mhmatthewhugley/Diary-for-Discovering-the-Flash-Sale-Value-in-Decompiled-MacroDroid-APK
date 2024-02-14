package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.channels.C15221f;
import kotlinx.coroutines.channels.C15245x;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e*\u001c\b\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo71668d2 = {"R", "T", "Lkotlinx/coroutines/flow/g;", "", "Lkotlinx/coroutines/flow/f;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "Lja/u;", "", "transform", "a", "(Lkotlinx/coroutines/flow/g;[Lkotlinx/coroutines/flow/f;Lqa/a;Lqa/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/collections/k0;", "Update", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.i */
/* compiled from: Combine.kt */
public final class C15315i {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo71668d2 = {"R", "T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo71894f = "Combine.kt", mo71895l = {57, 79, 82}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.i$a */
    /* compiled from: Combine.kt */
    static final class C15316a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C16254a<T[]> $arrayFactory;
        final /* synthetic */ C15285f<T>[] $flows;
        final /* synthetic */ C15288g<R> $this_combineInternal;
        final /* synthetic */ C16270q<C15288g<? super R>, T[], C13635d<? super C13339u>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo71668d2 = {"R", "T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", mo71894f = "Combine.kt", mo71895l = {34}, mo71896m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.i$a$a */
        /* compiled from: Combine.kt */
        static final class C15317a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C15285f<T>[] $flows;

            /* renamed from: $i */
            final /* synthetic */ int f64542$i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ C15221f<C13592k0<Object>> $resultChannel;
            int label;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"R", "T", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a */
            /* compiled from: Combine.kt */
            static final class C15318a<T> implements C15288g {

                /* renamed from: a */
                final /* synthetic */ C15221f<C13592k0<Object>> f64543a;

                /* renamed from: c */
                final /* synthetic */ int f64544c;

                @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
                @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", mo71894f = "Combine.kt", mo71895l = {35, 36}, mo71896m = "emit")
                /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a$a */
                /* compiled from: Combine.kt */
                static final class C15319a extends C13656d {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C15318a<T> this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C15319a(C15318a<? super T> aVar, C13635d<? super C15319a> dVar) {
                        super(dVar);
                        this.this$0 = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                C15318a(C15221f<C13592k0<Object>> fVar, int i) {
                    this.f64543a = fVar;
                    this.f64544c = i;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(T r7, kotlin.coroutines.C13635d<? super p297ja.C13339u> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.C15315i.C15316a.C15317a.C15318a.C15319a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        kotlinx.coroutines.flow.internal.i$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.C15315i.C15316a.C15317a.C15318a.C15319a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.internal.i$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.i$a$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0038
                        if (r2 == r4) goto L_0x0034
                        if (r2 != r3) goto L_0x002c
                        p297ja.C13332o.m85685b(r8)
                        goto L_0x0056
                    L_0x002c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0034:
                        p297ja.C13332o.m85685b(r8)
                        goto L_0x004d
                    L_0x0038:
                        p297ja.C13332o.m85685b(r8)
                        kotlinx.coroutines.channels.f<kotlin.collections.k0<java.lang.Object>> r8 = r6.f64543a
                        kotlin.collections.k0 r2 = new kotlin.collections.k0
                        int r5 = r6.f64544c
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.send(r2, r0)
                        if (r7 != r1) goto L_0x004d
                        return r1
                    L_0x004d:
                        r0.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.C15263e3.m94032a(r0)
                        if (r7 != r1) goto L_0x0056
                        return r1
                    L_0x0056:
                        ja.u r7 = p297ja.C13339u.f61331a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C15315i.C15316a.C15317a.C15318a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15317a(C15285f<? extends T>[] fVarArr, int i, AtomicInteger atomicInteger, C15221f<C13592k0<Object>> fVar, C13635d<? super C15317a> dVar) {
                super(2, dVar);
                this.$flows = fVarArr;
                this.f64542$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = fVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C15317a(this.$flows, this.f64542$i, this.$nonClosed, this.$resultChannel, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C15317a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    C15285f<T>[] fVarArr = this.$flows;
                    int i2 = this.f64542$i;
                    C15285f<T> fVar = fVarArr[i2];
                    C15318a aVar = new C15318a(this.$resultChannel, i2);
                    this.label = 1;
                    if (fVar.collect(aVar, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    try {
                        C13332o.m85685b(obj);
                    } catch (Throwable th) {
                        if (this.$nonClosed.decrementAndGet() == 0) {
                            C15245x.C15246a.m93924a(this.$resultChannel, (Throwable) null, 1, (Object) null);
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (this.$nonClosed.decrementAndGet() == 0) {
                    C15245x.C15246a.m93924a(this.$resultChannel, (Throwable) null, 1, (Object) null);
                }
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15316a(C15285f<? extends T>[] fVarArr, C16254a<T[]> aVar, C16270q<? super C15288g<? super R>, ? super T[], ? super C13635d<? super C13339u>, ? extends Object> qVar, C15288g<? super R> gVar, C13635d<? super C15316a> dVar) {
            super(2, dVar);
            this.$flows = fVarArr;
            this.$arrayFactory = aVar;
            this.$transform = qVar;
            this.$this_combineInternal = gVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15316a aVar = new C15316a(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C15316a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ed A[LOOP:1: B:26:0x00ed->B:32:0x0111, LOOP_START, PHI: r3 r10 
          PHI: (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:23:0x00e8, B:32:0x0111] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v3 kotlin.collections.k0) = (r10v2 kotlin.collections.k0), (r10v16 kotlin.collections.k0) binds: [B:23:0x00e8, B:32:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0076
                if (r2 == r6) goto L_0x0052
                if (r2 == r5) goto L_0x0037
                if (r2 != r4) goto L_0x002f
                int r2 = r0.I$1
                int r3 = r0.I$0
                java.lang.Object r7 = r0.L$2
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.channels.f r8 = (kotlinx.coroutines.channels.C15221f) r8
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                p297ja.C13332o.m85685b(r25)
                r13 = r3
                r14 = r9
                r3 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x0167
            L_0x002f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0037:
                int r2 = r0.I$1
                int r3 = r0.I$0
                java.lang.Object r7 = r0.L$2
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.channels.f r8 = (kotlinx.coroutines.channels.C15221f) r8
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                p297ja.C13332o.m85685b(r25)
                r13 = r3
                r14 = r9
                r3 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x00c8
            L_0x0052:
                int r2 = r0.I$1
                int r3 = r0.I$0
                java.lang.Object r7 = r0.L$2
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.channels.f r8 = (kotlinx.coroutines.channels.C15221f) r8
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                p297ja.C13332o.m85685b(r25)
                r10 = r25
                kotlinx.coroutines.channels.j r10 = (kotlinx.coroutines.channels.C15226j) r10
                java.lang.Object r10 = r10.mo74576l()
                r15 = r9
                r9 = r0
                r23 = r7
                r7 = r2
                r2 = r23
                goto L_0x00e2
            L_0x0076:
                p297ja.C13332o.m85685b(r25)
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.k0 r2 = (kotlinx.coroutines.C15478k0) r2
                kotlinx.coroutines.flow.f<T>[] r7 = r0.$flows
                int r13 = r7.length
                if (r13 != 0) goto L_0x0085
                ja.u r1 = p297ja.C13339u.f61331a
                return r1
            L_0x0085:
                java.lang.Object[] r14 = new java.lang.Object[r13]
                kotlinx.coroutines.internal.a0 r8 = kotlinx.coroutines.flow.internal.C15328q.f64551b
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r14
                kotlin.collections.C13593l.m87566m(r7, r8, r9, r10, r11, r12)
                r7 = 6
                r8 = 0
                kotlinx.coroutines.channels.f r21 = kotlinx.coroutines.channels.C15225i.m93852d(r13, r8, r8, r7, r8)
                java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
                r12.<init>(r13)
                r7 = 0
            L_0x009d:
                if (r7 >= r13) goto L_0x00c3
                int r22 = r7 + 1
                r8 = 0
                r9 = 0
                kotlinx.coroutines.flow.internal.i$a$a r10 = new kotlinx.coroutines.flow.internal.i$a$a
                kotlinx.coroutines.flow.f<T>[] r11 = r0.$flows
                r20 = 0
                r15 = r10
                r16 = r11
                r17 = r7
                r18 = r12
                r19 = r21
                r15.<init>(r16, r17, r18, r19, r20)
                r11 = 3
                r15 = 0
                r7 = r2
                r16 = r12
                r12 = r15
                kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r7, r8, r9, r10, r11, r12)
                r12 = r16
                r7 = r22
                goto L_0x009d
            L_0x00c3:
                byte[] r2 = new byte[r13]
                r8 = r0
                r7 = r21
            L_0x00c8:
                int r3 = r3 + r6
                byte r3 = (byte) r3
                r8.L$0 = r14
                r8.L$1 = r7
                r8.L$2 = r2
                r8.I$0 = r13
                r8.I$1 = r3
                r8.label = r6
                java.lang.Object r10 = r7.mo74537n(r8)
                if (r10 != r1) goto L_0x00dd
                return r1
            L_0x00dd:
                r9 = r8
                r15 = r14
                r8 = r7
                r7 = r3
                r3 = r13
            L_0x00e2:
                java.lang.Object r10 = kotlinx.coroutines.channels.C15226j.m93858f(r10)
                kotlin.collections.k0 r10 = (kotlin.collections.C13592k0) r10
                if (r10 != 0) goto L_0x00ed
                ja.u r1 = p297ja.C13339u.f61331a
                return r1
            L_0x00ed:
                int r11 = r10.mo71844c()
                r12 = r15[r11]
                java.lang.Object r10 = r10.mo71845d()
                r15[r11] = r10
                kotlinx.coroutines.internal.a0 r10 = kotlinx.coroutines.flow.internal.C15328q.f64551b
                if (r12 != r10) goto L_0x00ff
                int r3 = r3 + -1
            L_0x00ff:
                byte r10 = r2[r11]
                if (r10 != r7) goto L_0x0104
                goto L_0x0113
            L_0x0104:
                byte r10 = (byte) r7
                r2[r11] = r10
                java.lang.Object r10 = r8.mo74535f()
                java.lang.Object r10 = kotlinx.coroutines.channels.C15226j.m93858f(r10)
                kotlin.collections.k0 r10 = (kotlin.collections.C13592k0) r10
                if (r10 != 0) goto L_0x00ed
            L_0x0113:
                if (r3 != 0) goto L_0x016a
                qa.a<T[]> r10 = r9.$arrayFactory
                java.lang.Object r10 = r10.invoke()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L_0x013c
                qa.q<kotlinx.coroutines.flow.g<? super R>, T[], kotlin.coroutines.d<? super ja.u>, java.lang.Object> r10 = r9.$transform
                kotlinx.coroutines.flow.g<R> r11 = r9.$this_combineInternal
                r9.L$0 = r15
                r9.L$1 = r8
                r9.L$2 = r2
                r9.I$0 = r3
                r9.I$1 = r7
                r9.label = r5
                java.lang.Object r10 = r10.invoke(r11, r15, r9)
                if (r10 != r1) goto L_0x0136
                return r1
            L_0x0136:
                r13 = r3
                r3 = r7
                r7 = r8
                r8 = r9
                r14 = r15
                goto L_0x00c8
            L_0x013c:
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 14
                r18 = 0
                r11 = r15
                r12 = r10
                r5 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                java.lang.Object[] unused = kotlin.collections.C13593l.m87561h(r11, r12, r13, r14, r15, r16, r17)
                qa.q<kotlinx.coroutines.flow.g<? super R>, T[], kotlin.coroutines.d<? super ja.u>, java.lang.Object> r11 = r9.$transform
                kotlinx.coroutines.flow.g<R> r12 = r9.$this_combineInternal
                r9.L$0 = r5
                r9.L$1 = r8
                r9.L$2 = r2
                r9.I$0 = r3
                r9.I$1 = r7
                r9.label = r4
                java.lang.Object r10 = r11.invoke(r12, r10, r9)
                if (r10 != r1) goto L_0x016b
                return r1
            L_0x0167:
                r5 = 2
                goto L_0x00c8
            L_0x016a:
                r5 = r15
            L_0x016b:
                r13 = r3
                r14 = r5
                r3 = r7
                r7 = r8
                r8 = r9
                goto L_0x0167
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C15315i.C15316a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <R, T> Object m94183a(C15288g<? super R> gVar, C15285f<? extends T>[] fVarArr, C16254a<T[]> aVar, C16270q<? super C15288g<? super R>, ? super T[], ? super C13635d<? super C13339u>, ? extends Object> qVar, C13635d<? super C13339u> dVar) {
        Object a = C15322l.m94185a(new C15316a(fVarArr, aVar, qVar, gVar, (C13635d<? super C15316a>) null), dVar);
        return a == C13652d.m87832c() ? a : C13339u.f61331a;
    }
}
