package p473rx.internal.operators;

import p459ef.C17153c;
import p459ef.C17162h;
import p463if.C17175a;
import p468nf.C17195c;

/* renamed from: rx.internal.operators.d */
/* compiled from: OnSubscribeLift */
public final class C17324d<T, R> implements C17153c.C17154a<R> {

    /* renamed from: a */
    final C17153c.C17154a<T> f68990a;

    /* renamed from: c */
    final C17153c.C17155b<? extends R, ? super T> f68991c;

    public C17324d(C17153c.C17154a<T> aVar, C17153c.C17155b<? extends R, ? super T> bVar) {
        this.f68990a = aVar;
        this.f68991c = bVar;
    }

    /* renamed from: b */
    public void mo26537a(C17162h<? super R> hVar) {
        C17162h hVar2;
        try {
            hVar2 = (C17162h) C17195c.m100726j(this.f68991c).mo80454a(hVar);
            hVar2.mo80451e();
            this.f68990a.mo26537a(hVar2);
        } catch (Throwable th) {
            C17175a.m100684d(th);
            hVar.onError(th);
        }
    }
}
