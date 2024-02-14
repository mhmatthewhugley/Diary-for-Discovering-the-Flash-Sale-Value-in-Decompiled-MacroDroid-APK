package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.C15501p;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15455o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, mo71668d2 = {"Lkotlinx/coroutines/channels/m;", "E", "Lkotlinx/coroutines/channels/w;", "Lkotlinx/coroutines/channels/u;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/a0;", "G", "Lja/u;", "D", "value", "h", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/a0;", "g", "(Ljava/lang/Object;)V", "closed", "F", "", "toString", "", "f", "Ljava/lang/Throwable;", "closeCause", "L", "()Ljava/lang/Throwable;", "sendException", "K", "receiveException", "I", "()Lkotlinx/coroutines/channels/m;", "offerResult", "J", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.m */
/* compiled from: AbstractChannel.kt */
public final class C15232m<E> extends C15244w implements C15242u<E> {

    /* renamed from: f */
    public final Throwable f64453f;

    public C15232m(Throwable th) {
        this.f64453f = th;
    }

    /* renamed from: D */
    public void mo74565D() {
    }

    /* renamed from: F */
    public void mo74567F(C15232m<?> mVar) {
    }

    /* renamed from: G */
    public C15429a0 mo74568G(C15455o.C15457b bVar) {
        return C15501p.f64720a;
    }

    /* renamed from: I */
    public C15232m<E> mo74588a() {
        return this;
    }

    /* renamed from: J */
    public C15232m<E> mo74566E() {
        return this;
    }

    /* renamed from: K */
    public final Throwable mo74586K() {
        Throwable th = this.f64453f;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    /* renamed from: L */
    public final Throwable mo74587L() {
        Throwable th = this.f64453f;
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    /* renamed from: g */
    public void mo74546g(E e) {
    }

    /* renamed from: h */
    public C15429a0 mo74547h(E e, C15455o.C15457b bVar) {
        return C15501p.f64720a;
    }

    public String toString() {
        return "Closed@" + C15498o0.m94572b(this) + '[' + this.f64453f + ']';
    }
}
