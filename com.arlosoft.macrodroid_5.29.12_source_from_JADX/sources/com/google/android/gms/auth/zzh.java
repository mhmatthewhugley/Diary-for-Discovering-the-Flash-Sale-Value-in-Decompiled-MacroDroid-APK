package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzh implements zzj<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ Account f2960a;

    /* renamed from: a */
    public final /* synthetic */ Object mo21064a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return (Bundle) zzd.m3414h(zzf.m55801t1(iBinder).mo48567x5(this.f2960a));
    }
}
