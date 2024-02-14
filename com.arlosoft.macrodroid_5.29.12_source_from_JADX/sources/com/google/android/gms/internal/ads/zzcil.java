package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcil implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f28515a;

    /* renamed from: c */
    final /* synthetic */ zzcim f28516c;

    zzcil(zzcim zzcim, boolean z) {
        this.f28516c = zzcim;
        this.f28515a = z;
    }

    public final void run() {
        this.f28516c.m45341t("windowVisibilityChanged", "isVisible", String.valueOf(this.f28515a));
    }
}
