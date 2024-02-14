package p363pc;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: pc.d */
/* compiled from: SimpleUnregistrar */
public class C16168d implements C16169e {

    /* renamed from: a */
    private WeakReference<Activity> f66405a;

    /* renamed from: b */
    private WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f66406b;

    C16168d(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f66405a = new WeakReference<>(activity);
        this.f66406b = new WeakReference<>(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public void mo78612a() {
        Activity activity = (Activity) this.f66405a.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f66406b.get();
        if (!(activity == null || onGlobalLayoutListener == null)) {
            C16164b.m97061a(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f66405a.clear();
        this.f66406b.clear();
    }
}
