package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a */
    public final float f46327a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final float f46328c;

    public static final class Builder {

        /* renamed from: a */
        public float f46329a;

        /* renamed from: b */
        public float f46330b;

        /* renamed from: a */
        public final Builder mo54789a(float f) {
            this.f46329a = f;
            return this;
        }

        /* renamed from: b */
        public final StreetViewPanoramaOrientation mo54790b() {
            return new StreetViewPanoramaOrientation(this.f46330b, this.f46329a);
        }

        /* renamed from: c */
        public final Builder mo54791c(float f) {
            this.f46330b = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param float f, @SafeParcelable.Param float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        Preconditions.m4479b(z, sb.toString());
        this.f46327a = f + 0.0f;
        this.f46328c = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f46327a) == Float.floatToIntBits(streetViewPanoramaOrientation.f46327a) && Float.floatToIntBits(this.f46328c) == Float.floatToIntBits(streetViewPanoramaOrientation.f46328c);
    }

    public int hashCode() {
        return Objects.m4471b(Float.valueOf(this.f46327a), Float.valueOf(this.f46328c));
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("tilt", Float.valueOf(this.f46327a)).mo21720a("bearing", Float.valueOf(this.f46328c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4573k(parcel, 2, this.f46327a);
        SafeParcelWriter.m4573k(parcel, 3, this.f46328c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
