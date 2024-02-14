package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p203authapi.zzc;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzs extends zzc implements zzp {
    public zzs() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21043y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo21039m();
        } else if (i != 2) {
            return false;
        } else {
            mo21040s();
        }
        return true;
    }
}
