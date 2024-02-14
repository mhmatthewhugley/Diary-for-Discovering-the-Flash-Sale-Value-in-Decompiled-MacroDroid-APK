package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsw extends zzboa {
    @Nullable

    /* renamed from: a */
    private final String f33009a;

    /* renamed from: c */
    private final zzdol f33010c;

    /* renamed from: d */
    private final zzdoq f33011d;

    public zzdsw(@Nullable String str, zzdol zzdol, zzdoq zzdoq) {
        this.f33009a = str;
        this.f33010c = zzdol;
        this.f33011d = zzdoq;
    }

    /* renamed from: D */
    public final void mo42846D() throws RemoteException {
        this.f33010c.mo44439a();
    }

    /* renamed from: F */
    public final void mo42847F() {
        this.f33010c.mo44777h();
    }

    /* renamed from: J */
    public final boolean mo42848J() {
        return this.f33010c.mo44790u();
    }

    /* renamed from: K */
    public final void mo42849K() throws RemoteException {
        this.f33010c.mo44766K();
    }

    /* renamed from: Ka */
    public final void mo42850Ka(zzbny zzbny) throws RemoteException {
        this.f33010c.mo44786q(zzbny);
    }

    /* renamed from: L5 */
    public final void mo42851L5(zzcq zzcq) throws RemoteException {
        this.f33010c.mo44784o(zzcq);
    }

    /* renamed from: R */
    public final boolean mo42852R() throws RemoteException {
        return !this.f33011d.mo44823f().isEmpty() && this.f33011d.mo44806S() != null;
    }

    /* renamed from: R8 */
    public final void mo42853R8(Bundle bundle) throws RemoteException {
        this.f33010c.mo44781l(bundle);
    }

    /* renamed from: b */
    public final double mo42829b() throws RemoteException {
        return this.f33011d.mo44795A();
    }

    /* renamed from: c */
    public final Bundle mo42854c() throws RemoteException {
        return this.f33011d.mo44799L();
    }

    /* renamed from: c5 */
    public final boolean mo42855c5(Bundle bundle) throws RemoteException {
        return this.f33010c.mo44792x(bundle);
    }

    /* renamed from: e */
    public final zzdk mo42830e() throws RemoteException {
        return this.f33011d.mo44805R();
    }

    @Nullable
    /* renamed from: f */
    public final zzdh mo42831f() throws RemoteException {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26972Q5)).booleanValue()) {
            return null;
        }
        return this.f33010c.mo44496c();
    }

    /* renamed from: g */
    public final zzblw mo42832g() throws RemoteException {
        return this.f33011d.mo44807T();
    }

    /* renamed from: h */
    public final zzbmb mo42856h() throws RemoteException {
        return this.f33010c.mo44761C().mo44793a();
    }

    /* renamed from: i */
    public final zzbme mo42833i() throws RemoteException {
        return this.f33011d.mo44809V();
    }

    /* renamed from: j */
    public final IObjectWrapper mo42834j() throws RemoteException {
        return this.f33011d.mo44816b0();
    }

    /* renamed from: j0 */
    public final void mo42857j0() {
        this.f33010c.mo44783n();
    }

    /* renamed from: k */
    public final IObjectWrapper mo42835k() throws RemoteException {
        return ObjectWrapper.m5051g8(this.f33010c);
    }

    /* renamed from: l */
    public final String mo42836l() throws RemoteException {
        return this.f33011d.mo44822e0();
    }

    /* renamed from: m */
    public final String mo42837m() throws RemoteException {
        return this.f33011d.mo44824f0();
    }

    /* renamed from: m5 */
    public final void mo42858m5(zzde zzde) throws RemoteException {
        this.f33010c.mo44785p(zzde);
    }

    /* renamed from: n */
    public final String mo42838n() throws RemoteException {
        return this.f33011d.mo44820d0();
    }

    /* renamed from: p */
    public final String mo42839p() throws RemoteException {
        return this.f33011d.mo44815b();
    }

    /* renamed from: q */
    public final String mo42859q() throws RemoteException {
        return this.f33009a;
    }

    /* renamed from: r */
    public final String mo42840r() throws RemoteException {
        return this.f33011d.mo44817c();
    }

    /* renamed from: s */
    public final String mo42841s() throws RemoteException {
        return this.f33011d.mo44828h0();
    }

    /* renamed from: t3 */
    public final void mo42860t3(@Nullable zzcu zzcu) throws RemoteException {
        this.f33010c.mo44773R(zzcu);
    }

    /* renamed from: u */
    public final List mo42842u() throws RemoteException {
        return this.f33011d.mo44821e();
    }

    /* renamed from: v6 */
    public final void mo42861v6(Bundle bundle) throws RemoteException {
        this.f33010c.mo44776U(bundle);
    }

    /* renamed from: w */
    public final List mo42843w() throws RemoteException {
        if (mo42852R()) {
            return this.f33011d.mo44823f();
        }
        return Collections.emptyList();
    }
}
