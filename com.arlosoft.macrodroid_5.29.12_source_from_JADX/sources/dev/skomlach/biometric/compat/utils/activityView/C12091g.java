package dev.skomlach.biometric.compat.utils.activityView;

import android.view.ViewTreeObserver;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12091g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ WindowBackgroundBlurring f58344a;

    public /* synthetic */ C12091g(WindowBackgroundBlurring windowBackgroundBlurring) {
        this.f58344a = windowBackgroundBlurring;
    }

    public final boolean onPreDraw() {
        return WindowBackgroundBlurring.m101357onDrawListener$lambda0(this.f58344a);
    }
}
