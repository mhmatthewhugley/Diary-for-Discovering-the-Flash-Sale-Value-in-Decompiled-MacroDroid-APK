package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzoh implements zzog {

    /* renamed from: a */
    public static final zzib f41849a;

    /* renamed from: b */
    public static final zzib f41850b;

    /* renamed from: c */
    public static final zzib f41851c;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51277a();
        f41849a = a.mo51282f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f41850b = a.mo51282f("measurement.client.sessions.check_on_startup", true);
        f41851c = a.mo51282f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f41849a.mo51283b()).booleanValue();
    }
}
