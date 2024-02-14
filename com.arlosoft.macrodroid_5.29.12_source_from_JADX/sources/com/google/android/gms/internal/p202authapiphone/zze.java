package com.google.android.gms.internal.p202authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zze */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class zze extends zza implements zzf {
    public zze() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo48496y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo48500Y1((Status) zzd.m55631a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
