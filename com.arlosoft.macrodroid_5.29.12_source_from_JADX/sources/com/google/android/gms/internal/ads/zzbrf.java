package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbrf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrf> CREATOR = new zzbrg();
    @SafeParcelable.Field

    /* renamed from: a */
    public final boolean f27674a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f27675c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f27676d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final byte[] f27677f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String[] f27678g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final String[] f27679o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final boolean f27680p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final long f27681s;

    @SafeParcelable.Constructor
    zzbrf(@SafeParcelable.Param boolean z, @SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param String[] strArr2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param long j) {
        this.f27674a = z;
        this.f27675c = str;
        this.f27676d = i;
        this.f27677f = bArr;
        this.f27678g = strArr;
        this.f27679o = strArr2;
        this.f27680p = z2;
        this.f27681s = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f27674a);
        SafeParcelWriter.m4586x(parcel, 2, this.f27675c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f27676d);
        SafeParcelWriter.m4569g(parcel, 4, this.f27677f, false);
        SafeParcelWriter.m4587y(parcel, 5, this.f27678g, false);
        SafeParcelWriter.m4587y(parcel, 6, this.f27679o, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f27680p);
        SafeParcelWriter.m4581s(parcel, 8, this.f27681s);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
