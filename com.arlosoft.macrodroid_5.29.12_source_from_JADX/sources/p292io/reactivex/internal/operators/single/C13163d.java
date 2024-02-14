package p292io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p223ca.C11164c;
import p241da.C11984b;
import p414v9.C16747p;
import p414v9.C16748q;

/* renamed from: io.reactivex.internal.operators.single.d */
/* compiled from: SingleError */
public final class C13163d<T> extends C16747p<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f61001a;

    public C13163d(Callable<? extends Throwable> callable) {
        this.f61001a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        try {
            th = (Throwable) C11984b.m82367d(this.f61001a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C11078a.m74639b(th);
        }
        C11164c.m74937i(th, qVar);
    }
}
