package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzx;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvy extends zzyb {
    @NonNull

    /* renamed from: w */
    private final zzsq f40550w;

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50003D(this.f40550w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        zzx i = zzwy.m58269i(this.f40622c, this.f40629j);
        if (this.f40623d.mo22654r2().equalsIgnoreCase(i.mo22654r2())) {
            ((zzg) this.f40624e).mo22787a(this.f40628i, i);
            mo50072l((Object) null);
            return;
        }
        mo50071k(new Status(17024));
    }

    public final String zza() {
        return "reauthenticateWithEmailPassword";
    }
}
