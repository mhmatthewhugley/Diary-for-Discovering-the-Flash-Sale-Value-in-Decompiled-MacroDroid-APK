package p171u0;

/* renamed from: u0.a */
/* compiled from: Presenter.kt */
public class C10280a<T> {

    /* renamed from: a */
    private T f23434a;

    /* renamed from: j */
    public final void mo40889j() {
        mo27412l();
        this.f23434a = null;
    }

    /* renamed from: k */
    public final T mo40890k() {
        return this.f23434a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        throw null;
    }

    /* renamed from: n */
    public final void mo40891n(T t) {
        if (this.f23434a == null) {
            this.f23434a = t;
            mo27413m();
            return;
        }
        throw new IllegalStateException("Presenter already has the view or the dropView isn't called");
    }
}
