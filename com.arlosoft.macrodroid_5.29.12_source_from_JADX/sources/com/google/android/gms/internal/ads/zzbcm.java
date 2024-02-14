package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbcm implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ zzbcn f26597a;

    /* renamed from: b */
    public final /* synthetic */ zzbcf f26598b;

    /* renamed from: c */
    public final /* synthetic */ WebView f26599c;

    /* renamed from: d */
    public final /* synthetic */ boolean f26600d;

    public /* synthetic */ zzbcm(zzbcn zzbcn, zzbcf zzbcf, WebView webView, boolean z) {
        this.f26597a = zzbcn;
        this.f26598b = zzbcf;
        this.f26599c = webView;
        this.f26600d = z;
    }

    public final void onReceiveValue(Object obj) {
        zzbcn zzbcn = this.f26597a;
        zzbcf zzbcf = this.f26598b;
        WebView webView = this.f26599c;
        boolean z = this.f26600d;
        zzbcn.f26605g.mo42471d(zzbcf, webView, (String) obj, z);
    }
}
