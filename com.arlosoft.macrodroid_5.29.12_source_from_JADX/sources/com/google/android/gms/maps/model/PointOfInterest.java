package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: a */
    public final LatLng f46291a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f46292c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f46293d;

    @SafeParcelable.Constructor
    public PointOfInterest(@SafeParcelable.Param LatLng latLng, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f46291a = latLng;
        this.f46292c = str;
        this.f46293d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f46291a, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f46292c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f46293d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
