package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzq {
    @Nullable

    /* renamed from: d */
    private static zzq f2941d;
    @VisibleForTesting

    /* renamed from: a */
    private Storage f2942a;
    @Nullable
    @VisibleForTesting

    /* renamed from: b */
    private GoogleSignInAccount f2943b;
    @Nullable
    @VisibleForTesting

    /* renamed from: c */
    private GoogleSignInOptions f2944c = this.f2942a.mo21015d();

    private zzq(Context context) {
        Storage b = Storage.m3343b(context);
        this.f2942a = b;
        this.f2943b = b.mo21014c();
    }

    /* renamed from: c */
    public static synchronized zzq m3385c(@NonNull Context context) {
        zzq d;
        synchronized (zzq.class) {
            d = m3386d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    private static synchronized zzq m3386d(Context context) {
        synchronized (zzq.class) {
            zzq zzq = f2941d;
            if (zzq != null) {
                return zzq;
            }
            zzq zzq2 = new zzq(context);
            f2941d = zzq2;
            return zzq2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo21041a() {
        this.f2942a.mo21013a();
        this.f2943b = null;
        this.f2944c = null;
    }

    /* renamed from: b */
    public final synchronized void mo21042b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f2942a.mo21017f(googleSignInAccount, googleSignInOptions);
        this.f2943b = googleSignInAccount;
        this.f2944c = googleSignInOptions;
    }
}
