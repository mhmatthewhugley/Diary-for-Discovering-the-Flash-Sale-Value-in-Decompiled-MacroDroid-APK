package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfri extends zzarz implements zzfrk {
    zzfri(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    /* renamed from: N2 */
    public final void mo46137N2(Bundle bundle, zzfrm zzfrm) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, bundle);
        zzasb.m42229g(y, zzfrm);
        mo41867g8(2, y);
    }

    /* renamed from: a9 */
    public final void mo46138a9(String str, Bundle bundle, zzfrm zzfrm) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        zzasb.m42227e(y, bundle);
        zzasb.m42229g(y, zzfrm);
        mo41867g8(1, y);
    }

    /* renamed from: ob */
    public final void mo46139ob(Bundle bundle, zzfrm zzfrm) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, bundle);
        zzasb.m42229g(y, zzfrm);
        mo41867g8(3, y);
    }
}
