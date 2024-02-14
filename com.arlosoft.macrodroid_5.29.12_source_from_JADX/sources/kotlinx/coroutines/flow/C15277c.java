package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.channels.C15241t;
import kotlinx.coroutines.flow.internal.C15303d;
import kotlinx.coroutines.flow.internal.C15335u;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0010%\u001a\u00020\"\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006("}, mo71668d2 = {"Lkotlinx/coroutines/flow/c;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lja/u;", "m", "()V", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "h", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/f;", "i", "()Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/r;", "scope", "f", "(Lkotlinx/coroutines/channels/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k0;", "Lkotlinx/coroutines/channels/t;", "l", "(Lkotlinx/coroutines/k0;)Lkotlinx/coroutines/channels/t;", "Lkotlinx/coroutines/flow/g;", "collector", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "d", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/t;", "channel", "", "g", "Z", "consume", "<init>", "(Lkotlinx/coroutines/channels/t;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.c */
/* compiled from: Channels.kt */
final class C15277c<T> extends C15303d<T> {

    /* renamed from: o */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64500o = AtomicIntegerFieldUpdater.newUpdater(C15277c.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: f */
    private final C15241t<T> f64501f;

    /* renamed from: g */
    private final boolean f64502g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15277c(C15241t tVar, boolean z, C13640g gVar, int i, C15220e eVar, int i2, C13695i iVar) {
        this(tVar, z, (i2 & 4) != 0 ? C13646h.f61899a : gVar, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? C15220e.SUSPEND : eVar);
    }

    /* renamed from: m */
    private final void m94093m() {
        if (this.f64502g) {
            boolean z = true;
            if (f64500o.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public Object collect(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        if (this.f64534c == -3) {
            m94093m();
            Object a = C15340j.m94202d(gVar, this.f64501f, this.f64502g, dVar);
            return a == C13652d.m87832c() ? a : C13339u.f61331a;
        }
        Object collect = super.collect(gVar, dVar);
        return collect == C13652d.m87832c() ? collect : C13339u.f61331a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo74658d() {
        return C13706o.m87936m("channel=", this.f64501f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object mo74656f(C15239r<? super T> rVar, C13635d<? super C13339u> dVar) {
        Object a = C15340j.m94202d(new C15335u(rVar), this.f64501f, this.f64502g, dVar);
        return a == C13652d.m87832c() ? a : C13339u.f61331a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C15303d<T> mo74657h(C13640g gVar, int i, C15220e eVar) {
        return new C15277c(this.f64501f, this.f64502g, gVar, i, eVar);
    }

    /* renamed from: i */
    public C15285f<T> mo74659i() {
        return new C15277c(this.f64501f, this.f64502g, (C13640g) null, 0, (C15220e) null, 28, (C13695i) null);
    }

    /* renamed from: l */
    public C15241t<T> mo74660l(C15478k0 k0Var) {
        m94093m();
        if (this.f64534c == -3) {
            return this.f64501f;
        }
        return super.mo74660l(k0Var);
    }

    public C15277c(C15241t<? extends T> tVar, boolean z, C13640g gVar, int i, C15220e eVar) {
        super(gVar, i, eVar);
        this.f64501f = tVar;
        this.f64502g = z;
        this.consumed = 0;
    }
}
