package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbrq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrq> CREATOR = new zzbrr();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f27690a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f27691c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f27692d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f27693f;

    @SafeParcelable.Constructor
    public zzbrq(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i, @SafeParcelable.Param String str2) {
        this.f27690a = str;
        this.f27691c = z;
        this.f27692d = i;
        this.f27693f = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f27690a, false);
        SafeParcelWriter.m4565c(parcel, 2, this.f27691c);
        SafeParcelWriter.m4576n(parcel, 3, this.f27692d);
        SafeParcelWriter.m4586x(parcel, 4, this.f27693f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
