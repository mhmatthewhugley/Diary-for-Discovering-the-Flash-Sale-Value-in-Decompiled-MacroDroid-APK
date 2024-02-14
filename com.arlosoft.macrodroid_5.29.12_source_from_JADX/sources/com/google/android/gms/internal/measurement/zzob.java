package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzob implements zzoa {

    /* renamed from: a */
    public static final zzib f41840a;

    /* renamed from: b */
    public static final zzib f41841b;

    /* renamed from: c */
    public static final zzib f41842c;

    /* renamed from: d */
    public static final zzib f41843d;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51277a();
        f41840a = a.mo51282f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f41841b = a.mo51282f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f41842c = a.mo51282f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f41843d = a.mo51282f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo51666a() {
        return ((Boolean) f41842c.mo51283b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo51667d() {
        return ((Boolean) f41843d.mo51283b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f41841b.mo51283b()).booleanValue();
    }
}
