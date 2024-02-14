package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdob implements zzgxi {

    /* renamed from: a */
    private final zzgxv f32578a;

    /* renamed from: b */
    private final zzgxv f32579b;

    /* renamed from: c */
    private final zzgxv f32580c;

    /* renamed from: d */
    private final zzgxv f32581d;

    public zzdob(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4) {
        this.f32578a = zzgxv;
        this.f32579b = zzgxv2;
        this.f32580c = zzgxv3;
        this.f32581d = zzgxv4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvu((Executor) this.f32579b.zzb(), new zzcvg((Context) this.f32580c.zzb(), (zzbbm) this.f32578a.zzb()), (Clock) this.f32581d.zzb());
    }
}
