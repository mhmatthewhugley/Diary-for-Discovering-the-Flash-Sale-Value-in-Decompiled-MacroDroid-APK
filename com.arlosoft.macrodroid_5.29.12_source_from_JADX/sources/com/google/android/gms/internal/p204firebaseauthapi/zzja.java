package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzja */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzja {

    /* renamed from: a */
    private HashMap f40201a = new HashMap();

    /* renamed from: a */
    public final zzjc mo49496a() {
        if (this.f40201a != null) {
            zzjc zzjc = new zzjc(Collections.unmodifiableMap(this.f40201a), (zzjb) null);
            this.f40201a = null;
            return zzjc;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
