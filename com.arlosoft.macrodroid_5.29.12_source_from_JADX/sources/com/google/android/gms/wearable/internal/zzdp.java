package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdp> CREATOR = new zzdq();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48254a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzao f48255c;

    @SafeParcelable.Constructor
    public zzdp(@SafeParcelable.Param int i, @SafeParcelable.Param zzao zzao) {
        this.f48254a = i;
        this.f48255c = zzao;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48254a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48255c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
