package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzq;

public final class IndoorLevel {

    /* renamed from: a */
    private final zzq f46262a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.f46262a.mo50671Y2(((IndoorLevel) obj).f46262a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46262a.mo50672h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
