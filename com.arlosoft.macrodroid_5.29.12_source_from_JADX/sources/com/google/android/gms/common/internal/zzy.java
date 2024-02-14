package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: t1 */
    public static zzz m4723t1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21710y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper d = mo21836d();
            parcel2.writeNoException();
            zzc.m55909f(parcel2, d);
        } else if (i != 2) {
            return false;
        } else {
            int a = mo21835a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
