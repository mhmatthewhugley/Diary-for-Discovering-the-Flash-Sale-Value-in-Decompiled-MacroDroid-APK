package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f46335a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f46336c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final byte[] f46337d;

    @SafeParcelable.Constructor
    public Tile(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param byte[] bArr) {
        this.f46335a = i;
        this.f46336c = i2;
        this.f46337d = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f46335a);
        SafeParcelWriter.m4576n(parcel, 3, this.f46336c);
        SafeParcelWriter.m4569g(parcel, 4, this.f46337d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
