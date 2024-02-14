package p292io.reactivex.internal.operators.observable;

import p216ba.C11110a;
import p216ba.C11113d;
import p292io.reactivex.internal.observers.C13024g;
import p414v9.C16735i;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.h */
/* compiled from: ObservableDoOnLifecycle */
public final class C13120h<T> extends C13083a<T, T> {

    /* renamed from: c */
    private final C11113d<? super C17071b> f60925c;

    /* renamed from: d */
    private final C11110a f60926d;

    public C13120h(C16735i<T> iVar, C11113d<? super C17071b> dVar, C11110a aVar) {
        super(iVar);
        this.f60925c = dVar;
        this.f60926d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13024g(nVar, this.f60925c, this.f60926d));
    }
}
