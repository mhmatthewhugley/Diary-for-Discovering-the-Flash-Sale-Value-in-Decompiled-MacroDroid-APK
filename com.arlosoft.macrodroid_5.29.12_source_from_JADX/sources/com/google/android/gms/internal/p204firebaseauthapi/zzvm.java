package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzaj;
import java.util.List;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvm extends zzyb {

    /* renamed from: w */
    private final zzrs f40538w;

    public zzvm(String str, @Nullable String str2) {
        super(3);
        Preconditions.m4485h(str, "email cannot be null or empty");
        this.f40538w = new zzrs(str, str2);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50023r(this.f40538w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        List list;
        if (this.f40630k.mo50091l2() == null) {
            list = zzal.m56890k();
        } else {
            list = (List) Preconditions.m4488k(this.f40630k.mo50091l2());
        }
        mo50072l(new zzaj(list));
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }
}
