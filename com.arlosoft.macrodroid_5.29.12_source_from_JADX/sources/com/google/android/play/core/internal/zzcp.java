package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcp implements zzcs {

    /* renamed from: a */
    private zzcs f51710a;

    /* renamed from: a */
    public static void m70941a(zzcs zzcs, zzcs zzcs2) {
        zzcp zzcp = (zzcp) zzcs;
        if (zzcp.f51710a == null) {
            zzcp.f51710a = zzcs2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zza() {
        zzcs zzcs = this.f51710a;
        if (zzcs != null) {
            return zzcs.zza();
        }
        throw new IllegalStateException();
    }
}
