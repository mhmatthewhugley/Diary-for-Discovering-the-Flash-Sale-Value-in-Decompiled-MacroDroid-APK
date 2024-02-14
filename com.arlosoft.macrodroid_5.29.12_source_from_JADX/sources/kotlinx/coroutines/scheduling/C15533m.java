package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15415h0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\f"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/m;", "Lkotlinx/coroutines/h0;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lja/u;", "dispatchYield", "dispatch", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.m */
/* compiled from: Dispatcher.kt */
final class C15533m extends C15415h0 {

    /* renamed from: a */
    public static final C15533m f64779a = new C15533m();

    private C15533m() {
    }

    public void dispatch(C13640g gVar, Runnable runnable) {
        C15523c.f64761p.mo74893s(runnable, C15532l.f64778g, false);
    }

    public void dispatchYield(C13640g gVar, Runnable runnable) {
        C15523c.f64761p.mo74893s(runnable, C15532l.f64778g, true);
    }
}
