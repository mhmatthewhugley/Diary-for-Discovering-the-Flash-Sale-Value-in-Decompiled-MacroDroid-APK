package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzct extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Bundle f41332g;

    /* renamed from: o */
    final /* synthetic */ zzef f41333o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzct(zzef zzef, Bundle bundle) {
        super(zzef, true);
        this.f41333o = zzef;
        this.f41332g = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41333o.f41435i)).setConsent(this.f41332g, this.f41402a);
    }
}
