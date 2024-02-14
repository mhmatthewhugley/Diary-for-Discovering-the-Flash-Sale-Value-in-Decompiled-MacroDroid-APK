package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum zzbhc implements zzgrg {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    

    /* renamed from: p */
    private static final zzgrh f26781p = null;
    private final int zzi;

    static {
        f26781p = new zzbha();
    }

    private zzbhc(int i) {
        this.zzi = i;
    }

    /* renamed from: b */
    public static zzbhc m43427b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    /* renamed from: d */
    public static zzgri m43428d() {
        return zzbhb.f26774a;
    }

    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
