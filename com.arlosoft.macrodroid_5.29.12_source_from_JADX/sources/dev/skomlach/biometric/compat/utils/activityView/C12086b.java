package dev.skomlach.biometric.compat.utils.activityView;

import android.view.View;
import dev.skomlach.biometric.compat.utils.activityView.BlurUtil;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12086b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f58337a;

    /* renamed from: c */
    public final /* synthetic */ BlurUtil.OnPublishListener f58338c;

    public /* synthetic */ C12086b(View view, BlurUtil.OnPublishListener onPublishListener) {
        this.f58337a = view;
        this.f58338c = onPublishListener;
    }

    public final void run() {
        BlurUtil.m101354takeScreenshotAndBlur$lambda4(this.f58337a, this.f58338c);
    }
}
