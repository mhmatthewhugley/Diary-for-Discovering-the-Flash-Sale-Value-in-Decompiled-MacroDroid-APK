package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47957a;
    @SafeParcelable.Field

    /* renamed from: c */
    final zat f47958c;

    @SafeParcelable.Constructor
    zai(@SafeParcelable.Param int i, @SafeParcelable.Param zat zat) {
        this.f47957a = i;
        this.f47958c = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47957a);
        SafeParcelWriter.m4584v(parcel, 2, this.f47958c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
