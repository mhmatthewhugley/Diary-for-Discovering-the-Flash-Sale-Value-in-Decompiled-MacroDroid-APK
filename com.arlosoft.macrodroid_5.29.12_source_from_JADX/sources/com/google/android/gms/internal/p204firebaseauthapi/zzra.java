package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzra */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzra> CREATOR = new zzrb();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40354a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40355c;

    @SafeParcelable.Constructor
    public zzra(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f40354a = str;
        this.f40355c = str2;
    }

    /* renamed from: l2 */
    public final String mo49732l2() {
        return this.f40355c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40354a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40355c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40354a;
    }
}
