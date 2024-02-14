package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzot implements zzos {

    /* renamed from: a */
    public static final zzib f41873a;

    /* renamed from: b */
    public static final zzib f41874b;

    /* renamed from: c */
    public static final zzib f41875c;

    /* renamed from: d */
    public static final zzib f41876d;

    /* renamed from: e */
    public static final zzib f41877e;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51277a();
        f41873a = a.mo51282f("measurement.test.boolean_flag", false);
        f41874b = a.mo51279c("measurement.test.double_flag", -3.0d);
        f41875c = a.mo51280d("measurement.test.int_flag", -2);
        f41876d = a.mo51280d("measurement.test.long_flag", -1);
        f41877e = a.mo51281e("measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final long mo51684a() {
        return ((Long) f41876d.mo51283b()).longValue();
    }

    /* renamed from: b */
    public final boolean mo51685b() {
        return ((Boolean) f41873a.mo51283b()).booleanValue();
    }

    /* renamed from: d */
    public final String mo51686d() {
        return (String) f41877e.mo51283b();
    }

    public final double zza() {
        return ((Double) f41874b.mo51283b()).doubleValue();
    }

    public final long zzb() {
        return ((Long) f41875c.mo51283b()).longValue();
    }
}
