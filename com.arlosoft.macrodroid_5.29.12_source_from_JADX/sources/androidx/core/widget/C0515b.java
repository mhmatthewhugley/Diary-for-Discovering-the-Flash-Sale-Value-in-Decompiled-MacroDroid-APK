package androidx.core.widget;

/* renamed from: androidx.core.widget.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0515b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ContentLoadingProgressBar f519a;

    public /* synthetic */ C0515b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f519a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f519a.hideOnUiThread();
    }
}
