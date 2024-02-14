package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbi {

    /* renamed from: a */
    private final Object f45559a;

    /* renamed from: b */
    private final int f45560b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbi = (zzbi) obj;
        if (this.f45559a == zzbi.f45559a && this.f45560b == zzbi.f45560b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f45559a) * 65535) + this.f45560b;
    }
}
