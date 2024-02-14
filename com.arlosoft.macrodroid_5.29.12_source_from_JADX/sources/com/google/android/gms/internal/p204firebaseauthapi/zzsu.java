package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsu> CREATOR = new zzsv();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PhoneAuthCredential f40399a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f40400c;

    @SafeParcelable.Constructor
    public zzsu(@SafeParcelable.Param PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param @Nullable String str) {
        this.f40399a = phoneAuthCredential;
        this.f40400c = str;
    }

    /* renamed from: l2 */
    public final PhoneAuthCredential mo49845l2() {
        return this.f40399a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40399a, i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40400c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
