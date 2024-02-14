package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class zzh extends zza {
    zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    /* renamed from: A1 */
    public final void mo50499A1(zzg zzg, UserAddressRequest userAddressRequest, Bundle bundle) throws RemoteException {
        Parcel y = mo50493y();
        zzc.m59129c(y, zzg);
        zzc.m59128b(y, userAddressRequest);
        zzc.m59128b(y, bundle);
        mo50492t1(2, y);
    }
}
