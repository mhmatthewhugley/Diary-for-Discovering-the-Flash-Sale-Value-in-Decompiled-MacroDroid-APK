package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbok implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AdManagerAdView f27585a;

    /* renamed from: c */
    final /* synthetic */ zzbs f27586c;

    /* renamed from: d */
    final /* synthetic */ zzbol f27587d;

    zzbok(zzbol zzbol, AdManagerAdView adManagerAdView, zzbs zzbs) {
        this.f27587d = zzbol;
        this.f27585a = adManagerAdView;
        this.f27586c = zzbs;
    }

    public final void run() {
        if (this.f27585a.mo19765f(this.f27586c)) {
            this.f27587d.f27588a.mo19809a(this.f27585a);
        } else {
            zzcgp.m45229g("Could not bind.");
        }
    }
}
