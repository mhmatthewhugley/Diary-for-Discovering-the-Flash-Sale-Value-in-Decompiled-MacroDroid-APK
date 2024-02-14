package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f47915a;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param String str) {
        this.f47915a = str;
    }

    /* renamed from: c2 */
    public final String mo56074c2() {
        return this.f47915a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f47915a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
