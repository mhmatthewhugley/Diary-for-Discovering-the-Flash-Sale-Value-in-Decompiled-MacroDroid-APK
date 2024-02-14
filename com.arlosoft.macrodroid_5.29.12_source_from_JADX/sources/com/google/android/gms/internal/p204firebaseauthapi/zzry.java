package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzry */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzry> CREATOR = new zzrz();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40380a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final PhoneAuthCredential f40381c;

    @SafeParcelable.Constructor
    public zzry(@SafeParcelable.Param String str, @SafeParcelable.Param PhoneAuthCredential phoneAuthCredential) {
        this.f40380a = str;
        this.f40381c = phoneAuthCredential;
    }

    /* renamed from: l2 */
    public final PhoneAuthCredential mo49794l2() {
        return this.f40381c;
    }

    /* renamed from: m2 */
    public final String mo49795m2() {
        return this.f40380a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40380a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f40381c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
