package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class zzax extends AdListener {

    /* renamed from: a */
    private final Object f1859a = new Object();

    /* renamed from: b */
    private AdListener f1860b;

    /* renamed from: a */
    public final void mo19885a(AdListener adListener) {
        synchronized (this.f1859a) {
            this.f1860b = adListener;
        }
    }

    public final void onAdClicked() {
        synchronized (this.f1859a) {
            AdListener adListener = this.f1860b;
            if (adListener != null) {
                adListener.onAdClicked();
            }
        }
    }

    public final void onAdClosed() {
        synchronized (this.f1859a) {
            AdListener adListener = this.f1860b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f1859a) {
            AdListener adListener = this.f1860b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    public final void onAdImpression() {
        synchronized (this.f1859a) {
            AdListener adListener = this.f1860b;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f1859a) {
            AdListener adListener = this.f1860b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    public final void onAdOpened() {
        synchronized (this.f1859a) {
            AdListener adListener = this.f1860b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }
}
