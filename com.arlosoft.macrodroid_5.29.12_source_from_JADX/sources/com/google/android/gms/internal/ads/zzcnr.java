package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcnr extends zzcns {
    public zzcnr(zzcmp zzcmp, zzbep zzbep, boolean z) {
        super(zzcmp, zzbep, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo44176L0(webView, str, (Map) null);
    }
}
