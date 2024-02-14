package com.google.android.gms.internal.icing;

import android.accounts.Account;
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
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    final zzk[] f41019a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f41020c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f41021d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final Account f41022f;

    @SafeParcelable.Constructor
    zzg(@SafeParcelable.Param @Nullable zzk[] zzkArr, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param Account account) {
        this.f41019a = zzkArr;
        this.f41020c = str;
        this.f41021d = z;
        this.f41022f = account;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzg) {
            zzg zzg = (zzg) obj;
            if (!Objects.m4470a(this.f41020c, zzg.f41020c) || !Objects.m4470a(Boolean.valueOf(this.f41021d), Boolean.valueOf(zzg.f41021d)) || !Objects.m4470a(this.f41022f, zzg.f41022f) || !Arrays.equals(this.f41019a, zzg.f41019a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f41020c, Boolean.valueOf(this.f41021d), this.f41022f, Integer.valueOf(Arrays.hashCode(this.f41019a)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4557A(parcel, 1, this.f41019a, i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f41020c, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f41021d);
        SafeParcelWriter.m4584v(parcel, 4, this.f41022f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
