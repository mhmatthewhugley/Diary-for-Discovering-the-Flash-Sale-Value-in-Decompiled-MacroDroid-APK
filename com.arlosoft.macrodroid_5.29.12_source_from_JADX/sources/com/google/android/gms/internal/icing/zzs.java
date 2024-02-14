package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f41046a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f41047c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f41048d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final int f41049f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final boolean f41050g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final String f41051o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final zzm[] f41052p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    public final String f41053s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final zzu f41054z;

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param zzm[] zzmArr, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param zzu zzu) {
        this.f41046a = str;
        this.f41047c = str2;
        this.f41048d = z;
        this.f41049f = i;
        this.f41050g = z2;
        this.f41051o = str3;
        this.f41052p = zzmArr;
        this.f41053s = str4;
        this.f41054z = zzu;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        return this.f41048d == zzs.f41048d && this.f41049f == zzs.f41049f && this.f41050g == zzs.f41050g && Objects.m4470a(this.f41046a, zzs.f41046a) && Objects.m4470a(this.f41047c, zzs.f41047c) && Objects.m4470a(this.f41051o, zzs.f41051o) && Objects.m4470a(this.f41053s, zzs.f41053s) && Objects.m4470a(this.f41054z, zzs.f41054z) && Arrays.equals(this.f41052p, zzs.f41052p);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f41046a, this.f41047c, Boolean.valueOf(this.f41048d), Integer.valueOf(this.f41049f), Boolean.valueOf(this.f41050g), this.f41051o, Integer.valueOf(Arrays.hashCode(this.f41052p)), this.f41053s, this.f41054z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f41046a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f41047c, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f41048d);
        SafeParcelWriter.m4576n(parcel, 4, this.f41049f);
        SafeParcelWriter.m4565c(parcel, 5, this.f41050g);
        SafeParcelWriter.m4586x(parcel, 6, this.f41051o, false);
        SafeParcelWriter.m4557A(parcel, 7, this.f41052p, i, false);
        SafeParcelWriter.m4586x(parcel, 11, this.f41053s, false);
        SafeParcelWriter.m4584v(parcel, 12, this.f41054z, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
