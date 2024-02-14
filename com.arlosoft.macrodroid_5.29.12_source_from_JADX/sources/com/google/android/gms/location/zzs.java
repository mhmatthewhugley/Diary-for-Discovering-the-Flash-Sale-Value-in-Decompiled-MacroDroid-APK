package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a */
    boolean f46113a;
    @SafeParcelable.Field

    /* renamed from: c */
    long f46114c;
    @SafeParcelable.Field

    /* renamed from: d */
    float f46115d;
    @SafeParcelable.Field

    /* renamed from: f */
    long f46116f;
    @SafeParcelable.Field

    /* renamed from: g */
    int f46117g;

    public zzs() {
        this(true, 50, 0.0f, LocationRequestCompat.PASSIVE_INTERVAL, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        return this.f46113a == zzs.f46113a && this.f46114c == zzs.f46114c && Float.compare(this.f46115d, zzs.f46115d) == 0 && this.f46116f == zzs.f46116f && this.f46117g == zzs.f46117g;
    }

    public final int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f46113a), Long.valueOf(this.f46114c), Float.valueOf(this.f46115d), Long.valueOf(this.f46116f), Integer.valueOf(this.f46117g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f46113a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f46114c);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f46115d);
        long j = this.f46116f;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f46117g != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f46117g);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f46113a);
        SafeParcelWriter.m4581s(parcel, 2, this.f46114c);
        SafeParcelWriter.m4573k(parcel, 3, this.f46115d);
        SafeParcelWriter.m4581s(parcel, 4, this.f46116f);
        SafeParcelWriter.m4576n(parcel, 5, this.f46117g);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param boolean z, @SafeParcelable.Param long j, @SafeParcelable.Param float f, @SafeParcelable.Param long j2, @SafeParcelable.Param int i) {
        this.f46113a = z;
        this.f46114c = j;
        this.f46115d = f;
        this.f46116f = j2;
        this.f46117g = i;
    }
}
