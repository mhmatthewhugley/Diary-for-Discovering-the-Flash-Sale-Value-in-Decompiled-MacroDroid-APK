package p423w9;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p440y9.C16971a;
import p448z9.C17071b;

/* renamed from: w9.a */
/* compiled from: MainThreadDisposable */
public abstract class C16780a implements C17071b {

    /* renamed from: a */
    private final AtomicBoolean f67758a = new AtomicBoolean();

    /* renamed from: w9.a$a */
    /* compiled from: MainThreadDisposable */
    class C16781a implements Runnable {
        C16781a() {
        }

        public void run() {
            C16780a.this.mo70802a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo70802a();

    public final void dispose() {
        if (!this.f67758a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo70802a();
        } else {
            C16971a.m100210a().mo70027b(new C16781a());
        }
    }

    public final boolean isDisposed() {
        return this.f67758a.get();
    }
}
