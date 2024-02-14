package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoc> CREATOR = new zzfod();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f36184a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final byte[] f36185c;

    @SafeParcelable.Constructor
    zzfoc(@SafeParcelable.Param int i, @SafeParcelable.Param byte[] bArr) {
        this.f36184a = i;
        this.f36185c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f36184a);
        SafeParcelWriter.m4569g(parcel, 2, this.f36185c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzfoc(byte[] bArr) {
        this(1, bArr);
    }
}
