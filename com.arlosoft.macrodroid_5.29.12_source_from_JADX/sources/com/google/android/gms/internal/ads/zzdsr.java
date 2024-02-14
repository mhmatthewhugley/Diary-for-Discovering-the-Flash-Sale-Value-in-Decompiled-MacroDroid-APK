package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsr extends zzbmu {
    @Nullable

    /* renamed from: a */
    private final String f32994a;

    /* renamed from: c */
    private final zzdol f32995c;

    /* renamed from: d */
    private final zzdoq f32996d;

    public zzdsr(@Nullable String str, zzdol zzdol, zzdoq zzdoq) {
        this.f32994a = str;
        this.f32995c = zzdol;
        this.f32996d = zzdoq;
    }

    /* renamed from: I2 */
    public final void mo42784I2(Bundle bundle) throws RemoteException {
        this.f32995c.mo44776U(bundle);
    }

    /* renamed from: a */
    public final zzdk mo42785a() throws RemoteException {
        return this.f32996d.mo44805R();
    }

    /* renamed from: b */
    public final zzbme mo42786b() throws RemoteException {
        return this.f32996d.mo44810W();
    }

    /* renamed from: c */
    public final IObjectWrapper mo42787c() throws RemoteException {
        return this.f32996d.mo44816b0();
    }

    /* renamed from: d */
    public final zzblw mo42788d() throws RemoteException {
        return this.f32996d.mo44807T();
    }

    /* renamed from: e */
    public final String mo42789e() throws RemoteException {
        return this.f32996d.mo44820d0();
    }

    /* renamed from: f */
    public final IObjectWrapper mo42790f() throws RemoteException {
        return ObjectWrapper.m5051g8(this.f32995c);
    }

    /* renamed from: g */
    public final String mo42791g() throws RemoteException {
        return this.f32996d.mo44822e0();
    }

    /* renamed from: h */
    public final String mo42792h() throws RemoteException {
        return this.f32996d.mo44824f0();
    }

    /* renamed from: i */
    public final String mo42793i() throws RemoteException {
        return this.f32996d.mo44828h0();
    }

    /* renamed from: j */
    public final String mo42794j() throws RemoteException {
        return this.f32994a;
    }

    /* renamed from: k */
    public final List mo42795k() throws RemoteException {
        return this.f32996d.mo44821e();
    }

    /* renamed from: k0 */
    public final boolean mo42796k0(Bundle bundle) throws RemoteException {
        return this.f32995c.mo44792x(bundle);
    }

    /* renamed from: n */
    public final void mo42797n() throws RemoteException {
        this.f32995c.mo44439a();
    }

    /* renamed from: n0 */
    public final void mo42798n0(Bundle bundle) throws RemoteException {
        this.f32995c.mo44781l(bundle);
    }

    public final Bundle zzb() throws RemoteException {
        return this.f32996d.mo44799L();
    }
}
