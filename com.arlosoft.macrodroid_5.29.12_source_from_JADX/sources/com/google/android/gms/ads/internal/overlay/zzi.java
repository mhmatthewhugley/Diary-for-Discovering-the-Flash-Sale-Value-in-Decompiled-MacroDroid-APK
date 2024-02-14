package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzk f2095a;

    /* renamed from: c */
    public final /* synthetic */ Drawable f2096c;

    public /* synthetic */ zzi(zzk zzk, Drawable drawable) {
        this.f2095a = zzk;
        this.f2096c = drawable;
    }

    public final void run() {
        zzk zzk = this.f2095a;
        zzk.f2097c.f2110a.getWindow().setBackgroundDrawable(this.f2096c);
    }
}
