package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzed extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzed> CREATOR = new zzee();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48269a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final ConnectionConfiguration f48270c;

    @SafeParcelable.Constructor
    public zzed(@SafeParcelable.Param int i, @SafeParcelable.Param ConnectionConfiguration connectionConfiguration) {
        this.f48269a = i;
        this.f48270c = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48269a);
        SafeParcelWriter.m4584v(parcel, 3, this.f48270c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
