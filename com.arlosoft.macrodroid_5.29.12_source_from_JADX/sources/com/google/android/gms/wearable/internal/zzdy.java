package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new zzdx();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48262a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f48263c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f48264d;

    @SafeParcelable.Constructor
    public zzdy(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f48262a = i;
        this.f48263c = z;
        this.f48264d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48262a);
        SafeParcelWriter.m4565c(parcel, 3, this.f48263c);
        SafeParcelWriter.m4565c(parcel, 4, this.f48264d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
