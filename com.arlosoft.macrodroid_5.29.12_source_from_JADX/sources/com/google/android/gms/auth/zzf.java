package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

final class zzf implements zzj<Void> {

    /* renamed from: a */
    private final /* synthetic */ String f2956a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f2957b;

    /* renamed from: a */
    public final /* synthetic */ Object mo21064a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle = (Bundle) zzd.m3414h(com.google.android.gms.internal.auth.zzf.m55801t1(iBinder).mo48565h1(this.f2956a, this.f2957b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
