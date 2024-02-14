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
public class TwitterAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzak();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f4557a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f4558c;

    @SafeParcelable.Constructor
    TwitterAuthCredential(@SafeParcelable.Param @NonNull String str, @SafeParcelable.Param @NonNull String str2) {
        this.f4557a = Preconditions.m4484g(str);
        this.f4558c = Preconditions.m4484g(str2);
    }

    /* renamed from: n2 */
    public static zzaay m6131n2(@NonNull TwitterAuthCredential twitterAuthCredential, @Nullable String str) {
        Preconditions.m4488k(twitterAuthCredential);
        return new zzaay((String) null, twitterAuthCredential.f4557a, twitterAuthCredential.mo22576l2(), (String) null, twitterAuthCredential.f4558c, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "twitter.com";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new TwitterAuthCredential(this.f4557a, this.f4558c);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4557a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4558c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
