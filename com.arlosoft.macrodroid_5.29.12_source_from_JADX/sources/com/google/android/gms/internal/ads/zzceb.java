package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzceb extends zzcev {

    /* renamed from: b */
    private final Clock f28281b;

    /* renamed from: c */
    private final zzceb f28282c = this;

    /* renamed from: d */
    private final zzgxv f28283d;

    /* renamed from: e */
    private final zzgxv f28284e;

    /* renamed from: f */
    private final zzgxv f28285f;

    /* renamed from: g */
    private final zzgxv f28286g;

    /* renamed from: h */
    private final zzgxv f28287h;

    /* renamed from: i */
    private final zzgxv f28288i;

    /* renamed from: j */
    private final zzgxv f28289j;

    /* renamed from: k */
    private final zzgxv f28290k;

    /* synthetic */ zzceb(Context context, Clock clock, zzg zzg, zzceu zzceu, zzcea zzcea) {
        this.f28281b = clock;
        zzgxi a = zzgxj.m53647a(context);
        this.f28283d = a;
        zzgxi a2 = zzgxj.m53647a(zzg);
        this.f28284e = a2;
        zzgxi a3 = zzgxj.m53647a(zzceu);
        this.f28285f = a3;
        this.f28286g = zzgxh.m53646b(new zzcdt(a, a2, a3));
        zzgxi a4 = zzgxj.m53647a(clock);
        this.f28287h = a4;
        zzgxv b = zzgxh.m53646b(new zzcdv(a4, a2, a3));
        this.f28288i = b;
        zzcdx zzcdx = new zzcdx(a4, b);
        this.f28289j = zzcdx;
        this.f28290k = zzgxh.m53646b(new zzcfa(a, zzcdx));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzcds mo43418a() {
        return (zzcds) this.f28286g.zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzcdw mo43419b() {
        return new zzcdw(this.f28281b, (zzcdu) this.f28288i.zzb());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzcez mo43420c() {
        return (zzcez) this.f28290k.zzb();
    }
}
