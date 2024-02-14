package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneMultiFactorInfo;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwn extends zzyb {

    /* renamed from: w */
    private final zzsy f40565w;

    public zzwn(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, boolean z3) {
        super(8);
        Preconditions.m4488k(phoneMultiFactorInfo);
        Preconditions.m4484g(str);
        this.f40565w = new zzsy(phoneMultiFactorInfo, str, str2, j, z, z2, str3, str4, z3);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50007a(this.f40565w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
    }

    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }
}
