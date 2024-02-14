package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0241a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Toolbar f312a;

    public /* synthetic */ C0241a(Toolbar toolbar) {
        this.f312a = toolbar;
    }

    public final void run() {
        this.f312a.invalidateMenu();
    }
}
