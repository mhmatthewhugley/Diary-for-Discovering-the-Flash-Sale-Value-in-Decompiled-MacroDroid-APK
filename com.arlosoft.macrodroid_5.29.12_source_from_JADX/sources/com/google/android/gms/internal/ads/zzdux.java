package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdux {

    /* renamed from: a */
    private final zzdcy f33156a;

    /* renamed from: b */
    private final zzdkl f33157b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzdeh f33158c;

    /* renamed from: d */
    private final zzdeu f33159d;

    /* renamed from: e */
    private final zzdfg f33160e;

    /* renamed from: f */
    private final zzdht f33161f;

    /* renamed from: g */
    private final Executor f33162g;

    /* renamed from: h */
    private final zzdki f33163h;

    /* renamed from: i */
    private final zzcvk f33164i;

    /* renamed from: j */
    private final zzb f33165j;

    /* renamed from: k */
    private final zzcdq f33166k;

    /* renamed from: l */
    private final zzape f33167l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final zzdhk f33168m;

    /* renamed from: n */
    private final zzego f33169n;

    /* renamed from: o */
    private final zzfkm f33170o;

    /* renamed from: p */
    private final zzdxq f33171p;

    /* renamed from: q */
    private final zzfir f33172q;

    public zzdux(zzdcy zzdcy, zzdeh zzdeh, zzdeu zzdeu, zzdfg zzdfg, zzdht zzdht, Executor executor, zzdki zzdki, zzcvk zzcvk, zzb zzb, @Nullable zzcdq zzcdq, zzape zzape, zzdhk zzdhk, zzego zzego, zzfkm zzfkm, zzdxq zzdxq, zzfir zzfir, zzdkl zzdkl) {
        this.f33156a = zzdcy;
        this.f33158c = zzdeh;
        this.f33159d = zzdeu;
        this.f33160e = zzdfg;
        this.f33161f = zzdht;
        this.f33162g = executor;
        this.f33163h = zzdki;
        this.f33164i = zzcvk;
        this.f33165j = zzb;
        this.f33166k = zzcdq;
        this.f33167l = zzape;
        this.f33168m = zzdhk;
        this.f33169n = zzego;
        this.f33170o = zzfkm;
        this.f33171p = zzdxq;
        this.f33172q = zzfir;
        this.f33157b = zzdkl;
    }

    /* renamed from: j */
    public static final zzfzp m48214j(zzcmp zzcmp, String str, String str2) {
        zzchh zzchh = new zzchh();
        zzcmp.mo44044e0().mo44085I(new zzduv(zzchh));
        zzcmp.mo44028R0(str, str2, (String) null);
        return zzchh;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo44997c() {
        this.f33156a.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo44998d(String str, String str2) {
        this.f33161f.mo42869x0(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo44999e() {
        this.f33158c.zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo45000f(View view) {
        this.f33165j.mo20414a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo45001g(zzcmp zzcmp, zzcmp zzcmp2, Map map) {
        this.f33164i.mo44408c(zzcmp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ boolean mo45002h(View view, MotionEvent motionEvent) {
        this.f33165j.mo20414a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* renamed from: i */
    public final void mo45003i(zzcmp zzcmp, boolean z, zzbpx zzbpx) {
        zzapa c;
        zzcmp zzcmp2 = zzcmp;
        zzcoc e0 = zzcmp.mo44044e0();
        zzduo zzduo = r4;
        zzduo zzduo2 = new zzduo(this);
        zzdeu zzdeu = this.f33159d;
        zzdfg zzdfg = this.f33160e;
        zzdup zzdup = r7;
        zzdup zzdup2 = new zzdup(this);
        zzduq zzduq = r10;
        zzduq zzduq2 = new zzduq(this);
        zzb zzb = this.f33165j;
        zzduw zzduw = r12;
        zzduw zzduw2 = new zzduw(this);
        e0.mo44086I0(zzduo, zzdeu, zzdfg, zzdup, zzduq, z, zzbpx, zzb, zzduw, this.f33166k, this.f33169n, this.f33170o, this.f33171p, this.f33172q, (zzbpv) null, this.f33157b, (zzbqm) null, (zzbqg) null);
        zzcmp zzcmp3 = zzcmp;
        zzcmp3.setOnTouchListener(new zzdur(this));
        zzcmp3.setOnClickListener(new zzdus(this));
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27134h2)).booleanValue() && (c = this.f33167l.mo41776c()) != null) {
            c.mo20427a((View) zzcmp3);
        }
        this.f33163h.mo44629G0(zzcmp3, this.f33162g);
        this.f33163h.mo44629G0(new zzdut(zzcmp3), this.f33162g);
        this.f33163h.mo44684M0((View) zzcmp3);
        zzcmp3.mo44064o0("/trackActiveViewUnit", new zzduu(this, zzcmp3));
        this.f33164i.mo44409d(zzcmp3);
    }
}
