package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbu {

    /* renamed from: a */
    private final ConcurrentMap f39927a;

    /* renamed from: b */
    private final zzbq f39928b;

    /* renamed from: c */
    private final Class f39929c;

    /* renamed from: d */
    private final zzjc f39930d;

    /* synthetic */ zzbu(ConcurrentMap concurrentMap, zzbq zzbq, zzjc zzjc, Class cls, zzbt zzbt) {
        this.f39927a = concurrentMap;
        this.f39928b = zzbq;
        this.f39929c = cls;
        this.f39930d = zzjc;
    }

    /* renamed from: a */
    public final zzbq mo49357a() {
        return this.f39928b;
    }

    /* renamed from: b */
    public final zzjc mo49358b() {
        return this.f39930d;
    }

    /* renamed from: c */
    public final Class mo49359c() {
        return this.f39929c;
    }

    /* renamed from: d */
    public final Collection mo49360d() {
        return this.f39927a.values();
    }

    /* renamed from: e */
    public final List mo49361e(byte[] bArr) {
        List list = (List) this.f39927a.get(new zzbs(bArr, (zzbr) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean mo49362f() {
        return !this.f39930d.mo49497a().isEmpty();
    }
}
