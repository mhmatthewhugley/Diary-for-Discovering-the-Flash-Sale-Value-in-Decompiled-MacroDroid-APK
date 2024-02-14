package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f39166a = 1;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f39167c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final byte[] f39168d;

    @SafeParcelable.Constructor
    zzaf(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param byte[] bArr) {
        this.f39167c = (String) Preconditions.m4488k(str);
        this.f39168d = (byte[]) Preconditions.m4488k(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f39166a);
        SafeParcelWriter.m4586x(parcel, 2, this.f39167c, false);
        SafeParcelWriter.m4569g(parcel, 3, this.f39168d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
