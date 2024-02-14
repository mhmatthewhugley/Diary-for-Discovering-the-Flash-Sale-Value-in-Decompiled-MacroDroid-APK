package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzg extends zzbe {

    /* renamed from: a */
    private final AdListener f1977a;

    public zzg(AdListener adListener) {
        this.f1977a = adListener;
    }

    /* renamed from: A */
    public final void mo19893A(int i) {
    }

    /* renamed from: C */
    public final void mo19894C(zze zze) {
        AdListener adListener = this.f1977a;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zze.mo20074m2());
        }
    }

    /* renamed from: Jb */
    public final AdListener mo20143Jb() {
        return this.f1977a;
    }

    /* renamed from: a */
    public final void mo19895a() {
        AdListener adListener = this.f1977a;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    /* renamed from: d */
    public final void mo19896d() {
        AdListener adListener = this.f1977a;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    /* renamed from: e */
    public final void mo19897e() {
    }

    /* renamed from: f */
    public final void mo19898f() {
        AdListener adListener = this.f1977a;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    /* renamed from: g */
    public final void mo19899g() {
        AdListener adListener = this.f1977a;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    /* renamed from: h */
    public final void mo19900h() {
        AdListener adListener = this.f1977a;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }
}
