package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzoq implements zzop {

    /* renamed from: a */
    public static final zzib f41867a;

    /* renamed from: b */
    public static final zzib f41868b;

    /* renamed from: c */
    public static final zzib f41869c;

    /* renamed from: d */
    public static final zzib f41870d;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51277a();
        f41867a = a.mo51280d("measurement.id.lifecycle.app_in_background_parameter", 0);
        f41868b = a.mo51282f("measurement.lifecycle.app_backgrounded_tracking", true);
        f41869c = a.mo51282f("measurement.lifecycle.app_in_background_parameter", false);
        f41870d = a.mo51280d("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return ((Boolean) f41869c.mo51283b()).booleanValue();
    }
}
