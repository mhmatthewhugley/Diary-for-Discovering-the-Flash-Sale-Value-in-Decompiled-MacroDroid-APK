package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzpq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpq> CREATOR = new zzpr();
    @SafeParcelable.Field

    /* renamed from: a */
    private zzrv f45005a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f45006c;

    private zzpq() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpq) {
            zzpq zzpq = (zzpq) obj;
            return Objects.m4470a(this.f45005a, zzpq.f45005a) && Objects.m4470a(Integer.valueOf(this.f45006c), Integer.valueOf(zzpq.f45006c));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45005a, Integer.valueOf(this.f45006c));
    }

    /* renamed from: l2 */
    public final zzrv mo53126l2() {
        return this.f45005a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f45005a, i, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f45006c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f45006c;
    }

    @SafeParcelable.Constructor
    zzpq(@SafeParcelable.Param zzrv zzrv, @SafeParcelable.Param int i) {
        this.f45005a = zzrv;
        this.f45006c = i;
    }
}
