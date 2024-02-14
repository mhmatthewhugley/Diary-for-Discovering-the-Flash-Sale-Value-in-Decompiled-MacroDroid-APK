package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzflv extends zzfls {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f36078d;

    /* renamed from: e */
    private Long f36079e = null;

    /* renamed from: f */
    private final Map f36080f;

    public zzflv(Map map, String str) {
        this.f36080f = map;
    }

    /* renamed from: c */
    public final void mo45933c() {
        long j;
        super.mo45933c();
        if (this.f36079e == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f36079e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzflu(this), Math.max(4000 - j, 2000));
        this.f36078d = null;
    }

    /* renamed from: f */
    public final void mo45936f(zzfkv zzfkv, zzfkt zzfkt) {
        JSONObject jSONObject = new JSONObject();
        Map i = zzfkt.mo45877i();
        for (String str : i.keySet()) {
            zzflw.m50522h(jSONObject, str, (zzflb) i.get(str));
        }
        mo45937g(zzfkv, zzfkt, jSONObject);
    }

    /* renamed from: j */
    public final void mo45940j() {
        WebView webView = new WebView(zzflj.m50475b().mo45912a());
        this.f36078d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo45939i(this.f36078d);
        WebView webView2 = this.f36078d;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f36080f.keySet().iterator();
        if (!it.hasNext()) {
            this.f36079e = Long.valueOf(System.nanoTime());
            return;
        }
        zzflb zzflb = (zzflb) this.f36080f.get((String) it.next());
        throw null;
    }
}
