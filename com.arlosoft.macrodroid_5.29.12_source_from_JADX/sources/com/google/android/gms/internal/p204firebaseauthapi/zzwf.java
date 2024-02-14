package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwf extends zzyb {

    /* renamed from: w */
    private final zzsi f40557w;

    public zzwf(@Nullable String str) {
        super(9);
        this.f40557w = new zzsi(str);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50031z(this.f40557w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        mo50072l((Object) null);
    }

    public final String zza() {
        return "setFirebaseUIVersion";
    }
}
