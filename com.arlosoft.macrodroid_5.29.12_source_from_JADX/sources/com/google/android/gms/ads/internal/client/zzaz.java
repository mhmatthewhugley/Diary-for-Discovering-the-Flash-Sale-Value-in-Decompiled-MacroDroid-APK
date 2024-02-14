package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzaz extends zzcf {
    @Nullable

    /* renamed from: a */
    private final FullScreenContentCallback f1865a;

    public zzaz(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.f1865a = fullScreenContentCallback;
    }

    /* renamed from: H0 */
    public final void mo19886H0(zze zze) {
        FullScreenContentCallback fullScreenContentCallback = this.f1865a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zze.mo20073l2());
        }
    }

    /* renamed from: a */
    public final void mo19887a() {
        FullScreenContentCallback fullScreenContentCallback = this.f1865a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    /* renamed from: b */
    public final void mo19888b() {
        FullScreenContentCallback fullScreenContentCallback = this.f1865a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    /* renamed from: c */
    public final void mo19889c() {
        FullScreenContentCallback fullScreenContentCallback = this.f1865a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f1865a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }
}
