package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcn extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Bundle f41314g;

    /* renamed from: o */
    final /* synthetic */ zzef f41315o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcn(zzef zzef, Bundle bundle) {
        super(zzef, true);
        this.f41315o = zzef;
        this.f41314g = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41315o.f41435i)).setConditionalUserProperty(this.f41314g, this.f41402a);
    }
}
