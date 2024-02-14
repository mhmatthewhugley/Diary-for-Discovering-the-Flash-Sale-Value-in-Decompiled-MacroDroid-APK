package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzok implements zzoj {

    /* renamed from: a */
    public static final zzib f41854a;

    /* renamed from: b */
    public static final zzib f41855b;

    /* renamed from: c */
    public static final zzib f41856c;

    /* renamed from: d */
    public static final zzib f41857d;

    /* renamed from: e */
    public static final zzib f41858e;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51278b().mo51277a();
        f41854a = a.mo51282f("measurement.client.global_params", true);
        f41855b = a.mo51282f("measurement.service.global_params_in_payload", true);
        f41856c = a.mo51282f("measurement.service.clear_global_params_on_uninstall", true);
        f41857d = a.mo51282f("measurement.service.global_params", true);
        f41858e = a.mo51280d("measurement.id.service.global_params", 0);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f41856c.mo51283b()).booleanValue();
    }
}
