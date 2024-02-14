package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcf> CREATOR = new zzcg();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f48202a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f48203c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f48204d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f48205f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final boolean f48206g;

    @SafeParcelable.Constructor
    public zzcf(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4) {
        this.f48202a = i;
        this.f48203c = z;
        this.f48204d = z2;
        this.f48205f = z3;
        this.f48206g = z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f48202a);
        SafeParcelWriter.m4565c(parcel, 2, this.f48203c);
        SafeParcelWriter.m4565c(parcel, 3, this.f48204d);
        SafeParcelWriter.m4565c(parcel, 4, this.f48205f);
        SafeParcelWriter.m4565c(parcel, 5, this.f48206g);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
