package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzcb extends zzl implements zzcc {
    public zzcb() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo59802y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                mo59850D4(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                mo59855P3(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                mo59860t0(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo59851H5(parcel.readInt(), (Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                mo59853O0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo59854P1(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                mo59852K7((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                mo59861v0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                mo59856R3((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo59857T0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                mo59858g0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo59859m1((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
