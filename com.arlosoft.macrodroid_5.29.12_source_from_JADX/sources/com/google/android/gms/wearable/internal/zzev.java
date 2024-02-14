package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.wearable.zza;
import com.google.android.gms.internal.wearable.zzc;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzev extends zza {
    zzev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    /* renamed from: g8 */
    public final void mo56409g8(boolean z, byte[] bArr) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64215c(A1, z);
        A1.writeByteArray(bArr);
        mo53770t1(1, A1);
    }
}
