package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzw;

public final class Polygon {

    /* renamed from: a */
    private final zzw f46294a;

    public Polygon(zzw zzw) {
        this.f46294a = (zzw) Preconditions.m4488k(zzw);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            return this.f46294a.mo50677r6(((Polygon) obj).f46294a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46294a.mo50676h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
