package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzt;

public final class Marker {

    /* renamed from: a */
    private final zzt f46273a;

    public Marker(zzt zzt) {
        this.f46273a = (zzt) Preconditions.m4488k(zzt);
    }

    /* renamed from: a */
    public final void mo54723a() {
        try {
            this.f46273a.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.f46273a.mo50673ea(((Marker) obj).f46273a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46273a.mo50674h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
