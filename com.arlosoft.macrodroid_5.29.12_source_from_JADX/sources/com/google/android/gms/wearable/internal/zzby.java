package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzby extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new zzbz();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48194a;

    @SafeParcelable.Constructor
    public zzby(@SafeParcelable.Param int i) {
        this.f48194a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48194a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
