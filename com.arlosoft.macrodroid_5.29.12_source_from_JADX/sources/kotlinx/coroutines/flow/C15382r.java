package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15286f0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017\u001aP\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2(\u0010\u001f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001aø\u0001\u0000¢\u0006\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/k0;", "scope", "Lkotlinx/coroutines/flow/f0;", "started", "", "replay", "Lkotlinx/coroutines/flow/z;", "f", "Lkotlinx/coroutines/flow/e0;", "c", "(Lkotlinx/coroutines/flow/f;I)Lkotlinx/coroutines/flow/e0;", "Lkotlin/coroutines/g;", "context", "upstream", "Lkotlinx/coroutines/flow/u;", "shared", "initialValue", "Lkotlinx/coroutines/w1;", "d", "(Lkotlinx/coroutines/k0;Lkotlin/coroutines/g;Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/u;Lkotlinx/coroutines/flow/f0;Ljava/lang/Object;)Lkotlinx/coroutines/w1;", "a", "Lkotlinx/coroutines/flow/v;", "Lkotlinx/coroutines/flow/i0;", "b", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/d;", "Lja/u;", "", "action", "e", "(Lkotlinx/coroutines/flow/z;Lqa/p;)Lkotlinx/coroutines/flow/z;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.r */
/* compiled from: Share.kt */
final /* synthetic */ class C15382r {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", mo71894f = "Share.kt", mo71895l = {214, 218, 219, 225}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.r$a */
    /* compiled from: Share.kt */
    static final class C15383a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ C15401u<T> $shared;
        final /* synthetic */ C15286f0 $started;
        final /* synthetic */ C15285f<T> $upstream;
        int label;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo71668d2 = {"T", "", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", mo71894f = "Share.kt", mo71895l = {}, mo71896m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.r$a$a */
        /* compiled from: Share.kt */
        static final class C15384a extends C13665l implements C16269p<Integer, C13635d<? super Boolean>, Object> {
            /* synthetic */ int I$0;
            int label;

            C15384a(C13635d<? super C15384a> dVar) {
                super(2, dVar);
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                C15384a aVar = new C15384a(dVar);
                aVar.I$0 = ((Number) obj).intValue();
                return aVar;
            }

            /* renamed from: h */
            public final Object mo74710h(int i, C13635d<? super Boolean> dVar) {
                return ((C15384a) create(Integer.valueOf(i), dVar)).invokeSuspend(C13339u.f61331a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo74710h(((Number) obj).intValue(), (C13635d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    return C13654b.m87833a(this.I$0 > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/d0;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", mo71894f = "Share.kt", mo71895l = {227}, mo71896m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.r$a$b */
        /* compiled from: Share.kt */
        static final class C15385b extends C13665l implements C16269p<C15280d0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ T $initialValue;
            final /* synthetic */ C15401u<T> $shared;
            final /* synthetic */ C15285f<T> $upstream;
            /* synthetic */ Object L$0;
            int label;

            @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
            /* renamed from: kotlinx.coroutines.flow.r$a$b$a */
            /* compiled from: Share.kt */
            public /* synthetic */ class C15386a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f64596a;

                static {
                    int[] iArr = new int[C15280d0.values().length];
                    iArr[C15280d0.START.ordinal()] = 1;
                    iArr[C15280d0.STOP.ordinal()] = 2;
                    iArr[C15280d0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f64596a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15385b(C15285f<? extends T> fVar, C15401u<T> uVar, T t, C13635d<? super C15385b> dVar) {
                super(2, dVar);
                this.$upstream = fVar;
                this.$shared = uVar;
                this.$initialValue = t;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                C15385b bVar = new C15385b(this.$upstream, this.$shared, this.$initialValue, dVar);
                bVar.L$0 = obj;
                return bVar;
            }

            /* renamed from: h */
            public final Object invoke(C15280d0 d0Var, C13635d<? super C13339u> dVar) {
                return ((C15385b) create(d0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    int i2 = C15386a.f64596a[((C15280d0) this.L$0).ordinal()];
                    if (i2 == 1) {
                        C15285f<T> fVar = this.$upstream;
                        C15401u<T> uVar = this.$shared;
                        this.label = 1;
                        if (fVar.collect(uVar, this) == c) {
                            return c;
                        }
                    } else if (i2 == 3) {
                        T t = this.$initialValue;
                        if (t == C15276b0.f64499a) {
                            this.$shared.mo74653g();
                        } else {
                            this.$shared.mo74652b(t);
                        }
                    }
                } else if (i == 1) {
                    C13332o.m85685b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15383a(C15286f0 f0Var, C15285f<? extends T> fVar, C15401u<T> uVar, T t, C13635d<? super C15383a> dVar) {
            super(2, dVar);
            this.$started = f0Var;
            this.$upstream = fVar;
            this.$shared = uVar;
            this.$initialValue = t;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C15383a(this.$started, this.$upstream, this.$shared, this.$initialValue, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C15383a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C13332o.m85685b(obj);
                    } else if (!(i == 3 || i == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            }
            C13332o.m85685b(obj);
            C15286f0 f0Var = this.$started;
            C15286f0.C15287a aVar = C15286f0.f64520a;
            if (f0Var == aVar.mo74667a()) {
                C15285f<T> fVar = this.$upstream;
                C15401u<T> uVar = this.$shared;
                this.label = 1;
                if (fVar.collect(uVar, this) == c) {
                    return c;
                }
            } else if (this.$started == aVar.mo74668b()) {
                C15299i0<Integer> c2 = this.$shared.mo74714c();
                C15384a aVar2 = new C15384a((C13635d<? super C15384a>) null);
                this.label = 2;
                if (C15290h.m94131q(c2, aVar2, this) == c) {
                    return c;
                }
            } else {
                C15285f<C15280d0> k = C15290h.m94125k(this.$started.mo74666a(this.$shared.mo74714c()));
                C15385b bVar = new C15385b(this.$upstream, this.$shared, this.$initialValue, (C13635d<? super C15385b>) null);
                this.label = 4;
                if (C15290h.m94121g(k, bVar, this) == c) {
                    return c;
                }
            }
            return C13339u.f61331a;
            C15285f<T> fVar2 = this.$upstream;
            C15401u<T> uVar2 = this.$shared;
            this.label = 3;
            if (fVar2.collect(uVar2, this) == c) {
                return c;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: a */
    public static final <T> C15406z<T> m94246a(C15401u<T> uVar) {
        return new C15403w(uVar, (C15561w1) null);
    }

    /* renamed from: b */
    public static final <T> C15299i0<T> m94247b(C15402v<T> vVar) {
        return new C15404x(vVar, (C15561w1) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = (kotlinx.coroutines.flow.internal.C15303d) r7;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> kotlinx.coroutines.flow.C15284e0<T> m94248c(kotlinx.coroutines.flow.C15285f<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.f$a r0 = kotlinx.coroutines.channels.C15221f.f64445y
            int r0 = r0.mo74570a()
            int r0 = p424wa.C16792h.m99540b(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.C15303d
            if (r1 == 0) goto L_0x003d
            r1 = r7
            kotlinx.coroutines.flow.internal.d r1 = (kotlinx.coroutines.flow.internal.C15303d) r1
            kotlinx.coroutines.flow.f r2 = r1.mo74659i()
            if (r2 == 0) goto L_0x003d
            kotlinx.coroutines.flow.e0 r7 = new kotlinx.coroutines.flow.e0
            int r3 = r1.f64534c
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L_0x0027
            r4 = -2
            if (r3 == r4) goto L_0x0027
            if (r3 == 0) goto L_0x0027
            r0 = r3
            goto L_0x0035
        L_0x0027:
            kotlinx.coroutines.channels.e r4 = r1.f64535d
            kotlinx.coroutines.channels.e r6 = kotlinx.coroutines.channels.C15220e.SUSPEND
            if (r4 != r6) goto L_0x0030
            if (r3 != 0) goto L_0x0035
            goto L_0x0034
        L_0x0030:
            if (r8 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            kotlinx.coroutines.channels.e r8 = r1.f64535d
            kotlin.coroutines.g r1 = r1.f64533a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003d:
            kotlinx.coroutines.flow.e0 r8 = new kotlinx.coroutines.flow.e0
            kotlinx.coroutines.channels.e r1 = kotlinx.coroutines.channels.C15220e.SUSPEND
            kotlin.coroutines.h r2 = kotlin.coroutines.C13646h.f61899a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15382r.m94248c(kotlinx.coroutines.flow.f, int):kotlinx.coroutines.flow.e0");
    }

    /* renamed from: d */
    private static final <T> C15561w1 m94249d(C15478k0 k0Var, C13640g gVar, C15285f<? extends T> fVar, C15401u<T> uVar, C15286f0 f0Var, T t) {
        return C15414h.m94294c(k0Var, gVar, C13706o.m87924a(f0Var, C15286f0.f64520a.mo74667a()) ? C15486m0.DEFAULT : C15486m0.UNDISPATCHED, new C15383a(f0Var, fVar, uVar, t, (C13635d<? super C15383a>) null));
    }

    /* renamed from: e */
    public static final <T> C15406z<T> m94250e(C15406z<? extends T> zVar, C16269p<? super C15288g<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        return new C15360n0(zVar, pVar);
    }

    /* renamed from: f */
    public static final <T> C15406z<T> m94251f(C15285f<? extends T> fVar, C15478k0 k0Var, C15286f0 f0Var, int i) {
        C15284e0<? extends T> c = m94248c(fVar, i);
        C15401u a = C15276b0.m94086a(i, c.f64517b, c.f64518c);
        return new C15403w(a, m94249d(k0Var, c.f64519d, c.f64516a, a, f0Var, C15276b0.f64499a));
    }
}
