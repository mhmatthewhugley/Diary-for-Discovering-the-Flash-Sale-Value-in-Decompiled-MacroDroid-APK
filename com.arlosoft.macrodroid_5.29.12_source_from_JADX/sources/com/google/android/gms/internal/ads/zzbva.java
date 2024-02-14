package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbva extends zzcof {

    /* renamed from: a */
    private final AppMeasurementSdk f27820a;

    zzbva(AppMeasurementSdk appMeasurementSdk) {
        this.f27820a = appMeasurementSdk;
    }

    /* renamed from: N1 */
    public final void mo43007N1(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f27820a.mo54910u(str, str2, iObjectWrapper != null ? ObjectWrapper.m5050A1(iObjectWrapper) : null);
    }

    /* renamed from: Wa */
    public final Map mo43008Wa(String str, String str2, boolean z) throws RemoteException {
        return this.f27820a.mo54902m(str, str2, z);
    }

    /* renamed from: Z */
    public final void mo43009Z(String str) throws RemoteException {
        this.f27820a.mo54893c(str);
    }

    /* renamed from: a */
    public final long mo43010a() throws RemoteException {
        return this.f27820a.mo54894d();
    }

    /* renamed from: b */
    public final String mo43011b() throws RemoteException {
        return this.f27820a.mo54895e();
    }

    /* renamed from: c */
    public final String mo43012c() throws RemoteException {
        return this.f27820a.mo54896f();
    }

    /* renamed from: e */
    public final String mo43013e() throws RemoteException {
        return this.f27820a.mo54899i();
    }

    /* renamed from: f */
    public final String mo43014f() throws RemoteException {
        return this.f27820a.mo54898h();
    }

    /* renamed from: g */
    public final String mo43015g() throws RemoteException {
        return this.f27820a.mo54900j();
    }

    /* renamed from: g0 */
    public final Bundle mo43016g0(Bundle bundle) throws RemoteException {
        return this.f27820a.mo54905p(bundle);
    }

    /* renamed from: hb */
    public final void mo43017hb(String str, String str2, Bundle bundle) throws RemoteException {
        this.f27820a.mo54892b(str, str2, bundle);
    }

    /* renamed from: k0 */
    public final void mo43018k0(Bundle bundle) throws RemoteException {
        this.f27820a.mo54907r(bundle);
    }

    /* renamed from: ka */
    public final void mo43019ka(String str, String str2, Bundle bundle) throws RemoteException {
        this.f27820a.mo54903n(str, str2, bundle);
    }

    /* renamed from: m0 */
    public final void mo43020m0(String str) throws RemoteException {
        this.f27820a.mo54891a(str);
    }

    /* renamed from: n0 */
    public final void mo43021n0(Bundle bundle) throws RemoteException {
        this.f27820a.mo54904o(bundle);
    }

    /* renamed from: q4 */
    public final List mo43022q4(String str, String str2) throws RemoteException {
        return this.f27820a.mo54897g(str, str2);
    }

    /* renamed from: t */
    public final int mo43023t(String str) throws RemoteException {
        return this.f27820a.mo54901l(str);
    }

    /* renamed from: u4 */
    public final void mo43024u4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f27820a.mo54909t(iObjectWrapper != null ? (Activity) ObjectWrapper.m5050A1(iObjectWrapper) : null, str, str2);
    }

    /* renamed from: x1 */
    public final void mo43025x1(Bundle bundle) throws RemoteException {
        this.f27820a.mo54908s(bundle);
    }
}
