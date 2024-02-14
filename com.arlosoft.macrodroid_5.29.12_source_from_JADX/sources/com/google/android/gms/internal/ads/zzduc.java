package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzduc extends zzcze {

    /* renamed from: i */
    private final Context f33124i;

    /* renamed from: j */
    private final WeakReference f33125j;

    /* renamed from: k */
    private final zzdmp f33126k;

    /* renamed from: l */
    private final zzdjw f33127l;

    /* renamed from: m */
    private final zzddn f33128m;

    /* renamed from: n */
    private final zzdeu f33129n;

    /* renamed from: o */
    private final zzczy f33130o;

    /* renamed from: p */
    private final zzcci f33131p;

    /* renamed from: q */
    private final zzfni f33132q;

    /* renamed from: r */
    private final zzfdy f33133r;

    /* renamed from: s */
    private boolean f33134s = false;

    zzduc(zzczd zzczd, Context context, @Nullable zzcmp zzcmp, zzdmp zzdmp, zzdjw zzdjw, zzddn zzddn, zzdeu zzdeu, zzczy zzczy, zzfdk zzfdk, zzfni zzfni, zzfdy zzfdy) {
        super(zzczd);
        this.f33124i = context;
        this.f33126k = zzdmp;
        this.f33125j = new WeakReference(zzcmp);
        this.f33127l = zzdjw;
        this.f33128m = zzddn;
        this.f33129n = zzdeu;
        this.f33130o = zzczy;
        this.f33132q = zzfni;
        zzcce zzcce = zzfdk.f35543m;
        this.f33131p = new zzcdc(zzcce != null ? zzcce.f28207a : "", zzcce != null ? zzcce.f28208c : 1);
        this.f33133r = zzfdy;
    }

    public final void finalize() throws Throwable {
        try {
            zzcmp zzcmp = (zzcmp) this.f33125j.get();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26952O5)).booleanValue()) {
                if (!this.f33134s && zzcmp != null) {
                    zzchc.f28460e.execute(new zzdub(zzcmp));
                }
            } else if (zzcmp != null) {
                zzcmp.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final Bundle mo44988h() {
        return this.f33129n.mo44601M0();
    }

    /* renamed from: i */
    public final zzcci mo44989i() {
        return this.f33131p;
    }

    /* renamed from: j */
    public final zzfdy mo44990j() {
        return this.f33133r;
    }

    /* renamed from: k */
    public final boolean mo44991k() {
        return this.f33130o.mo44516a();
    }

    /* renamed from: l */
    public final boolean mo44992l() {
        return this.f33134s;
    }

    /* renamed from: m */
    public final boolean mo44993m() {
        zzcmp zzcmp = (zzcmp) this.f33125j.get();
        return zzcmp != null && !zzcmp.mo44067q0();
    }

    /* renamed from: n */
    public final boolean mo44994n(boolean z, @Nullable Activity activity) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27302y0)).booleanValue()) {
            zzt.m2905r();
            if (zzs.m2752c(this.f33124i)) {
                zzcgp.m45229g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f33128m.zzb();
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27312z0)).booleanValue()) {
                    this.f33132q.mo46006a(this.f31895a.f35590b.f35587b.f35566b);
                }
                return false;
            }
        }
        if (this.f33134s) {
            zzcgp.m45229g("The rewarded ad have been showed.");
            this.f33128m.mo44574r(zzffe.m50085d(10, (String) null, (zze) null));
            return false;
        }
        this.f33134s = true;
        this.f33127l.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.f33124i;
        }
        try {
            this.f33126k.mo44707a(z, context, this.f33128m);
            this.f33127l.zza();
            return true;
        } catch (zzdmo e) {
            this.f33128m.mo44575y0(e);
            return false;
        }
    }
}
