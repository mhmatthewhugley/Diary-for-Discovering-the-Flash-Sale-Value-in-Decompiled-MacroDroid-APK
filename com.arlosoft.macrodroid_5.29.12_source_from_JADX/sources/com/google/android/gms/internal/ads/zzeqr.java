package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeqr implements zzeve {

    /* renamed from: a */
    private final Executor f34726a;

    /* renamed from: b */
    private final zzcfy f34727b;

    zzeqr(Executor executor, zzcfy zzcfy) {
        this.f34726a = executor;
        this.f34727b = zzcfy;
    }

    public final int zza() {
        return 10;
    }

    public final zzfzp zzb() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27174l2)).booleanValue()) {
            return zzfzg.m51414i((Object) null);
        }
        return zzfzg.m51418m(this.f34727b.mo43495j(), zzeqp.f34724a, this.f34726a);
    }
}
