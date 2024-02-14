package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<LatLng> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    public final double f46263a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final double f46264c;

    @SafeParcelable.Constructor
    public LatLng(@SafeParcelable.Param double d, @SafeParcelable.Param double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f46264c = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f46264c = d2;
        }
        this.f46263a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f46263a) == Double.doubleToLongBits(latLng.f46263a) && Double.doubleToLongBits(this.f46264c) == Double.doubleToLongBits(latLng.f46264c);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46263a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46264c);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.f46263a;
        double d2 = this.f46264c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4570h(parcel, 2, this.f46263a);
        SafeParcelWriter.m4570h(parcel, 3, this.f46264c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
