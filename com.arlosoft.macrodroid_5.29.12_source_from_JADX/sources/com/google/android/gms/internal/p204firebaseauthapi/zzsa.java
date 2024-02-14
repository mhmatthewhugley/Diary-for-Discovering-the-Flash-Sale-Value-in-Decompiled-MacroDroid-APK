package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsa> CREATOR = new zzsb();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40383a;

    @SafeParcelable.Constructor
    public zzsa(@SafeParcelable.Param String str) {
        this.f40383a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40383a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40383a;
    }
}
