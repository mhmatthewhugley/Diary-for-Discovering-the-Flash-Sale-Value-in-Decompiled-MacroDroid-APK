package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoo> CREATOR = new zzfop();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f36206a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f36207c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f36208d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f36209f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f36210g;

    @SafeParcelable.Constructor
    zzfoo(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f36206a = i;
        this.f36207c = i2;
        this.f36208d = str;
        this.f36209f = str2;
        this.f36210g = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f36206a);
        SafeParcelWriter.m4576n(parcel, 2, this.f36207c);
        SafeParcelWriter.m4586x(parcel, 3, this.f36208d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f36209f, false);
        SafeParcelWriter.m4576n(parcel, 5, this.f36210g);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzfoo(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
