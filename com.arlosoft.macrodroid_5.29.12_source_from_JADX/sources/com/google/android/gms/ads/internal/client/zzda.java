package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzda extends zzasa implements zzdb {
    public zzda() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    /* renamed from: Jb */
    public static zzdb m2130Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof zzdb ? (zzdb) queryLocalInterface : new zzcz(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo19988b();
        parcel2.writeNoException();
        return true;
    }
}
