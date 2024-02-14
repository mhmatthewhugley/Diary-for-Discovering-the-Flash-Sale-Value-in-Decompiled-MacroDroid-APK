package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.BleSignal;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zza extends AbstractSafeParcelable implements BleSignal {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47706a;
    @SafeParcelable.Field

    /* renamed from: c */
    final int f47707c;
    @SafeParcelable.Field

    /* renamed from: d */
    final int f47708d;

    @SafeParcelable.Constructor
    zza(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f47706a = i;
        this.f47707c = i2;
        this.f47708d = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    /* renamed from: A0 */
    public final int mo55868A0() {
        return this.f47707c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSignal)) {
            return false;
        }
        BleSignal bleSignal = (BleSignal) obj;
        return this.f47707c == bleSignal.mo55868A0() && this.f47708d == bleSignal.mo55869x0();
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47707c), Integer.valueOf(this.f47708d));
    }

    public final String toString() {
        int i = this.f47707c;
        int i2 = this.f47708d;
        return "BleSignal{rssi=" + i + ", txPower=" + i2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47706a);
        SafeParcelWriter.m4576n(parcel, 2, this.f47707c);
        SafeParcelWriter.m4576n(parcel, 3, this.f47708d);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* renamed from: x0 */
    public final int mo55869x0() {
        return this.f47708d;
    }
}
