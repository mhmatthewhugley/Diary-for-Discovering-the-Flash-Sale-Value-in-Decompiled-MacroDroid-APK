package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbdg extends zzbdp {
    @Nullable

    /* renamed from: a */
    private FullScreenContentCallback f26655a;

    /* renamed from: H0 */
    public final void mo42500H0(zze zze) {
        FullScreenContentCallback fullScreenContentCallback = this.f26655a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zze.mo20073l2());
        }
    }

    /* renamed from: a */
    public final void mo42501a() {
        FullScreenContentCallback fullScreenContentCallback = this.f26655a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    /* renamed from: b */
    public final void mo42502b() {
        FullScreenContentCallback fullScreenContentCallback = this.f26655a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    /* renamed from: c */
    public final void mo42503c() {
        FullScreenContentCallback fullScreenContentCallback = this.f26655a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f26655a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }
}
