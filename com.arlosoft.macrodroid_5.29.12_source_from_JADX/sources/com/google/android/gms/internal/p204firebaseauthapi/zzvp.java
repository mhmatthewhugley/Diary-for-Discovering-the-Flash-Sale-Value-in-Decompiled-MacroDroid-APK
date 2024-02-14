package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzay;
import com.google.firebase.auth.internal.zzg;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvp extends zzyb {

    /* renamed from: w */
    private final zzrq f40541w;

    public zzvp(String str) {
        super(1);
        Preconditions.m4485h(str, "refresh token cannot be null");
        this.f40541w = new zzrq(str);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50022q(this.f40541w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        if (TextUtils.isEmpty(this.f40628i.mo50148n2())) {
            this.f40628i.mo50151q2(this.f40541w.zza());
        }
        ((zzg) this.f40624e).mo22787a(this.f40628i, this.f40623d);
        mo50072l(zzay.m6194a(this.f40628i.mo50147m2()));
    }

    public final String zza() {
        return "getAccessToken";
    }
}
