package com.google.android.gms.internal.p203authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzah */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzah extends zzc implements zzae {
    public zzah() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21043y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo48510B6((Status) zzf.m55710a(parcel, Status.CREATOR), (PendingIntent) zzf.m55710a(parcel, PendingIntent.CREATOR));
        return true;
    }
}