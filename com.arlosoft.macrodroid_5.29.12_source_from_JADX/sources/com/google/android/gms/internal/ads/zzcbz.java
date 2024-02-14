package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbz> CREATOR = new zzcca();
    @SafeParcelable.Field

    /* renamed from: a */
    public final zzl f28202a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f28203c;

    @SafeParcelable.Constructor
    public zzcbz(@SafeParcelable.Param zzl zzl, @SafeParcelable.Param String str) {
        this.f28202a = zzl;
        this.f28203c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f28202a, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f28203c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
