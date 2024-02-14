package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f45978a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45979c;

    @SafeParcelable.Constructor
    zzao(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f45978a = i;
        this.f45979c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45978a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45979c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
