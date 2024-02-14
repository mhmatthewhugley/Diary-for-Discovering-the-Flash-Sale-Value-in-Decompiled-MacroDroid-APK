package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdc extends zzdu {

    /* renamed from: g */
    final /* synthetic */ zzbz f41352g;

    /* renamed from: o */
    final /* synthetic */ zzef f41353o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdc(zzef zzef, zzbz zzbz) {
        super(zzef, true);
        this.f41353o = zzef;
        this.f41352g = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41353o.f41435i)).generateEventId(this.f41352g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41352g.mo50779m1((Bundle) null);
    }
}
