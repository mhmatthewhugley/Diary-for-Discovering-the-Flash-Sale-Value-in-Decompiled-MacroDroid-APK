package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbe extends zzasa implements zzbf {
    public zzbe() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo19896d();
                break;
            case 2:
                int readInt = parcel.readInt();
                zzasb.m42225c(parcel);
                mo19893A(readInt);
                break;
            case 3:
                break;
            case 4:
                mo19899g();
                break;
            case 5:
                mo19900h();
                break;
            case 6:
                mo19895a();
                break;
            case 7:
                mo19898f();
                break;
            case 8:
                zzasb.m42225c(parcel);
                mo19894C((zze) zzasb.m42223a(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
