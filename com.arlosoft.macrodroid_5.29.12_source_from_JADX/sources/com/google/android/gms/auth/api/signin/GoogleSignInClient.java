package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {

    /* renamed from: k */
    private static final zzd f2871k = new zzd((zzc) null);
    @VisibleForTesting

    /* renamed from: l */
    private static int f2872l = zzc.f2873a;

    /* 'enum' modifier removed */
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    static final class zzc {

        /* renamed from: a */
        public static final int f2873a = 1;

        /* renamed from: b */
        public static final int f2874b = 2;

        /* renamed from: c */
        public static final int f2875c = 3;

        /* renamed from: d */
        public static final int f2876d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f2877e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m3300a() {
            return (int[]) f2877e.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private static class zzd implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private zzd() {
        }

        /* synthetic */ zzd(zzc zzc) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final /* synthetic */ Object mo20769a(Result result) {
            return ((GoogleSignInResult) result).mo20998a();
        }
    }

    GoogleSignInClient(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.f2670g, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    /* renamed from: J */
    private final synchronized int m3296J() {
        if (f2872l == zzc.f2873a) {
            Context x = mo21238x();
            GoogleApiAvailability q = GoogleApiAvailability.m3521q();
            int j = q.mo21157j(x, GooglePlayServicesUtilLight.f3065a);
            if (j == 0) {
                f2872l = zzc.f2876d;
            } else if (q.mo21153d(x, j, (String) null) != null || DynamiteModule.m5094a(x, "com.google.android.gms.auth.api.fallback") == 0) {
                f2872l = zzc.f2874b;
            } else {
                f2872l = zzc.f2875c;
            }
        }
        return f2872l;
    }

    @NonNull
    /* renamed from: G */
    public Intent mo20975G() {
        Context x = mo21238x();
        int i = zzc.f2947a[m3296J() - 1];
        if (i == 1) {
            return zzi.m3372e(x, (GoogleSignInOptions) mo21237w());
        }
        if (i != 2) {
            return zzi.m3374g(x, (GoogleSignInOptions) mo21237w());
        }
        return zzi.m3369b(x, (GoogleSignInOptions) mo21237w());
    }

    /* renamed from: H */
    public Task<Void> mo20976H() {
        return PendingResultUtil.m4476c(zzi.m3373f(mo21225k(), mo21238x(), m3296J() == zzc.f2875c));
    }

    /* renamed from: I */
    public Task<Void> mo20977I() {
        return PendingResultUtil.m4476c(zzi.m3370c(mo21225k(), mo21238x(), m3296J() == zzc.f2875c));
    }
}
