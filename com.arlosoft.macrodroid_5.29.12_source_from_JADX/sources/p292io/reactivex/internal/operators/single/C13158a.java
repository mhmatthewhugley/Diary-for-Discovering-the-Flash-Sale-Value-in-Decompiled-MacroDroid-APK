package p292io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p223ca.C11164c;
import p241da.C11984b;
import p414v9.C16747p;
import p414v9.C16748q;
import p414v9.C16749r;

/* renamed from: io.reactivex.internal.operators.single.a */
/* compiled from: SingleDefer */
public final class C13158a<T> extends C16747p<T> {

    /* renamed from: a */
    final Callable<? extends C16749r<? extends T>> f60993a;

    public C13158a(Callable<? extends C16749r<? extends T>> callable) {
        this.f60993a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        try {
            ((C16749r) C11984b.m82367d(this.f60993a.call(), "The singleSupplier returned a null SingleSource")).mo79722a(qVar);
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C11164c.m74937i(th, qVar);
        }
    }
}
