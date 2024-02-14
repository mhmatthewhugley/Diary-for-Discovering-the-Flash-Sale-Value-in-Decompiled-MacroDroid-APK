package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxu implements zzgxv {

    /* renamed from: c */
    private static final Object f37424c = new Object();

    /* renamed from: a */
    private volatile zzgxv f37425a;

    /* renamed from: b */
    private volatile Object f37426b = f37424c;

    private zzgxu(zzgxv zzgxv) {
        this.f37425a = zzgxv;
    }

    /* renamed from: a */
    public static zzgxv m53665a(zzgxv zzgxv) {
        if ((zzgxv instanceof zzgxu) || (zzgxv instanceof zzgxh)) {
            return zzgxv;
        }
        Objects.requireNonNull(zzgxv);
        return new zzgxu(zzgxv);
    }

    public final Object zzb() {
        Object obj = this.f37426b;
        if (obj != f37424c) {
            return obj;
        }
        zzgxv zzgxv = this.f37425a;
        if (zzgxv == null) {
            return this.f37426b;
        }
        Object zzb = zzgxv.zzb();
        this.f37426b = zzb;
        this.f37425a = null;
        return zzb;
    }
}
