package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzjr {

    /* renamed from: b */
    private static volatile zzjr f41559b;

    /* renamed from: c */
    static final zzjr f41560c = new zzjr(true);

    /* renamed from: d */
    public static final /* synthetic */ int f41561d = 0;

    /* renamed from: a */
    private final Map f41562a;

    zzjr() {
        this.f41562a = new HashMap();
    }

    /* renamed from: a */
    public static zzjr m60463a() {
        Class<zzjr> cls = zzjr.class;
        zzjr zzjr = f41559b;
        if (zzjr != null) {
            return zzjr;
        }
        synchronized (cls) {
            zzjr zzjr2 = f41559b;
            if (zzjr2 != null) {
                return zzjr2;
            }
            zzjr b = zzjz.m60482b(cls);
            f41559b = b;
            return b;
        }
    }

    /* renamed from: b */
    public final zzkd mo51416b(zzlm zzlm, int i) {
        return (zzkd) this.f41562a.get(new zzjq(zzlm, i));
    }

    zzjr(boolean z) {
        this.f41562a = Collections.emptyMap();
    }
}
