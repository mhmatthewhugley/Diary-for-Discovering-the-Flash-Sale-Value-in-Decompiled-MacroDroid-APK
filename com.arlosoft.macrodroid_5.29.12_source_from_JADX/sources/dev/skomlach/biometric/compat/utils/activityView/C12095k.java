package dev.skomlach.biometric.compat.utils.activityView;

import androidx.palette.graphics.Palette;

/* renamed from: dev.skomlach.biometric.compat.utils.activityView.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12095k implements Palette.PaletteAsyncListener {

    /* renamed from: a */
    public final /* synthetic */ WindowForegroundBlurring f58348a;

    public /* synthetic */ C12095k(WindowForegroundBlurring windowForegroundBlurring) {
        this.f58348a = windowForegroundBlurring;
    }

    public final void onGenerated(Palette palette) {
        WindowForegroundBlurring.m101365updateDefaultColor$lambda20(this.f58348a, palette);
    }
}
