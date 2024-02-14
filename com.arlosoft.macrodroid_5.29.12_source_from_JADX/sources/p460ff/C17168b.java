package p460ff;

import android.util.Log;
import p459ef.C17153c;
import p459ef.C17162h;
import p461gf.C17170a;
import p464jf.C17181e;

/* renamed from: ff.b */
/* compiled from: OperatorConditionalBinding */
final class C17168b<T, R> implements C17153c.C17155b<T, T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public R f68717a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C17181e<? super R, Boolean> f68718b;

    /* renamed from: ff.b$a */
    /* compiled from: OperatorConditionalBinding */
    class C17169a extends C17162h<T> {

        /* renamed from: g */
        final /* synthetic */ C17162h f68719g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17169a(C17162h hVar, C17162h hVar2) {
            super(hVar);
            this.f68719g = hVar2;
        }

        /* renamed from: h */
        private void m100670h(String str) {
            m100671i("bound object has become invalid; skipping " + str);
            m100671i("unsubscribing...");
            Object unused = C17168b.this.f68717a = null;
            mo80450d();
        }

        /* renamed from: i */
        private void m100671i(String str) {
            Log.isLoggable("ConditionalBinding", 3);
        }

        /* renamed from: j */
        private boolean m100672j() {
            return C17168b.this.f68717a != null && ((Boolean) C17168b.this.f68718b.mo80454a(C17168b.this.f68717a)).booleanValue();
        }

        public void onCompleted() {
            C17170a.m100673a();
            if (m100672j()) {
                this.f68719g.onCompleted();
            } else {
                m100670h("onCompleted");
            }
        }

        public void onError(Throwable th) {
            C17170a.m100673a();
            if (m100672j()) {
                this.f68719g.onError(th);
            } else {
                m100670h("onError");
            }
        }

        public void onNext(T t) {
            C17170a.m100673a();
            if (m100672j()) {
                this.f68719g.onNext(t);
            } else {
                m100670h("onNext");
            }
        }
    }

    public C17168b(R r, C17181e<? super R, Boolean> eVar) {
        this.f68717a = r;
        this.f68718b = eVar;
    }

    /* renamed from: e */
    public C17162h<? super T> mo80454a(C17162h<? super T> hVar) {
        return new C17169a(hVar, hVar);
    }
}
