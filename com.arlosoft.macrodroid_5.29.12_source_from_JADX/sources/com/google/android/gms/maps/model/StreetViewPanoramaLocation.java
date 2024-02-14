package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzo();
    @SafeParcelable.Field

    /* renamed from: a */
    public final StreetViewPanoramaLink[] f46324a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final LatLng f46325c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f46326d;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLocation(@SafeParcelable.Param StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.Param LatLng latLng, @SafeParcelable.Param String str) {
        this.f46324a = streetViewPanoramaLinkArr;
        this.f46325c = latLng;
        this.f46326d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f46326d.equals(streetViewPanoramaLocation.f46326d) && this.f46325c.equals(streetViewPanoramaLocation.f46325c);
    }

    public int hashCode() {
        return Objects.m4471b(this.f46325c, this.f46326d);
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("panoId", this.f46326d).mo21720a("position", this.f46325c.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4557A(parcel, 2, this.f46324a, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f46325c, i, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f46326d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
