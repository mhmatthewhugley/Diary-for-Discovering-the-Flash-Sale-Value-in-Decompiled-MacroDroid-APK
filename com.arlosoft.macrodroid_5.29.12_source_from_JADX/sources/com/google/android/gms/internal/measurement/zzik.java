package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzik implements zzii {

    /* renamed from: a */
    volatile zzii f41523a;

    /* renamed from: c */
    volatile boolean f41524c;

    /* renamed from: d */
    Object f41525d;

    zzik(zzii zzii) {
        Objects.requireNonNull(zzii);
        this.f41523a = zzii;
    }

    public final String toString() {
        Object obj = this.f41523a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f41525d + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f41524c) {
            synchronized (this) {
                if (!this.f41524c) {
                    zzii zzii = this.f41523a;
                    zzii.getClass();
                    Object zza = zzii.zza();
                    this.f41525d = zza;
                    this.f41524c = true;
                    this.f41523a = null;
                    return zza;
                }
            }
        }
        return this.f41525d;
    }
}
