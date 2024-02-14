package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdxb implements zzdfv, zzdeo, zzddd {

    /* renamed from: a */
    private final zzdxl f33300a;

    /* renamed from: c */
    private final zzdxv f33301c;

    public zzdxb(zzdxl zzdxl, zzdxv zzdxv) {
        this.f33300a = zzdxl;
        this.f33301c = zzdxv;
    }

    /* renamed from: g */
    public final void mo44489g(zzfdw zzfdw) {
        this.f33300a.mo45037b(zzfdw);
    }

    /* renamed from: n */
    public final void mo44393n() {
        this.f33300a.mo45036a().put("action", "loaded");
        this.f33301c.mo45056e(this.f33300a.mo45036a());
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        this.f33300a.mo45036a().put("action", "ftl");
        this.f33300a.mo45036a().put("ftl", String.valueOf(zze.f1934a));
        this.f33300a.mo45036a().put("ed", zze.f1936d);
        this.f33301c.mo45056e(this.f33300a.mo45036a());
    }

    /* renamed from: u */
    public final void mo44490u(zzcbc zzcbc) {
        this.f33300a.mo45038c(zzcbc.f28122a);
    }
}
