package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3858a;
    @SafeParcelable.Field

    /* renamed from: c */
    final String f3859c;
    @SafeParcelable.Field

    /* renamed from: d */
    final int f3860d;

    @SafeParcelable.Constructor
    zac(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param int i2) {
        this.f3858a = i;
        this.f3859c = str;
        this.f3860d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3858a);
        SafeParcelWriter.m4586x(parcel, 2, this.f3859c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f3860d);
        SafeParcelWriter.m4564b(parcel, a);
    }

    zac(String str, int i) {
        this.f3858a = 1;
        this.f3859c = str;
        this.f3860d = i;
    }
}
