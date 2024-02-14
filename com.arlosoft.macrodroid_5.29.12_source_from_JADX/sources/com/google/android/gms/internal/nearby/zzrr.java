package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.nearby.uwb.RangingMeasurement;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.zza;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrr extends zzox {

    /* renamed from: a */
    private final ListenerHolder f45073a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final RangingSessionCallback f45074c;

    /* renamed from: d */
    final /* synthetic */ zzrs f45075d;

    /* renamed from: ia */
    private static final RangingMeasurement m62961ia(zzpu zzpu) {
        return new RangingMeasurement(zzpu.mo53143m2(), zzpu.mo53142l2());
    }

    /* renamed from: t1 */
    static /* bridge */ /* synthetic */ RangingPosition m62962t1(zzrr zzrr, zzqa zzqa) {
        return new RangingPosition(m62961ia(zzqa.mo53163n2()), zzqa.mo53162m2() != null ? m62961ia(zzqa.mo53162m2()) : null, zzqa.mo53164o2() != null ? m62961ia(zzqa.mo53164o2()) : null, zzqa.mo53161l2());
    }

    /* renamed from: Bb */
    public final void mo53098Bb(zzpm zzpm) {
        int i = zzrs.f45077l;
        zzrl zzrl = new zzrl(this, zzpm);
        this.f45075d.mo21231q(RegistrationMethods.m3853a().mo21396b(new zzrm(zzrl)).mo21399e(zzrn.f45066a).mo21400f(this.f45073a).mo21397c(zza.f47863I).mo21398d(1304).mo21395a());
    }

    /* renamed from: I8 */
    public final void mo53099I8(zzpo zzpo) {
        int i = zzrs.f45077l;
        this.f45073a.mo21377c(new zzrp(this, zzpo));
    }

    /* renamed from: V3 */
    public final void mo53100V3(zzpq zzpq) {
        int i = zzrs.f45077l;
        this.f45073a.mo21377c(new zzrq(this, zzpq));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z8 */
    public final /* synthetic */ void mo53211Z8(zzpm zzpm) {
        this.f45073a.mo21377c(new zzro(this, zzpm));
    }
}
