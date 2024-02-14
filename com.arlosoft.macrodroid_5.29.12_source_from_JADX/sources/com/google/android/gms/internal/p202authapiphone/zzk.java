package com.google.android.gms.internal.p202authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzk */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class zzk extends zza implements zzl {
    public zzk() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo48496y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo48507Q0((Status) zzd.m55631a(parcel, Status.CREATOR));
        return true;
    }
}
