package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgo> CREATOR = new zzgp();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48344a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzbq f48345c;

    @SafeParcelable.Constructor
    public zzgo(@SafeParcelable.Param int i, @SafeParcelable.Param zzbq zzbq) {
        this.f48344a = i;
        this.f48345c = zzbq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48344a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48345c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
