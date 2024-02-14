package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdg implements zzdn {

    /* renamed from: a */
    private final zzdc f45687a;

    /* renamed from: b */
    private final zzee f45688b;

    /* renamed from: c */
    private final boolean f45689c;

    /* renamed from: d */
    private final zzbk f45690d;

    private zzdg(zzee zzee, zzbk zzbk, zzdc zzdc) {
        this.f45688b = zzee;
        this.f45689c = zzbk.mo53915c(zzdc);
        this.f45690d = zzbk;
        this.f45687a = zzdc;
    }

    /* renamed from: h */
    static zzdg m64326h(zzee zzee, zzbk zzbk, zzdc zzdc) {
        return new zzdg(zzee, zzbk, zzdc);
    }

    /* renamed from: a */
    public final int mo53996a(Object obj) {
        zzee zzee = this.f45688b;
        int b = zzee.mo54045b(zzee.mo54046c(obj));
        if (!this.f45689c) {
            return b;
        }
        this.f45690d.mo53913a(obj);
        throw null;
    }

    /* renamed from: b */
    public final void mo53997b(Object obj, zzew zzew) throws IOException {
        this.f45690d.mo53913a(obj);
        throw null;
    }

    /* renamed from: c */
    public final int mo53998c(Object obj) {
        int hashCode = this.f45688b.mo54046c(obj).hashCode();
        if (!this.f45689c) {
            return hashCode;
        }
        this.f45690d.mo53913a(obj);
        throw null;
    }

    /* renamed from: d */
    public final void mo53999d(Object obj) {
        this.f45688b.mo54048e(obj);
        this.f45690d.mo53914b(obj);
    }

    /* renamed from: e */
    public final boolean mo54000e(Object obj) {
        this.f45690d.mo53913a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo54001f(Object obj, Object obj2) {
        zzdp.m64382d(this.f45688b, obj, obj2);
        if (this.f45689c) {
            zzdp.m64381c(this.f45690d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo54002g(Object obj, Object obj2) {
        if (!this.f45688b.mo54046c(obj).equals(this.f45688b.mo54046c(obj2))) {
            return false;
        }
        if (!this.f45689c) {
            return true;
        }
        this.f45690d.mo53913a(obj);
        this.f45690d.mo53913a(obj2);
        throw null;
    }
}
