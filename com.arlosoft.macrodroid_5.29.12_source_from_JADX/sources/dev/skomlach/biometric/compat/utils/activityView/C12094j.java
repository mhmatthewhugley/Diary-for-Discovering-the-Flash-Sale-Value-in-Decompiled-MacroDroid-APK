package dev.skomlach.biometric.compat.utils.activityView;

import android.view.ViewTreeObserver;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12094j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ WindowForegroundBlurring f58347a;

    public /* synthetic */ C12094j(WindowForegroundBlurring windowForegroundBlurring) {
        this.f58347a = windowForegroundBlurring;
    }

    public final boolean onPreDraw() {
        return WindowForegroundBlurring.m101362onDrawListener$lambda1(this.f58347a);
    }
}
