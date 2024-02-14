package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzcmw;
import com.google.android.gms.internal.ads.zzcnr;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzaa {
    private zzaa() {
    }

    /* synthetic */ zzaa(zzz zzz) {
    }

    /* renamed from: k */
    public static zzaa m2509k(int i) {
        return i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : i >= 24 ? new zzu() : i >= 21 ? new zzt() : new zzaa();
    }

    /* renamed from: a */
    public int mo20246a() {
        return 1;
    }

    @Nullable
    /* renamed from: b */
    public CookieManager mo20247b(Context context) {
        zzt.m2905r();
        if (zzs.m2751b()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcgp.m45227e("Failed to obtain CookieManager.", th);
            zzt.m2904q().mo43503t(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public WebResourceResponse mo20248c(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: d */
    public zzcmw mo20249d(zzcmp zzcmp, zzbep zzbep, boolean z) {
        return new zzcnr(zzcmp, zzbep, z);
    }

    /* renamed from: e */
    public boolean mo20250e(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: f */
    public void mo20251f(Context context) {
    }

    /* renamed from: g */
    public int mo20252g(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    /* renamed from: h */
    public int mo20253h(AudioManager audioManager) {
        return 0;
    }

    /* renamed from: i */
    public void mo20254i(Activity activity) {
    }

    /* renamed from: j */
    public int mo20255j(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
