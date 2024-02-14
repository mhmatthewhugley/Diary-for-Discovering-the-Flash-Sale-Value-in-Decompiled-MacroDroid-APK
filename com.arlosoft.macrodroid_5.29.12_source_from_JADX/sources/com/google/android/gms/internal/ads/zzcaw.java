package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcaw extends zzarz implements zzcay {
    zzcaw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* renamed from: B9 */
    public final void mo43267B9(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, parcelFileDescriptor);
        mo41865A1(1, y);
    }

    /* renamed from: a6 */
    public final void mo43268a6(zzaz zzaz) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzaz);
        mo41865A1(2, y);
    }
}
