package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzacs {

    /* renamed from: b */
    static final zzacs f39670b = new zzacs(true);

    /* renamed from: c */
    public static final /* synthetic */ int f39671c = 0;

    /* renamed from: a */
    private final Map f39672a;

    zzacs() {
        this.f39672a = new HashMap();
    }

    /* renamed from: a */
    public static zzacs m56379a() {
        return f39670b;
    }

    /* renamed from: b */
    public final zzadd mo49040b(zzaek zzaek, int i) {
        return (zzadd) this.f39672a.get(new zzacr(zzaek, i));
    }

    zzacs(boolean z) {
        this.f39672a = Collections.emptyMap();
    }
}
