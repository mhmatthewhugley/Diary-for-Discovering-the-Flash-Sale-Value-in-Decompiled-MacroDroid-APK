package androidx.core.widget;

/* renamed from: androidx.core.widget.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0517d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ContentLoadingProgressBar f521a;

    public /* synthetic */ C0517d(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f521a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f521a.showOnUiThread();
    }
}
