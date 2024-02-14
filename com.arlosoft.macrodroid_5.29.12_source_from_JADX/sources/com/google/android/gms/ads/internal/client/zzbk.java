package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbk extends zzasa implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasb.m42225c(parcel);
            mo19903Q8((zzl) zzasb.m42223a(parcel, zzl.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String b = mo19904b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i == 3) {
            boolean g = mo19906g();
            parcel2.writeNoException();
            zzasb.m42226d(parcel2, g);
        } else if (i == 4) {
            String c = mo19905c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzasb.m42225c(parcel);
            mo19907u6((zzl) zzasb.m42223a(parcel, zzl.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
