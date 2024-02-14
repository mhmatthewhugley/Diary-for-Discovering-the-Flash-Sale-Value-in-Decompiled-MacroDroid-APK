package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbcn implements Runnable {

    /* renamed from: a */
    final ValueCallback f26601a;

    /* renamed from: c */
    final /* synthetic */ zzbcf f26602c;

    /* renamed from: d */
    final /* synthetic */ WebView f26603d;

    /* renamed from: f */
    final /* synthetic */ boolean f26604f;

    /* renamed from: g */
    final /* synthetic */ zzbcp f26605g;

    zzbcn(zzbcp zzbcp, zzbcf zzbcf, WebView webView, boolean z) {
        this.f26605g = zzbcp;
        this.f26602c = zzbcf;
        this.f26603d = webView;
        this.f26604f = z;
        this.f26601a = new zzbcm(this, zzbcf, webView, z);
    }

    public final void run() {
        if (this.f26603d.getSettings().getJavaScriptEnabled()) {
            try {
                this.f26603d.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f26601a);
            } catch (Throwable unused) {
                this.f26601a.onReceiveValue("");
            }
        }
    }
}
