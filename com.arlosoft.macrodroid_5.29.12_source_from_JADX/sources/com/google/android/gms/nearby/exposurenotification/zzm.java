package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<ScanInstance> arrayList = null;
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    j = SafeParcelReader.m4523J(parcel, E);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m4551u(parcel, E, ScanInstance.CREATOR);
                    break;
                case 3:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 4:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 5:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    i4 = SafeParcelReader.m4520G(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new ExposureWindow(j, arrayList, i, i2, i3, str, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExposureWindow[i];
    }
}
