package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p204firebaseauthapi.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbj implements Executor {

    /* renamed from: c */
    private static final zzbj f4651c = new zzbj();

    /* renamed from: a */
    private final Handler f4652a = new zzg(Looper.getMainLooper());

    private zzbj() {
    }

    /* renamed from: a */
    public static zzbj m6227a() {
        return f4651c;
    }

    public final void execute(Runnable runnable) {
        this.f4652a.post(runnable);
    }
}
