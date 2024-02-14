package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcs extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Boolean f41330g;

    /* renamed from: o */
    final /* synthetic */ zzef f41331o;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        if (this.f41330g != null) {
            ((zzcc) Preconditions.m4488k(this.f41331o.f41435i)).setMeasurementEnabled(this.f41330g.booleanValue(), this.f41402a);
        } else {
            ((zzcc) Preconditions.m4488k(this.f41331o.f41435i)).clearMeasurementEnabled(this.f41402a);
        }
    }
}
