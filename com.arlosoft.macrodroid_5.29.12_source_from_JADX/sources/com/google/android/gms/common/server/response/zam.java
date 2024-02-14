package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3902a;
    @SafeParcelable.Field

    /* renamed from: c */
    final String f3903c;
    @SafeParcelable.Field

    /* renamed from: d */
    final FastJsonResponse.Field f3904d;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param FastJsonResponse.Field field) {
        this.f3902a = i;
        this.f3903c = str;
        this.f3904d = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3902a);
        SafeParcelWriter.m4586x(parcel, 2, this.f3903c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f3904d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    zam(String str, FastJsonResponse.Field field) {
        this.f3902a = 1;
        this.f3903c = str;
        this.f3904d = field;
    }
}
