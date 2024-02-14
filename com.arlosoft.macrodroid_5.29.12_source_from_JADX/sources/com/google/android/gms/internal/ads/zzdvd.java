package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdvd implements zzddv {
    @Nullable

    /* renamed from: a */
    private final zzcmp f33210a;

    zzdvd(@Nullable zzcmp zzcmp) {
        this.f33210a = zzcmp;
    }

    /* renamed from: f */
    public final void mo44379f(@Nullable Context context) {
        zzcmp zzcmp = this.f33210a;
        if (zzcmp != null) {
            zzcmp.onPause();
        }
    }

    /* renamed from: o */
    public final void mo44380o(@Nullable Context context) {
        zzcmp zzcmp = this.f33210a;
        if (zzcmp != null) {
            zzcmp.destroy();
        }
    }

    /* renamed from: s */
    public final void mo44381s(@Nullable Context context) {
        zzcmp zzcmp = this.f33210a;
        if (zzcmp != null) {
            zzcmp.onResume();
        }
    }
}
