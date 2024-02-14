package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdzq implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzdzs f33451a;

    zzdzq(zzdzs zzdzs) {
        this.f33451a = zzdzs;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        synchronized (this) {
            this.f33451a.f33460c = true;
            this.f33451a.m48462v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzt.m2889b().mo21952c() - this.f33451a.f33461d));
            this.f33451a.f33462e.mo43575d(new Exception());
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.f33451a.f33460c = true;
            this.f33451a.m48462v("com.google.android.gms.ads.MobileAds", true, "", (int) (zzt.m2889b().mo21952c() - this.f33451a.f33461d));
            this.f33451a.f33466i.execute(new zzdzp(this, str));
        }
    }
}
