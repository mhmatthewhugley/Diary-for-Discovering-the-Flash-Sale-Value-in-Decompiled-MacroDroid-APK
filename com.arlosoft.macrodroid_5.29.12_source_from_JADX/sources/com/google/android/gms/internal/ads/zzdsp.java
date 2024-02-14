package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsp extends zzbms {
    @Nullable

    /* renamed from: a */
    private final String f32988a;

    /* renamed from: c */
    private final zzdol f32989c;

    /* renamed from: d */
    private final zzdoq f32990d;

    public zzdsp(@Nullable String str, zzdol zzdol, zzdoq zzdoq) {
        this.f32988a = str;
        this.f32989c = zzdol;
        this.f32990d = zzdoq;
    }

    /* renamed from: a */
    public final Bundle mo42766a() throws RemoteException {
        return this.f32990d.mo44799L();
    }

    /* renamed from: b */
    public final zzblw mo42767b() throws RemoteException {
        return this.f32990d.mo44807T();
    }

    /* renamed from: c */
    public final zzbme mo42768c() throws RemoteException {
        return this.f32990d.mo44809V();
    }

    /* renamed from: d */
    public final zzdk mo42769d() throws RemoteException {
        return this.f32990d.mo44805R();
    }

    /* renamed from: e */
    public final IObjectWrapper mo42770e() throws RemoteException {
        return ObjectWrapper.m5051g8(this.f32989c);
    }

    /* renamed from: f */
    public final IObjectWrapper mo42771f() throws RemoteException {
        return this.f32990d.mo44816b0();
    }

    /* renamed from: g */
    public final String mo42772g() throws RemoteException {
        return this.f32990d.mo44822e0();
    }

    /* renamed from: h */
    public final String mo42773h() throws RemoteException {
        return this.f32990d.mo44824f0();
    }

    /* renamed from: i */
    public final String mo42774i() throws RemoteException {
        return this.f32990d.mo44828h0();
    }

    /* renamed from: j */
    public final String mo42775j() throws RemoteException {
        return this.f32988a;
    }

    /* renamed from: k */
    public final String mo42776k() throws RemoteException {
        return this.f32990d.mo44815b();
    }

    /* renamed from: k0 */
    public final void mo42777k0(Bundle bundle) throws RemoteException {
        this.f32989c.mo44776U(bundle);
    }

    /* renamed from: l */
    public final List mo42778l() throws RemoteException {
        return this.f32990d.mo44821e();
    }

    /* renamed from: m */
    public final void mo42779m() throws RemoteException {
        this.f32989c.mo44439a();
    }

    /* renamed from: n */
    public final String mo42780n() throws RemoteException {
        return this.f32990d.mo44817c();
    }

    /* renamed from: u1 */
    public final boolean mo42781u1(Bundle bundle) throws RemoteException {
        return this.f32989c.mo44792x(bundle);
    }

    /* renamed from: x1 */
    public final void mo42782x1(Bundle bundle) throws RemoteException {
        this.f32989c.mo44781l(bundle);
    }

    public final double zzb() throws RemoteException {
        return this.f32990d.mo44795A();
    }
}
