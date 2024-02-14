package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13678a0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, mo71668d2 = {"Lkotlinx/coroutines/flow/h0;", "Lkotlinx/coroutines/flow/f0;", "Lkotlinx/coroutines/flow/i0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/d0;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.h0 */
/* compiled from: SharingStarted.kt */
final class C15291h0 implements C15286f0 {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/flow/g;", "Lkotlinx/coroutines/flow/d0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.StartedLazily$command$1", mo71894f = "SharingStarted.kt", mo71895l = {155}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.h0$a */
    /* compiled from: SharingStarted.kt */
    static final class C15292a extends C13665l implements C16269p<C15288g<? super C15280d0>, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C15299i0<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "count", "Lja/u;", "a", "(ILkotlin/coroutines/d;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.h0$a$a */
        /* compiled from: SharingStarted.kt */
        static final class C15293a<T> implements C15288g {

            /* renamed from: a */
            final /* synthetic */ C13678a0 f64524a;

            /* renamed from: c */
            final /* synthetic */ C15288g<C15280d0> f64525c;

            @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
            @C13658f(mo71893c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", mo71894f = "SharingStarted.kt", mo71895l = {158}, mo71896m = "emit")
            /* renamed from: kotlinx.coroutines.flow.h0$a$a$a */
            /* compiled from: SharingStarted.kt */
            static final class C15294a extends C13656d {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C15293a<T> this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15294a(C15293a<? super T> aVar, C13635d<? super C15294a> dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.mo74672a(0, this);
                }
            }

            C15293a(C13678a0 a0Var, C15288g<? super C15280d0> gVar) {
                this.f64524a = a0Var;
                this.f64525c = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo74672a(int r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.C15291h0.C15292a.C15293a.C15294a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    kotlinx.coroutines.flow.h0$a$a$a r0 = (kotlinx.coroutines.flow.C15291h0.C15292a.C15293a.C15294a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.h0$a$a$a r0 = new kotlinx.coroutines.flow.h0$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p297ja.C13332o.m85685b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p297ja.C13332o.m85685b(r6)
                    if (r5 <= 0) goto L_0x004e
                    kotlin.jvm.internal.a0 r5 = r4.f64524a
                    boolean r6 = r5.element
                    if (r6 != 0) goto L_0x004e
                    r5.element = r3
                    kotlinx.coroutines.flow.g<kotlinx.coroutines.flow.d0> r5 = r4.f64525c
                    kotlinx.coroutines.flow.d0 r6 = kotlinx.coroutines.flow.C15280d0.START
                    r0.label = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                L_0x004e:
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15291h0.C15292a.C15293a.mo74672a(int, kotlin.coroutines.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C13635d dVar) {
                return mo74672a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15292a(C15299i0<Integer> i0Var, C13635d<? super C15292a> dVar) {
            super(2, dVar);
            this.$subscriptionCount = i0Var;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15292a aVar = new C15292a(this.$subscriptionCount, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C15288g<? super C15280d0> gVar, C13635d<? super C13339u> dVar) {
            return ((C15292a) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C13678a0 a0Var = new C13678a0();
                C15299i0<Integer> i0Var = this.$subscriptionCount;
                C15293a aVar = new C15293a(a0Var, (C15288g) this.L$0);
                this.label = 1;
                if (i0Var.collect(aVar, this) == c) {
                    return c;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13332o.m85685b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: a */
    public C15285f<C15280d0> mo74666a(C15299i0<Integer> i0Var) {
        return C15290h.m94132r(new C15292a(i0Var, (C13635d<? super C15292a>) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
