package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class Projection {

    /* renamed from: a */
    private final IProjectionDelegate f46172a;

    Projection(IProjectionDelegate iProjectionDelegate) {
        this.f46172a = iProjectionDelegate;
    }

    /* renamed from: a */
    public final Point mo54531a(LatLng latLng) {
        try {
            return (Point) ObjectWrapper.m5050A1(this.f46172a.mo54602U2(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
