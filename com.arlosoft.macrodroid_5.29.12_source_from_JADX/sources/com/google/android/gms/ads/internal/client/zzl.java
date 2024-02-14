package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzcgq;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzn();
    @SafeParcelable.Field

    /* renamed from: A */
    public final zzfb f1982A;
    @SafeParcelable.Field

    /* renamed from: B */
    public final Location f1983B;
    @SafeParcelable.Field

    /* renamed from: C */
    public final String f1984C;
    @SafeParcelable.Field

    /* renamed from: D */
    public final Bundle f1985D;
    @SafeParcelable.Field

    /* renamed from: E */
    public final Bundle f1986E;
    @SafeParcelable.Field

    /* renamed from: F */
    public final List f1987F;
    @SafeParcelable.Field

    /* renamed from: G */
    public final String f1988G;
    @SafeParcelable.Field

    /* renamed from: H */
    public final String f1989H;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: I */
    public final boolean f1990I;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: J */
    public final zzc f1991J;
    @SafeParcelable.Field

    /* renamed from: K */
    public final int f1992K;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: L */
    public final String f1993L;
    @SafeParcelable.Field

    /* renamed from: M */
    public final List f1994M;
    @SafeParcelable.Field

    /* renamed from: N */
    public final int f1995N;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: O */
    public final String f1996O;
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f1997a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c */
    public final long f1998c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final Bundle f1999d;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: f */
    public final int f2000f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final List f2001g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final boolean f2002o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final int f2003p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final boolean f2004s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final String f2005z;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param int i, @SafeParcelable.Param long j, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param int i2, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i3, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str, @SafeParcelable.Param zzfb zzfb, @SafeParcelable.Param Location location, @SafeParcelable.Param String str2, @SafeParcelable.Param Bundle bundle2, @SafeParcelable.Param Bundle bundle3, @SafeParcelable.Param List list2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z3, @SafeParcelable.Param zzc zzc, @SafeParcelable.Param int i4, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param List list3, @SafeParcelable.Param int i5, @SafeParcelable.Param String str6) {
        this.f1997a = i;
        this.f1998c = j;
        this.f1999d = bundle == null ? new Bundle() : bundle;
        this.f2000f = i2;
        this.f2001g = list;
        this.f2002o = z;
        this.f2003p = i3;
        this.f2004s = z2;
        this.f2005z = str;
        this.f1982A = zzfb;
        this.f1983B = location;
        this.f1984C = str2;
        this.f1985D = bundle2 == null ? new Bundle() : bundle2;
        this.f1986E = bundle3;
        this.f1987F = list2;
        this.f1988G = str3;
        this.f1989H = str4;
        this.f1990I = z3;
        this.f1991J = zzc;
        this.f1992K = i4;
        this.f1993L = str5;
        this.f1994M = list3 == null ? new ArrayList() : list3;
        this.f1995N = i5;
        this.f1996O = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzl = (zzl) obj;
        if (this.f1997a != zzl.f1997a || this.f1998c != zzl.f1998c || !zzcgq.m45233a(this.f1999d, zzl.f1999d) || this.f2000f != zzl.f2000f || !Objects.m4470a(this.f2001g, zzl.f2001g) || this.f2002o != zzl.f2002o || this.f2003p != zzl.f2003p || this.f2004s != zzl.f2004s || !Objects.m4470a(this.f2005z, zzl.f2005z) || !Objects.m4470a(this.f1982A, zzl.f1982A) || !Objects.m4470a(this.f1983B, zzl.f1983B) || !Objects.m4470a(this.f1984C, zzl.f1984C) || !zzcgq.m45233a(this.f1985D, zzl.f1985D) || !zzcgq.m45233a(this.f1986E, zzl.f1986E) || !Objects.m4470a(this.f1987F, zzl.f1987F) || !Objects.m4470a(this.f1988G, zzl.f1988G) || !Objects.m4470a(this.f1989H, zzl.f1989H) || this.f1990I != zzl.f1990I || this.f1992K != zzl.f1992K || !Objects.m4470a(this.f1993L, zzl.f1993L) || !Objects.m4470a(this.f1994M, zzl.f1994M) || this.f1995N != zzl.f1995N || !Objects.m4470a(this.f1996O, zzl.f1996O)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f1997a), Long.valueOf(this.f1998c), this.f1999d, Integer.valueOf(this.f2000f), this.f2001g, Boolean.valueOf(this.f2002o), Integer.valueOf(this.f2003p), Boolean.valueOf(this.f2004s), this.f2005z, this.f1982A, this.f1983B, this.f1984C, this.f1985D, this.f1986E, this.f1987F, this.f1988G, this.f1989H, Boolean.valueOf(this.f1990I), Integer.valueOf(this.f1992K), this.f1993L, this.f1994M, Integer.valueOf(this.f1995N), this.f1996O);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f1997a);
        SafeParcelWriter.m4581s(parcel, 2, this.f1998c);
        SafeParcelWriter.m4567e(parcel, 3, this.f1999d, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f2000f);
        SafeParcelWriter.m4588z(parcel, 5, this.f2001g, false);
        SafeParcelWriter.m4565c(parcel, 6, this.f2002o);
        SafeParcelWriter.m4576n(parcel, 7, this.f2003p);
        SafeParcelWriter.m4565c(parcel, 8, this.f2004s);
        SafeParcelWriter.m4586x(parcel, 9, this.f2005z, false);
        SafeParcelWriter.m4584v(parcel, 10, this.f1982A, i, false);
        SafeParcelWriter.m4584v(parcel, 11, this.f1983B, i, false);
        SafeParcelWriter.m4586x(parcel, 12, this.f1984C, false);
        SafeParcelWriter.m4567e(parcel, 13, this.f1985D, false);
        SafeParcelWriter.m4567e(parcel, 14, this.f1986E, false);
        SafeParcelWriter.m4588z(parcel, 15, this.f1987F, false);
        SafeParcelWriter.m4586x(parcel, 16, this.f1988G, false);
        SafeParcelWriter.m4586x(parcel, 17, this.f1989H, false);
        SafeParcelWriter.m4565c(parcel, 18, this.f1990I);
        SafeParcelWriter.m4584v(parcel, 19, this.f1991J, i, false);
        SafeParcelWriter.m4576n(parcel, 20, this.f1992K);
        SafeParcelWriter.m4586x(parcel, 21, this.f1993L, false);
        SafeParcelWriter.m4588z(parcel, 22, this.f1994M, false);
        SafeParcelWriter.m4576n(parcel, 23, this.f1995N);
        SafeParcelWriter.m4586x(parcel, 24, this.f1996O, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
