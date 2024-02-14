package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzij implements Serializable, zzii {

    /* renamed from: a */
    volatile transient boolean f41521a;

    /* renamed from: c */
    transient Object f41522c;
    final zzii zza;

    zzij(zzii zzii) {
        Objects.requireNonNull(zzii);
        this.zza = zzii;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f41521a) {
            obj = "<supplier that returned " + this.f41522c + ">";
        } else {
            obj = this.zza;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f41521a) {
            synchronized (this) {
                if (!this.f41521a) {
                    Object zza2 = this.zza.zza();
                    this.f41522c = zza2;
                    this.f41521a = true;
                    return zza2;
                }
            }
        }
        return this.f41522c;
    }
}
