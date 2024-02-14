package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzk implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, DetectedActivity.CREATOR);
            } else if (w == 2) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w == 3) {
                j2 = SafeParcelReader.m4523J(parcel, E);
            } else if (w == 4) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bundle = SafeParcelReader.m4536f(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
