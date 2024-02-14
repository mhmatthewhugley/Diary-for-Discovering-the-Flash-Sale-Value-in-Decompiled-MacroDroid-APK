package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzih extends zzig {
    private final Object zza;

    zzih(Object obj) {
        this.zza = obj;
    }

    /* renamed from: a */
    public final Object mo51285a() {
        return this.zza;
    }

    /* renamed from: b */
    public final boolean mo51286b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzih) {
            return this.zza.equals(((zzih) obj).zza);
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
