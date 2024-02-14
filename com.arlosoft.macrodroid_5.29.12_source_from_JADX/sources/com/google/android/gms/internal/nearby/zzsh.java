package com.google.android.gms.internal.nearby;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzsh extends zzsc {
    private final Object zza;

    zzsh(Object obj) {
        this.zza = obj;
    }

    /* renamed from: a */
    public final Object mo53221a() {
        return this.zza;
    }

    /* renamed from: b */
    public final boolean mo53222b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzsh) {
            return this.zza.equals(((zzsh) obj).zza);
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
