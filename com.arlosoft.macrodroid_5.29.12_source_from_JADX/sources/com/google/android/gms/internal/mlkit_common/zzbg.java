package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzbg implements zzbl {

    /* renamed from: a */
    private final int f41968a;

    /* renamed from: b */
    private final zzbk f41969b;

    zzbg(int i, zzbk zzbk) {
        this.f41968a = i;
        this.f41969b = zzbk;
    }

    public final Class annotationType() {
        return zzbl.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        zzbl zzbl = (zzbl) obj;
        return this.f41968a == zzbl.zza() && this.f41969b.equals(zzbl.zzb());
    }

    public final int hashCode() {
        return (this.f41968a ^ 14552422) + (this.f41969b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f41968a + "intEncoding=" + this.f41969b + ')';
    }

    public final int zza() {
        return this.f41968a;
    }

    public final zzbk zzb() {
        return this.f41969b;
    }
}
