package dev.skomlach.biometric.compat.utils.activityView;

import android.graphics.Bitmap;
import dev.skomlach.biometric.compat.utils.activityView.BlurUtil;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12085a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f58333a;

    /* renamed from: c */
    public final /* synthetic */ BlurUtil.OnPublishListener f58334c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f58335d;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f58336f;

    public /* synthetic */ C12085a(long j, BlurUtil.OnPublishListener onPublishListener, Bitmap bitmap, Bitmap bitmap2) {
        this.f58333a = j;
        this.f58334c = onPublishListener;
        this.f58335d = bitmap;
        this.f58336f = bitmap2;
    }

    public final void run() {
        BlurUtil.m101353blur$lambda7(this.f58333a, this.f58334c, this.f58335d, this.f58336f);
    }
}
