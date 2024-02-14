package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GoogleSignInResult implements Result {

    /* renamed from: a */
    private Status f2906a;
    @Nullable

    /* renamed from: c */
    private GoogleSignInAccount f2907c;

    public GoogleSignInResult(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f2907c = googleSignInAccount;
        this.f2906a = status;
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo20998a() {
        return this.f2907c;
    }

    @NonNull
    public Status getStatus() {
        return this.f2906a;
    }
}
