package com.google.android.gms.internal.p204firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzr> CREATOR = new zzzs();
    @SafeParcelable.Field

    /* renamed from: A */
    private long f40728A;
    @SafeParcelable.Field

    /* renamed from: B */
    private boolean f40729B;
    @SafeParcelable.Field

    /* renamed from: C */
    private zze f40730C;
    @SafeParcelable.Field

    /* renamed from: D */
    private List f40731D;
    @SafeParcelable.Field

    /* renamed from: a */
    private String f40732a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f40733c;
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f40734d;
    @SafeParcelable.Field

    /* renamed from: f */
    private String f40735f;
    @SafeParcelable.Field

    /* renamed from: g */
    private String f40736g;
    @SafeParcelable.Field

    /* renamed from: o */
    private zzaag f40737o;
    @SafeParcelable.Field

    /* renamed from: p */
    private String f40738p;
    @SafeParcelable.Field

    /* renamed from: s */
    private String f40739s;
    @SafeParcelable.Field

    /* renamed from: z */
    private long f40740z;

    public zzzr() {
        this.f40737o = new zzaag();
    }

    @NonNull
    /* renamed from: A2 */
    public final List mo50112A2() {
        return this.f40731D;
    }

    @NonNull
    /* renamed from: B2 */
    public final List mo50113B2() {
        return this.f40737o.mo48751n2();
    }

    /* renamed from: C2 */
    public final boolean mo50114C2() {
        return this.f40734d;
    }

    /* renamed from: D2 */
    public final boolean mo50115D2() {
        return this.f40729B;
    }

    /* renamed from: l2 */
    public final long mo50116l2() {
        return this.f40740z;
    }

    @Nullable
    /* renamed from: m2 */
    public final Uri mo50117m2() {
        if (!TextUtils.isEmpty(this.f40736g)) {
            return Uri.parse(this.f40736g);
        }
        return null;
    }

    @Nullable
    /* renamed from: n2 */
    public final zze mo50118n2() {
        return this.f40730C;
    }

    @NonNull
    /* renamed from: o2 */
    public final zzzr mo50119o2(zze zze) {
        this.f40730C = zze;
        return this;
    }

    @NonNull
    /* renamed from: p2 */
    public final zzzr mo50120p2(@Nullable String str) {
        this.f40735f = str;
        return this;
    }

    @NonNull
    /* renamed from: q2 */
    public final zzzr mo50121q2(@Nullable String str) {
        this.f40733c = str;
        return this;
    }

    /* renamed from: r2 */
    public final zzzr mo50122r2(boolean z) {
        this.f40729B = z;
        return this;
    }

    @NonNull
    /* renamed from: s2 */
    public final zzzr mo50123s2(String str) {
        Preconditions.m4484g(str);
        this.f40738p = str;
        return this;
    }

    @NonNull
    /* renamed from: t2 */
    public final zzzr mo50124t2(@Nullable String str) {
        this.f40736g = str;
        return this;
    }

    @NonNull
    /* renamed from: u2 */
    public final zzzr mo50125u2(List list) {
        Preconditions.m4488k(list);
        zzaag zzaag = new zzaag();
        this.f40737o = zzaag;
        zzaag.mo48751n2().addAll(list);
        return this;
    }

    /* renamed from: v2 */
    public final zzaag mo50126v2() {
        return this.f40737o;
    }

    @Nullable
    /* renamed from: w2 */
    public final String mo50127w2() {
        return this.f40735f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f40732a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40733c, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f40734d);
        SafeParcelWriter.m4586x(parcel, 5, this.f40735f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f40736g, false);
        SafeParcelWriter.m4584v(parcel, 7, this.f40737o, i, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f40738p, false);
        SafeParcelWriter.m4586x(parcel, 9, this.f40739s, false);
        SafeParcelWriter.m4581s(parcel, 10, this.f40740z);
        SafeParcelWriter.m4581s(parcel, 11, this.f40728A);
        SafeParcelWriter.m4565c(parcel, 12, this.f40729B);
        SafeParcelWriter.m4584v(parcel, 13, this.f40730C, i, false);
        SafeParcelWriter.m4558B(parcel, 14, this.f40731D, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @Nullable
    /* renamed from: x2 */
    public final String mo50129x2() {
        return this.f40733c;
    }

    @NonNull
    /* renamed from: y2 */
    public final String mo50130y2() {
        return this.f40732a;
    }

    @Nullable
    /* renamed from: z2 */
    public final String mo50131z2() {
        return this.f40739s;
    }

    public final long zzb() {
        return this.f40728A;
    }

    @SafeParcelable.Constructor
    public zzzr(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param zzaag zzaag, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param long j, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param zze zze, @SafeParcelable.Param List list) {
        zzaag zzaag2;
        this.f40732a = str;
        this.f40733c = str2;
        this.f40734d = z;
        this.f40735f = str3;
        this.f40736g = str4;
        if (zzaag == null) {
            zzaag2 = new zzaag();
        } else {
            zzaag2 = zzaag.m56010m2(zzaag);
        }
        this.f40737o = zzaag2;
        this.f40738p = str5;
        this.f40739s = str6;
        this.f40740z = j;
        this.f40728A = j2;
        this.f40729B = z2;
        this.f40730C = zze;
        this.f40731D = list == null ? new ArrayList() : list;
    }
}
