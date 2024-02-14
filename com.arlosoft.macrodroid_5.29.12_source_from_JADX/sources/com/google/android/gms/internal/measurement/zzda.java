package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzda extends zzdu {

    /* renamed from: g */
    final /* synthetic */ zzbz f41348g;

    /* renamed from: o */
    final /* synthetic */ zzef f41349o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzda(zzef zzef, zzbz zzbz) {
        super(zzef, true);
        this.f41349o = zzef;
        this.f41348g = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41349o.f41435i)).getGmpAppId(this.f41348g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41348g.mo50779m1((Bundle) null);
    }
}
