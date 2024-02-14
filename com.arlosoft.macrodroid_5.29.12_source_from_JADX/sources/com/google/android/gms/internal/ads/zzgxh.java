package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxh implements zzgxv, zzgxc {

    /* renamed from: c */
    private static final Object f37413c = new Object();

    /* renamed from: a */
    private volatile zzgxv f37414a;

    /* renamed from: b */
    private volatile Object f37415b = f37413c;

    private zzgxh(zzgxv zzgxv) {
        this.f37414a = zzgxv;
    }

    /* renamed from: a */
    public static zzgxc m53645a(zzgxv zzgxv) {
        if (zzgxv instanceof zzgxc) {
            return (zzgxc) zzgxv;
        }
        Objects.requireNonNull(zzgxv);
        return new zzgxh(zzgxv);
    }

    /* renamed from: b */
    public static zzgxv m53646b(zzgxv zzgxv) {
        Objects.requireNonNull(zzgxv);
        if (zzgxv instanceof zzgxh) {
            return zzgxv;
        }
        return new zzgxh(zzgxv);
    }

    public final Object zzb() {
        Object obj = this.f37415b;
        Object obj2 = f37413c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f37415b;
                if (obj == obj2) {
                    obj = this.f37414a.zzb();
                    Object obj3 = this.f37415b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f37415b = obj;
                    this.f37414a = null;
                }
            }
        }
        return obj;
    }
}
