package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f39164a = 1;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f39165c;

    @SafeParcelable.Constructor
    zzad(@SafeParcelable.Param int i, @SafeParcelable.Param String str) {
        this.f39165c = (String) Preconditions.m4488k(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f39164a);
        SafeParcelWriter.m4586x(parcel, 2, this.f39165c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
