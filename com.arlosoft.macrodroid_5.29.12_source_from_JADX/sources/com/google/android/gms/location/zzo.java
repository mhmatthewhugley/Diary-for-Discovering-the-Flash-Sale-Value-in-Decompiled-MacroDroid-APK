package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzo implements Parcelable.Creator<ActivityTransitionRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<ActivityTransition> arrayList = null;
        String str = null;
        ArrayList<ClientIdentity> arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, ActivityTransition.CREATOR);
            } else if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                arrayList2 = SafeParcelReader.m4551u(parcel, E, ClientIdentity.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str2 = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
