package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    @SafeParcelable.Field

    /* renamed from: a */
    public final long f41306a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final long f41307c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final boolean f41308d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final String f41309f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public final String f41310g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final String f41311o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final Bundle f41312p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    public final String f41313s;

    @SafeParcelable.Constructor
    public zzcl(@SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable Bundle bundle, @SafeParcelable.Param @Nullable String str4) {
        this.f41306a = j;
        this.f41307c = j2;
        this.f41308d = z;
        this.f41309f = str;
        this.f41310g = str2;
        this.f41311o = str3;
        this.f41312p = bundle;
        this.f41313s = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, this.f41306a);
        SafeParcelWriter.m4581s(parcel, 2, this.f41307c);
        SafeParcelWriter.m4565c(parcel, 3, this.f41308d);
        SafeParcelWriter.m4586x(parcel, 4, this.f41309f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f41310g, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f41311o, false);
        SafeParcelWriter.m4567e(parcel, 7, this.f41312p, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f41313s, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
