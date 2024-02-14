package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjq {

    /* renamed from: a */
    private final Object f41557a;

    /* renamed from: b */
    private final int f41558b;

    zzjq(Object obj, int i) {
        this.f41557a = obj;
        this.f41558b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjq = (zzjq) obj;
        if (this.f41557a == zzjq.f41557a && this.f41558b == zzjq.f41558b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f41557a) * 65535) + this.f41558b;
    }
}
