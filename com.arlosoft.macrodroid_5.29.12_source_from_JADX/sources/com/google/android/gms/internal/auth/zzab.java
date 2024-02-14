package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f39161a = 1;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f39162c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f39163d;

    @SafeParcelable.Constructor
    zzab(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param int i2) {
        this.f39162c = (String) Preconditions.m4488k(str);
        this.f39163d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f39161a);
        SafeParcelWriter.m4586x(parcel, 2, this.f39162c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f39163d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
