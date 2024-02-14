package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeiy extends zzccc implements zzdek {

    /* renamed from: a */
    private zzccd f34147a;

    /* renamed from: c */
    private zzdej f34148c;

    /* renamed from: d */
    private zzdky f34149d;

    /* renamed from: D1 */
    public final synchronized void mo43333D1(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdky zzdky = this.f34149d;
        if (zzdky != null) {
            ((zzelq) zzdky).f34408d.f34414b.execute(new zzelp((zzelq) zzdky, ((zzelq) zzdky).f34405a, ((zzelq) zzdky).f34406b, ((zzelq) zzdky).f34407c));
        }
    }

    /* renamed from: J4 */
    public final synchronized void mo43334J4(IObjectWrapper iObjectWrapper, zzcce zzcce) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            ((zzelr) zzccd).f34412f.mo42890x(zzcce);
        }
    }

    /* renamed from: Kb */
    public final synchronized void mo45331Kb(zzccd zzccd) {
        this.f34147a = zzccd;
    }

    /* renamed from: L0 */
    public final synchronized void mo43335L0(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdej zzdej = this.f34148c;
        if (zzdej != null) {
            zzdej.mo44596v(i);
        }
    }

    /* renamed from: Lb */
    public final synchronized void mo45332Lb(zzdky zzdky) {
        this.f34149d = zzdky;
    }

    /* renamed from: O2 */
    public final synchronized void mo43336O2(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            ((zzelr) zzccd).f34411d.mo44590b();
        }
    }

    /* renamed from: f1 */
    public final synchronized void mo43337f1(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            zzccd.mo43337f1(iObjectWrapper);
        }
    }

    /* renamed from: i0 */
    public final synchronized void mo43338i0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            ((zzelr) zzccd).f34409a.zzb();
        }
    }

    /* renamed from: ia */
    public final synchronized void mo44598ia(zzdej zzdej) {
        this.f34148c = zzdej;
    }

    /* renamed from: k2 */
    public final synchronized void mo43339k2(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            ((zzelr) zzccd).f34412f.mo42889a();
        }
    }

    /* renamed from: k8 */
    public final synchronized void mo43342k8(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            ((zzelr) zzccd).f34411d.zzb();
        }
    }

    /* renamed from: v7 */
    public final synchronized void mo43343v7(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdky zzdky = this.f34149d;
        if (zzdky != null) {
            zzcgp.m45229g("Fail to initialize adapter ".concat(String.valueOf(((zzelq) zzdky).f34407c.f34015a)));
        }
    }

    /* renamed from: y0 */
    public final synchronized void mo43340y0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdej zzdej = this.f34148c;
        if (zzdej != null) {
            zzdej.mo44594d();
        }
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccd = this.f34147a;
        if (zzccd != null) {
            ((zzelr) zzccd).f34410c.onAdClicked();
        }
    }
}
