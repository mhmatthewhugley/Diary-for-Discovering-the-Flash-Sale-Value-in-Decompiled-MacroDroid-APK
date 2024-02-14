package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsa> CREATOR = new zzbsb();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f27699a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final Bundle f27700c;

    @SafeParcelable.Constructor
    public zzbsa(@SafeParcelable.Param String str, @SafeParcelable.Param Bundle bundle) {
        this.f27699a = str;
        this.f27700c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f27699a, false);
        SafeParcelWriter.m4567e(parcel, 2, this.f27700c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
