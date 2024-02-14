package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.p027h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzbqz implements OnH5AdsEventListener {

    /* renamed from: a */
    public final /* synthetic */ WebView f27665a;

    /* renamed from: a */
    public final void mo19841a(String str) {
        WebView webView = this.f27665a;
        int i = zzbra.f27667d;
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
