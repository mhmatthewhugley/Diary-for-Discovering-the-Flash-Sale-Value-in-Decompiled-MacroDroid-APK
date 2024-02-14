package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzha extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzha> CREATOR = new zzhb();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48356a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f48357c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final byte[] f48358d;

    @SafeParcelable.Constructor
    public zzha(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param byte[] bArr) {
        this.f48356a = i;
        this.f48357c = i2;
        this.f48358d = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f48356a);
        SafeParcelWriter.m4576n(parcel, 2, this.f48357c);
        SafeParcelWriter.m4569g(parcel, 3, this.f48358d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
