package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdl extends zzdu {

    /* renamed from: g */
    final /* synthetic */ zzbz f41375g;

    /* renamed from: o */
    final /* synthetic */ zzef f41376o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdl(zzef zzef, zzbz zzbz) {
        super(zzef, true);
        this.f41376o = zzef;
        this.f41375g = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41376o.f41435i)).getSessionId(this.f41375g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41375g.mo50779m1((Bundle) null);
    }
}
