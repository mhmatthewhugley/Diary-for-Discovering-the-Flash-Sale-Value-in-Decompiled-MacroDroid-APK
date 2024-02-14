package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzsb extends zzrw {

    /* renamed from: f */
    public static final Object f38406f = new Object();
    @Nullable

    /* renamed from: d */
    private final Object f38407d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public final Object f38408e;

    private zzsb(zzcn zzcn, @Nullable Object obj, @Nullable Object obj2) {
        super(zzcn);
        this.f38407d = obj;
        this.f38408e = obj2;
    }

    /* renamed from: q */
    public static zzsb m54852q(zzbg zzbg) {
        return new zzsb(new zzsc(zzbg), zzcm.f28931o, f38406f);
    }

    /* renamed from: r */
    public static zzsb m54853r(zzcn zzcn, @Nullable Object obj, @Nullable Object obj2) {
        return new zzsb(zzcn, obj, obj2);
    }

    /* renamed from: a */
    public final int mo43599a(Object obj) {
        Object obj2;
        zzcn zzcn = this.f38388c;
        if (f38406f.equals(obj) && (obj2 = this.f38408e) != null) {
            obj = obj2;
        }
        return zzcn.mo43599a(obj);
    }

    /* renamed from: d */
    public final zzck mo43602d(int i, zzck zzck, boolean z) {
        this.f38388c.mo43602d(i, zzck, z);
        if (zzen.m49181t(zzck.f28720b, this.f38408e) && z) {
            zzck.f28720b = f38406f;
        }
        return zzck;
    }

    /* renamed from: e */
    public final zzcm mo43603e(int i, zzcm zzcm, long j) {
        this.f38388c.mo43603e(i, zzcm, j);
        if (zzen.m49181t(zzcm.f28935a, this.f38407d)) {
            zzcm.f28935a = zzcm.f28931o;
        }
        return zzcm;
    }

    /* renamed from: f */
    public final Object mo43604f(int i) {
        Object f = this.f38388c.mo43604f(i);
        return zzen.m49181t(f, this.f38408e) ? f38406f : f;
    }

    /* renamed from: p */
    public final zzsb mo48155p(zzcn zzcn) {
        return new zzsb(zzcn, this.f38407d, this.f38408e);
    }
}
