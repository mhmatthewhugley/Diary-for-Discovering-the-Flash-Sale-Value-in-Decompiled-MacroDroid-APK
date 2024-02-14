package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzhg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhg> CREATOR = new zzhh();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48363a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final long f48364c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final List f48365d;

    @SafeParcelable.Constructor
    public zzhg(@SafeParcelable.Param int i, @SafeParcelable.Param long j, @SafeParcelable.Param List list) {
        this.f48363a = i;
        this.f48364c = j;
        this.f48365d = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48363a);
        SafeParcelWriter.m4581s(parcel, 3, this.f48364c);
        SafeParcelWriter.m4558B(parcel, 4, this.f48365d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
