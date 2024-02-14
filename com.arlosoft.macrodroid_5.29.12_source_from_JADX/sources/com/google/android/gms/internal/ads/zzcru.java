package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcru implements zzfbq {

    /* renamed from: a */
    private final zzcpw f30947a;

    /* renamed from: b */
    private final zzcru f30948b = this;

    /* renamed from: c */
    private final zzgxv f30949c;

    /* renamed from: d */
    private final zzgxv f30950d;

    /* renamed from: e */
    private final zzgxv f30951e;

    /* renamed from: f */
    private final zzgxv f30952f;

    /* renamed from: g */
    private final zzgxv f30953g;

    /* renamed from: h */
    private final zzgxv f30954h;

    /* renamed from: i */
    private final zzgxv f30955i;

    /* synthetic */ zzcru(zzcpw zzcpw, Context context, String str, zzq zzq, zzcrt zzcrt) {
        this.f30947a = zzcpw;
        zzgxi a = zzgxj.m53647a(context);
        this.f30949c = a;
        zzgxi a2 = zzgxj.m53647a(zzq);
        this.f30950d = a2;
        zzgxi a3 = zzgxj.m53647a(str);
        this.f30951e = a3;
        zzgxv b = zzgxh.m53646b(new zzeog(zzcpw.f29501p));
        this.f30952f = b;
        zzgxv b2 = zzgxh.m53646b(new zzfco(zzcpw.f29442A0));
        this.f30953g = b2;
        zzgxi zzgxi = a;
        zzgxv b3 = zzgxh.m53646b(new zzfbo(zzgxi, zzcpw.f29503q, zzcpw.f29464S, b, b2, zzfeh.m50007a()));
        this.f30954h = b3;
        this.f30955i = zzgxh.m53646b(new zzeoo(zzgxi, a2, a3, b3, b, b2, zzcpw.f29489j));
    }

    public final zzeon zza() {
        return (zzeon) this.f30955i.zzb();
    }
}
