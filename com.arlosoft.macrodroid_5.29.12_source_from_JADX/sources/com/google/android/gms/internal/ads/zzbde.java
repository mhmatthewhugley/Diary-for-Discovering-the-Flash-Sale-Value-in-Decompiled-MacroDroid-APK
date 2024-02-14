package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbde extends zzbdl {
    @Nullable

    /* renamed from: a */
    private final AppOpenAd.AppOpenAdLoadCallback f26650a;

    /* renamed from: c */
    private final String f26651c;

    public zzbde(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f26650a = appOpenAdLoadCallback;
        this.f26651c = str;
    }

    /* renamed from: B */
    public final void mo42497B(int i) {
    }

    /* renamed from: qa */
    public final void mo42498qa(zze zze) {
        if (this.f26650a != null) {
            this.f26650a.onAdFailedToLoad(zze.mo20074m2());
        }
    }

    /* renamed from: y3 */
    public final void mo42499y3(zzbdj zzbdj) {
        if (this.f26650a != null) {
            this.f26650a.onAdLoaded(new zzbdf(zzbdj, this.f26651c));
        }
    }
}
