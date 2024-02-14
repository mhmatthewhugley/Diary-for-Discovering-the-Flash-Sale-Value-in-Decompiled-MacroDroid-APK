package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeMultiFactorInfo;
import com.google.firebase.auth.MultiFactorInfo;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzn extends ActionCodeMultiFactorInfo {

    /* renamed from: b */
    private final MultiFactorInfo f4673b;

    public zzn(String str, MultiFactorInfo multiFactorInfo) {
        this.f4467a = Preconditions.m4484g(str);
        this.f4673b = (MultiFactorInfo) Preconditions.m4488k(multiFactorInfo);
    }
}
