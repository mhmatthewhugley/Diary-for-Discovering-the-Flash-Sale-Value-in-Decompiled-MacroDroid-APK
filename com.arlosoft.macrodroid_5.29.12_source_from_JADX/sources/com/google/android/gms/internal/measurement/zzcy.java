package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcy extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41344g;

    /* renamed from: o */
    final /* synthetic */ zzef f41345o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcy(zzef zzef, String str) {
        super(zzef, true);
        this.f41345o = zzef;
        this.f41344g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41345o.f41435i)).beginAdUnitExposure(this.f41344g, this.f41403c);
    }
}
