package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f2038a;
    @SafeParcelable.Field

    /* renamed from: c */
    public long f2039c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public zze f2040d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final Bundle f2041f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f2042g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final String f2043o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final String f2044p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final String f2045s;

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param String str, @SafeParcelable.Param long j, @SafeParcelable.Param @Nullable zze zze, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5) {
        this.f2038a = str;
        this.f2039c = j;
        this.f2040d = zze;
        this.f2041f = bundle;
        this.f2042g = str2;
        this.f2043o = str3;
        this.f2044p = str4;
        this.f2045s = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f2038a, false);
        SafeParcelWriter.m4581s(parcel, 2, this.f2039c);
        SafeParcelWriter.m4584v(parcel, 3, this.f2040d, i, false);
        SafeParcelWriter.m4567e(parcel, 4, this.f2041f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f2042g, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f2043o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f2044p, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f2045s, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
