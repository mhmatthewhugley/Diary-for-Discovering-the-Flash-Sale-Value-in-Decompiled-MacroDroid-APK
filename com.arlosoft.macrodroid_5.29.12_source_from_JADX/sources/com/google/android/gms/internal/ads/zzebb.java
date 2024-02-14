package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzebb extends AdListener {

    /* renamed from: a */
    final /* synthetic */ String f33615a;

    /* renamed from: b */
    final /* synthetic */ zzebe f33616b;

    zzebb(zzebe zzebe, String str) {
        this.f33616b = zzebe;
        this.f33615a = str;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f33616b.m48545j(zzebe.m48544i(loadAdError), this.f33615a);
    }
}
