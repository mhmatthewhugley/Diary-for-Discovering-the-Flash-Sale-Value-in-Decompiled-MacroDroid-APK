package com.google.android.gms.location;

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
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbp();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f46088a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f46089c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final long f46090d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final long f46091f;

    @SafeParcelable.Constructor
    zzbo(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param long j, @SafeParcelable.Param long j2) {
        this.f46088a = i;
        this.f46089c = i2;
        this.f46090d = j;
        this.f46091f = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzbo = (zzbo) obj;
            if (this.f46088a == zzbo.f46088a && this.f46089c == zzbo.f46089c && this.f46090d == zzbo.f46090d && this.f46091f == zzbo.f46091f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f46089c), Integer.valueOf(this.f46088a), Long.valueOf(this.f46091f), Long.valueOf(this.f46090d));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f46088a + " Cell status: " + this.f46089c + " elapsed time NS: " + this.f46091f + " system time ms: " + this.f46090d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f46088a);
        SafeParcelWriter.m4576n(parcel, 2, this.f46089c);
        SafeParcelWriter.m4581s(parcel, 3, this.f46090d);
        SafeParcelWriter.m4581s(parcel, 4, this.f46091f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
