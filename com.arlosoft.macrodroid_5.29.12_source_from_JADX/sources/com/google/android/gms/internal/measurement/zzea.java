package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzea extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Activity f41416g;

    /* renamed from: o */
    final /* synthetic */ zzee f41417o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzea(zzee zzee, Activity activity) {
        super(zzee.f41425a, true);
        this.f41417o = zzee;
        this.f41416g = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        ((zzcc) Preconditions.m4488k(this.f41417o.f41425a.f41435i)).onActivityPaused(ObjectWrapper.m5051g8(this.f41416g), this.f41403c);
    }
}
