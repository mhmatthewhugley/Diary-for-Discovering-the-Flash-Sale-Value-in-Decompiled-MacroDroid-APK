package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    @SafeParcelable.Field

    /* renamed from: a */
    int f45832a;
    @SafeParcelable.Field

    /* renamed from: c */
    long f45833c;
    @SafeParcelable.Field

    /* renamed from: d */
    long f45834d;
    @SafeParcelable.Field

    /* renamed from: f */
    boolean f45835f;
    @SafeParcelable.Field

    /* renamed from: g */
    long f45836g;
    @SafeParcelable.Field

    /* renamed from: o */
    int f45837o;
    @SafeParcelable.Field

    /* renamed from: p */
    float f45838p;
    @SafeParcelable.Field

    /* renamed from: s */
    long f45839s;
    @SafeParcelable.Field

    /* renamed from: z */
    boolean f45840z;

    @Deprecated
    public LocationRequest() {
        this.f45832a = 102;
        this.f45833c = 3600000;
        this.f45834d = 600000;
        this.f45835f = false;
        this.f45836g = LocationRequestCompat.PASSIVE_INTERVAL;
        this.f45837o = Integer.MAX_VALUE;
        this.f45838p = 0.0f;
        this.f45839s = 0;
        this.f45840z = false;
    }

    @NonNull
    /* renamed from: l2 */
    public static LocationRequest m64672l2() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo54188q2(true);
        return locationRequest;
    }

    /* renamed from: r2 */
    private static void m64673r2(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f45832a == locationRequest.f45832a && this.f45833c == locationRequest.f45833c && this.f45834d == locationRequest.f45834d && this.f45835f == locationRequest.f45835f && this.f45836g == locationRequest.f45836g && this.f45837o == locationRequest.f45837o && this.f45838p == locationRequest.f45838p && mo54184m2() == locationRequest.mo54184m2() && this.f45840z == locationRequest.f45840z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45832a), Long.valueOf(this.f45833c), Float.valueOf(this.f45838p), Long.valueOf(this.f45839s));
    }

    /* renamed from: m2 */
    public long mo54184m2() {
        long j = this.f45839s;
        long j2 = this.f45833c;
        return j < j2 ? j2 : j;
    }

    /* renamed from: n2 */
    public int mo54185n2() {
        return this.f45837o;
    }

    @NonNull
    /* renamed from: o2 */
    public LocationRequest mo54186o2(long j) {
        m64673r2(j);
        this.f45839s = j;
        return this;
    }

    @NonNull
    /* renamed from: p2 */
    public LocationRequest mo54187p2(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f45832a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    /* renamed from: q2 */
    public LocationRequest mo54188q2(boolean z) {
        this.f45840z = z;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f45832a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f45832a != 105) {
            sb.append(" requested=");
            sb.append(this.f45833c);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f45834d);
        sb.append("ms");
        if (this.f45839s > this.f45833c) {
            sb.append(" maxWait=");
            sb.append(this.f45839s);
            sb.append("ms");
        }
        if (this.f45838p > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f45838p);
            sb.append("m");
        }
        long j = this.f45836g;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f45837o != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f45837o);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45832a);
        SafeParcelWriter.m4581s(parcel, 2, this.f45833c);
        SafeParcelWriter.m4581s(parcel, 3, this.f45834d);
        SafeParcelWriter.m4565c(parcel, 4, this.f45835f);
        SafeParcelWriter.m4581s(parcel, 5, this.f45836g);
        SafeParcelWriter.m4576n(parcel, 6, this.f45837o);
        SafeParcelWriter.m4573k(parcel, 7, this.f45838p);
        SafeParcelWriter.m4581s(parcel, 8, this.f45839s);
        SafeParcelWriter.m4565c(parcel, 9, this.f45840z);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param int i, @SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z, @SafeParcelable.Param long j3, @SafeParcelable.Param int i2, @SafeParcelable.Param float f, @SafeParcelable.Param long j4, @SafeParcelable.Param boolean z2) {
        this.f45832a = i;
        this.f45833c = j;
        this.f45834d = j2;
        this.f45835f = z;
        this.f45836g = j3;
        this.f45837o = i2;
        this.f45838p = f;
        this.f45839s = j4;
        this.f45840z = z2;
    }
}
