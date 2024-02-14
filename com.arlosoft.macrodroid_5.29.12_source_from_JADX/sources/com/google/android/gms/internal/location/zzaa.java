package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    /* renamed from: c */
    public static final zzaa f41080c = new zzaa(Status.f3138p);
    @SafeParcelable.Field

    /* renamed from: a */
    private final Status f41081a;

    @SafeParcelable.Constructor
    public zzaa(@SafeParcelable.Param Status status) {
        this.f41081a = status;
    }

    public final Status getStatus() {
        return this.f41081a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f41081a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
