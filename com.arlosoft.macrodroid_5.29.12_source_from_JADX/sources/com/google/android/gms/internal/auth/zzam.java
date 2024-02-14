package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo20764y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo48556v3((ProxyResponse) zzc.m55792b(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo48555t(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
