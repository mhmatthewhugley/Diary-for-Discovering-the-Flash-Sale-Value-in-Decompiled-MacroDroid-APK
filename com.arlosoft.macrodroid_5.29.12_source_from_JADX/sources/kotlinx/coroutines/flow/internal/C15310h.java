package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bf\u0012.\u0010\u0014\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/h;", "T", "R", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/d;", "h", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "p", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "", "transform", "Lkotlinx/coroutines/flow/f;", "flow", "<init>", "(Lqa/q;Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.h */
/* compiled from: Merge.kt */
public final class C15310h<T, R> extends C15307f<T, R> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16270q<C15288g<? super R>, T, C13635d<? super C13339u>, Object> f64537g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo71894f = "Merge.kt", mo71895l = {27}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.h$a */
    /* compiled from: Merge.kt */
    static final class C15311a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C15288g<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15310h<T, R> this$0;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"T", "R", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.h$a$a */
        /* compiled from: Merge.kt */
        static final class C15312a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C13684d0<C15561w1> f64538a;

            /* renamed from: c */
            final /* synthetic */ C15478k0 f64539c;

            /* renamed from: d */
            final /* synthetic */ C15310h<T, R> f64540d;

            /* renamed from: f */
            final /* synthetic */ C15288g<R> f64541f;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
            @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", mo71894f = "Merge.kt", mo71895l = {34}, mo71896m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.internal.h$a$a$a */
            /* compiled from: Merge.kt */
            static final class C15313a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
                final /* synthetic */ C15288g<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ C15310h<T, R> this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15313a(C15310h<T, R> hVar, C15288g<? super R> gVar, T t, C13635d<? super C15313a> dVar) {
                    super(2, dVar);
                    this.this$0 = hVar;
                    this.$collector = gVar;
                    this.$value = t;
                }

                public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                    return new C15313a(this.this$0, this.$collector, this.$value, dVar);
                }

                public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                    return ((C15313a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object c = C13652d.m87832c();
                    int i = this.label;
                    if (i == 0) {
                        C13332o.m85685b(obj);
                        C16270q q = this.this$0.f64537g;
                        C15288g<R> gVar = this.$collector;
                        T t = this.$value;
                        this.label = 1;
                        if (q.invoke(gVar, t, this) == c) {
                            return c;
                        }
                    } else if (i == 1) {
                        C13332o.m85685b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C13339u.f61331a;
                }
            }

            @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
            @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", mo71894f = "Merge.kt", mo71895l = {30}, mo71896m = "emit")
            /* renamed from: kotlinx.coroutines.flow.internal.h$a$a$b */
            /* compiled from: Merge.kt */
            static final class C15314b extends C13656d {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C15312a<T> this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15314b(C15312a<? super T> aVar, C13635d<? super C15314b> dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            }

            C15312a(C13684d0<C15561w1> d0Var, C15478k0 k0Var, C15310h<T, R> hVar, C15288g<? super R> gVar) {
                this.f64538a = d0Var;
                this.f64539c = k0Var;
                this.f64540d = hVar;
                this.f64541f = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r8, kotlin.coroutines.C13635d<? super p297ja.C13339u> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.C15310h.C15311a.C15312a.C15314b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    kotlinx.coroutines.flow.internal.h$a$a$b r0 = (kotlinx.coroutines.flow.internal.C15310h.C15311a.C15312a.C15314b) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.internal.h$a$a$b r0 = new kotlinx.coroutines.flow.internal.h$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.w1 r8 = (kotlinx.coroutines.C15561w1) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    kotlinx.coroutines.flow.internal.h$a$a r0 = (kotlinx.coroutines.flow.internal.C15310h.C15311a.C15312a) r0
                    p297ja.C13332o.m85685b(r9)
                    goto L_0x005f
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    p297ja.C13332o.m85685b(r9)
                    kotlin.jvm.internal.d0<kotlinx.coroutines.w1> r9 = r7.f64538a
                    T r9 = r9.element
                    kotlinx.coroutines.w1 r9 = (kotlinx.coroutines.C15561w1) r9
                    if (r9 != 0) goto L_0x0048
                L_0x0046:
                    r0 = r7
                    goto L_0x005f
                L_0x0048:
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.mo74534c(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.mo74626x(r0)
                    if (r9 != r1) goto L_0x0046
                    return r1
                L_0x005f:
                    kotlin.jvm.internal.d0<kotlinx.coroutines.w1> r9 = r0.f64538a
                    kotlinx.coroutines.k0 r1 = r0.f64539c
                    r2 = 0
                    kotlinx.coroutines.m0 r3 = kotlinx.coroutines.C15486m0.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.h$a$a$a r4 = new kotlinx.coroutines.flow.internal.h$a$a$a
                    kotlinx.coroutines.flow.internal.h<T, R> r5 = r0.f64540d
                    kotlinx.coroutines.flow.g<R> r0 = r0.f64541f
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.w1 r8 = kotlinx.coroutines.C15473j.m94492d(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    ja.u r8 = p297ja.C13339u.f61331a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C15310h.C15311a.C15312a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15311a(C15310h<T, R> hVar, C15288g<? super R> gVar, C13635d<? super C15311a> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$collector = gVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15311a aVar = new C15311a(this.this$0, this.$collector, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C15311a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C13684d0 d0Var = new C13684d0();
                C15310h<T, R> hVar = this.this$0;
                C15285f<S> fVar = hVar.f64536f;
                C15312a aVar = new C15312a(d0Var, (C15478k0) this.L$0, hVar, this.$collector);
                this.label = 1;
                if (fVar.collect(aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15310h(C16270q qVar, C15285f fVar, C13640g gVar, int i, C15220e eVar, int i2, C13695i iVar) {
        this(qVar, fVar, (i2 & 4) != 0 ? C13646h.f61899a : gVar, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? C15220e.SUSPEND : eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C15303d<R> mo74657h(C13640g gVar, int i, C15220e eVar) {
        return new C15310h(this.f64537g, this.f64536f, gVar, i, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Object mo74685p(C15288g<? super R> gVar, C13635d<? super C13339u> dVar) {
        Object d = C15482l0.m94505d(new C15311a(this, gVar, (C13635d<? super C15311a>) null), dVar);
        return d == C13652d.m87832c() ? d : C13339u.f61331a;
    }

    public C15310h(C16270q<? super C15288g<? super R>, ? super T, ? super C13635d<? super C13339u>, ? extends Object> qVar, C15285f<? extends T> fVar, C13640g gVar, int i, C15220e eVar) {
        super(fVar, gVar, i, eVar);
        this.f64537g = qVar;
    }
}
