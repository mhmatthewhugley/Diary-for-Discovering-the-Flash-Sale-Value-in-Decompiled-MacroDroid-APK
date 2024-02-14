package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdq extends zzdu {

    /* renamed from: g */
    final /* synthetic */ zzdw f41386g;

    /* renamed from: o */
    final /* synthetic */ zzef f41387o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdq(zzef zzef, zzdw zzdw) {
        super(zzef, true);
        this.f41387o = zzef;
        this.f41386g = zzdw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41387o.f41435i)).registerOnMeasurementEventListener(this.f41386g);
    }
}
