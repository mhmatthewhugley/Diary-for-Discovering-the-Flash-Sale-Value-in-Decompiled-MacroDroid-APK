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
public class FacebookAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new zzh();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4497a;

    @SafeParcelable.Constructor
    FacebookAuthCredential(@SafeParcelable.Param String str) {
        this.f4497a = Preconditions.m4484g(str);
    }

    @NonNull
    /* renamed from: n2 */
    public static zzaay m5977n2(@NonNull FacebookAuthCredential facebookAuthCredential, @Nullable String str) {
        Preconditions.m4488k(facebookAuthCredential);
        return new zzaay((String) null, facebookAuthCredential.f4497a, facebookAuthCredential.mo22576l2(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "facebook.com";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new FacebookAuthCredential(this.f4497a);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4497a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
