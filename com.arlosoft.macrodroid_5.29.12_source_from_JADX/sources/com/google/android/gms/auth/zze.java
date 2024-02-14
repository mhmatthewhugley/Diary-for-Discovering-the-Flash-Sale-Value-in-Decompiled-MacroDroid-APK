package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zze implements zzj<TokenData> {

    /* renamed from: a */
    private final /* synthetic */ Account f2953a;

    /* renamed from: b */
    private final /* synthetic */ String f2954b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f2955c;

    zze(Account account, String str, Bundle bundle) {
        this.f2953a = account;
        this.f2954b = str;
        this.f2955c = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo21064a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle = (Bundle) zzd.m3414h(zzf.m55801t1(iBinder).mo48564g6(this.f2953a, this.f2954b, this.f2955c));
        TokenData l2 = TokenData.m3119l2(bundle, "tokenDetails");
        if (l2 != null) {
            return l2;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay d = zzay.m55789d(string);
        boolean z = false;
        if (!zzay.m55788b(d)) {
            if (zzay.NETWORK_ERROR.equals(d) || zzay.SERVICE_UNAVAILABLE.equals(d) || zzay.INTNERNAL_ERROR.equals(d)) {
                z = true;
            }
            if (z) {
                throw new IOException(string);
            }
            throw new GoogleAuthException(string);
        }
        Logger f = zzd.f2952e;
        String valueOf = String.valueOf(d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        f.mo21844h("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
