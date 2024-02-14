package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new zzv();
    @SafeParcelable.Field

    /* renamed from: a */
    public final LatLng f46348a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final LatLng f46349c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final LatLng f46350d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final LatLng f46351f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final LatLngBounds f46352g;

    @SafeParcelable.Constructor
    public VisibleRegion(@SafeParcelable.Param LatLng latLng, @SafeParcelable.Param LatLng latLng2, @SafeParcelable.Param LatLng latLng3, @SafeParcelable.Param LatLng latLng4, @SafeParcelable.Param LatLngBounds latLngBounds) {
        this.f46348a = latLng;
        this.f46349c = latLng2;
        this.f46350d = latLng3;
        this.f46351f = latLng4;
        this.f46352g = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f46348a.equals(visibleRegion.f46348a) && this.f46349c.equals(visibleRegion.f46349c) && this.f46350d.equals(visibleRegion.f46350d) && this.f46351f.equals(visibleRegion.f46351f) && this.f46352g.equals(visibleRegion.f46352g);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f46348a, this.f46349c, this.f46350d, this.f46351f, this.f46352g);
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("nearLeft", this.f46348a).mo21720a("nearRight", this.f46349c).mo21720a("farLeft", this.f46350d).mo21720a("farRight", this.f46351f).mo21720a("latLngBounds", this.f46352g).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f46348a, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f46349c, i, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f46350d, i, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f46351f, i, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f46352g, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
