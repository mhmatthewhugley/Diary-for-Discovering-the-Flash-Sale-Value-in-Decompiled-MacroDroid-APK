package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzer extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzer> CREATOR = new zzes();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48283a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f48284c;

    @SafeParcelable.Constructor
    public zzer(@SafeParcelable.Param int i, @SafeParcelable.Param String str) {
        this.f48283a = i;
        this.f48284c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48283a);
        SafeParcelWriter.m4586x(parcel, 3, this.f48284c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
