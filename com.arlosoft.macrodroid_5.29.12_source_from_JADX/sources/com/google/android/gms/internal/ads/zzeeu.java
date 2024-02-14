package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeeu implements zzdfv, zzdeo, zzddd {

    /* renamed from: a */
    private final zzfiq f33853a;

    /* renamed from: c */
    private final zzfir f33854c;

    /* renamed from: d */
    private final zzcgc f33855d;

    public zzeeu(zzfiq zzfiq, zzfir zzfir, zzcgc zzcgc) {
        this.f33853a = zzfiq;
        this.f33854c = zzfir;
        this.f33855d = zzcgc;
    }

    /* renamed from: g */
    public final void mo44489g(zzfdw zzfdw) {
        this.f33853a.mo45779h(zzfdw, this.f33855d);
    }

    /* renamed from: n */
    public final void mo44393n() {
        zzfir zzfir = this.f33854c;
        zzfiq zzfiq = this.f33853a;
        zzfiq.mo45774a("action", "loaded");
        zzfir.mo45782a(zzfiq);
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        zzfiq zzfiq = this.f33853a;
        zzfiq.mo45774a("action", "ftl");
        zzfiq.mo45774a("ftl", String.valueOf(zze.f1934a));
        zzfiq.mo45774a("ed", zze.f1936d);
        this.f33854c.mo45782a(this.f33853a);
    }

    /* renamed from: u */
    public final void mo44490u(zzcbc zzcbc) {
        this.f33853a.mo45780i(zzcbc.f28122a);
    }
}
