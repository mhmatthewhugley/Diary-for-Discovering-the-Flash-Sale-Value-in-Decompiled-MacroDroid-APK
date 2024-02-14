package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdn extends zzdu {

    /* renamed from: g */
    final /* synthetic */ boolean f41380g;

    /* renamed from: o */
    final /* synthetic */ zzef f41381o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdn(zzef zzef, boolean z) {
        super(zzef, true);
        this.f41381o = zzef;
        this.f41380g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41381o.f41435i)).setDataCollectionEnabled(this.f41380g);
    }
}
