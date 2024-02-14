package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzac extends MultiFactor {

    /* renamed from: a */
    private final zzx f4582a;

    public zzac(zzx zzx) {
        Preconditions.m4488k(zzx);
        this.f4582a = zzx;
    }

    /* renamed from: a */
    public final List<MultiFactorInfo> mo22668a() {
        return this.f4582a.mo22827K2();
    }
}
