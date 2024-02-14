package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzc implements Parcelable.Creator<AccountChangeEventsResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        ArrayList<AccountChangeEvent> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m4551u(parcel, E, AccountChangeEvent.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new AccountChangeEventsResponse(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsResponse[i];
    }
}
