package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbb implements Parcelable.Creator<zzba> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<ClientIdentity> arrayList = zzba.f41100C;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w != 1) {
                switch (w) {
                    case 5:
                        arrayList = SafeParcelReader.m4551u(parcel2, E, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m4547q(parcel2, E);
                        break;
                    case 7:
                        z = SafeParcelReader.m4554x(parcel2, E);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m4554x(parcel2, E);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m4554x(parcel2, E);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m4547q(parcel2, E);
                        break;
                    case 11:
                        z4 = SafeParcelReader.m4554x(parcel2, E);
                        break;
                    case 12:
                        z5 = SafeParcelReader.m4554x(parcel2, E);
                        break;
                    case 13:
                        str3 = SafeParcelReader.m4547q(parcel2, E);
                        break;
                    case 14:
                        j = SafeParcelReader.m4523J(parcel2, E);
                        break;
                    default:
                        SafeParcelReader.m4527N(parcel2, E);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m4546p(parcel2, E, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzba(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}
