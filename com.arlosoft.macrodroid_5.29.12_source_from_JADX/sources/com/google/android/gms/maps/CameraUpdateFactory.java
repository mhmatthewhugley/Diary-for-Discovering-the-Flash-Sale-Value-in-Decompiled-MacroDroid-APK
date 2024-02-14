package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class CameraUpdateFactory {

    /* renamed from: a */
    private static ICameraUpdateFactoryDelegate f46134a;

    private CameraUpdateFactory() {
    }

    /* renamed from: a */
    public static CameraUpdate m64878a(LatLng latLng, float f) {
        try {
            return new CameraUpdate(m64880c().mo54565c6(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static void m64879b(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        f46134a = (ICameraUpdateFactoryDelegate) Preconditions.m4488k(iCameraUpdateFactoryDelegate);
    }

    /* renamed from: c */
    private static ICameraUpdateFactoryDelegate m64880c() {
        return (ICameraUpdateFactoryDelegate) Preconditions.m4489l(f46134a, "CameraUpdateFactory is not initialized");
    }
}
