package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15474j0;
import kotlinx.coroutines.channels.C15245x;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, mo71668d2 = {"Lkotlinx/coroutines/channels/q;", "E", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/channels/r;", "Lja/u;", "value", "M0", "(Lja/u;)V", "", "cause", "", "handled", "H0", "b", "()Z", "isActive", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/f;", "channel", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/f;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.q */
/* compiled from: Produce.kt */
final class C15238q<E> extends C15223g<E> implements C15239r<E> {
    public C15238q(C13640g gVar, C15221f<E> fVar) {
        super(gVar, fVar, true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo74483H0(Throwable th, boolean z) {
        if (!mo74573L0().close(th) && !z) {
            C15474j0.m94494a(getContext(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo74484I0(C13339u uVar) {
        C15245x.C15246a.m93924a(mo74573L0(), (Throwable) null, 1, (Object) null);
    }

    /* renamed from: b */
    public boolean mo74487b() {
        return super.mo74487b();
    }

    public /* bridge */ /* synthetic */ C15245x getChannel() {
        return mo74572K0();
    }
}
