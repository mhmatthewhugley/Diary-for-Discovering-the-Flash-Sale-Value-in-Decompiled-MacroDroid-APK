package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzea extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzea> CREATOR = new zzdz();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48265a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f48266c;

    @SafeParcelable.Constructor
    public zzea(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z) {
        this.f48265a = i;
        this.f48266c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48265a);
        SafeParcelWriter.m4565c(parcel, 3, this.f48266c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
