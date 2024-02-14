package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsi {

    /* renamed from: a */
    private final zzfef f32959a;

    /* renamed from: b */
    private final Executor f32960b;

    /* renamed from: c */
    private final zzduy f32961c;

    /* renamed from: d */
    private final zzdtt f32962d;

    /* renamed from: e */
    private final Context f32963e;

    /* renamed from: f */
    private final zzdxq f32964f;

    /* renamed from: g */
    private final zzfir f32965g;

    /* renamed from: h */
    private final zzfkm f32966h;

    /* renamed from: i */
    private final zzego f32967i;

    public zzdsi(zzfef zzfef, Executor executor, zzduy zzduy, Context context, zzdxq zzdxq, zzfir zzfir, zzfkm zzfkm, zzego zzego, zzdtt zzdtt) {
        this.f32959a = zzfef;
        this.f32960b = executor;
        this.f32961c = zzduy;
        this.f32963e = context;
        this.f32964f = zzdxq;
        this.f32965g = zzfir;
        this.f32966h = zzfkm;
        this.f32967i = zzego;
        this.f32962d = zzdtt;
    }

    /* renamed from: h */
    private final void m48007h(zzcmp zzcmp) {
        m48008i(zzcmp);
        zzcmp.mo44064o0("/video", zzbpt.f27614l);
        zzcmp.mo44064o0("/videoMeta", zzbpt.f27615m);
        zzcmp.mo44064o0("/precache", new zzclc());
        zzcmp.mo44064o0("/delayPageLoaded", zzbpt.f27618p);
        zzcmp.mo44064o0("/instrument", zzbpt.f27616n);
        zzcmp.mo44064o0("/log", zzbpt.f27609g);
        zzcmp.mo44064o0("/click", zzbpt.m43931a((zzdkn) null));
        if (this.f32959a.f35627b != null) {
            zzcmp.mo44044e0().mo44091Y(true);
            zzcmp.mo44064o0("/open", new zzbqf((zzb) null, (zzbxz) null, (zzego) null, (zzdxq) null, (zzfir) null));
        } else {
            zzcmp.mo44044e0().mo44091Y(false);
        }
        if (zzt.m2903p().mo43449z(zzcmp.getContext())) {
            zzcmp.mo44064o0("/logScionEvent", new zzbqa(zzcmp.getContext()));
        }
    }

    /* renamed from: i */
    private static final void m48008i(zzcmp zzcmp) {
        zzcmp.mo44064o0("/videoClicked", zzbpt.f27610h);
        zzcmp.mo44044e0().mo44084H0(true);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26999T2)).booleanValue()) {
            zzcmp.mo44064o0("/getNativeAdViewSignals", zzbpt.f27621s);
        }
        zzcmp.mo44064o0("/getNativeClickMeta", zzbpt.f27622t);
    }

    /* renamed from: a */
    public final zzfzp mo44954a(JSONObject jSONObject) {
        return zzfzg.m51419n(zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzdry(this), this.f32960b), new zzdrz(this, jSONObject), this.f32960b);
    }

    /* renamed from: b */
    public final zzfzp mo44955b(String str, String str2, zzfdk zzfdk, zzfdn zzfdn, zzq zzq) {
        return zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzdsb(this, zzq, zzfdk, zzfdn, str, str2), this.f32960b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo44956c(JSONObject jSONObject, zzcmp zzcmp) throws Exception {
        zzchg e = zzchg.m45246e(zzcmp);
        if (this.f32959a.f35627b != null) {
            zzcmp.mo44057l0(zzcoe.m46202d());
        } else {
            zzcmp.mo44057l0(zzcoe.m46203e());
        }
        zzcmp.mo44044e0().mo44085I(new zzdrx(this, zzcmp, e));
        zzcmp.mo42972d1("google.afma.nativeAds.renderVideo", jSONObject);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ zzfzp mo44957d(zzq zzq, zzfdk zzfdk, zzfdn zzfdn, String str, String str2, Object obj) throws Exception {
        zzcmp a = this.f32961c.mo45004a(zzq, zzfdk, zzfdn);
        zzchg e = zzchg.m45246e(a);
        if (this.f32959a.f35627b != null) {
            m48007h(a);
            a.mo44057l0(zzcoe.m46202d());
        } else {
            zzdtq b = this.f32962d.mo44984b();
            zzdtq zzdtq = b;
            zzcoc e0 = a.mo44044e0();
            zzb zzb = r3;
            zzb zzb2 = new zzb(this.f32963e, (zzcdq) null, (zzcaq) null);
            e0.mo44086I0(b, zzdtq, b, b, b, false, (zzbpx) null, zzb, (zzbyg) null, (zzcdq) null, this.f32967i, this.f32966h, this.f32964f, this.f32965g, (zzbpv) null, b, (zzbqm) null, (zzbqg) null);
            m48008i(a);
        }
        a.mo44044e0().mo44085I(new zzdsc(this, a, e));
        a.mo44028R0(str, str2, (String) null);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ zzfzp mo44958e(Object obj) throws Exception {
        zzcmp a = this.f32961c.mo45004a(zzq.m2419n2(), (zzfdk) null, (zzfdn) null);
        zzchg e = zzchg.m45246e(a);
        m48007h(a);
        a.mo44044e0().mo44099d0(new zzdsa(e));
        a.loadUrl((String) zzay.m1924c().mo42663b(zzbjc.f26989S2));
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo44959f(zzcmp zzcmp, zzchg zzchg, boolean z) {
        if (!(this.f32959a.f35626a == null || zzcmp.mo43761p() == null)) {
            zzcmp.mo43761p().mo44167Nb(this.f32959a.f35626a);
        }
        zzchg.mo43573f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo44960g(zzcmp zzcmp, zzchg zzchg, boolean z) {
        if (z) {
            if (!(this.f32959a.f35626a == null || zzcmp.mo43761p() == null)) {
                zzcmp.mo43761p().mo44167Nb(this.f32959a.f35626a);
            }
            zzchg.mo43573f();
            return;
        }
        zzchg.mo43575d(new zzekr(1, "Html video Web View failed to load."));
    }
}
