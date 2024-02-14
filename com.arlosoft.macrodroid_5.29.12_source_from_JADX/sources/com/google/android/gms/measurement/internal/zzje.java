package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzje implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f47148a;

    /* renamed from: c */
    final /* synthetic */ String f47149c;

    /* renamed from: d */
    final /* synthetic */ zzq f47150d;

    /* renamed from: f */
    final /* synthetic */ zzcf f47151f;

    /* renamed from: g */
    final /* synthetic */ zzjm f47152g;

    zzje(zzjm zzjm, String str, String str2, zzq zzq, zzcf zzcf) {
        this.f47152g = zzjm;
        this.f47148a = str;
        this.f47149c = str2;
        this.f47150d = zzq;
        this.f47151f = zzcf;
    }

    public final void run() {
        zzfr zzfr;
        ArrayList arrayList = new ArrayList();
        try {
            zzjm zzjm = this.f47152g;
            zzdx H = zzjm.f47171d;
            if (H == null) {
                zzjm.f46899a.mo55221z().mo55098p().mo55093c("Failed to get conditional properties; not connected to service", this.f47148a, this.f47149c);
                zzfr = this.f47152g.f46899a;
            } else {
                Preconditions.m4488k(this.f47150d);
                arrayList = zzlb.m66133t(H.mo55054t9(this.f47148a, this.f47149c, this.f47150d));
                this.f47152g.m65932E();
                zzfr = this.f47152g.f46899a;
            }
        } catch (RemoteException e) {
            this.f47152g.f46899a.mo55221z().mo55098p().mo55094d("Failed to get conditional properties; remote exception", this.f47148a, this.f47149c, e);
            zzfr = this.f47152g.f46899a;
        } catch (Throwable th) {
            this.f47152g.f46899a.mo55196N().mo55576E(this.f47151f, arrayList);
            throw th;
        }
        zzfr.mo55196N().mo55576E(this.f47151f, arrayList);
    }
}
