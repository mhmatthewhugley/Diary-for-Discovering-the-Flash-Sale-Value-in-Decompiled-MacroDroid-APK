package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15488m1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006#"}, mo71668d2 = {"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/scheduling/a;", "o", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lja/u;", "dispatch", "dispatchYield", "Lkotlinx/coroutines/scheduling/i;", "", "tailDispatch", "s", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V", "", "c", "I", "corePoolSize", "d", "maxPoolSize", "", "f", "J", "idleWorkerKeepAliveNs", "", "g", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.f */
/* compiled from: Dispatcher.kt */
public class C15526f extends C15488m1 {

    /* renamed from: c */
    private final int f64763c;

    /* renamed from: d */
    private final int f64764d;

    /* renamed from: f */
    private final long f64765f;

    /* renamed from: g */
    private final String f64766g;

    /* renamed from: o */
    private C15517a f64767o = m94646o();

    public C15526f(int i, int i2, long j, String str) {
        this.f64763c = i;
        this.f64764d = i2;
        this.f64765f = j;
        this.f64766g = str;
    }

    /* renamed from: o */
    private final C15517a m94646o() {
        return new C15517a(this.f64763c, this.f64764d, this.f64765f, this.f64766g);
    }

    public void dispatch(C13640g gVar, Runnable runnable) {
        C15517a.m94608h(this.f64767o, runnable, (C15529i) null, false, 6, (Object) null);
    }

    public void dispatchYield(C13640g gVar, Runnable runnable) {
        C15517a.m94608h(this.f64767o, runnable, (C15529i) null, true, 2, (Object) null);
    }

    /* renamed from: s */
    public final void mo74893s(Runnable runnable, C15529i iVar, boolean z) {
        this.f64767o.mo74873g(runnable, iVar, z);
    }
}
