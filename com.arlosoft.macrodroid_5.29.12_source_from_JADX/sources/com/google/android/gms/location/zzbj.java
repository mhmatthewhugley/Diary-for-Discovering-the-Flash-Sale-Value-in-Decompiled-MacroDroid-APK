package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f46085a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f46086c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f46087d;

    @SafeParcelable.Constructor
    zzbj(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f46087d = str;
        this.f46085a = str2;
        this.f46086c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f46085a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f46086c, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f46087d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
