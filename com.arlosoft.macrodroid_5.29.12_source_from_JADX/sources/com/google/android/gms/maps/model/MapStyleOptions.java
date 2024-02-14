package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzg();

    /* renamed from: c */
    private static final String f46271c = MapStyleOptions.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f46272a;

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param String str) {
        this.f46272a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f46272a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
