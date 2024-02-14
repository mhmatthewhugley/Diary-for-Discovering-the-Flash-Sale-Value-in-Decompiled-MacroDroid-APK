package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class zze implements Parcelable.Creator<UserAddressRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<CountrySpecification> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m4551u(parcel, E, CountrySpecification.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new UserAddressRequest(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserAddressRequest[i];
    }
}
