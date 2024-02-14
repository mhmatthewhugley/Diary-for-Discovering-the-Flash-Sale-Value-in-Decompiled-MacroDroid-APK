package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzv extends zzl implements zzw {
    public zzv() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo59802y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                mo59599db(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                mo59603t0(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                mo59602p6(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo59596T1(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                mo59594L6((Bundle) zzm.m70974a(parcel, creator), (Bundle) zzm.m70974a(parcel, creator));
                return true;
            case 7:
                mo59600g0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo59592A4((Bundle) zzm.m70974a(parcel, creator2), (Bundle) zzm.m70974a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo59598b5((Bundle) zzm.m70974a(parcel, creator3), (Bundle) zzm.m70974a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo59597U5((Bundle) zzm.m70974a(parcel, creator4), (Bundle) zzm.m70974a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo59595R6((Bundle) zzm.m70974a(parcel, creator5), (Bundle) zzm.m70974a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo59593J3((Bundle) zzm.m70974a(parcel, creator6), (Bundle) zzm.m70974a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                mo59601i3((Bundle) zzm.m70974a(parcel, creator7), (Bundle) zzm.m70974a(parcel, creator7));
                return true;
            case 15:
                mo59604v0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
