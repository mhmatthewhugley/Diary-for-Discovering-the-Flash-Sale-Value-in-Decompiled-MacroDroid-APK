package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrm> CREATOR = new zzrn();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PhoneAuthCredential f40367a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40368c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f40369d;

    @SafeParcelable.Constructor
    public zzrm(@SafeParcelable.Param PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2) {
        this.f40367a = phoneAuthCredential;
        this.f40368c = str;
        this.f40369d = str2;
    }

    /* renamed from: l2 */
    public final PhoneAuthCredential mo49763l2() {
        return this.f40367a;
    }

    /* renamed from: m2 */
    public final String mo49764m2() {
        return this.f40368c;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo49765n2() {
        return this.f40369d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40367a, i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40368c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40369d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
