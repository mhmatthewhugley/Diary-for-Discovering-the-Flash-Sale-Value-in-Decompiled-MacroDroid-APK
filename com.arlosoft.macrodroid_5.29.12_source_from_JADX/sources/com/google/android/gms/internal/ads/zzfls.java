package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzfls {

    /* renamed from: a */
    private zzfmq f36073a = new zzfmq((WebView) null);

    /* renamed from: b */
    private long f36074b;

    /* renamed from: c */
    private int f36075c;

    public zzfls() {
        mo45932b();
    }

    /* renamed from: a */
    public final WebView mo45931a() {
        return (WebView) this.f36073a.get();
    }

    /* renamed from: b */
    public final void mo45932b() {
        this.f36074b = System.nanoTime();
        this.f36075c = 1;
    }

    /* renamed from: c */
    public void mo45933c() {
        this.f36073a.clear();
    }

    /* renamed from: d */
    public final void mo45934d(String str, long j) {
        if (j >= this.f36074b && this.f36075c != 3) {
            this.f36075c = 3;
            zzfll.m50478a().mo45919f(mo45931a(), str);
        }
    }

    /* renamed from: e */
    public final void mo45935e(String str, long j) {
        if (j >= this.f36074b) {
            this.f36075c = 2;
            zzfll.m50478a().mo45919f(mo45931a(), str);
        }
    }

    /* renamed from: f */
    public void mo45936f(zzfkv zzfkv, zzfkt zzfkt) {
        mo45937g(zzfkv, zzfkt, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo45937g(zzfkv zzfkv, zzfkt zzfkt, JSONObject jSONObject) {
        String h = zzfkv.mo45881h();
        JSONObject jSONObject2 = new JSONObject();
        zzflw.m50522h(jSONObject2, "environment", "app");
        zzflw.m50522h(jSONObject2, "adSessionType", zzfkt.mo45872d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzflw.m50522h(jSONObject3, "deviceType", str + "; " + str2);
        zzflw.m50522h(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzflw.m50522h(jSONObject3, "os", "Android");
        zzflw.m50522h(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzflw.m50522h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzflw.m50522h(jSONObject4, "partnerName", zzfkt.mo45873e().mo45887b());
        zzflw.m50522h(jSONObject4, "partnerVersion", zzfkt.mo45873e().mo45888c());
        zzflw.m50522h(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzflw.m50522h(jSONObject5, "libraryVersion", "1.3.31-google_20220407");
        zzflw.m50522h(jSONObject5, "appId", zzflj.m50475b().mo45912a().getApplicationContext().getPackageName());
        zzflw.m50522h(jSONObject2, "app", jSONObject5);
        if (zzfkt.mo45874f() != null) {
            zzflw.m50522h(jSONObject2, "contentUrl", zzfkt.mo45874f());
        }
        zzflw.m50522h(jSONObject2, "customReferenceData", zzfkt.mo45875g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfkt.mo45876h().iterator();
        if (!it.hasNext()) {
            zzfll.m50478a().mo45920g(mo45931a(), h, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzflb zzflb = (zzflb) it.next();
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo45938h(float f) {
        zzfll.m50478a().mo45918e(mo45931a(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo45939i(WebView webView) {
        this.f36073a = new zzfmq(webView);
    }

    /* renamed from: j */
    public void mo45940j() {
    }

    /* renamed from: k */
    public final boolean mo45941k() {
        return this.f36073a.get() != null;
    }
}
