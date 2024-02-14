package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzej> CREATOR = new zzek();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48275a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzdi f48276c;

    @SafeParcelable.Constructor
    public zzej(@SafeParcelable.Param int i, @SafeParcelable.Param zzdi zzdi) {
        this.f48275a = i;
        this.f48276c = zzdi;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48275a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48276c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
