package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzflk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView f36060a;

    /* renamed from: c */
    final /* synthetic */ String f36061c;

    zzflk(zzfll zzfll, WebView webView, String str) {
        this.f36060a = webView;
        this.f36061c = str;
    }

    public final void run() {
        this.f36060a.loadUrl(this.f36061c);
    }
}
