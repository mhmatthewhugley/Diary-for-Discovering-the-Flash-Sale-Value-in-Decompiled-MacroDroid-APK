package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.zzg;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfr extends zzgp {

    /* renamed from: a */
    final /* synthetic */ zzks f44639a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfr(zzfx zzfx, zzks zzks) {
        super((zzgo) null);
        this.f44639a = zzks;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        String l2 = this.f44639a.mo52806l2();
        zzg zzg = new zzg();
        zzg.mo55716c(this.f44639a.mo52807m2());
        zzg.mo55714a(this.f44639a.zza());
        zzg.mo55719f(this.f44639a.mo52810p2());
        zzg.mo55718e(this.f44639a.mo52809o2());
        zzg.mo55715b(this.f44639a.mo52811q2());
        zzg.mo55717d(this.f44639a.mo52808n2());
        ((ConnectionLifecycleCallback) obj).mo37367b(l2, zzg.mo55720g());
    }
}
