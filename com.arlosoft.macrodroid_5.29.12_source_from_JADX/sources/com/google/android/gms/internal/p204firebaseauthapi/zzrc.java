package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrc> CREATOR = new zzrd();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40356a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40357c;

    @SafeParcelable.Constructor
    public zzrc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f40356a = str;
        this.f40357c = str2;
    }

    /* renamed from: l2 */
    public final String mo49737l2() {
        return this.f40357c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40356a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40357c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40356a;
    }
}
