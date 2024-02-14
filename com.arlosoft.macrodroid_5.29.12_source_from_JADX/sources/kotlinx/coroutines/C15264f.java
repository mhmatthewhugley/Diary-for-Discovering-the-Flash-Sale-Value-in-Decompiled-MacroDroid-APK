package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo71668d2 = {"Lkotlinx/coroutines/f;", "T", "Lkotlinx/coroutines/a;", "", "state", "Lja/u;", "F", "K0", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "d", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/g1;", "f", "Lkotlinx/coroutines/g1;", "eventLoop", "", "e0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/g;", "parentContext", "<init>", "(Lkotlin/coroutines/g;Ljava/lang/Thread;Lkotlinx/coroutines/g1;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f */
/* compiled from: Builders.kt */
final class C15264f<T> extends C15184a<T> {

    /* renamed from: d */
    private final Thread f64481d;

    /* renamed from: f */
    private final C15412g1 f64482f;

    public C15264f(C13640g gVar, Thread thread, C15412g1 g1Var) {
        super(gVar, true, true);
        this.f64481d = thread;
        this.f64482f = g1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo74600F(Object obj) {
        if (!C13706o.m87924a(Thread.currentThread(), this.f64481d)) {
            Thread thread = this.f64481d;
            C15200c.m93755a();
            LockSupport.unpark(thread);
        }
    }

    /* renamed from: K0 */
    public final T mo74641K0() {
        C15200c.m93755a();
        try {
            C15412g1 g1Var = this.f64482f;
            C15196b0 b0Var = null;
            if (g1Var != null) {
                C15412g1.m94280G(g1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                C15412g1 g1Var2 = this.f64482f;
                long K = g1Var2 == null ? LocationRequestCompat.PASSIVE_INTERVAL : g1Var2.mo74724K();
                if (mo74625w()) {
                    C15412g1 g1Var3 = this.f64482f;
                    if (g1Var3 != null) {
                        C15412g1.m94281s(g1Var3, false, 1, (Object) null);
                    }
                    C15200c.m93755a();
                    T h = C15262e2.m94031h(mo74608a0());
                    if (h instanceof C15196b0) {
                        b0Var = (C15196b0) h;
                    }
                    if (b0Var == null) {
                        return h;
                    }
                    throw b0Var.f64404a;
                }
                C15200c.m93755a();
                LockSupport.parkNanos(this, K);
            }
            InterruptedException interruptedException = new InterruptedException();
            mo74602I(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C15200c.m93755a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public boolean mo74611e0() {
        return true;
    }
}
