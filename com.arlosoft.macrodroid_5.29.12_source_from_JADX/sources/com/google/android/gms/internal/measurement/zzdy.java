package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdy extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Activity f41411g;

    /* renamed from: o */
    final /* synthetic */ zzee f41412o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdy(zzee zzee, Activity activity) {
        super(zzee.f41425a, true);
        this.f41412o = zzee;
        this.f41411g = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41412o.f41425a.f41435i)).onActivityStarted(ObjectWrapper.m5051g8(this.f41411g), this.f41403c);
    }
}
