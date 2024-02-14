package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeji implements zzehj {

    /* renamed from: a */
    private final Context f34191a;

    /* renamed from: b */
    private final zzdmh f34192b;

    /* renamed from: c */
    private final zzcgv f34193c;

    /* renamed from: d */
    private final Executor f34194d;

    public zzeji(Context context, zzcgv zzcgv, zzdmh zzdmh, Executor executor) {
        this.f34191a = context;
        this.f34193c = zzcgv;
        this.f34192b = zzdmh;
        this.f34194d = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        zzdlh c = this.f34192b.mo44335c(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdlk(new zzejh(this, zzehf), (zzcmp) null));
        c.mo44277c().mo44629G0(new zzcuq((zzffa) zzehf.f34016b), this.f34194d);
        ((zzeix) zzehf.f34017c).mo45330Kb(c.mo44279g());
        return c.mo44326i();
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        ((zzffa) zzehf.f34016b).mo45661q(this.f34191a, zzfdw.f35589a.f35583a.f35629d, zzfdk.f35557w.toString(), zzbu.m2602l(zzfdk.f35554t), (zzbvq) zzehf.f34017c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo45336c(zzehf zzehf, boolean z, Context context, zzddn zzddn) throws zzdmo {
        try {
            ((zzffa) zzehf.f34016b).mo45668x(z);
            if (this.f34193c.f28448d < ((Integer) zzay.m1924c().mo42663b(zzbjc.f26817B0)).intValue()) {
                ((zzffa) zzehf.f34016b).mo45669y();
            } else {
                ((zzffa) zzehf.f34016b).mo45670z(context);
            }
        } catch (zzfek e) {
            zzcgp.m45228f("Cannot show interstitial.");
            throw new zzdmo(e.getCause());
        }
    }
}
