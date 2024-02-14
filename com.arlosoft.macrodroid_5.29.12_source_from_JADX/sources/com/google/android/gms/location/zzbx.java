package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f46097a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f46098c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f46099d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f46100f;

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4) {
        boolean z = true;
        Preconditions.m4494q(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        Preconditions.m4494q(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.m4494q(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        Preconditions.m4494q(i4 >= 0 && i4 <= 59, "End minute must be in range [0, 59].");
        Preconditions.m4494q(((i + i2) + i3) + i4 <= 0 ? false : z, "Parameters can't be all 0.");
        this.f46097a = i;
        this.f46098c = i2;
        this.f46099d = i3;
        this.f46100f = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbx = (zzbx) obj;
        return this.f46097a == zzbx.f46097a && this.f46098c == zzbx.f46098c && this.f46099d == zzbx.f46099d && this.f46100f == zzbx.f46100f;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f46097a), Integer.valueOf(this.f46098c), Integer.valueOf(this.f46099d), Integer.valueOf(this.f46100f));
    }

    public final String toString() {
        int i = this.f46097a;
        int i2 = this.f46098c;
        int i3 = this.f46099d;
        int i4 = this.f46100f;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f46097a);
        SafeParcelWriter.m4576n(parcel, 2, this.f46098c);
        SafeParcelWriter.m4576n(parcel, 3, this.f46099d);
        SafeParcelWriter.m4576n(parcel, 4, this.f46100f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
