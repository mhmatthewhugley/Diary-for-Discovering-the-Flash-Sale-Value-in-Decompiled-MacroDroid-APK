package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f3658a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f3659c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f3660d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final long f3661f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final long f3662g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f3663o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f3664p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final int f3665s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final int f3666z;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3658a);
        SafeParcelWriter.m4576n(parcel, 2, this.f3659c);
        SafeParcelWriter.m4576n(parcel, 3, this.f3660d);
        SafeParcelWriter.m4581s(parcel, 4, this.f3661f);
        SafeParcelWriter.m4581s(parcel, 5, this.f3662g);
        SafeParcelWriter.m4586x(parcel, 6, this.f3663o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f3664p, false);
        SafeParcelWriter.m4576n(parcel, 8, this.f3665s);
        SafeParcelWriter.m4576n(parcel, 9, this.f3666z);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param int i4, @SafeParcelable.Param int i5) {
        this.f3658a = i;
        this.f3659c = i2;
        this.f3660d = i3;
        this.f3661f = j;
        this.f3662g = j2;
        this.f3663o = str;
        this.f3664p = str2;
        this.f3665s = i4;
        this.f3666z = i5;
    }
}
