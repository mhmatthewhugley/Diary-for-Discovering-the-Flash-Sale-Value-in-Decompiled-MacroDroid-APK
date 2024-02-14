package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdw> CREATOR = new zzdv();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48260a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f48261c;

    @SafeParcelable.Constructor
    public zzdw(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z) {
        this.f48260a = i;
        this.f48261c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48260a);
        SafeParcelWriter.m4565c(parcel, 3, this.f48261c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
