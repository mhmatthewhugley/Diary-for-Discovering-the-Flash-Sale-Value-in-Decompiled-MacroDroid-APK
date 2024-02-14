package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzav();
    @SafeParcelable.Field

    /* renamed from: a */
    final int f45994a;
    @SafeParcelable.Field

    /* renamed from: c */
    final int f45995c;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f45994a = i;
        this.f45995c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzb = (zzb) obj;
        return Objects.m4470a(Integer.valueOf(this.f45994a), Integer.valueOf(zzb.f45994a)) && Objects.m4470a(Integer.valueOf(this.f45995c), Integer.valueOf(zzb.f45995c));
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45994a), Integer.valueOf(this.f45995c));
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a(TypedValues.Cycle.S_WAVE_OFFSET, Integer.valueOf(this.f45994a)).mo21720a("length", Integer.valueOf(this.f45995c)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45994a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45995c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
