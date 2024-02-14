package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzdx extends zzdu {

    /* renamed from: g */
    final /* synthetic */ Bundle f41408g;

    /* renamed from: o */
    final /* synthetic */ Activity f41409o;

    /* renamed from: p */
    final /* synthetic */ zzee f41410p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdx(zzee zzee, Bundle bundle, Activity activity) {
        super(zzee.f41425a, true);
        this.f41410p = zzee;
        this.f41408g = bundle;
        this.f41409o = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50838a() throws RemoteException {
        Bundle bundle;
        if (this.f41408g != null) {
            bundle = new Bundle();
            if (this.f41408g.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f41408g.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzcc) Preconditions.m4488k(this.f41410p.f41425a.f41435i)).onActivityCreated(ObjectWrapper.m5051g8(this.f41409o), bundle, this.f41403c);
    }
}
