package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzt extends zzl {
    public zzt(Activity activity) {
        super(activity);
    }

    /* renamed from: T0 */
    public final void mo20193T0(@Nullable Bundle bundle) {
        zze.m2645k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f2109K = 4;
        this.f2110a.finish();
    }
}
