package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a */
    private int f47490a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f47491c;
    @SafeParcelable.Field

    /* renamed from: d */
    private int f47492d;
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f47493f;

    private zzs() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzs = (zzs) obj;
            return Objects.m4470a(Integer.valueOf(this.f47490a), Integer.valueOf(zzs.f47490a)) && Objects.m4470a(Integer.valueOf(this.f47491c), Integer.valueOf(zzs.f47491c)) && Objects.m4470a(Integer.valueOf(this.f47492d), Integer.valueOf(zzs.f47492d)) && Objects.m4470a(Boolean.valueOf(this.f47493f), Boolean.valueOf(zzs.f47493f));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47490a), Integer.valueOf(this.f47491c), Integer.valueOf(this.f47492d), Boolean.valueOf(this.f47493f));
    }

    public final String toString() {
        int i = this.f47490a;
        int i2 = this.f47491c;
        int i3 = this.f47492d;
        boolean z = this.f47493f;
        return "UwbRangingData{rawDistance=" + i + ", rawAngleOfArrivalAzimuth=" + i2 + ", rawAngleOfArrivalPolar=" + i3 + ", isValidAngleOfArrivalData=" + z + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47490a);
        SafeParcelWriter.m4576n(parcel, 2, this.f47491c);
        SafeParcelWriter.m4576n(parcel, 3, this.f47492d);
        SafeParcelWriter.m4565c(parcel, 4, this.f47493f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param boolean z) {
        this.f47490a = i;
        this.f47491c = i2;
        this.f47492d = i3;
        this.f47493f = z;
    }
}
