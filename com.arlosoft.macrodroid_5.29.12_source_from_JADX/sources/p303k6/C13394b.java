package p303k6;

import android.view.View;
import p293j6.C13289a;
import p293j6.C13290b;
import p414v9.C16735i;
import p414v9.C16741n;
import p423w9.C16780a;

/* renamed from: k6.b */
/* compiled from: ViewClickObservable */
final class C13394b extends C16735i<Object> {

    /* renamed from: a */
    private final View f61427a;

    /* renamed from: k6.b$a */
    /* compiled from: ViewClickObservable */
    static final class C13395a extends C16780a implements View.OnClickListener {

        /* renamed from: c */
        private final View f61428c;

        /* renamed from: d */
        private final C16741n<? super Object> f61429d;

        C13395a(View view, C16741n<? super Object> nVar) {
            this.f61428c = view;
            this.f61429d = nVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo70802a() {
            this.f61428c.setOnClickListener((View.OnClickListener) null);
        }

        public void onClick(View view) {
            if (!isDisposed()) {
                this.f61429d.onNext(C13289a.INSTANCE);
            }
        }
    }

    C13394b(View view) {
        this.f61427a = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super Object> nVar) {
        if (C13290b.m85614a(nVar)) {
            C13395a aVar = new C13395a(this.f61427a, nVar);
            nVar.onSubscribe(aVar);
            this.f61427a.setOnClickListener(aVar);
        }
    }
}
