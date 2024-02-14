package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbe();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: a */
    int f45827a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c */
    int f45828c;
    @SafeParcelable.Field

    /* renamed from: d */
    long f45829d;
    @SafeParcelable.Field

    /* renamed from: f */
    int f45830f;
    @SafeParcelable.Field

    /* renamed from: g */
    zzbo[] f45831g;

    @SafeParcelable.Constructor
    LocationAvailability(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param long j, @SafeParcelable.Param zzbo[] zzboArr) {
        this.f45830f = i;
        this.f45827a = i2;
        this.f45828c = i3;
        this.f45829d = j;
        this.f45831g = zzboArr;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f45827a == locationAvailability.f45827a && this.f45828c == locationAvailability.f45828c && this.f45829d == locationAvailability.f45829d && this.f45830f == locationAvailability.f45830f && Arrays.equals(this.f45831g, locationAvailability.f45831g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45830f), Integer.valueOf(this.f45827a), Integer.valueOf(this.f45828c), Long.valueOf(this.f45829d), this.f45831g);
    }

    /* renamed from: l2 */
    public boolean mo54177l2() {
        return this.f45830f < 1000;
    }

    @NonNull
    public String toString() {
        boolean l2 = mo54177l2();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(l2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45827a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45828c);
        SafeParcelWriter.m4581s(parcel, 3, this.f45829d);
        SafeParcelWriter.m4576n(parcel, 4, this.f45830f);
        SafeParcelWriter.m4557A(parcel, 5, this.f45831g, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
