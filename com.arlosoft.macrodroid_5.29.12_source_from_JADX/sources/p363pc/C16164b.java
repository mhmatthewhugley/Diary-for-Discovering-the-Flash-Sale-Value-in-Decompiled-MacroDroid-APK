package p363pc;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: pc.b */
/* compiled from: KeyboardVisibilityEvent */
public class C16164b {

    /* renamed from: pc.b$a */
    /* compiled from: KeyboardVisibilityEvent */
    static class C16165a extends C16163a {

        /* renamed from: c */
        final /* synthetic */ C16169e f66400c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16165a(Activity activity, C16169e eVar) {
            super(activity);
            this.f66400c = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo78603a() {
            this.f66400c.mo78612a();
        }
    }

    /* renamed from: pc.b$b */
    /* compiled from: KeyboardVisibilityEvent */
    static class C16166b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f66401a = new Rect();

        /* renamed from: c */
        private boolean f66402c = false;

        /* renamed from: d */
        final /* synthetic */ View f66403d;

        /* renamed from: f */
        final /* synthetic */ C16167c f66404f;

        C16166b(View view, C16167c cVar) {
            this.f66403d = view;
            this.f66404f = cVar;
        }

        public void onGlobalLayout() {
            this.f66403d.getWindowVisibleDisplayFrame(this.f66401a);
            int height = this.f66403d.getRootView().getHeight();
            boolean z = ((double) (height - this.f66401a.height())) > ((double) height) * 0.15d;
            if (z != this.f66402c) {
                this.f66402c = z;
                this.f66404f.mo29030a(z);
            }
        }
    }

    /* renamed from: a */
    static View m97061a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    /* renamed from: b */
    public static C16169e m97062b(Activity activity, C16167c cVar) {
        Objects.requireNonNull(activity, "Parameter:activity must not be null");
        if ((activity.getWindow().getAttributes().softInputMode & 240 & 48) != 48) {
            Objects.requireNonNull(cVar, "Parameter:listener must not be null");
            View a = m97061a(activity);
            C16166b bVar = new C16166b(a, cVar);
            a.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
            return new C16168d(activity, bVar);
        }
        throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
    }

    /* renamed from: c */
    public static void m97063c(Activity activity, C16167c cVar) {
        activity.getApplication().registerActivityLifecycleCallbacks(new C16165a(activity, m97062b(activity, cVar)));
    }
}
