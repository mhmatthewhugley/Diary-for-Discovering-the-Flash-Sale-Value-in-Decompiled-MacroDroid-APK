package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class zzas extends zzak implements Set {

    /* renamed from: c */
    private transient zzao f41950c;

    zzas() {
    }

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    public abstract zzbb iterator();

    public final int hashCode() {
        return zzba.m61196a(this);
    }

    /* renamed from: j */
    public final zzao mo51785j() {
        zzao zzao = this.f41950c;
        if (zzao != null) {
            return zzao;
        }
        zzao k = mo51786k();
        this.f41950c = k;
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public zzao mo51786k() {
        return zzao.m61161l(toArray());
    }
}
