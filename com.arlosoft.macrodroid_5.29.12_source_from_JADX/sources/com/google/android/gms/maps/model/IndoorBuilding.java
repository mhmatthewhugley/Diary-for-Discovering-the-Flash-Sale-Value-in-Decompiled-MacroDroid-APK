package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.maps.zzn;

public final class IndoorBuilding {
    @NonNull

    /* renamed from: a */
    private final zzn f46259a;
    @NonNull

    /* renamed from: b */
    private final zza f46260b;

    @VisibleForTesting
    static class zza {

        /* renamed from: a */
        public static final zza f46261a = new zza();

        private zza() {
        }
    }

    public IndoorBuilding(@NonNull zzn zzn) {
        this(zzn, zza.f46261a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.f46259a.mo50669bb(((IndoorBuilding) obj).f46259a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46259a.mo50670h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @VisibleForTesting
    private IndoorBuilding(@NonNull zzn zzn, @NonNull zza zza2) {
        this.f46259a = (zzn) Preconditions.m4489l(zzn, "delegate");
        this.f46260b = (zza) Preconditions.m4489l(zza2, "shim");
    }
}
