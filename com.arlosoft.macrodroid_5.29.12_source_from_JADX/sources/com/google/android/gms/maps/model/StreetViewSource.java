package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzq();

    /* renamed from: c */
    private static final String f46331c = StreetViewSource.class.getSimpleName();

    /* renamed from: d */
    public static final StreetViewSource f46332d = new StreetViewSource(0);

    /* renamed from: f */
    public static final StreetViewSource f46333f = new StreetViewSource(1);
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f46334a;

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param int i) {
        this.f46334a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f46334a == ((StreetViewSource) obj).f46334a;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f46334a));
    }

    public final String toString() {
        String str;
        int i = this.f46334a;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f46334a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
