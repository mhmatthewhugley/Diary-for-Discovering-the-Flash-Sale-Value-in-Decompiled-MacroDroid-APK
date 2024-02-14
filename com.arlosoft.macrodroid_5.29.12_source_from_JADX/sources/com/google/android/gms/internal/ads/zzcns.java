package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzcns extends zzcmw {
    public zzcns(zzcmp zzcmp, zzbep zzbep, boolean z) {
        super(zzcmp, zzbep, z);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: L0 */
    public final WebResourceResponse mo44176L0(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzcmp)) {
            zzcgp.m45229g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcmp zzcmp = (zzcmp) webView;
        zzcdq zzcdq = this.f29024L;
        if (zzcdq != null) {
            zzcdq.mo43393a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo44082E(str, map);
        }
        if (zzcmp.mo44044e0() != null) {
            zzcmp.mo44044e0().mo44112p0();
        }
        if (zzcmp.mo44009C().mo44186i()) {
            str2 = (String) zzay.m1924c().mo42663b(zzbjc.f26926M);
        } else if (zzcmp.mo44055j0()) {
            str2 = (String) zzay.m1924c().mo42663b(zzbjc.f26916L);
        } else {
            str2 = (String) zzay.m1924c().mo42663b(zzbjc.f26906K);
        }
        zzt.m2905r();
        return zzs.m2744R(zzcmp.getContext(), zzcmp.mo43759m().f28446a, str2);
    }
}
