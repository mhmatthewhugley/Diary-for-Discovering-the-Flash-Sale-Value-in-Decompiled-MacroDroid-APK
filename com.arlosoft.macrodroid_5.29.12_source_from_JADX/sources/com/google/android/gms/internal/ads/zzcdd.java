package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcdd extends zzccn {
    @Nullable

    /* renamed from: a */
    private FullScreenContentCallback f28221a;

    /* renamed from: c */
    private OnUserEarnedRewardListener f28222c;

    /* renamed from: C5 */
    public final void mo43351C5(zze zze) {
        FullScreenContentCallback fullScreenContentCallback = this.f28221a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zze.mo20073l2());
        }
    }

    /* renamed from: E */
    public final void mo43352E(int i) {
    }

    /* renamed from: Jb */
    public final void mo43389Jb(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f28222c = onUserEarnedRewardListener;
    }

    /* renamed from: Y4 */
    public final void mo43353Y4(zzcci zzcci) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f28222c;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.mo19736a(new zzccv(zzcci));
        }
    }

    /* renamed from: b */
    public final void mo43354b() {
        FullScreenContentCallback fullScreenContentCallback = this.f28221a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    /* renamed from: c */
    public final void mo43355c() {
        FullScreenContentCallback fullScreenContentCallback = this.f28221a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    /* renamed from: f */
    public final void mo43356f() {
        FullScreenContentCallback fullScreenContentCallback = this.f28221a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    /* renamed from: h */
    public final void mo43357h() {
        FullScreenContentCallback fullScreenContentCallback = this.f28221a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
