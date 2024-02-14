package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcrk implements zzdyz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f30619a;

    /* renamed from: b */
    private final zzbqr f30620b;

    /* renamed from: c */
    private final zzcpw f30621c;

    /* renamed from: d */
    private final zzcrk f30622d = this;

    /* renamed from: e */
    private final zzgxv f30623e;

    /* renamed from: f */
    private final zzgxv f30624f;

    /* renamed from: g */
    private final zzgxv f30625g;

    /* renamed from: h */
    private final zzgxv f30626h;

    /* synthetic */ zzcrk(zzcpw zzcpw, Context context, zzbqr zzbqr, zzcrj zzcrj) {
        this.f30621c = zzcpw;
        this.f30619a = context;
        this.f30620b = zzbqr;
        zzgxi a = zzgxj.m53647a(this);
        this.f30623e = a;
        zzgxi a2 = zzgxj.m53647a(zzbqr);
        this.f30624f = a2;
        zzdyv zzdyv = new zzdyv(a2);
        this.f30625g = zzdyv;
        this.f30626h = zzgxh.m53646b(new zzdyx(a, zzdyv));
    }

    /* renamed from: d */
    public final zzdyw mo44321d() {
        return (zzdyw) this.f30626h.zzb();
    }

    public final zzdyq zzb() {
        return new zzcre(this.f30621c, this.f30622d, (zzcrd) null);
    }
}
