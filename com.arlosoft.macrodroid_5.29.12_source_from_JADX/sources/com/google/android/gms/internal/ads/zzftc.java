package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzftc extends zzfst {
    private final Object zza;

    zzftc(Object obj) {
        this.zza = obj;
    }

    /* renamed from: a */
    public final zzfst mo46157a(zzfsm zzfsm) {
        Object apply = zzfsm.apply(this.zza);
        zzfsx.m50938c(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzftc(apply);
    }

    /* renamed from: b */
    public final Object mo46158b(Object obj) {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzftc) {
            return this.zza.equals(((zzftc) obj).zza);
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
