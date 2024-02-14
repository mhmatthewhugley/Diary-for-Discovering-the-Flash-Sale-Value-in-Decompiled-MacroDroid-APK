package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzi {

    /* renamed from: a */
    private static Logger f2937a = new Logger("GoogleSignInCommon", new String[0]);

    @Nullable
    /* renamed from: a */
    public static GoogleSignInResult m3368a(@Nullable Intent intent) {
        if (intent == null) {
            return new GoogleSignInResult((GoogleSignInAccount) null, Status.f3140z);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new GoogleSignInResult(googleSignInAccount, Status.f3138p);
        }
        if (status == null) {
            status = Status.f3140z;
        }
        return new GoogleSignInResult((GoogleSignInAccount) null, status);
    }

    /* renamed from: b */
    public static Intent m3369b(Context context, GoogleSignInOptions googleSignInOptions) {
        f2937a.mo21837a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: c */
    public static PendingResult<Status> m3370c(GoogleApiClient googleApiClient, Context context, boolean z) {
        f2937a.mo21837a("Signing out", new Object[0]);
        m3371d(context);
        if (z) {
            return PendingResults.m3683b(Status.f3138p, googleApiClient);
        }
        return googleApiClient.mo21253i(new zzj(googleApiClient));
    }

    /* renamed from: d */
    private static void m3371d(Context context) {
        zzq.m3385c(context).mo21041a();
        for (GoogleApiClient o : GoogleApiClient.m3652j()) {
            o.mo21258o();
        }
        GoogleApiManager.m3751a();
    }

    /* renamed from: e */
    public static Intent m3372e(Context context, GoogleSignInOptions googleSignInOptions) {
        f2937a.mo21837a("getFallbackSignInIntent()", new Object[0]);
        Intent b = m3369b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return b;
    }

    /* renamed from: f */
    public static PendingResult<Status> m3373f(GoogleApiClient googleApiClient, Context context, boolean z) {
        f2937a.mo21837a("Revoking access", new Object[0]);
        String e = Storage.m3343b(context).mo21016e();
        m3371d(context);
        if (z) {
            return zze.m3358a(e);
        }
        return googleApiClient.mo21253i(new zzl(googleApiClient));
    }

    /* renamed from: g */
    public static Intent m3374g(Context context, GoogleSignInOptions googleSignInOptions) {
        f2937a.mo21837a("getNoImplementationSignInIntent()", new Object[0]);
        Intent b = m3369b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.NO_IMPL");
        return b;
    }
}
