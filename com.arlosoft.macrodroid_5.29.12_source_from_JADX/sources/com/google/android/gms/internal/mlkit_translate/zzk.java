package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzk extends zzf {
    private final Object zza;

    zzk(Object obj) {
        this.zza = obj;
    }

    /* renamed from: a */
    public final boolean mo52018a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzk) {
            return this.zza.equals(((zzk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }
}
