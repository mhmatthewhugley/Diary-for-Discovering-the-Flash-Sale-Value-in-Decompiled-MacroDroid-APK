package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzep extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzep> CREATOR = new zzeq();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48281a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzgm f48282c;

    @SafeParcelable.Constructor
    public zzep(@SafeParcelable.Param int i, @SafeParcelable.Param zzgm zzgm) {
        this.f48281a = i;
        this.f48282c = zzgm;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48281a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48282c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
