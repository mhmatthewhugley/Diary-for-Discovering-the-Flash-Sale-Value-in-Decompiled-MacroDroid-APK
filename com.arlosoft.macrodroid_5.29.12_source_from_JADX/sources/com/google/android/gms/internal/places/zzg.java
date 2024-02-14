package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzf();

    /* renamed from: c */
    private static final zzg f45452c = new zzg("Home");

    /* renamed from: d */
    private static final zzg f45453d = new zzg("Work");
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f45454a;

    @SafeParcelable.Constructor
    zzg(@SafeParcelable.Param String str) {
        this.f45454a = str;
    }

    @ShowFirstParty
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        return Objects.m4470a(this.f45454a, ((zzg) obj).f45454a);
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.m4471b(this.f45454a);
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("alias", this.f45454a).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f45454a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
