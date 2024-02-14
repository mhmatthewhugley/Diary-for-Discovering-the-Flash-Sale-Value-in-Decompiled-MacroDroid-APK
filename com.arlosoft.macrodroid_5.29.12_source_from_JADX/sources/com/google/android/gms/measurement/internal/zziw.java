package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziw extends zzap {

    /* renamed from: e */
    final /* synthetic */ zzjm f47119e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zziw(zzjm zzjm, zzgm zzgm) {
        super(zzgm);
        this.f47119e = zzjm;
    }

    /* renamed from: c */
    public final void mo54997c() {
        zzjm zzjm = this.f47119e;
        zzjm.mo55073e();
        if (zzjm.mo55466x()) {
            zzjm.f46899a.mo55221z().mo55102t().mo55091a("Inactivity, disconnecting from the service");
            zzjm.mo55447Q();
        }
    }
}
