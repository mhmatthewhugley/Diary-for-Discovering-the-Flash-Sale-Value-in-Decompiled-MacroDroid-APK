package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcnt extends zzcns {
    public zzcnt(zzcmp zzcmp, zzbep zzbep, boolean z) {
        super(zzcmp, zzbep, z);
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo44176L0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
