package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzbf extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ zzbg f39347a;

    public final void onLoadResource(WebView webView, String str) {
        if (zzbg.m55950c(this.f39347a, str)) {
            this.f39347a.f39349c.mo48709c(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.f39347a.f39350d) {
            boolean unused = this.f39347a.f39350d = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f39347a.f39349c.mo48710d(i, str, str2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (!zzbg.m55950c(this.f39347a, uri)) {
            return false;
        }
        this.f39347a.f39349c.mo48709c(uri);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzbg.m55950c(this.f39347a, str)) {
            return false;
        }
        this.f39347a.f39349c.mo48709c(str);
        return true;
    }
}
