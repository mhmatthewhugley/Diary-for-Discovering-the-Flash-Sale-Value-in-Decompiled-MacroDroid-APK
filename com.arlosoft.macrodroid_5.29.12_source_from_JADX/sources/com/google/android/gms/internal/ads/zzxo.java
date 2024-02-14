package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxo implements zzxn {

    /* renamed from: a */
    private final WindowManager f38902a;

    private zzxo(WindowManager windowManager) {
        this.f38902a = windowManager;
    }

    @Nullable
    /* renamed from: b */
    public static zzxn m55369b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxo(windowManager);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo48393a(zzxl zzxl) {
        zzxr.m55377b(zzxl.f38901a, this.f38902a.getDefaultDisplay());
    }

    public final void zza() {
    }
}
