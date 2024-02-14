package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgqq {

    /* renamed from: b */
    private static volatile zzgqq f37072b;

    /* renamed from: c */
    private static volatile zzgqq f37073c;

    /* renamed from: d */
    static final zzgqq f37074d = new zzgqq(true);

    /* renamed from: a */
    private final Map f37075a;

    zzgqq() {
        this.f37075a = new HashMap();
    }

    /* renamed from: a */
    public static zzgqq m52900a() {
        zzgqq zzgqq = f37072b;
        if (zzgqq == null) {
            synchronized (zzgqq.class) {
                zzgqq = f37072b;
                if (zzgqq == null) {
                    zzgqq = f37074d;
                    f37072b = zzgqq;
                }
            }
        }
        return zzgqq;
    }

    /* renamed from: b */
    public static zzgqq m52901b() {
        Class<zzgqq> cls = zzgqq.class;
        zzgqq zzgqq = f37073c;
        if (zzgqq != null) {
            return zzgqq;
        }
        synchronized (cls) {
            zzgqq zzgqq2 = f37073c;
            if (zzgqq2 != null) {
                return zzgqq2;
            }
            zzgqq b = zzgqy.m52930b(cls);
            f37073c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final zzgrc mo47273c(zzgso zzgso, int i) {
        return (zzgrc) this.f37075a.get(new zzgqp(zzgso, i));
    }

    zzgqq(boolean z) {
        this.f37075a = Collections.emptyMap();
    }
}
