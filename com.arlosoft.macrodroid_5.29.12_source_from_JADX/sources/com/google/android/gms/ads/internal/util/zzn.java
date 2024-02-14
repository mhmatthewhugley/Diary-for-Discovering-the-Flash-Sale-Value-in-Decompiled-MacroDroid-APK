package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzgxw;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzn implements zzbjy {

    /* renamed from: a */
    final /* synthetic */ zzbka f2300a;

    /* renamed from: b */
    final /* synthetic */ Context f2301b;

    /* renamed from: c */
    final /* synthetic */ Uri f2302c;

    zzn(zzs zzs, zzbka zzbka, Context context, Uri uri) {
        this.f2300a = zzbka;
        this.f2301b = context;
        this.f2302c = uri;
    }

    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.f2300a.mo42720a()).build();
        build.intent.setPackage(zzgxw.m53666a(this.f2301b));
        build.launchUrl(this.f2301b, this.f2302c);
        this.f2300a.mo42725f((Activity) this.f2301b);
    }
}
