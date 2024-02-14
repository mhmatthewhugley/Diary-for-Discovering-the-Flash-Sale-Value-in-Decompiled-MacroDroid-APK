package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo20764y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo48569e0((Status) zzc.m55792b(parcel, Status.CREATOR));
                return true;
            case 2:
                mo48568I1((Status) zzc.m55792b(parcel, Status.CREATOR), (zzt) zzc.m55792b(parcel, zzt.CREATOR));
                return true;
            case 3:
                mo48570f7((Status) zzc.m55792b(parcel, Status.CREATOR), (zzl) zzc.m55792b(parcel, zzl.CREATOR));
                return true;
            case 4:
                mo20788d();
                return true;
            case 5:
                mo20777G5((Status) zzc.m55792b(parcel, Status.CREATOR));
                return true;
            case 6:
                mo20786X(parcel.createByteArray());
                return true;
            case 7:
                mo20787l3((DeviceMetaData) zzc.m55792b(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
