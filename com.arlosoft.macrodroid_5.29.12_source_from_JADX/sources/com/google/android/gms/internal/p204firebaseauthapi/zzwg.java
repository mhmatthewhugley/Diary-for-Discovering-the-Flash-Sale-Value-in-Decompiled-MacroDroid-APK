package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwg extends zzyb {

    /* renamed from: w */
    private final zzsk f40558w;

    public zzwg(@Nullable String str) {
        super(2);
        this.f40558w = new zzsk(str);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50000A(this.f40558w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        zzx i = zzwy.m58269i(this.f40622c, this.f40629j);
        ((zzg) this.f40624e).mo22787a(this.f40628i, i);
        mo50072l(new zzr(i));
    }

    public final String zza() {
        return "signInAnonymously";
    }
}
