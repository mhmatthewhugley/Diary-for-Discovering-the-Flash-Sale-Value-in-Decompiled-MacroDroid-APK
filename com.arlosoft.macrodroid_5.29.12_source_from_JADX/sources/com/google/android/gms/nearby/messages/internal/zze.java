package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Distance;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zze extends AbstractSafeParcelable implements Distance {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47817a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f47818c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final double f47819d;

    @SafeParcelable.Constructor
    zze(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param double d) {
        this.f47817a = i;
        this.f47818c = i2;
        this.f47819d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zze = (zze) obj;
        return this.f47818c == zze.f47818c && compareTo(zze) == 0;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47818c), Double.valueOf(this.f47819d));
    }

    /* renamed from: i2 */
    public final double mo55870i2() {
        return this.f47819d;
    }

    /* renamed from: l2 */
    public final int compareTo(@NonNull Distance distance) {
        if (!Double.isNaN(this.f47819d) || !Double.isNaN(distance.mo55870i2())) {
            return Double.compare(this.f47819d, distance.mo55870i2());
        }
        return 0;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.f47819d);
        objArr[1] = this.f47818c != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47817a);
        SafeParcelWriter.m4576n(parcel, 2, this.f47818c);
        SafeParcelWriter.m4570h(parcel, 3, this.f47819d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
