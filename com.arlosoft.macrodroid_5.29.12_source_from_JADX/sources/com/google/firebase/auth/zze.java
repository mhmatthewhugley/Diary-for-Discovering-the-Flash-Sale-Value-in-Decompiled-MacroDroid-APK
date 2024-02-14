package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p204firebaseauthapi.zzaay;
import com.google.android.gms.internal.p204firebaseauthapi.zzag;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4715a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f4716c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f4717d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final zzaay f4718f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private final String f4719g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f4720o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f4721p;

    @SafeParcelable.Constructor
    zze(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable zzaay zzaay, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param @Nullable String str6) {
        this.f4715a = zzag.m56869c(str);
        this.f4716c = str2;
        this.f4717d = str3;
        this.f4718f = zzaay;
        this.f4719g = str4;
        this.f4720o = str5;
        this.f4721p = str6;
    }

    /* renamed from: p2 */
    public static zze m6315p2(zzaay zzaay) {
        Preconditions.m4489l(zzaay, "Must specify a non-null webSignInCredential");
        return new zze((String) null, (String) null, (String) null, zzaay, (String) null, (String) null, (String) null);
    }

    /* renamed from: q2 */
    public static zze m6316q2(String str, String str2, String str3, @Nullable String str4, @Nullable String str5) {
        Preconditions.m4485h(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zze(str, str2, str3, (zzaay) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    /* renamed from: r2 */
    public static zzaay m6317r2(zze zze, @Nullable String str) {
        Preconditions.m4488k(zze);
        zzaay zzaay = zze.f4718f;
        if (zzaay != null) {
            return zzaay;
        }
        return new zzaay(zze.f4716c, zze.f4717d, zze.f4715a, (String) null, zze.f4720o, (String) null, str, zze.f4719g, zze.f4721p);
    }

    /* renamed from: l2 */
    public final String mo22576l2() {
        return this.f4715a;
    }

    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new zze(this.f4715a, this.f4716c, this.f4717d, this.f4718f, this.f4719g, this.f4720o, this.f4721p);
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo22670n2() {
        return this.f4717d;
    }

    @Nullable
    /* renamed from: o2 */
    public final String mo22671o2() {
        return this.f4720o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4715a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4716c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4717d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f4718f, i, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f4719g, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f4720o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f4721p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
