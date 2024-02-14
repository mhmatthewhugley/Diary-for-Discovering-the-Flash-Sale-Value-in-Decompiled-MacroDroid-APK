package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p204firebaseauthapi.zzaay;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzh {
    @NonNull
    /* renamed from: a */
    public static zzaay m6252a(AuthCredential authCredential, @Nullable String str) {
        Preconditions.m4488k(authCredential);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GoogleAuthCredential.m6071n2((GoogleAuthCredential) authCredential, str);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return FacebookAuthCredential.m5977n2((FacebookAuthCredential) authCredential, str);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return TwitterAuthCredential.m6131n2((TwitterAuthCredential) authCredential, str);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return GithubAuthCredential.m6068n2((GithubAuthCredential) authCredential, str);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return PlayGamesAuthCredential.m6127n2((PlayGamesAuthCredential) authCredential, str);
        }
        if (zze.class.isAssignableFrom(authCredential.getClass())) {
            return zze.m6317r2((zze) authCredential, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
