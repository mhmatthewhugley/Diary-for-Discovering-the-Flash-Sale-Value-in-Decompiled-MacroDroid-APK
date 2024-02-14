package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzcax extends zzasa implements zzcay {
    public zzcax() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasb.m42225c(parcel);
            mo43267B9((ParcelFileDescriptor) zzasb.m42223a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzasb.m42225c(parcel);
            mo43268a6((zzaz) zzasb.m42223a(parcel, zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
