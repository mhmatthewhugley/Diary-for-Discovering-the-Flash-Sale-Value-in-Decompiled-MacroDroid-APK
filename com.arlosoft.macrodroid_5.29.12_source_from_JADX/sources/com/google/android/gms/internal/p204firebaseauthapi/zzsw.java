package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsw> CREATOR = new zzsx();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40401a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40402c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f40403d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final long f40404f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f40405g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final boolean f40406o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f40407p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final String f40408s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final boolean f40409z;

    @SafeParcelable.Constructor
    public zzsw(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param boolean z3) {
        this.f40401a = str;
        this.f40402c = str2;
        this.f40403d = str3;
        this.f40404f = j;
        this.f40405g = z;
        this.f40406o = z2;
        this.f40407p = str4;
        this.f40408s = str5;
        this.f40409z = z3;
    }

    /* renamed from: l2 */
    public final long mo49849l2() {
        return this.f40404f;
    }

    /* renamed from: m2 */
    public final String mo49850m2() {
        return this.f40401a;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo49851n2() {
        return this.f40403d;
    }

    /* renamed from: o2 */
    public final String mo49852o2() {
        return this.f40402c;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo49853p2() {
        return this.f40408s;
    }

    @Nullable
    /* renamed from: q2 */
    public final String mo49854q2() {
        return this.f40407p;
    }

    /* renamed from: r2 */
    public final boolean mo49855r2() {
        return this.f40405g;
    }

    /* renamed from: s2 */
    public final boolean mo49856s2() {
        return this.f40409z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40401a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40402c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40403d, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f40404f);
        SafeParcelWriter.m4565c(parcel, 5, this.f40405g);
        SafeParcelWriter.m4565c(parcel, 6, this.f40406o);
        SafeParcelWriter.m4586x(parcel, 7, this.f40407p, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f40408s, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f40409z);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
