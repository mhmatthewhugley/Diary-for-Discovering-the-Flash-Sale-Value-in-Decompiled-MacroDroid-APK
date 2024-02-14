package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zznv implements zznu {

    /* renamed from: a */
    public static final zzib f41832a;

    /* renamed from: b */
    public static final zzib f41833b;

    /* renamed from: c */
    public static final zzib f41834c;

    static {
        zzhy a = new zzhy(zzhq.m60278a("com.google.android.gms.measurement")).mo51278b().mo51277a();
        f41832a = a.mo51282f("measurement.collection.event_safelist", true);
        f41833b = a.mo51282f("measurement.service.store_null_safelist", true);
        f41834c = a.mo51282f("measurement.service.store_safelist", true);
    }

    /* renamed from: a */
    public final boolean mo51658a() {
        return ((Boolean) f41834c.mo51283b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f41833b.mo51283b()).booleanValue();
    }
}
