package com.google.android.gms.internal.consent_sdk;

import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzh {

    /* renamed from: a */
    private final Executor f39424a;

    @AnyThread
    /* renamed from: a */
    public final Executor mo48718a() {
        return this.f39424a;
    }

    @AnyThread
    /* renamed from: b */
    public final void mo48719b(@Nullable String str, @Nullable String str2, zzg... zzgArr) {
        this.f39424a.execute(new zze(str, str2, zzgArr));
    }
}
