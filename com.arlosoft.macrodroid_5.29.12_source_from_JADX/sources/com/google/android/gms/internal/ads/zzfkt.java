package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfkt {

    /* renamed from: a */
    private final zzfla f35996a;

    /* renamed from: b */
    private final WebView f35997b;

    /* renamed from: c */
    private final List f35998c = new ArrayList();

    /* renamed from: d */
    private final Map f35999d = new HashMap();

    /* renamed from: e */
    private final String f36000e;
    @Nullable

    /* renamed from: f */
    private final String f36001f;

    /* renamed from: g */
    private final zzfku f36002g;

    private zzfkt(zzfla zzfla, WebView webView, String str, List list, @Nullable String str2, String str3, zzfku zzfku) {
        this.f35996a = zzfla;
        this.f35997b = webView;
        this.f36002g = zzfku;
        this.f36001f = str2;
        this.f36000e = "";
    }

    /* renamed from: b */
    public static zzfkt m50430b(zzfla zzfla, WebView webView, @Nullable String str, String str2) {
        return new zzfkt(zzfla, webView, (String) null, (List) null, str, "", zzfku.HTML);
    }

    /* renamed from: c */
    public static zzfkt m50431c(zzfla zzfla, WebView webView, @Nullable String str, String str2) {
        return new zzfkt(zzfla, webView, (String) null, (List) null, str, "", zzfku.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView mo45871a() {
        return this.f35997b;
    }

    /* renamed from: d */
    public final zzfku mo45872d() {
        return this.f36002g;
    }

    /* renamed from: e */
    public final zzfla mo45873e() {
        return this.f35996a;
    }

    @Nullable
    /* renamed from: f */
    public final String mo45874f() {
        return this.f36001f;
    }

    /* renamed from: g */
    public final String mo45875g() {
        return this.f36000e;
    }

    /* renamed from: h */
    public final List mo45876h() {
        return Collections.unmodifiableList(this.f35998c);
    }

    /* renamed from: i */
    public final Map mo45877i() {
        return Collections.unmodifiableMap(this.f35999d);
    }
}
