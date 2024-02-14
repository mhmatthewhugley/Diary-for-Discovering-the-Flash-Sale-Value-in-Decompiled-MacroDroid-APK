package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p027h5.H5AdsRequestHandler;

@RequiresApi(api = 21)
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbra extends zzbqn {

    /* renamed from: d */
    public static final /* synthetic */ int f27667d = 0;
    @Nullable

    /* renamed from: a */
    private WebViewClient f27668a;

    /* renamed from: b */
    private final H5AdsRequestHandler f27669b;

    /* renamed from: c */
    private final WebView f27670c;

    /* renamed from: b */
    private final boolean m44001b(WebView webView) {
        if (this.f27670c.equals(webView)) {
            return true;
        }
        zzcgp.m45226d("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final WebViewClient mo19840a() {
        return this.f27668a;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (m44001b(webView) && !this.f27669b.mo19839a(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @RequiresApi(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!m44001b(this.f27670c)) {
            return false;
        }
        if (this.f27669b.mo19839a(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!m44001b(webView)) {
            return false;
        }
        if (this.f27669b.mo19839a(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
