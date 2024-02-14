package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfae implements zzfgl {

    /* renamed from: a */
    public final zzfay f35314a;

    /* renamed from: b */
    public final zzfba f35315b;

    /* renamed from: c */
    public final zzl f35316c;

    /* renamed from: d */
    public final String f35317d;

    /* renamed from: e */
    public final Executor f35318e;

    /* renamed from: f */
    public final zzw f35319f;

    /* renamed from: g */
    public final zzfga f35320g;

    public zzfae(zzfay zzfay, zzfba zzfba, zzl zzl, String str, Executor executor, zzw zzw, zzfga zzfga) {
        this.f35314a = zzfay;
        this.f35315b = zzfba;
        this.f35316c = zzl;
        this.f35317d = str;
        this.f35318e = executor;
        this.f35319f = zzw;
        this.f35320g = zzfga;
    }

    public final zzfga zza() {
        return this.f35320g;
    }

    public final Executor zzb() {
        return this.f35318e;
    }
}
