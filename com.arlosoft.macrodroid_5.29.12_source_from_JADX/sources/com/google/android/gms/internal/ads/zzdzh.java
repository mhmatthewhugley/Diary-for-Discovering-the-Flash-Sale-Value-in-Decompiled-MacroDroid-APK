package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdzh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzdzs f33428a;

    /* renamed from: c */
    public final /* synthetic */ zzchh f33429c;

    public /* synthetic */ zzdzh(zzdzs zzdzs, zzchh zzchh) {
        this.f33428a = zzdzs;
        this.f33429c = zzchh;
    }

    public final void run() {
        zzchh zzchh = this.f33429c;
        String c = zzt.m2904q().mo43494h().mo20365e().mo43478c();
        if (!TextUtils.isEmpty(c)) {
            zzchh.mo43574c(c);
        } else {
            zzchh.mo43575d(new Exception());
        }
    }
}
