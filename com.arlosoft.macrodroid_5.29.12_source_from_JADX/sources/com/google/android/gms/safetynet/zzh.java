package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f47921a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f47922c;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z) {
        this.f47921a = i;
        this.f47922c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f47921a);
        SafeParcelWriter.m4565c(parcel, 3, this.f47922c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
