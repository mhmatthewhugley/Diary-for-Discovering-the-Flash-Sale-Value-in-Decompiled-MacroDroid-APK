package com.google.android.gms.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzb {
    /* renamed from: a */
    public static int m3101a(AdSize adSize) {
        return adSize.mo19688i();
    }

    /* renamed from: b */
    public static int m3102b(AdSize adSize) {
        return adSize.mo19686h();
    }

    /* renamed from: c */
    public static AdSize m3103c(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    /* renamed from: d */
    public static AdSize m3104d(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.mo19691l(true);
        adSize.mo19689j(i2);
        return adSize;
    }

    /* renamed from: e */
    public static AdSize m3105e(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.mo19692m(true);
        adSize.mo19690k(i2);
        return adSize;
    }

    /* renamed from: f */
    public static boolean m3106f(AdSize adSize) {
        return adSize.mo19693n();
    }

    /* renamed from: g */
    public static boolean m3107g(AdSize adSize) {
        return adSize.mo19694o();
    }

    /* renamed from: h */
    public static boolean m3108h(AdSize adSize) {
        return adSize.mo19695p();
    }
}
