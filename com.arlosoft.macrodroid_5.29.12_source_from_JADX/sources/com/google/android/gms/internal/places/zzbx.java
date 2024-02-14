package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;

final class zzbx implements zzcz {

    /* renamed from: b */
    private static final zzch f45307b = new zzca();

    /* renamed from: a */
    private final zzch f45308a;

    public zzbx() {
        this(new zzbz(zzba.m63302c(), m63396c()));
    }

    /* renamed from: b */
    private static boolean m63395b(zzci zzci) {
        return zzci.mo53532c() == zzbc.zze.f45270i;
    }

    /* renamed from: c */
    private static zzch m63396c() {
        try {
            return (zzch) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f45307b;
        }
    }

    /* renamed from: a */
    public final <T> zzda<T> mo53502a(Class<T> cls) {
        Class<zzbc> cls2 = zzbc.class;
        zzdc.m63557E(cls);
        zzci b = this.f45308a.mo53440b(cls);
        if (b.mo53530a()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzcq.m63503i(zzdc.m63600r(), zzas.m63265b(), b.mo53531b());
            }
            return zzcq.m63503i(zzdc.m63594l(), zzas.m63266c(), b.mo53531b());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m63395b(b)) {
                return zzco.m63487u(cls, b, zzcu.m63515b(), zzbu.m63386d(), zzdc.m63600r(), zzas.m63265b(), zzcf.m63428b());
            }
            return zzco.m63487u(cls, b, zzcu.m63515b(), zzbu.m63386d(), zzdc.m63600r(), (zzar<?>) null, zzcf.m63428b());
        } else if (m63395b(b)) {
            return zzco.m63487u(cls, b, zzcu.m63514a(), zzbu.m63385c(), zzdc.m63594l(), zzas.m63266c(), zzcf.m63427a());
        } else {
            return zzco.m63487u(cls, b, zzcu.m63514a(), zzbu.m63385c(), zzdc.m63599q(), (zzar<?>) null, zzcf.m63427a());
        }
    }

    private zzbx(zzch zzch) {
        this.f45308a = (zzch) zzbd.m63344e(zzch, "messageInfoFactory");
    }
}
