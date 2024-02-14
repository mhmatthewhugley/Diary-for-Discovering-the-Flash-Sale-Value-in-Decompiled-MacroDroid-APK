package com.google.android.gms.internal.nearby;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzsc implements Serializable {
    zzsc() {
    }

    /* renamed from: c */
    public static zzsc m62979c() {
        return zzrz.f45093a;
    }

    /* renamed from: d */
    public static zzsc m62980d(Object obj) {
        Objects.requireNonNull(obj);
        return new zzsh(obj);
    }

    /* renamed from: a */
    public abstract Object mo53221a();

    /* renamed from: b */
    public abstract boolean mo53222b();
}
