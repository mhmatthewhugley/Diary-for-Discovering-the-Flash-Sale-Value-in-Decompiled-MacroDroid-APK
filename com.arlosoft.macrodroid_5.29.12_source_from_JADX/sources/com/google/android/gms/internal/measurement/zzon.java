package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzon implements zzom {

    /* renamed from: a */
    public static final zzib f41861a;

    /* renamed from: b */
    public static final zzib f41862b;

    /* renamed from: c */
    public static final zzib f41863c;

    /* renamed from: d */
    public static final zzib f41864d;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51277a();
        f41861a = a.mo51282f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f41862b = a.mo51282f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f41863c = a.mo51282f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f41864d = a.mo51280d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f41863c.mo51283b()).booleanValue();
    }
}
