package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: a */
    public final LatLng f46265a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final LatLng f46266c;

    public static final class Builder {

        /* renamed from: a */
        private double f46267a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f46268b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f46269c = Double.NaN;

        /* renamed from: d */
        private double f46270d = Double.NaN;
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param LatLng latLng, @SafeParcelable.Param LatLng latLng2) {
        Preconditions.m4489l(latLng, "null southwest");
        Preconditions.m4489l(latLng2, "null northeast");
        double d = latLng2.f46263a;
        double d2 = latLng.f46263a;
        Preconditions.m4480c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f46263a));
        this.f46265a = latLng;
        this.f46266c = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f46265a.equals(latLngBounds.f46265a) && this.f46266c.equals(latLngBounds.f46266c);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f46265a, this.f46266c);
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("southwest", this.f46265a).mo21720a("northeast", this.f46266c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f46265a, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f46266c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
