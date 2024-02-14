package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zze;

public final class BitmapDescriptorFactory {

    /* renamed from: a */
    private static zze f46219a;

    private BitmapDescriptorFactory() {
    }

    /* renamed from: a */
    public static BitmapDescriptor m65198a(int i) {
        try {
            return new BitmapDescriptor(m65200c().mo50664v(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static void m65199b(zze zze) {
        if (f46219a == null) {
            f46219a = (zze) Preconditions.m4488k(zze);
        }
    }

    /* renamed from: c */
    private static zze m65200c() {
        return (zze) Preconditions.m4489l(f46219a, "IBitmapDescriptorFactory is not initialized");
    }
}
