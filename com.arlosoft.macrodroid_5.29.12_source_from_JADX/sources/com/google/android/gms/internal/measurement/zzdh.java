package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdh extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Bundle f41366g;

    /* renamed from: o */
    final /* synthetic */ zzbz f41367o;

    /* renamed from: p */
    final /* synthetic */ zzef f41368p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdh(zzef zzef, Bundle bundle, zzbz zzbz) {
        super(zzef, true);
        this.f41368p = zzef;
        this.f41366g = bundle;
        this.f41367o = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41368p.f41435i)).performAction(this.f41366g, this.f41367o, this.f41402a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50839b() {
        this.f41367o.mo50779m1((Bundle) null);
    }
}
