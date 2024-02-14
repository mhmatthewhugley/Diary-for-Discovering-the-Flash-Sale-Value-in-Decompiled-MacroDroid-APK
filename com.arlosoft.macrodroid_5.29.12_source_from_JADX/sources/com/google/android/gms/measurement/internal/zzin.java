package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzin implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f47090a;

    /* renamed from: c */
    final /* synthetic */ String f47091c;

    /* renamed from: d */
    final /* synthetic */ zzq f47092d;

    /* renamed from: f */
    final /* synthetic */ boolean f47093f;

    /* renamed from: g */
    final /* synthetic */ zzcf f47094g;

    /* renamed from: o */
    final /* synthetic */ zzjm f47095o;

    zzin(zzjm zzjm, String str, String str2, zzq zzq, boolean z, zzcf zzcf) {
        this.f47095o = zzjm;
        this.f47090a = str;
        this.f47091c = str2;
        this.f47092d = zzq;
        this.f47093f = z;
        this.f47094g = zzcf;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            zzjm zzjm = this.f47095o;
            zzdx H = zzjm.f47171d;
            if (H == null) {
                zzjm.f46899a.mo55221z().mo55098p().mo55093c("Failed to get user properties; not connected to service", this.f47090a, this.f47091c);
                this.f47095o.f46899a.mo55196N().mo55577F(this.f47094g, bundle2);
                return;
            }
            Preconditions.m4488k(this.f47092d);
            List<zzkw> S4 = H.mo55045S4(this.f47090a, this.f47091c, this.f47093f, this.f47092d);
            bundle = new Bundle();
            if (S4 != null) {
                for (zzkw zzkw : S4) {
                    String str = zzkw.f47285g;
                    if (str != null) {
                        bundle.putString(zzkw.f47282c, str);
                    } else {
                        Long l = zzkw.f47284f;
                        if (l != null) {
                            bundle.putLong(zzkw.f47282c, l.longValue());
                        } else {
                            Double d = zzkw.f47287p;
                            if (d != null) {
                                bundle.putDouble(zzkw.f47282c, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f47095o.m65932E();
                this.f47095o.f46899a.mo55196N().mo55577F(this.f47094g, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f47095o.f46899a.mo55221z().mo55098p().mo55093c("Failed to get user properties; remote exception", this.f47090a, e);
                    this.f47095o.f46899a.mo55196N().mo55577F(this.f47094g, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f47095o.f46899a.mo55196N().mo55577F(this.f47094g, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f47095o.f46899a.mo55221z().mo55098p().mo55093c("Failed to get user properties; remote exception", this.f47090a, e);
            this.f47095o.f46899a.mo55196N().mo55577F(this.f47094g, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f47095o.f46899a.mo55196N().mo55577F(this.f47094g, bundle2);
            throw th;
        }
    }
}
