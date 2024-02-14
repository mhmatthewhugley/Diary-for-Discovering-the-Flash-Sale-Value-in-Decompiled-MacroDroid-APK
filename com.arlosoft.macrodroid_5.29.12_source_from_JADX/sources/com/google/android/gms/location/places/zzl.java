package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzl implements Parcelable.Creator<PlacePhotoResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Status status = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                status = (Status) SafeParcelReader.m4546p(parcel, E, Status.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bitmapTeleporter = (BitmapTeleporter) SafeParcelReader.m4546p(parcel, E, BitmapTeleporter.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new PlacePhotoResult(status, bitmapTeleporter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlacePhotoResult[i];
    }
}
