package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {

    /* renamed from: a */
    private static boolean f46171a = false;

    private MapsInitializer() {
    }

    /* renamed from: a */
    public static synchronized int m64967a(Context context) {
        synchronized (MapsInitializer.class) {
            Preconditions.m4489l(context, "Context is null");
            if (f46171a) {
                return 0;
            }
            try {
                zze a = zzbz.m65134a(context);
                try {
                    CameraUpdateFactory.m64879b(a.mo54654b());
                    BitmapDescriptorFactory.m65199b(a.mo54655c());
                    f46171a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        }
    }
}
