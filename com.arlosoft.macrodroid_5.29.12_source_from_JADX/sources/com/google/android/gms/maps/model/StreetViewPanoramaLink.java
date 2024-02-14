package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new zzn();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f46322a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final float f46323c;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLink(@SafeParcelable.Param String str, @SafeParcelable.Param float f) {
        this.f46322a = str;
        this.f46323c = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f46322a.equals(streetViewPanoramaLink.f46322a) && Float.floatToIntBits(this.f46323c) == Float.floatToIntBits(streetViewPanoramaLink.f46323c);
    }

    public int hashCode() {
        return Objects.m4471b(this.f46322a, Float.valueOf(this.f46323c));
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("panoId", this.f46322a).mo21720a("bearing", Float.valueOf(this.f46323c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f46322a, false);
        SafeParcelWriter.m4573k(parcel, 3, this.f46323c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
