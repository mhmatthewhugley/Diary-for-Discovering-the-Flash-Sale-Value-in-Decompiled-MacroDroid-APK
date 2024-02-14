package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlq implements zzlx {

    /* renamed from: a */
    private final zzlm f41688a;

    /* renamed from: b */
    private final zzmo f41689b;

    /* renamed from: c */
    private final boolean f41690c;

    /* renamed from: d */
    private final zzjs f41691d;

    private zzlq(zzmo zzmo, zzjs zzjs, zzlm zzlm) {
        this.f41689b = zzmo;
        this.f41690c = zzjs.mo51419c(zzlm);
        this.f41691d = zzjs;
        this.f41688a = zzlm;
    }

    /* renamed from: j */
    static zzlq m60667j(zzmo zzmo, zzjs zzjs, zzlm zzlm) {
        return new zzlq(zzmo, zzjs, zzlm);
    }

    /* renamed from: a */
    public final int mo51509a(Object obj) {
        zzmo zzmo = this.f41689b;
        int b = zzmo.mo51560b(zzmo.mo51562d(obj));
        if (!this.f41690c) {
            return b;
        }
        this.f41691d.mo51417a(obj);
        throw null;
    }

    /* renamed from: b */
    public final Object mo51510b() {
        zzlm zzlm = this.f41688a;
        if (zzlm instanceof zzkf) {
            return ((zzkf) zzlm).mo51452j();
        }
        return zzlm.mo51447b().mo51438F();
    }

    /* renamed from: c */
    public final int mo51511c(Object obj) {
        int hashCode = this.f41689b.mo51562d(obj).hashCode();
        if (!this.f41690c) {
            return hashCode;
        }
        this.f41691d.mo51417a(obj);
        throw null;
    }

    /* renamed from: d */
    public final void mo51512d(Object obj) {
        this.f41689b.mo51565g(obj);
        this.f41691d.mo51418b(obj);
    }

    /* renamed from: e */
    public final boolean mo51513e(Object obj) {
        this.f41691d.mo51417a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo51514f(Object obj, Object obj2) {
        zzlz.m60731f(this.f41689b, obj, obj2);
        if (this.f41690c) {
            zzlz.m60730e(this.f41691d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo51515g(Object obj, Object obj2) {
        if (!this.f41689b.mo51562d(obj).equals(this.f41689b.mo51562d(obj2))) {
            return false;
        }
        if (!this.f41690c) {
            return true;
        }
        this.f41691d.mo51417a(obj);
        this.f41691d.mo51417a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo51516h(Object obj, zzng zzng) throws IOException {
        this.f41691d.mo51417a(obj);
        throw null;
    }

    /* renamed from: i */
    public final void mo51517i(Object obj, byte[] bArr, int i, int i2, zzir zzir) throws IOException {
        zzkf zzkf = (zzkf) obj;
        if (zzkf.zzc == zzmp.m60784c()) {
            zzkf.zzc = zzmp.m60786f();
        }
        zzkc zzkc = (zzkc) obj;
        throw null;
    }
}
