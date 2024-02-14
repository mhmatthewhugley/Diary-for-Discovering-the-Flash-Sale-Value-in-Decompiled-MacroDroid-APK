package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzaf implements zzap {

    /* renamed from: a */
    private final boolean f41186a;

    public zzaf(Boolean bool) {
        this.f41186a = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: c */
    public final zzap mo50702c(String str, zzg zzg, List list) {
        if ("toString".equals(str)) {
            return new zzat(Boolean.toString(this.f41186a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f41186a), str}));
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        return new zzaf(Boolean.valueOf(this.f41186a));
    }

    /* renamed from: e */
    public final Double mo50704e() {
        return Double.valueOf(true != this.f41186a ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.f41186a == ((zzaf) obj).f41186a;
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        return Boolean.valueOf(this.f41186a);
    }

    /* renamed from: g */
    public final String mo50707g() {
        return Boolean.toString(this.f41186a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f41186a).hashCode();
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f41186a);
    }
}
