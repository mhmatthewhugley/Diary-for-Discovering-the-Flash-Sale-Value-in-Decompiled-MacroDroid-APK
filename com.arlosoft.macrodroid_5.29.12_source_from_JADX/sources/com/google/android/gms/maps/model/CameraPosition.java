package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();
    @SafeParcelable.Field

    /* renamed from: a */
    public final LatLng f46220a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final float f46221c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final float f46222d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final float f46223f;

    public static final class Builder {

        /* renamed from: a */
        private LatLng f46224a;

        /* renamed from: b */
        private float f46225b;

        /* renamed from: c */
        private float f46226c;

        /* renamed from: d */
        private float f46227d;

        /* renamed from: a */
        public final Builder mo54675a(float f) {
            this.f46227d = f;
            return this;
        }

        /* renamed from: b */
        public final CameraPosition mo54676b() {
            return new CameraPosition(this.f46224a, this.f46225b, this.f46226c, this.f46227d);
        }

        /* renamed from: c */
        public final Builder mo54677c(LatLng latLng) {
            this.f46224a = latLng;
            return this;
        }

        /* renamed from: d */
        public final Builder mo54678d(float f) {
            this.f46226c = f;
            return this;
        }

        /* renamed from: e */
        public final Builder mo54679e(float f) {
            this.f46225b = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param LatLng latLng, @SafeParcelable.Param float f, @SafeParcelable.Param float f2, @SafeParcelable.Param float f3) {
        Preconditions.m4489l(latLng, "null camera target");
        Preconditions.m4480c(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f46220a = latLng;
        this.f46221c = f;
        this.f46222d = f2 + 0.0f;
        this.f46223f = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: l2 */
    public static Builder m65201l2() {
        return new Builder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f46220a.equals(cameraPosition.f46220a) && Float.floatToIntBits(this.f46221c) == Float.floatToIntBits(cameraPosition.f46221c) && Float.floatToIntBits(this.f46222d) == Float.floatToIntBits(cameraPosition.f46222d) && Float.floatToIntBits(this.f46223f) == Float.floatToIntBits(cameraPosition.f46223f);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f46220a, Float.valueOf(this.f46221c), Float.valueOf(this.f46222d), Float.valueOf(this.f46223f));
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a(TypedValues.Attributes.S_TARGET, this.f46220a).mo21720a("zoom", Float.valueOf(this.f46221c)).mo21720a("tilt", Float.valueOf(this.f46222d)).mo21720a("bearing", Float.valueOf(this.f46223f)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f46220a, i, false);
        SafeParcelWriter.m4573k(parcel, 3, this.f46221c);
        SafeParcelWriter.m4573k(parcel, 4, this.f46222d);
        SafeParcelWriter.m4573k(parcel, 5, this.f46223f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
