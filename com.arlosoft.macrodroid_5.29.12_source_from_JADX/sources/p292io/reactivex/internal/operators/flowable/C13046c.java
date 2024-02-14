package p292io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p241da.C11984b;
import p292io.reactivex.internal.subscriptions.C13210c;
import p329me.C15738c;
import p414v9.C16732f;

/* renamed from: io.reactivex.internal.operators.flowable.c */
/* compiled from: FlowableError */
public final class C13046c<T> extends C16732f<T> {

    /* renamed from: c */
    final Callable<? extends Throwable> f60810c;

    public C13046c(Callable<? extends Throwable> callable) {
        this.f60810c = callable;
    }

    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        try {
            th = (Throwable) C11984b.m82367d(this.f60810c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C11078a.m74639b(th);
        }
        C13210c.m85516e(th, cVar);
    }
}
