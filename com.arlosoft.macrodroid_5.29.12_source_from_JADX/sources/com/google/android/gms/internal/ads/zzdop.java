package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdn;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdop extends zzdj {

    /* renamed from: a */
    private final Object f32642a = new Object();

    /* renamed from: c */
    private final zzdk f32643c;

    /* renamed from: d */
    private final zzbvz f32644d;

    public zzdop(zzdk zzdk, zzbvz zzbvz) {
        this.f32643c = zzdk;
        this.f32644d = zzbvz;
    }

    /* renamed from: E6 */
    public final void mo19998E6(zzdn zzdn) throws RemoteException {
        synchronized (this.f32642a) {
            zzdk zzdk = this.f32643c;
            if (zzdk != null) {
                zzdk.mo19998E6(zzdn);
            }
        }
    }

    /* renamed from: b */
    public final float mo19999b() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: c */
    public final float mo20000c() throws RemoteException {
        zzbvz zzbvz = this.f32644d;
        if (zzbvz != null) {
            return zzbvz.mo43139f();
        }
        return 0.0f;
    }

    /* renamed from: d8 */
    public final void mo20003d8(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final int mo20004e() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: f */
    public final float mo20001f() throws RemoteException {
        zzbvz zzbvz = this.f32644d;
        if (zzbvz != null) {
            return zzbvz.mo43138e();
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final zzdn mo20002g() throws RemoteException {
        synchronized (this.f32642a) {
            zzdk zzdk = this.f32643c;
            if (zzdk == null) {
                return null;
            }
            zzdn g = zzdk.mo20002g();
            return g;
        }
    }

    /* renamed from: i */
    public final void mo20005i() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: j */
    public final void mo20006j() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: l */
    public final boolean mo20007l() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: m */
    public final boolean mo20008m() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: n */
    public final void mo20009n() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: s */
    public final boolean mo20010s() throws RemoteException {
        throw new RemoteException();
    }
}
