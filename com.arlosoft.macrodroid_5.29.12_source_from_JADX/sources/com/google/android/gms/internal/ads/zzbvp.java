package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbvp extends zzasa implements zzbvq {
    public zzbvp() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: Jb */
    public static zzbvq m44294Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbvq ? (zzbvq) queryLocalInterface : new zzbvo(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo43076b();
                break;
            case 2:
                mo43077c();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzasb.m42225c(parcel);
                mo43088x(readInt);
                break;
            case 4:
                mo43083n();
                break;
            case 5:
                mo43081m();
                break;
            case 6:
                mo43080l();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbvu) {
                        zzbvu zzbvu = (zzbvu) queryLocalInterface;
                    }
                }
                zzasb.m42225c(parcel);
                break;
            case 8:
                mo43079k();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzasb.m42225c(parcel);
                mo43084ta(readString, readString2);
                break;
            case 10:
                zzbmx.m43773Jb(parcel.readStrongBinder());
                parcel.readString();
                zzasb.m42225c(parcel);
                break;
            case 11:
                mo43087w();
                break;
            case 12:
                parcel.readString();
                zzasb.m42225c(parcel);
                break;
            case 13:
                mo43070H();
                break;
            case 14:
                zzasb.m42225c(parcel);
                mo43072L2((zzcce) zzasb.m42223a(parcel, zzcce.CREATOR));
                break;
            case 15:
                mo43071K();
                break;
            case 16:
                zzcci Jb = zzcch.m44874Jb(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43068A9(Jb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzasb.m42225c(parcel);
                mo43074S0(readInt2);
                break;
            case 18:
                mo43085u();
                break;
            case 19:
                Bundle bundle = (Bundle) zzasb.m42223a(parcel, Bundle.CREATOR);
                zzasb.m42225c(parcel);
                break;
            case 20:
                mo43069D();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzasb.m42225c(parcel);
                mo43082m0(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzasb.m42225c(parcel);
                mo43078f2(readInt3, readString4);
                break;
            case 23:
                zzasb.m42225c(parcel);
                mo43086u2((zze) zzasb.m42223a(parcel, zze.CREATOR));
                break;
            case 24:
                zzasb.m42225c(parcel);
                mo43073M0((zze) zzasb.m42223a(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
