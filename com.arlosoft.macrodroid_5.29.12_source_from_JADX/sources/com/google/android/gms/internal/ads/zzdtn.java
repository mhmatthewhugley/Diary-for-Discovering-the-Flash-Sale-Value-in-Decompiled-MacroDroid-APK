package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdtn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzdth f33064a = new zzdth((zzdtg) null);

    /* renamed from: b */
    private final zza f33065b;

    /* renamed from: c */
    private final zzcnb f33066c;

    /* renamed from: d */
    private final Context f33067d;

    /* renamed from: e */
    private final zzdxq f33068e;

    /* renamed from: f */
    private final zzfir f33069f;

    /* renamed from: g */
    private final Executor f33070g;

    /* renamed from: h */
    private final zzape f33071h;

    /* renamed from: i */
    private final zzcgv f33072i;

    /* renamed from: j */
    private final zzbqj f33073j;

    /* renamed from: k */
    private final zzego f33074k;

    /* renamed from: l */
    private final zzfkm f33075l;

    /* renamed from: m */
    private zzfzp f33076m;

    zzdtn(zzdtk zzdtk) {
        this.f33067d = zzdtk.f33053d;
        this.f33070g = zzdtk.f33057p;
        this.f33071h = zzdtk.f33058s;
        this.f33072i = zzdtk.f33059z;
        this.f33065b = zzdtk.f33051a;
        this.f33066c = zzdtk.f33052c;
        this.f33073j = new zzbqj();
        this.f33074k = zzdtk.f33056o;
        this.f33075l = zzdtk.f33050A;
        this.f33068e = zzdtk.f33054f;
        this.f33069f = zzdtk.f33055g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzcmp mo44973a(zzcmp zzcmp) {
        zzcmp zzcmp2 = zzcmp;
        zzcmp2.mo44064o0("/result", this.f33073j);
        zzcoc e0 = zzcmp.mo44044e0();
        zzdth zzdth = this.f33064a;
        zzb zzb = r2;
        zzb zzb2 = new zzb(this.f33067d, (zzcdq) null, (zzcaq) null);
        e0.mo44086I0((com.google.android.gms.ads.internal.client.zza) null, zzdth, zzdth, zzdth, zzdth, false, (zzbpx) null, zzb, (zzbyg) null, (zzcdq) null, this.f33074k, this.f33075l, this.f33068e, this.f33069f, (zzbpv) null, (zzdkn) null, (zzbqm) null, (zzbqg) null);
        return zzcmp2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo44974c(String str, JSONObject jSONObject, zzcmp zzcmp) throws Exception {
        return this.f33073j.mo42887b(zzcmp, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized zzfzp mo44975d(String str, JSONObject jSONObject) {
        zzfzp zzfzp = this.f33076m;
        if (zzfzp == null) {
            return zzfzg.m51414i((Object) null);
        }
        return zzfzg.m51419n(zzfzp, new zzdsz(this, str, jSONObject), this.f33070g);
    }

    /* renamed from: e */
    public final synchronized void mo44976e(zzfdk zzfdk, zzfdn zzfdn) {
        zzfzp zzfzp = this.f33076m;
        if (zzfzp != null) {
            zzfzg.m51423r(zzfzp, new zzdtf(this, zzfdk, zzfdn), this.f33070g);
        }
    }

    /* renamed from: f */
    public final synchronized void mo44977f() {
        zzfzp zzfzp = this.f33076m;
        if (zzfzp != null) {
            zzfzg.m51423r(zzfzp, new zzdtb(this), this.f33070g);
            this.f33076m = null;
        }
    }

    /* renamed from: g */
    public final synchronized void mo44978g(String str, Map map) {
        zzfzp zzfzp = this.f33076m;
        if (zzfzp != null) {
            zzfzg.m51423r(zzfzp, new zzdte(this, "sendMessageToNativeJs", map), this.f33070g);
        }
    }

    /* renamed from: h */
    public final synchronized void mo44979h() {
        Context context = this.f33067d;
        zzcgv zzcgv = this.f33072i;
        zzbiu zzbiu = zzbjc.f26979R2;
        zzfzp m = zzfzg.m51418m(zzfzg.m51417l(new zzcmy(context, this.f33071h, zzcgv, this.f33065b, (String) zzay.m1924c().mo42663b(zzbiu)), zzchc.f28460e), new zzdta(this), this.f33070g);
        this.f33076m = m;
        zzchf.m45244a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void mo44980i(String str, zzbpu zzbpu) {
        zzfzp zzfzp = this.f33076m;
        if (zzfzp != null) {
            zzfzg.m51423r(zzfzp, new zzdtc(this, str, zzbpu), this.f33070g);
        }
    }

    /* renamed from: j */
    public final void mo44981j(WeakReference weakReference, String str, zzbpu zzbpu) {
        mo44980i(str, new zzdtm(this, weakReference, str, zzbpu, (zzdtl) null));
    }

    /* renamed from: k */
    public final synchronized void mo44982k(String str, zzbpu zzbpu) {
        zzfzp zzfzp = this.f33076m;
        if (zzfzp != null) {
            zzfzg.m51423r(zzfzp, new zzdtd(this, str, zzbpu), this.f33070g);
        }
    }
}
