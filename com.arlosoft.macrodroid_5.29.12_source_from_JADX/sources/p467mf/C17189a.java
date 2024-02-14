package p467mf;

import java.util.Arrays;
import p459ef.C17162h;
import p463if.C17175a;
import p468nf.C17195c;
import p473rx.exceptions.CompositeException;
import p473rx.exceptions.OnErrorFailedException;
import p473rx.exceptions.OnErrorNotImplementedException;
import p473rx.exceptions.UnsubscribeFailedException;

/* renamed from: mf.a */
/* compiled from: SafeSubscriber */
public class C17189a<T> extends C17162h<T> {

    /* renamed from: g */
    private final C17162h<? super T> f68737g;

    /* renamed from: o */
    boolean f68738o;

    public C17189a(C17162h<? super T> hVar) {
        super(hVar);
        this.f68737g = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo80476h(Throwable th) {
        C17195c.m100723g(th);
        try {
            this.f68737g.onError(th);
            try {
                mo80450d();
            } catch (Throwable th2) {
                C17195c.m100723g(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            mo80450d();
            throw e;
        } catch (Throwable th3) {
            C17195c.m100723g(th3);
            throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(new Throwable[]{th, th3})));
        }
    }

    public void onCompleted() {
        if (!this.f68738o) {
            this.f68738o = true;
            try {
                this.f68737g.onCompleted();
                try {
                    mo80450d();
                } catch (Throwable th) {
                    C17195c.m100723g(th);
                    throw new UnsubscribeFailedException(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    mo80450d();
                    throw th2;
                } catch (Throwable th3) {
                    C17195c.m100723g(th3);
                    throw new UnsubscribeFailedException(th3.getMessage(), th3);
                }
            }
        }
    }

    public void onError(Throwable th) {
        C17175a.m100684d(th);
        if (!this.f68738o) {
            this.f68738o = true;
            mo80476h(th);
        }
    }

    public void onNext(T t) {
        try {
            if (!this.f68738o) {
                this.f68737g.onNext(t);
            }
        } catch (Throwable th) {
            C17175a.m100685e(th, this);
        }
    }
}
