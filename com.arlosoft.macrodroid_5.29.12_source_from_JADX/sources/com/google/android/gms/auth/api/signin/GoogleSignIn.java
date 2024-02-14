package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    /* renamed from: a */
    public static GoogleSignInClient m3281a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(context, (GoogleSignInOptions) Preconditions.m4488k(googleSignInOptions));
    }

    /* renamed from: b */
    public static Task<GoogleSignInAccount> m3282b(@Nullable Intent intent) {
        GoogleSignInResult a = zzi.m3368a(intent);
        if (a == null) {
            return Tasks.m66666e(ApiExceptionUtil.m4340a(Status.f3140z));
        }
        GoogleSignInAccount a2 = a.mo20998a();
        if (!a.getStatus().mo21297q2() || a2 == null) {
            return Tasks.m66666e(ApiExceptionUtil.m4340a(a.getStatus()));
        }
        return Tasks.m66667f(a2);
    }
}
