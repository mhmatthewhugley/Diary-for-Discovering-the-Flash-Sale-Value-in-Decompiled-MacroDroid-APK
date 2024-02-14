package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f45456a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f45457c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final List<zzg> f45458d;

    @SafeParcelable.Constructor
    zzi(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param List<zzg> list) {
        this.f45456a = str;
        this.f45457c = str2;
        this.f45458d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zzi = (zzi) obj;
        return this.f45456a.equals(zzi.f45456a) && this.f45457c.equals(zzi.f45457c) && this.f45458d.equals(zzi.f45458d);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45456a, this.f45457c, this.f45458d);
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("accountName", this.f45456a).mo21720a("placeId", this.f45457c).mo21720a("placeAliases", this.f45458d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f45456a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f45457c, false);
        SafeParcelWriter.m4558B(parcel, 6, this.f45458d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
