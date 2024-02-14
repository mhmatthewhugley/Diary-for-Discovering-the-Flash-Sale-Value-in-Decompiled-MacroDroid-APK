package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeil extends zzbwq {

    /* renamed from: a */
    private final zzehf f34107a;

    /* renamed from: c */
    final /* synthetic */ zzeim f34108c;

    /* synthetic */ zzeil(zzeim zzeim, zzehf zzehf, zzeik zzeik) {
        this.f34108c = zzeim;
        this.f34107a = zzehf;
    }

    /* renamed from: C */
    public final void mo43157C(zze zze) throws RemoteException {
        ((zzeix) this.f34107a.f34017c).mo43086u2(zze);
    }

    /* renamed from: Y8 */
    public final void mo43158Y8(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f34108c.f34111c = (View) ObjectWrapper.m5050A1(iObjectWrapper);
        ((zzeix) this.f34107a.f34017c).mo43080l();
    }

    /* renamed from: s8 */
    public final void mo43159s8(zzbvt zzbvt) throws RemoteException {
        this.f34108c.f34112d = zzbvt;
        ((zzeix) this.f34107a.f34017c).mo43080l();
    }

    /* renamed from: z */
    public final void mo43160z(String str) throws RemoteException {
        ((zzeix) this.f34107a.f34017c).mo43078f2(0, str);
    }
}
