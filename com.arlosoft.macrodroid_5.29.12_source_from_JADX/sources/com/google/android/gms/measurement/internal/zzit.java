package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzit implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47112a;

    /* renamed from: c */
    final /* synthetic */ zzjm f47113c;

    zzit(zzjm zzjm, zzq zzq) {
        this.f47113c = zzjm;
        this.f47112a = zzq;
    }

    public final void run() {
        zzjm zzjm = this.f47113c;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.m4488k(this.f47112a);
            H.mo55041M3(this.f47112a);
            this.f47113c.f46899a.mo55186C().mo55079r();
            this.f47113c.mo55458p(H, (AbstractSafeParcelable) null, this.f47112a);
            this.f47113c.m65932E();
        } catch (RemoteException e) {
            this.f47113c.f46899a.mo55221z().mo55098p().mo55092b("Failed to send app launch to the service", e);
        }
    }
}
