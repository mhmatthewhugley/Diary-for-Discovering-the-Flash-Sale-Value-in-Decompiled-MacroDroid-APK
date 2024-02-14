package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsc> CREATOR = new zzbsd();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f27701a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f27702c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f27703d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final int f27704f;

    @SafeParcelable.Constructor
    public zzbsc(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param int i3) {
        this.f27701a = i;
        this.f27702c = i2;
        this.f27703d = str;
        this.f27704f = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f27702c);
        SafeParcelWriter.m4586x(parcel, 2, this.f27703d, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f27704f);
        SafeParcelWriter.m4576n(parcel, 1000, this.f27701a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
