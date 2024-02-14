package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzac;

public final class TileOverlay {

    /* renamed from: a */
    private final zzac f46338a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return false;
        }
        try {
            return this.f46338a.mo50659v2(((TileOverlay) obj).f46338a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46338a.mo50658h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
