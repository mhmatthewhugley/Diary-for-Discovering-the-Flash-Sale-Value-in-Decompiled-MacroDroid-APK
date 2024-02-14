package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.PlaceLikelihood;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzak extends AbstractSafeParcelable implements PlaceLikelihood {
    public static final Parcelable.Creator<zzak> CREATOR = new zzaj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PlaceEntity f45967a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final float f45968c;

    @SafeParcelable.Constructor
    zzak(@SafeParcelable.Param PlaceEntity placeEntity, @SafeParcelable.Param float f) {
        this.f45967a = placeEntity;
        this.f45968c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzak = (zzak) obj;
        return this.f45967a.equals(zzak.f45967a) && this.f45968c == zzak.f45968c;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45967a, Float.valueOf(this.f45968c));
    }

    /* renamed from: l2 */
    public final float mo54287l2() {
        return this.f45968c;
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("place", this.f45967a).mo21720a("likelihood", Float.valueOf(this.f45968c)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f45967a, i, false);
        SafeParcelWriter.m4573k(parcel, 2, this.f45968c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
