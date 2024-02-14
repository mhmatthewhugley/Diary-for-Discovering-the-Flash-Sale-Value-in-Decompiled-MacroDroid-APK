package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

public abstract class zzd extends zzb implements zzc {
    /* renamed from: t1 */
    public static zzc m3129t1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof zzc) {
            return (zzc) queryLocalInterface;
        }
        return new zze(iBinder);
    }
}
