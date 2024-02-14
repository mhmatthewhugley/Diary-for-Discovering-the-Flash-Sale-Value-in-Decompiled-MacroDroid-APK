package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcuq implements zzddv {

    /* renamed from: a */
    private final zzffa f31594a;

    public zzcuq(zzffa zzffa) {
        this.f31594a = zzffa;
    }

    /* renamed from: f */
    public final void mo44379f(@Nullable Context context) {
        try {
            this.f31594a.mo45666v();
        } catch (zzfek e) {
            zzcgp.m45230h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    /* renamed from: o */
    public final void mo44380o(@Nullable Context context) {
        try {
            this.f31594a.mo45654j();
        } catch (zzfek e) {
            zzcgp.m45230h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    /* renamed from: s */
    public final void mo44381s(@Nullable Context context) {
        try {
            this.f31594a.mo45667w();
            if (context != null) {
                this.f31594a.mo45665u(context);
            }
        } catch (zzfek e) {
            zzcgp.m45230h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
