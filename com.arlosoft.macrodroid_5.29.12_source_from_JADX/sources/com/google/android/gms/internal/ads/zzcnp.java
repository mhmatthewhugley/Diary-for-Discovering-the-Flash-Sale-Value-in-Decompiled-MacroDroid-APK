package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcnp {

    /* renamed from: a */
    private final zzcnq f29145a;

    /* renamed from: b */
    private final zzcno f29146b;

    public zzcnp(zzcnq zzcnq, zzcno zzcno, byte[] bArr) {
        this.f29146b = zzcno;
        this.f29145a = zzcnq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo44172a(String str) {
        zzcno zzcno = this.f29146b;
        Uri parse = Uri.parse(str);
        zzcmw g1 = ((zzcni) zzcno.f29144a).mo44146g1();
        if (g1 == null) {
            zzcgp.m45226d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            g1.mo44089V0(parse);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzcnx] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.m2645k("Click string is empty, not proceeding.");
            return "";
        }
        ? r0 = this.f29145a;
        zzape L = r0.mo44019L();
        if (L == null) {
            zze.m2645k("Signal utils is empty, ignoring.");
            return "";
        }
        zzapa c = L.mo41776c();
        if (c == null) {
            zze.m2645k("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            zze.m2645k("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.f29145a.getContext();
            zzcnq zzcnq = this.f29145a;
            return c.mo20432f(context, str, (View) zzcnq, zzcnq.mo43756i());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzcnx] */
    @JavascriptInterface
    public String getViewSignals() {
        ? r0 = this.f29145a;
        zzape L = r0.mo44019L();
        if (L == null) {
            zze.m2645k("Signal utils is empty, ignoring.");
            return "";
        }
        zzapa c = L.mo41776c();
        if (c == null) {
            zze.m2645k("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            zze.m2645k("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.f29145a.getContext();
            zzcnq zzcnq = this.f29145a;
            return c.mo20433g(context, (View) zzcnq, zzcnq.mo43756i());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzcgp.m45229g("URL is empty, ignoring message");
        } else {
            zzs.f2304i.post(new zzcnn(this, str));
        }
    }
}
