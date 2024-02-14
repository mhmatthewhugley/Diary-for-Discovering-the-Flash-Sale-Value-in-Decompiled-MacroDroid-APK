package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15235p;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.channels.C15241t;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!\u0012\u0006\u0012\u0004\u0018\u00010\"0 8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078@X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/d;", "T", "Lkotlinx/coroutines/flow/internal/n;", "Lkotlinx/coroutines/flow/f;", "i", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "a", "h", "Lkotlinx/coroutines/channels/r;", "scope", "Lja/u;", "f", "(Lkotlinx/coroutines/channels/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k0;", "Lkotlinx/coroutines/channels/t;", "l", "Lkotlinx/coroutines/flow/g;", "collector", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "d", "toString", "Lkotlin/coroutines/g;", "c", "I", "Lkotlinx/coroutines/channels/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "j", "()Lqa/p;", "collectToFun", "k", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.d */
/* compiled from: ChannelFlow.kt */
public abstract class C15303d<T> implements C15324n<T> {

    /* renamed from: a */
    public final C13640g f64533a;

    /* renamed from: c */
    public final int f64534c;

    /* renamed from: d */
    public final C15220e f64535d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo71894f = "ChannelFlow.kt", mo71895l = {123}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.d$a */
    /* compiled from: ChannelFlow.kt */
    static final class C15304a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C15288g<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15303d<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15304a(C15288g<? super T> gVar, C15303d<T> dVar, C13635d<? super C15304a> dVar2) {
            super(2, dVar2);
            this.$collector = gVar;
            this.this$0 = dVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15304a aVar = new C15304a(this.$collector, this.this$0, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C15304a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15288g<T> gVar = this.$collector;
                C15241t<T> l = this.this$0.mo74660l((C15478k0) this.L$0);
                this.label = 1;
                if (C15290h.m94127m(gVar, l, this) == c) {
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

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/channels/r;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo71894f = "ChannelFlow.kt", mo71895l = {60}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.d$b */
    /* compiled from: ChannelFlow.kt */
    static final class C15305b extends C13665l implements C16269p<C15239r<? super T>, C13635d<? super C13339u>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15303d<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15305b(C15303d<T> dVar, C13635d<? super C15305b> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15305b bVar = new C15305b(this.this$0, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        public final Object invoke(C15239r<? super T> rVar, C13635d<? super C13339u> dVar) {
            return ((C15305b) create(rVar, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15303d<T> dVar = this.this$0;
                this.label = 1;
                if (dVar.mo74656f((C15239r) this.L$0, this) == c) {
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

    public C15303d(C13640g gVar, int i, C15220e eVar) {
        this.f64533a = gVar;
        this.f64534c = i;
        this.f64535d = eVar;
    }

    /* renamed from: e */
    static /* synthetic */ Object m94159e(C15303d dVar, C15288g gVar, C13635d dVar2) {
        Object d = C15482l0.m94505d(new C15304a(gVar, dVar, (C13635d<? super C15304a>) null), dVar2);
        return d == C13652d.m87832c() ? d : C13339u.f61331a;
    }

    /* renamed from: a */
    public C15285f<T> mo74651a(C13640g gVar, int i, C15220e eVar) {
        C13640g plus = gVar.plus(this.f64533a);
        if (eVar == C15220e.SUSPEND) {
            int i2 = this.f64534c;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            eVar = this.f64535d;
        }
        if (C13706o.m87924a(plus, this.f64533a) && i == this.f64534c && eVar == this.f64535d) {
            return this;
        }
        return mo74657h(plus, i, eVar);
    }

    public Object collect(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        return m94159e(this, gVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo74658d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo74656f(C15239r<? super T> rVar, C13635d<? super C13339u> dVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C15303d<T> mo74657h(C13640g gVar, int i, C15220e eVar);

    /* renamed from: i */
    public C15285f<T> mo74659i() {
        return null;
    }

    /* renamed from: j */
    public final C16269p<C15239r<? super T>, C13635d<? super C13339u>, Object> mo74681j() {
        return new C15305b(this, (C13635d<? super C15305b>) null);
    }

    /* renamed from: k */
    public final int mo74682k() {
        int i = this.f64534c;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: l */
    public C15241t<T> mo74660l(C15478k0 k0Var) {
        return C15235p.m93899c(k0Var, this.f64533a, mo74682k(), this.f64535d, C15486m0.ATOMIC, (C16265l) null, mo74681j(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = mo74658d();
        if (d != null) {
            arrayList.add(d);
        }
        C13640g gVar = this.f64533a;
        if (gVar != C13646h.f61899a) {
            arrayList.add(C13706o.m87936m("context=", gVar));
        }
        int i = this.f64534c;
        if (i != -3) {
            arrayList.add(C13706o.m87936m("capacity=", Integer.valueOf(i)));
        }
        C15220e eVar = this.f64535d;
        if (eVar != C15220e.SUSPEND) {
            arrayList.add(C13706o.m87936m("onBufferOverflow=", eVar));
        }
        return C15498o0.m94571a(this) + '[' + C13566b0.m87432g0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null) + ']';
    }
}
