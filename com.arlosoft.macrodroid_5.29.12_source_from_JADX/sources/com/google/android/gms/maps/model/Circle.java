package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzh;

public final class Circle {

    /* renamed from: a */
    private final zzh f46232a;

    public Circle(zzh zzh) {
        this.f46232a = (zzh) Preconditions.m4488k(zzh);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.f46232a.mo50665V7(((Circle) obj).f46232a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46232a.mo50666h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
