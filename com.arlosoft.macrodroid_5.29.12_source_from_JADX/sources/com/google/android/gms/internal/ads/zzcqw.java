package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcqw implements zzezx {

    /* renamed from: a */
    private final Context f30458a;

    /* renamed from: b */
    private final zzq f30459b;

    /* renamed from: c */
    private final String f30460c;

    /* renamed from: d */
    private final zzcpw f30461d;

    /* renamed from: e */
    private final zzcqw f30462e = this;

    /* renamed from: f */
    private final zzgxv f30463f;

    /* renamed from: g */
    private final zzgxv f30464g;

    /* renamed from: h */
    private final zzgxv f30465h;

    /* renamed from: i */
    private final zzgxv f30466i;

    /* renamed from: j */
    private final zzgxv f30467j;

    /* renamed from: k */
    private final zzgxv f30468k;

    /* synthetic */ zzcqw(zzcpw zzcpw, Context context, String str, zzq zzq, zzcqv zzcqv) {
        this.f30461d = zzcpw;
        this.f30458a = context;
        this.f30459b = zzq;
        this.f30460c = str;
        zzgxi a = zzgxj.m53647a(context);
        this.f30463f = a;
        zzgxi a2 = zzgxj.m53647a(zzq);
        this.f30464g = a2;
        zzgxv b = zzgxh.m53646b(new zzeog(zzcpw.f29501p));
        this.f30465h = b;
        zzgxv b2 = zzgxh.m53646b(zzeol.m49361a());
        this.f30466i = b2;
        zzgxv b3 = zzgxh.m53646b(zzdhx.m47389a());
        this.f30467j = b3;
        this.f30468k = zzgxh.m53646b(new zzezv(a, zzcpw.f29503q, a2, zzcpw.f29464S, b, b2, zzfeh.m50007a(), b3));
    }

    public final zzenm zza() {
        zzcgv d = this.f30461d.f29473b.mo44222d();
        zzgxq.m53658b(d);
        return new zzenm(this.f30458a, this.f30459b, this.f30460c, (zzezu) this.f30468k.zzb(), (zzeof) this.f30465h.zzb(), d);
    }
}
