package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxp implements DisplayManager.DisplayListener, zzxn {

    /* renamed from: a */
    private final DisplayManager f38903a;
    @Nullable

    /* renamed from: b */
    private zzxl f38904b;

    private zzxp(DisplayManager displayManager) {
        this.f38903a = displayManager;
    }

    @Nullable
    /* renamed from: b */
    public static zzxn m55371b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzxp(displayManager);
        }
        return null;
    }

    /* renamed from: c */
    private final Display m55372c() {
        return this.f38903a.getDisplay(0);
    }

    /* renamed from: a */
    public final void mo48393a(zzxl zzxl) {
        this.f38904b = zzxl;
        this.f38903a.registerDisplayListener(this, zzen.m49158d((Handler.Callback) null));
        zzxr.m55377b(zzxl.f38901a, m55372c());
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        zzxl zzxl = this.f38904b;
        if (zzxl != null && i == 0) {
            zzxr.m55377b(zzxl.f38901a, m55372c());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.f38903a.unregisterDisplayListener(this);
        this.f38904b = null;
    }
}
