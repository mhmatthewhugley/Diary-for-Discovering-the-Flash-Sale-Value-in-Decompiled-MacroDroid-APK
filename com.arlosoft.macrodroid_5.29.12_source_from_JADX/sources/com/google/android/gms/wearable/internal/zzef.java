package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48271a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final ConnectionConfiguration[] f48272c;

    @SafeParcelable.Constructor
    public zzef(@SafeParcelable.Param int i, @SafeParcelable.Param ConnectionConfiguration[] connectionConfigurationArr) {
        this.f48271a = i;
        this.f48272c = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48271a);
        SafeParcelWriter.m4557A(parcel, 3, this.f48272c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
