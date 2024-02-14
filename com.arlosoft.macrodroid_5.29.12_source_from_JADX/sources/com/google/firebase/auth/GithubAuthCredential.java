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
public class GithubAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new zzab();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f4517a;

    @SafeParcelable.Constructor
    GithubAuthCredential(@SafeParcelable.Param String str) {
        this.f4517a = Preconditions.m4484g(str);
    }

    /* renamed from: n2 */
    public static zzaay m6068n2(@NonNull GithubAuthCredential githubAuthCredential, @Nullable String str) {
        Preconditions.m4488k(githubAuthCredential);
        return new zzaay((String) null, githubAuthCredential.f4517a, githubAuthCredential.mo22576l2(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "github.com";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new GithubAuthCredential(this.f4517a);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4517a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
