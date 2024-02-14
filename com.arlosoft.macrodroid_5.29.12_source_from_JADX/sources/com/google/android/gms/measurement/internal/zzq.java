package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: A */
    public final long f47311A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    public final String f47312B;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: C */
    public final long f47313C;
    @SafeParcelable.Field

    /* renamed from: D */
    public final long f47314D;
    @SafeParcelable.Field

    /* renamed from: E */
    public final int f47315E;
    @SafeParcelable.Field

    /* renamed from: F */
    public final boolean f47316F;
    @SafeParcelable.Field

    /* renamed from: G */
    public final boolean f47317G;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: H */
    public final String f47318H;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: I */
    public final Boolean f47319I;
    @SafeParcelable.Field

    /* renamed from: J */
    public final long f47320J;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: K */
    public final List f47321K;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: L */
    public final String f47322L;
    @SafeParcelable.Field

    /* renamed from: M */
    public final String f47323M;
    @SafeParcelable.Field

    /* renamed from: N */
    public final String f47324N;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: O */
    public final String f47325O;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public final String f47326a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final String f47327c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public final String f47328d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final String f47329f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final long f47330g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final long f47331o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final String f47332p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final boolean f47333s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final boolean f47334z;

    zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List list, @Nullable String str8, String str9, String str10, @Nullable String str11) {
        Preconditions.m4484g(str);
        this.f47326a = str;
        this.f47327c = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f47328d = str3;
        this.f47311A = j;
        this.f47329f = str4;
        this.f47330g = j2;
        this.f47331o = j3;
        this.f47332p = str5;
        this.f47333s = z;
        this.f47334z = z2;
        this.f47312B = str6;
        this.f47313C = 0;
        this.f47314D = j5;
        this.f47315E = i;
        this.f47316F = z3;
        this.f47317G = z4;
        this.f47318H = str7;
        this.f47319I = bool;
        this.f47320J = j6;
        this.f47321K = list;
        this.f47322L = null;
        this.f47323M = str9;
        this.f47324N = str10;
        this.f47325O = str11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f47326a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f47327c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f47328d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f47329f, false);
        SafeParcelWriter.m4581s(parcel, 6, this.f47330g);
        SafeParcelWriter.m4581s(parcel, 7, this.f47331o);
        SafeParcelWriter.m4586x(parcel, 8, this.f47332p, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f47333s);
        SafeParcelWriter.m4565c(parcel, 10, this.f47334z);
        SafeParcelWriter.m4581s(parcel, 11, this.f47311A);
        SafeParcelWriter.m4586x(parcel, 12, this.f47312B, false);
        SafeParcelWriter.m4581s(parcel, 13, this.f47313C);
        SafeParcelWriter.m4581s(parcel, 14, this.f47314D);
        SafeParcelWriter.m4576n(parcel, 15, this.f47315E);
        SafeParcelWriter.m4565c(parcel, 16, this.f47316F);
        SafeParcelWriter.m4565c(parcel, 18, this.f47317G);
        SafeParcelWriter.m4586x(parcel, 19, this.f47318H, false);
        SafeParcelWriter.m4566d(parcel, 21, this.f47319I, false);
        SafeParcelWriter.m4581s(parcel, 22, this.f47320J);
        SafeParcelWriter.m4588z(parcel, 23, this.f47321K, false);
        SafeParcelWriter.m4586x(parcel, 24, this.f47322L, false);
        SafeParcelWriter.m4586x(parcel, 25, this.f47323M, false);
        SafeParcelWriter.m4586x(parcel, 26, this.f47324N, false);
        SafeParcelWriter.m4586x(parcel, 27, this.f47325O, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param long j3, @SafeParcelable.Param @Nullable String str6, @SafeParcelable.Param long j4, @SafeParcelable.Param long j5, @SafeParcelable.Param int i, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param @Nullable String str7, @SafeParcelable.Param @Nullable Boolean bool, @SafeParcelable.Param long j6, @SafeParcelable.Param @Nullable List list, @SafeParcelable.Param @Nullable String str8, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param String str11) {
        this.f47326a = str;
        this.f47327c = str2;
        this.f47328d = str3;
        this.f47311A = j3;
        this.f47329f = str4;
        this.f47330g = j;
        this.f47331o = j2;
        this.f47332p = str5;
        this.f47333s = z;
        this.f47334z = z2;
        this.f47312B = str6;
        this.f47313C = j4;
        this.f47314D = j5;
        this.f47315E = i;
        this.f47316F = z3;
        this.f47317G = z4;
        this.f47318H = str7;
        this.f47319I = bool;
        this.f47320J = j6;
        this.f47321K = list;
        this.f47322L = str8;
        this.f47323M = str9;
        this.f47324N = str10;
        this.f47325O = str11;
    }
}
