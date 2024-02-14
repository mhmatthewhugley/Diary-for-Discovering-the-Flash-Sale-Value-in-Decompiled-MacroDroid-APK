package dev.skomlach.biometric.compat.utils.activityView;

import android.graphics.Bitmap;
import dev.skomlach.biometric.compat.utils.activityView.BlurUtil;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12087c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BlurUtil.OnPublishListener f58339a;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f58340c;

    public /* synthetic */ C12087c(BlurUtil.OnPublishListener onPublishListener, Bitmap bitmap) {
        this.f58339a = onPublishListener;
        this.f58340c = bitmap;
    }

    public final void run() {
        BlurUtil.m101352blur$lambda6(this.f58339a, this.f58340c);
    }
}
