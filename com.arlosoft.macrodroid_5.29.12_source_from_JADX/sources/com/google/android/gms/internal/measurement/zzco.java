package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzco extends zzdu {

    /* renamed from: g */
    final /* synthetic */ String f41316g;

    /* renamed from: o */
    final /* synthetic */ String f41317o;

    /* renamed from: p */
    final /* synthetic */ Bundle f41318p;

    /* renamed from: s */
    final /* synthetic */ zzef f41319s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzco(zzef zzef, String str, String str2, Bundle bundle) {
        super(zzef, true);
        this.f41319s = zzef;
        this.f41316g = str;
        this.f41317o = str2;
        this.f41318p = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41319s.f41435i)).clearConditionalUserProperty(this.f41316g, this.f41317o, this.f41318p);
    }
}
