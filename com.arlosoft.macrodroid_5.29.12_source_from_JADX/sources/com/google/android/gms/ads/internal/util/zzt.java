package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzcmw;
import com.google.android.gms.internal.ads.zzcnt;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzt extends zzaa {
    public zzt() {
        super((zzz) null);
    }

    /* renamed from: a */
    public final int mo20246a() {
        return 16974374;
    }

    @Nullable
    /* renamed from: b */
    public final CookieManager mo20247b(Context context) {
        com.google.android.gms.ads.internal.zzt.m2905r();
        if (zzs.m2751b()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcgp.m45227e("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.m2904q().mo43503t(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public final WebResourceResponse mo20248c(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    /* renamed from: d */
    public final zzcmw mo20249d(zzcmp zzcmp, zzbep zzbep, boolean z) {
        return new zzcnt(zzcmp, zzbep, z);
    }
}
