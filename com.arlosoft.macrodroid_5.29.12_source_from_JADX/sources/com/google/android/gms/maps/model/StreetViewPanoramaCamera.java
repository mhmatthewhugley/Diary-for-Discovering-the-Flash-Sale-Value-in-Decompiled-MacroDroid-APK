package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a */
    public final float f46318a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final float f46319c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final float f46320d;
    @NonNull

    /* renamed from: f */
    private final StreetViewPanoramaOrientation f46321f;

    public static final class Builder {
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param float f, @SafeParcelable.Param float f2, @SafeParcelable.Param float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.m4479b(z, sb.toString());
        this.f46318a = ((double) f) <= 0.0d ? 0.0f : f;
        this.f46319c = 0.0f + f2;
        this.f46320d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.f46321f = new StreetViewPanoramaOrientation.Builder().mo54791c(f2).mo54789a(f3).mo54790b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f46318a) == Float.floatToIntBits(streetViewPanoramaCamera.f46318a) && Float.floatToIntBits(this.f46319c) == Float.floatToIntBits(streetViewPanoramaCamera.f46319c) && Float.floatToIntBits(this.f46320d) == Float.floatToIntBits(streetViewPanoramaCamera.f46320d);
    }

    public int hashCode() {
        return Objects.m4471b(Float.valueOf(this.f46318a), Float.valueOf(this.f46319c), Float.valueOf(this.f46320d));
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("zoom", Float.valueOf(this.f46318a)).mo21720a("tilt", Float.valueOf(this.f46319c)).mo21720a("bearing", Float.valueOf(this.f46320d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4573k(parcel, 2, this.f46318a);
        SafeParcelWriter.m4573k(parcel, 3, this.f46319c);
        SafeParcelWriter.m4573k(parcel, 4, this.f46320d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
