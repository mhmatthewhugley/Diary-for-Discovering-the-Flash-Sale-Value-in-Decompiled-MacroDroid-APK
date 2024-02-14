package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR = new zzec();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48267a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f48268c;

    @SafeParcelable.Constructor
    public zzeb(@SafeParcelable.Param int i, @SafeParcelable.Param String str) {
        this.f48267a = i;
        this.f48268c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48267a);
        SafeParcelWriter.m4586x(parcel, 3, this.f48268c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
