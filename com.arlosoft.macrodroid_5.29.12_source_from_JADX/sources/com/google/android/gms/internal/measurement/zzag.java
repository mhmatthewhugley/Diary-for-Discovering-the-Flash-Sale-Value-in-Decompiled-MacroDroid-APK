package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzag implements zzap {

    /* renamed from: a */
    private final zzap f41187a;

    /* renamed from: c */
    private final String f41188c;

    public zzag() {
        throw null;
    }

    public zzag(String str) {
        this.f41187a = zzap.f41197i;
        this.f41188c = str;
    }

    public zzag(String str, zzap zzap) {
        this.f41187a = zzap;
        this.f41188c = str;
    }

    /* renamed from: a */
    public final zzap mo50728a() {
        return this.f41187a;
    }

    /* renamed from: b */
    public final String mo50729b() {
        return this.f41188c;
    }

    /* renamed from: c */
    public final zzap mo50702c(String str, zzg zzg, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        return new zzag(this.f41188c, this.f41187a.mo50703d());
    }

    /* renamed from: e */
    public final Double mo50704e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzag = (zzag) obj;
        return this.f41188c.equals(zzag.f41188c) && this.f41187a.equals(zzag.f41187a);
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: g */
    public final String mo50707g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f41188c.hashCode() * 31) + this.f41187a.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return null;
    }
}
