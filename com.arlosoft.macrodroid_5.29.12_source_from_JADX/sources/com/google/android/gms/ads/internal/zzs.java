package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzs extends zzbr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzcgv f2362a;

    /* renamed from: c */
    private final zzq f2363c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Future f2364d = zzchc.f28456a.mo46579F(new zzo(this));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f2365f;

    /* renamed from: g */
    private final zzr f2366g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o */
    public WebView f2367o;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: p */
    public zzbf f2368p;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: s */
    public zzape f2369s;

    /* renamed from: z */
    private AsyncTask f2370z;

    public zzs(Context context, zzq zzq, String str, zzcgv zzcgv) {
        this.f2365f = context;
        this.f2362a = zzcgv;
        this.f2363c = zzq;
        this.f2367o = new WebView(context);
        this.f2366g = new zzr(context, str);
        mo20457Kb(0);
        this.f2367o.setVerticalScrollBarEnabled(false);
        this.f2367o.getSettings().setJavaScriptEnabled(true);
        this.f2367o.setWebViewClient(new zzm(this));
        this.f2367o.setOnTouchListener(new zzn(this));
    }

    /* renamed from: Qb */
    static /* bridge */ /* synthetic */ String m2838Qb(zzs zzs, String str) {
        if (zzs.f2369s == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzs.f2369s.mo41774a(parse, zzs.f2365f, (View) null, (Activity) null);
        } catch (zzapf e) {
            zzcgp.m45230h("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: Tb */
    static /* bridge */ /* synthetic */ void m2841Tb(zzs zzs, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzs.f2365f.startActivity(intent);
    }

    /* renamed from: D */
    public final void mo19922D() throws RemoteException {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        this.f2370z.cancel(true);
        this.f2364d.cancel(true);
        this.f2367o.destroy();
        this.f2367o = null;
    }

    /* renamed from: D0 */
    public final void mo19946D0() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: Eb */
    public final void mo19923Eb(boolean z) throws RemoteException {
    }

    /* renamed from: F */
    public final void mo19947F() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: I */
    public final void mo19924I() throws RemoteException {
        Preconditions.m4483f("pause must be called on the main UI thread.");
    }

    /* renamed from: J6 */
    public final void mo19948J6(zzbzl zzbzl) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Kb */
    public final void mo20457Kb(int i) {
        if (this.f2367o != null) {
            this.f2367o.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* renamed from: M4 */
    public final void mo19925M4(zzw zzw) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: M7 */
    public final void mo19949M7(zzcby zzcby) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: Q5 */
    public final boolean mo19950Q5() throws RemoteException {
        return false;
    }

    /* renamed from: T8 */
    public final void mo19951T8(zzbjx zzbjx) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: U6 */
    public final void mo19952U6(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: V */
    public final void mo19927V() throws RemoteException {
        Preconditions.m4483f("resume must be called on the main UI thread.");
    }

    /* renamed from: a1 */
    public final boolean mo19953a1() throws RemoteException {
        return false;
    }

    /* renamed from: ab */
    public final void mo19954ab(zzbw zzbw) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) {
    }

    /* renamed from: d */
    public final Bundle mo19955d() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: f */
    public final zzq mo19929f() throws RemoteException {
        return this.f2363c;
    }

    /* renamed from: g */
    public final zzbf mo19930g() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: h */
    public final zzbz mo19931h() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: h6 */
    public final boolean mo19932h6(zzl zzl) throws RemoteException {
        Preconditions.m4489l(this.f2367o, "This Search Ad has already been torn down");
        this.f2366g.mo20456f(zzl, this.f2362a);
        this.f2370z = new zzq(this, (zzp) null).execute(new Void[0]);
        return true;
    }

    @Nullable
    /* renamed from: i */
    public final zzdh mo19933i() {
        return null;
    }

    @Nullable
    /* renamed from: j */
    public final zzdk mo19934j() {
        return null;
    }

    /* renamed from: l6 */
    public final void mo19956l6(zzcd zzcd) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) {
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: m */
    public final String mo20458m() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbkg.f27391d.mo42728e());
        builder.appendQueryParameter("query", this.f2366g.mo20454d());
        builder.appendQueryParameter("pubId", this.f2366g.mo20453c());
        builder.appendQueryParameter("mappver", this.f2366g.mo20451a());
        Map e = this.f2366g.mo20455e();
        for (String str : e.keySet()) {
            builder.appendQueryParameter(str, (String) e.get(str));
        }
        Uri build = builder.build();
        zzape zzape = this.f2369s;
        if (zzape != null) {
            try {
                build = zzape.mo41775b(build, this.f2365f);
            } catch (zzapf e2) {
                zzcgp.m45230h("Unable to process ad data", e2);
            }
        }
        String s = mo20459s();
        String encodedQuery = build.getEncodedQuery();
        return s + "#" + encodedQuery;
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) {
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() throws RemoteException {
        Preconditions.m4483f("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.m5051g8(this.f2367o);
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: oa */
    public final void mo19939oa(zzq zzq) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Nullable
    /* renamed from: p */
    public final String mo19957p() throws RemoteException {
        return null;
    }

    /* renamed from: q */
    public final String mo19940q() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Nullable
    /* renamed from: r */
    public final String mo19958r() throws RemoteException {
        return null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: s */
    public final String mo20459s() {
        String b = this.f2366g.mo20452b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        return "https://" + b + ((String) zzbkg.f27391d.mo42728e());
    }

    /* renamed from: s7 */
    public final void mo19959s7(zzbzo zzbzo, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: t */
    public final int mo20460t(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzaw.m1917b();
            return zzcgi.m45187w(this.f2365f, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: t8 */
    public final void mo19942t8(IObjectWrapper iObjectWrapper) {
    }

    /* renamed from: v8 */
    public final void mo19960v8(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: w4 */
    public final void mo19961w4(zzdo zzdo) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: xa */
    public final void mo19943xa(zzbf zzbf) throws RemoteException {
        this.f2368p = zzbf;
    }

    /* renamed from: y9 */
    public final void mo19944y9(zzff zzff) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: ya */
    public final void mo19945ya(boolean z) {
        throw new IllegalStateException("Unused method");
    }
}
