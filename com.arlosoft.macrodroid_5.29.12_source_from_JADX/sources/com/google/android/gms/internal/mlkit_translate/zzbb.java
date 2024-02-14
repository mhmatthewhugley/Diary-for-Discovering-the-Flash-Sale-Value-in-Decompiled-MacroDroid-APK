package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzbb implements zzbg {

    /* renamed from: a */
    private final int f43129a;

    /* renamed from: b */
    private final zzbf f43130b;

    zzbb(int i, zzbf zzbf) {
        this.f43129a = i;
        this.f43130b = zzbf;
    }

    public final Class annotationType() {
        return zzbg.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return false;
        }
        zzbg zzbg = (zzbg) obj;
        return this.f43129a == zzbg.zza() && this.f43130b.equals(zzbg.zzb());
    }

    public final int hashCode() {
        return (this.f43129a ^ 14552422) + (this.f43130b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f43129a + "intEncoding=" + this.f43130b + ')';
    }

    public final int zza() {
        return this.f43129a;
    }

    public final zzbf zzb() {
        return this.f43130b;
    }
}
