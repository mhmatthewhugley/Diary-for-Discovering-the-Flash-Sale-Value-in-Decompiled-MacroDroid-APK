package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzro */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzro extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzro> CREATOR = new zzrp();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PhoneAuthCredential f40370a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40371c;

    @SafeParcelable.Constructor
    public zzro(@SafeParcelable.Param PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param String str) {
        this.f40370a = phoneAuthCredential;
        this.f40371c = str;
    }

    /* renamed from: l2 */
    public final PhoneAuthCredential mo49769l2() {
        return this.f40370a;
    }

    /* renamed from: m2 */
    public final String mo49770m2() {
        return this.f40371c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40370a, i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40371c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
