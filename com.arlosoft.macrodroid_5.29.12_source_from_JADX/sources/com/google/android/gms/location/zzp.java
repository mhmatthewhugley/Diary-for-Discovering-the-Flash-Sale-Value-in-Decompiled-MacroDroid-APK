package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzp implements Parcelable.Creator<ActivityTransitionResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<ActivityTransitionEvent> arrayList = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, ActivityTransitionEvent.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bundle = SafeParcelReader.m4536f(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new ActivityTransitionResult(arrayList, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
