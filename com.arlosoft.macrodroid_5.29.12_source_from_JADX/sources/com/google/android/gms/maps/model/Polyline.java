package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzz;

public final class Polyline {

    /* renamed from: a */
    private final zzz f46306a;

    public Polyline(zzz zzz) {
        this.f46306a = (zzz) Preconditions.m4488k(zzz);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            return this.f46306a.mo50656E8(((Polyline) obj).f46306a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46306a.mo50657h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
