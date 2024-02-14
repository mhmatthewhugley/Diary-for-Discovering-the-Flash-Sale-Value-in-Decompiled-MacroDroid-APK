package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p204firebaseauthapi.zzaay;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GoogleAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new zzac();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final String f4518a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f4519c;

    @SafeParcelable.Constructor
    GoogleAuthCredential(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f4518a = str;
            this.f4519c = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    /* renamed from: n2 */
    public static zzaay m6071n2(@NonNull GoogleAuthCredential googleAuthCredential, @Nullable String str) {
        Preconditions.m4488k(googleAuthCredential);
        return new zzaay(googleAuthCredential.f4518a, googleAuthCredential.f4519c, googleAuthCredential.mo22576l2(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "google.com";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new GoogleAuthCredential(this.f4518a, this.f4519c);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4518a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4519c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
