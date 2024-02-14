package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo20764y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo20763l5((Account) zzc.m55792b(parcel, Account.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo20762O(zzc.m55795e(parcel));
        }
        return true;
    }
}
