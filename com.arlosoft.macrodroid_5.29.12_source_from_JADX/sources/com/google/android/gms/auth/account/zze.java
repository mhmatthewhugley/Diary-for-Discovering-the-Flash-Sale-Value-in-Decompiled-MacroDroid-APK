package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

public final class zze extends zza implements zzc {
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    /* renamed from: I0 */
    public final void mo20765I0(boolean z) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55791a(y, z);
        mo48534A1(1, y);
    }

    /* renamed from: Ma */
    public final void mo20766Ma(zza zza, String str) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55793c(y, zza);
        y.writeString(str);
        mo48534A1(2, y);
    }

    /* renamed from: xb */
    public final void mo20767xb(zza zza, Account account) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55793c(y, zza);
        zzc.m55794d(y, account);
        mo48534A1(3, y);
    }
}
