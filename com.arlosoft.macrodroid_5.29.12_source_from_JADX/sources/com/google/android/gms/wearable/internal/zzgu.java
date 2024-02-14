package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgu> CREATOR = new zzgv();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48351a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzdi f48352c;

    @SafeParcelable.Constructor
    public zzgu(@SafeParcelable.Param int i, @SafeParcelable.Param zzdi zzdi) {
        this.f48351a = i;
        this.f48352c = zzdi;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48351a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48352c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
