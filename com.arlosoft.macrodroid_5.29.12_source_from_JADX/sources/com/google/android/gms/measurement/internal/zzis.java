package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzis implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47109a;

    /* renamed from: c */
    final /* synthetic */ zzcf f47110c;

    /* renamed from: d */
    final /* synthetic */ zzjm f47111d;

    zzis(zzjm zzjm, zzq zzq, zzcf zzcf) {
        this.f47111d = zzjm;
        this.f47109a = zzq;
        this.f47110c = zzcf;
    }

    public final void run() {
        zzfr zzfr;
        String str = null;
        try {
            if (!this.f47111d.f46899a.mo55189F().mo55129o().mo54950i(zzah.ANALYTICS_STORAGE)) {
                this.f47111d.f46899a.mo55221z().mo55104v().mo55091a("Analytics storage consent denied; will not get app instance id");
                this.f47111d.f46899a.mo55191I().mo55345C((String) null);
                this.f47111d.f46899a.mo55189F().f46740g.mo55125b((String) null);
                zzfr = this.f47111d.f46899a;
            } else {
                zzjm zzjm = this.f47111d;
                zzdx H = zzjm.f47171d;
                if (H == null) {
                    zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to get app instance id");
                    zzfr = this.f47111d.f46899a;
                } else {
                    Preconditions.m4488k(this.f47109a);
                    str = H.mo55044O7(this.f47109a);
                    if (str != null) {
                        this.f47111d.f46899a.mo55191I().mo55345C(str);
                        this.f47111d.f46899a.mo55189F().f46740g.mo55125b(str);
                    }
                    this.f47111d.m65932E();
                    zzfr = this.f47111d.f46899a;
                }
            }
        } catch (RemoteException e) {
            this.f47111d.f46899a.mo55221z().mo55098p().mo55092b("Failed to get app instance id", e);
            zzfr = this.f47111d.f46899a;
        } catch (Throwable th) {
            this.f47111d.f46899a.mo55196N().mo55581J(this.f47110c, (String) null);
            throw th;
        }
        zzfr.mo55196N().mo55581J(this.f47110c, str);
    }
}
