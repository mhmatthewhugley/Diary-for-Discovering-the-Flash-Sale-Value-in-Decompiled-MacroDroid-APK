package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<PlacePhotoMetadataResult> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Status f45913a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final DataHolder f45914c;

    /* renamed from: d */
    private final PlacePhotoMetadataBuffer f45915d;

    @SafeParcelable.Constructor
    public PlacePhotoMetadataResult(@SafeParcelable.Param Status status, @SafeParcelable.Param DataHolder dataHolder) {
        this.f45913a = status;
        this.f45914c = dataHolder;
        if (dataHolder == null) {
            this.f45915d = null;
        } else {
            this.f45915d = new PlacePhotoMetadataBuffer(dataHolder);
        }
    }

    public Status getStatus() {
        return this.f45913a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f45914c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
