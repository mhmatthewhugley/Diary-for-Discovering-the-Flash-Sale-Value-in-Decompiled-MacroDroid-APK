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
public class PlayGamesAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new zzaj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4556a;

    @SafeParcelable.Constructor
    PlayGamesAuthCredential(@SafeParcelable.Param @NonNull String str) {
        this.f4556a = Preconditions.m4484g(str);
    }

    /* renamed from: n2 */
    public static zzaay m6127n2(@NonNull PlayGamesAuthCredential playGamesAuthCredential, @Nullable String str) {
        Preconditions.m4488k(playGamesAuthCredential);
        return new zzaay((String) null, (String) null, playGamesAuthCredential.mo22576l2(), (String) null, (String) null, playGamesAuthCredential.f4556a, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: l2 */
    public String mo22576l2() {
        return "playgames.google.com";
    }

    @NonNull
    /* renamed from: m2 */
    public final AuthCredential mo22577m2() {
        return new PlayGamesAuthCredential(this.f4556a);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4556a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
