package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzi implements zzj<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ String f2961a;

    /* renamed from: a */
    public final /* synthetic */ Object mo21064a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle = (Bundle) zzd.m3414h(zzf.m55801t1(iBinder).mo48566o(this.f2961a));
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay d = zzay.m55789d(string);
        if (zzay.SUCCESS.equals(d)) {
            return Boolean.TRUE;
        }
        if (zzay.m55788b(d)) {
            Logger f = zzd.f2952e;
            String valueOf = String.valueOf(d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            f.mo21844h("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}
