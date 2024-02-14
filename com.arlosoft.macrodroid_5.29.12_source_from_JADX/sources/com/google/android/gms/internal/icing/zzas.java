package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.search.internal.ISearchAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50163y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo50167b2((Status) zzc.m58651a(parcel, Status.CREATOR), (GoogleNowAuthState) zzc.m58651a(parcel, GoogleNowAuthState.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo50168m6((Status) zzc.m58651a(parcel, Status.CREATOR));
        }
        return true;
    }
}
