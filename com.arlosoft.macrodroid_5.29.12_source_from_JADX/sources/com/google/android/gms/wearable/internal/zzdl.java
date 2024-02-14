package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdl> CREATOR = new zzdm();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48250a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f48251c;

    @SafeParcelable.Constructor
    public zzdl(@SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f48250a = i;
        this.f48251c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48250a);
        SafeParcelWriter.m4576n(parcel, 3, this.f48251c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
