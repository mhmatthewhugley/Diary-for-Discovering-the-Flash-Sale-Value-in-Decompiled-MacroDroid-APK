package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a */
    public final boolean f2343a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f2344c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f2345d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f2346f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final float f2347g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final int f2348o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final boolean f2349p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final boolean f2350s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final boolean f2351z;

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z3, @SafeParcelable.Param float f, @SafeParcelable.Param int i, @SafeParcelable.Param boolean z4, @SafeParcelable.Param boolean z5, @SafeParcelable.Param boolean z6) {
        this.f2343a = z;
        this.f2344c = z2;
        this.f2345d = str;
        this.f2346f = z3;
        this.f2347g = f;
        this.f2348o = i;
        this.f2349p = z4;
        this.f2350s = z5;
        this.f2351z = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 2, this.f2343a);
        SafeParcelWriter.m4565c(parcel, 3, this.f2344c);
        SafeParcelWriter.m4586x(parcel, 4, this.f2345d, false);
        SafeParcelWriter.m4565c(parcel, 5, this.f2346f);
        SafeParcelWriter.m4573k(parcel, 6, this.f2347g);
        SafeParcelWriter.m4576n(parcel, 7, this.f2348o);
        SafeParcelWriter.m4565c(parcel, 8, this.f2349p);
        SafeParcelWriter.m4565c(parcel, 9, this.f2350s);
        SafeParcelWriter.m4565c(parcel, 10, this.f2351z);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzj(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, -1, z4, z5, z6);
    }
}
