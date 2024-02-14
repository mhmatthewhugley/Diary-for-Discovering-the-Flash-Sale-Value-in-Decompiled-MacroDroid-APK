package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdk extends zzdu {

    /* renamed from: g */
    final /* synthetic */ zzbz f41373g;

    /* renamed from: o */
    final /* synthetic */ zzef f41374o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdk(zzef zzef, zzbz zzbz) {
        super(zzef, true);
        this.f41374o = zzef;
        this.f41373g = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41374o.f41435i)).getAppInstanceId(this.f41373g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41373g.mo50779m1((Bundle) null);
    }
}
