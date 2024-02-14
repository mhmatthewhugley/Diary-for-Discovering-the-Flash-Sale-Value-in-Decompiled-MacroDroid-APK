package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsy> CREATOR = new zzsz();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PhoneMultiFactorInfo f40410a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40411c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f40412d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final long f40413f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f40414g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final boolean f40415o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f40416p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final String f40417s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final boolean f40418z;

    @SafeParcelable.Constructor
    public zzsy(@SafeParcelable.Param PhoneMultiFactorInfo phoneMultiFactorInfo, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param boolean z3) {
        this.f40410a = phoneMultiFactorInfo;
        this.f40411c = str;
        this.f40412d = str2;
        this.f40413f = j;
        this.f40414g = z;
        this.f40415o = z2;
        this.f40416p = str3;
        this.f40417s = str4;
        this.f40418z = z3;
    }

    /* renamed from: l2 */
    public final long mo49860l2() {
        return this.f40413f;
    }

    /* renamed from: m2 */
    public final PhoneMultiFactorInfo mo49861m2() {
        return this.f40410a;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo49862n2() {
        return this.f40412d;
    }

    /* renamed from: o2 */
    public final String mo49863o2() {
        return this.f40411c;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo49864p2() {
        return this.f40417s;
    }

    @Nullable
    /* renamed from: q2 */
    public final String mo49865q2() {
        return this.f40416p;
    }

    /* renamed from: r2 */
    public final boolean mo49866r2() {
        return this.f40414g;
    }

    /* renamed from: s2 */
    public final boolean mo49867s2() {
        return this.f40418z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40410a, i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40411c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40412d, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f40413f);
        SafeParcelWriter.m4565c(parcel, 5, this.f40414g);
        SafeParcelWriter.m4565c(parcel, 6, this.f40415o);
        SafeParcelWriter.m4586x(parcel, 7, this.f40416p, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f40417s, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f40418z);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
