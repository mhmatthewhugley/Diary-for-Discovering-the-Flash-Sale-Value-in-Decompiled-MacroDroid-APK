package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzru */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzru> CREATOR = new zzrv();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40375a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40376c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f40377d;

    @SafeParcelable.Constructor
    public zzru(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f40375a = str;
        this.f40376c = str2;
        this.f40377d = str3;
    }

    /* renamed from: l2 */
    public final String mo49783l2() {
        return this.f40375a;
    }

    /* renamed from: m2 */
    public final String mo49784m2() {
        return this.f40376c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40375a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40376c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40377d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40377d;
    }
}
