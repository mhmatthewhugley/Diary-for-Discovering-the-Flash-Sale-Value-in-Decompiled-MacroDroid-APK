package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzeg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<TemporaryExposureKey> arrayList = null;
        IBinder iBinder = null;
        ArrayList arrayList2 = null;
        ExposureConfiguration exposureConfiguration = null;
        String str = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    arrayList = SafeParcelReader.m4551u(parcel, E, TemporaryExposureKey.CREATOR);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.m4551u(parcel, E, ParcelFileDescriptor.CREATOR);
                    break;
                case 4:
                    exposureConfiguration = (ExposureConfiguration) SafeParcelReader.m4546p(parcel, E, ExposureConfiguration.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    iBinder2 = SafeParcelReader.m4519F(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzef(arrayList, iBinder, arrayList2, exposureConfiguration, str, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzef[i];
    }
}
