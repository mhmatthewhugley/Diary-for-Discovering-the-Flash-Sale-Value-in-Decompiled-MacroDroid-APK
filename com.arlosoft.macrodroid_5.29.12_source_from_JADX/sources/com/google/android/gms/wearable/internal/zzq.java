package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48441a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final List f48442c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final zziv f48443d;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param int i, @SafeParcelable.Param List list, @SafeParcelable.Param zziv zziv) {
        this.f48441a = i;
        this.f48442c = list;
        this.f48443d = zziv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f48441a);
        SafeParcelWriter.m4558B(parcel, 2, this.f48442c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f48443d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
