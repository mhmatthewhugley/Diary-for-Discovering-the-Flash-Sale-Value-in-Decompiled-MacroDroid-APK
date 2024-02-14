package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.zze;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfu extends zzgp {

    /* renamed from: a */
    final /* synthetic */ zzkq f44643a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfu(zzfx zzfx, zzkq zzkq) {
        super((zzgo) null);
        this.f44643a = zzkq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        String m2 = this.f44643a.mo52799m2();
        zze zze = new zze();
        zze.mo55712b(this.f44643a.mo52798l2());
        zze.mo55711a(this.f44643a.zza());
        ((ConnectionLifecycleCallback) obj).mo52755a(m2, zze.mo55713c());
    }
}
