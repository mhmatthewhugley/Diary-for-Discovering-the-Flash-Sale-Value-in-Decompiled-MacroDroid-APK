package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccz> CREATOR = new zzcda();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f28217a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f28218c;

    @SafeParcelable.Constructor
    public zzccz(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f28217a = str;
        this.f28218c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f28217a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f28218c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
