package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbt;

final class zzr extends zzbt {

    /* renamed from: a */
    private final /* synthetic */ GoogleMap.SnapshotReadyCallback f46383a;

    zzr(GoogleMap googleMap, GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.f46383a = snapshotReadyCallback;
    }

    /* renamed from: C0 */
    public final void mo54649C0(Bitmap bitmap) throws RemoteException {
        this.f46383a.mo29236C0(bitmap);
    }

    /* renamed from: q0 */
    public final void mo54650q0(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f46383a.mo29236C0((Bitmap) ObjectWrapper.m5050A1(iObjectWrapper));
    }
}
