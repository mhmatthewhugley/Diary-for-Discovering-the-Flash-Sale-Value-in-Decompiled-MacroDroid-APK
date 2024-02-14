package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqp {

    /* renamed from: a */
    private final Object f37070a;

    /* renamed from: b */
    private final int f37071b;

    zzgqp(Object obj, int i) {
        this.f37070a = obj;
        this.f37071b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqp)) {
            return false;
        }
        zzgqp zzgqp = (zzgqp) obj;
        if (this.f37070a == zzgqp.f37070a && this.f37071b == zzgqp.f37071b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f37070a) * 65535) + this.f37071b;
    }
}
