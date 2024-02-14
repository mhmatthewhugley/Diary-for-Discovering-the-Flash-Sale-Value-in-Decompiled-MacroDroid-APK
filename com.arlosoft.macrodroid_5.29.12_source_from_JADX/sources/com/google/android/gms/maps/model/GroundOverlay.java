package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzk;

public final class GroundOverlay {

    /* renamed from: a */
    private final zzk f46246a;

    public GroundOverlay(zzk zzk) {
        this.f46246a = (zzk) Preconditions.m4488k(zzk);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.f46246a.mo50667da(((GroundOverlay) obj).f46246a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46246a.mo50668h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
