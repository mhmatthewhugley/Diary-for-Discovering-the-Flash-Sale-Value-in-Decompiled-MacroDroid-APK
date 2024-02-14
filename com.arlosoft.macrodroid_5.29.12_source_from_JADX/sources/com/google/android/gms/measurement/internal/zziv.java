package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47116a;

    /* renamed from: c */
    final /* synthetic */ Bundle f47117c;

    /* renamed from: d */
    final /* synthetic */ zzjm f47118d;

    zziv(zzjm zzjm, zzq zzq, Bundle bundle) {
        this.f47118d = zzjm;
        this.f47116a = zzq;
        this.f47117c = bundle;
    }

    public final void run() {
        zzjm zzjm = this.f47118d;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.m4488k(this.f47116a);
            H.mo55050k7(this.f47117c, this.f47116a);
        } catch (RemoteException e) {
            this.f47118d.f46899a.mo55221z().mo55098p().mo55092b("Failed to send default event parameters to service", e);
        }
    }
}
