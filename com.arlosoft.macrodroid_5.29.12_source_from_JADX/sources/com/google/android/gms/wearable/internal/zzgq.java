package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgq> CREATOR = new zzgr();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f48346a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f48347c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final long f48348d;

    @SafeParcelable.Constructor
    public zzgq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param long j) {
        this.f48346a = str;
        this.f48347c = str2;
        this.f48348d = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f48346a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f48347c, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f48348d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
