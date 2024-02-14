package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f45919a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f45920c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f45921d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f45922f;

    @SafeParcelable.Constructor
    PlaceReport(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f45919a = i;
        this.f45920c = str;
        this.f45921d = str2;
        this.f45922f = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.m4470a(this.f45920c, placeReport.f45920c) && Objects.m4470a(this.f45921d, placeReport.f45921d) && Objects.m4470a(this.f45922f, placeReport.f45922f);
    }

    public int hashCode() {
        return Objects.m4471b(this.f45920c, this.f45921d, this.f45922f);
    }

    /* renamed from: l2 */
    public String mo54256l2() {
        return this.f45920c;
    }

    /* renamed from: m2 */
    public String mo54257m2() {
        return this.f45921d;
    }

    public String toString() {
        Objects.ToStringHelper c = Objects.m4472c(this);
        c.mo21720a("placeId", this.f45920c);
        c.mo21720a("tag", this.f45921d);
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(this.f45922f)) {
            c.mo21720a("source", this.f45922f);
        }
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45919a);
        SafeParcelWriter.m4586x(parcel, 2, mo54256l2(), false);
        SafeParcelWriter.m4586x(parcel, 3, mo54257m2(), false);
        SafeParcelWriter.m4586x(parcel, 4, this.f45922f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
