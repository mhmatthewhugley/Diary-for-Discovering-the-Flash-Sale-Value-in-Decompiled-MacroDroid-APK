package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
public class ProxyRequest extends AbstractSafeParcelable {

    /* renamed from: A */
    public static final int f2836A = 3;

    /* renamed from: B */
    public static final int f2837B = 4;

    /* renamed from: C */
    public static final int f2838C = 5;
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();

    /* renamed from: D */
    public static final int f2839D = 6;

    /* renamed from: E */
    public static final int f2840E = 7;

    /* renamed from: F */
    public static final int f2841F = 7;

    /* renamed from: p */
    public static final int f2842p = 0;

    /* renamed from: s */
    public static final int f2843s = 1;

    /* renamed from: z */
    public static final int f2844z = 2;
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2845a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f2846c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f2847d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final long f2848f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final byte[] f2849g;
    @SafeParcelable.Field

    /* renamed from: o */
    private Bundle f2850o;

    @KeepForSdkWithMembers
    public static class Builder {
    }

    @SafeParcelable.Constructor
    ProxyRequest(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param int i2, @SafeParcelable.Param long j, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param Bundle bundle) {
        this.f2845a = i;
        this.f2846c = str;
        this.f2847d = i2;
        this.f2848f = j;
        this.f2849g = bArr;
        this.f2850o = bundle;
    }

    public String toString() {
        String str = this.f2846c;
        int i = this.f2847d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f2846c, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f2847d);
        SafeParcelWriter.m4581s(parcel, 3, this.f2848f);
        SafeParcelWriter.m4569g(parcel, 4, this.f2849g, false);
        SafeParcelWriter.m4567e(parcel, 5, this.f2850o, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f2845a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
