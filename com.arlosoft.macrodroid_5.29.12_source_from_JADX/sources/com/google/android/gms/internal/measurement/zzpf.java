package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzpf implements zzpe {

    /* renamed from: a */
    public static final zzib f41902a;

    /* renamed from: b */
    public static final zzib f41903b;

    /* renamed from: c */
    public static final zzib f41904c;

    /* renamed from: d */
    public static final zzib f41905d;

    /* renamed from: e */
    public static final zzib f41906e;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51278b().mo51277a();
        f41902a = a.mo51282f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f41903b = a.mo51282f("measurement.session_stitching_token_enabled", false);
        f41904c = a.mo51282f("measurement.collection.enable_session_stitching_token.service", false);
        f41905d = a.mo51282f("measurement.collection.enable_session_stitching_token.service_new", true);
        f41906e = a.mo51280d("measurement.id.collection.enable_session_stitching_token.client.dev", 0);
    }

    /* renamed from: a */
    public final boolean mo51701a() {
        return ((Boolean) f41903b.mo51283b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo51702b() {
        return ((Boolean) f41905d.mo51283b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo51703d() {
        return ((Boolean) f41904c.mo51283b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f41902a.mo51283b()).booleanValue();
    }
}
