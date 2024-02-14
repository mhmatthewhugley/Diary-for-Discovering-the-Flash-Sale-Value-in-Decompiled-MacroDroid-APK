package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzec extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Activity f41420g;

    /* renamed from: o */
    final /* synthetic */ zzbz f41421o;

    /* renamed from: p */
    final /* synthetic */ zzee f41422p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzec(zzee zzee, Activity activity, zzbz zzbz) {
        super(zzee.f41425a, true);
        this.f41422p = zzee;
        this.f41420g = activity;
        this.f41421o = zzbz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41422p.f41425a.f41435i)).onActivitySaveInstanceState(ObjectWrapper.m5051g8(this.f41420g), this.f41421o, this.f41403c);
    }
}
