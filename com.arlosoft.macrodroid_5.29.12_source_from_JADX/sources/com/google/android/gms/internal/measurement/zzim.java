package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzim {
    /* renamed from: a */
    public static zzii m60309a(zzii zzii) {
        if ((zzii instanceof zzik) || (zzii instanceof zzij)) {
            return zzii;
        }
        if (zzii instanceof Serializable) {
            return new zzij(zzii);
        }
        return new zzik(zzii);
    }

    /* renamed from: b */
    public static zzii m60310b(Object obj) {
        return new zzil(obj);
    }
}
