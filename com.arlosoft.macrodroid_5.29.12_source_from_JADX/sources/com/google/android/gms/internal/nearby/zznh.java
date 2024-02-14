package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznh> CREATOR = new zzni();

    /* renamed from: f */
    public static final zznh f44962f = new zznh(1, "", (String) null);
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f44963a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f44964c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f44965d;

    @SafeParcelable.Constructor
    zznh(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        this.f44963a = ((Integer) Preconditions.m4488k(Integer.valueOf(i))).intValue();
        this.f44964c = str == null ? "" : str;
        this.f44965d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznh = (zznh) obj;
        return Objects.m4470a(this.f44964c, zznh.f44964c) && Objects.m4470a(this.f44965d, zznh.f44965d);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44964c, this.f44965d);
    }

    public final String toString() {
        String str = this.f44964c;
        String str2 = this.f44965d;
        return "NearbyDevice{handle=" + str + ", bluetoothAddress=" + str2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 3, this.f44964c, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f44965d, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f44963a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
