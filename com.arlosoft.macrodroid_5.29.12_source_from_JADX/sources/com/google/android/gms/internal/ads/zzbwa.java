package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwa extends zzdj {

    /* renamed from: a */
    private final Object f27859a = new Object();
    @Nullable

    /* renamed from: c */
    private volatile zzdn f27860c;

    /* renamed from: E6 */
    public final void mo19998E6(@Nullable zzdn zzdn) throws RemoteException {
        synchronized (this.f27859a) {
            this.f27860c = zzdn;
        }
    }

    /* renamed from: b */
    public final float mo19999b() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: c */
    public final float mo20000c() throws RemoteException {
        throw new RemoteException();
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
        throw new RemoteException();
    }

    @Nullable
    /* renamed from: g */
    public final zzdn mo20002g() throws RemoteException {
        zzdn zzdn;
        synchronized (this.f27859a) {
            zzdn = this.f27860c;
        }
        return zzdn;
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
