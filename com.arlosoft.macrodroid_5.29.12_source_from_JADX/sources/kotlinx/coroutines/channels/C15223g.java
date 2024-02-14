package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15184a;
import kotlinx.coroutines.C15252d2;
import kotlinx.coroutines.JobCancellationException;
import p297ja.C13339u;
import p299jc.C13373a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010/\u001a\u00020.\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u00100\u001a\u00020\u0007\u0012\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001J\u001f\u0010\u000b\u001a\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00030\tH\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0003J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013HAø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001e\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010#\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, mo71668d2 = {"Lkotlinx/coroutines/channels/g;", "E", "Lkotlinx/coroutines/a;", "Lja/u;", "Lkotlinx/coroutines/channels/f;", "", "cause", "", "close", "Lkotlin/Function1;", "handler", "invokeOnClose", "Lkotlinx/coroutines/channels/h;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "o", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/j;", "n", "send", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "K", "d", "Lkotlinx/coroutines/channels/f;", "L0", "()Lkotlinx/coroutines/channels/f;", "_channel", "isClosedForSend", "()Z", "Ljc/a;", "Lkotlinx/coroutines/channels/x;", "getOnSend", "()Ljc/a;", "onSend", "K0", "channel", "Lkotlin/coroutines/g;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/f;ZZ)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.g */
/* compiled from: ChannelCoroutine.kt */
public class C15223g<E> extends C15184a<C13339u> implements C15221f<E> {

    /* renamed from: d */
    private final C15221f<E> f64448d;

    public C15223g(C13640g gVar, C15221f<E> fVar, boolean z, boolean z2) {
        super(gVar, z, z2);
        this.f64448d = fVar;
    }

    /* renamed from: K */
    public void mo74571K(Throwable th) {
        CancellationException z0 = C15252d2.m93965z0(this, th, (String) null, 1, (Object) null);
        this.f64448d.mo74534c(z0);
        mo74602I(z0);
    }

    /* renamed from: K0 */
    public final C15221f<E> mo74572K0() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public final C15221f<E> mo74573L0() {
        return this.f64448d;
    }

    /* renamed from: c */
    public final void mo74534c(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo74486N(), (Throwable) null, this);
            }
            mo74571K(cancellationException);
        }
    }

    public boolean close(Throwable th) {
        return this.f64448d.close(th);
    }

    /* renamed from: f */
    public Object mo74535f() {
        return this.f64448d.mo74535f();
    }

    public C13373a<E, C15245x<E>> getOnSend() {
        return this.f64448d.getOnSend();
    }

    public void invokeOnClose(C16265l<? super Throwable, C13339u> lVar) {
        this.f64448d.invokeOnClose(lVar);
    }

    public boolean isClosedForSend() {
        return this.f64448d.isClosedForSend();
    }

    public C15224h<E> iterator() {
        return this.f64448d.iterator();
    }

    /* renamed from: n */
    public Object mo74537n(C13635d<? super C15226j<? extends E>> dVar) {
        Object n = this.f64448d.mo74537n(dVar);
        Object unused = C13652d.m87832c();
        return n;
    }

    /* renamed from: o */
    public Object mo74538o(C13635d<? super E> dVar) {
        return this.f64448d.mo74538o(dVar);
    }

    public boolean offer(E e) {
        return this.f64448d.offer(e);
    }

    public Object send(E e, C13635d<? super C13339u> dVar) {
        return this.f64448d.send(e, dVar);
    }

    /* renamed from: trySend-JP2dKIU  reason: not valid java name */
    public Object m101370trySendJP2dKIU(E e) {
        return this.f64448d.m101371trySendJP2dKIU(e);
    }
}
