package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaeo implements zzaew {

    /* renamed from: a */
    private final zzaek f39799a;

    /* renamed from: b */
    private final zzafn f39800b;

    /* renamed from: c */
    private final boolean f39801c;

    /* renamed from: d */
    private final zzact f39802d;

    private zzaeo(zzafn zzafn, zzact zzact, zzaek zzaek) {
        this.f39800b = zzafn;
        this.f39801c = zzact.mo49048h(zzaek);
        this.f39802d = zzact;
        this.f39799a = zzaek;
    }

    /* renamed from: k */
    static zzaeo m56595k(zzafn zzafn, zzact zzact, zzaek zzaek) {
        return new zzaeo(zzafn, zzact, zzaek);
    }

    /* renamed from: a */
    public final int mo49140a(Object obj) {
        zzafn zzafn = this.f39800b;
        int b = zzafn.mo49194b(zzafn.mo49196d(obj));
        if (!this.f39801c) {
            return b;
        }
        this.f39802d.mo49041a(obj);
        throw null;
    }

    /* renamed from: b */
    public final Object mo49141b() {
        zzaek zzaek = this.f39799a;
        if (zzaek instanceof zzadf) {
            return ((zzadf) zzaek).mo49090y();
        }
        return zzaek.mo49074V().mo49072i();
    }

    /* renamed from: c */
    public final int mo49142c(Object obj) {
        int hashCode = this.f39800b.mo49196d(obj).hashCode();
        if (!this.f39801c) {
            return hashCode;
        }
        this.f39802d.mo49041a(obj);
        throw null;
    }

    /* renamed from: d */
    public final void mo49143d(Object obj) {
        this.f39800b.mo49205m(obj);
        this.f39802d.mo49045e(obj);
    }

    /* renamed from: e */
    public final boolean mo49144e(Object obj) {
        this.f39802d.mo49041a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo49145f(Object obj, Object obj2) {
        zzaey.m56698f(this.f39800b, obj, obj2);
        if (this.f39801c) {
            zzaey.m56697e(this.f39802d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo49146g(Object obj, Object obj2) {
        if (!this.f39800b.mo49196d(obj).equals(this.f39800b.mo49196d(obj2))) {
            return false;
        }
        if (!this.f39801c) {
            return true;
        }
        this.f39802d.mo49041a(obj);
        this.f39802d.mo49041a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo49147h(Object obj, zzaco zzaco) throws IOException {
        this.f39802d.mo49041a(obj);
        throw null;
    }

    /* renamed from: i */
    public final void mo49148i(Object obj, zzaev zzaev, zzacs zzacs) throws IOException {
        boolean z;
        zzafn zzafn = this.f39800b;
        zzact zzact = this.f39802d;
        Object c = zzafn.mo49195c(obj);
        zzacx b = zzact.mo49042b(obj);
        while (zzaev.mo48938a() != Integer.MAX_VALUE) {
            int d = zzaev.mo48942d();
            if (d != 11) {
                if ((d & 7) == 2) {
                    Object c2 = zzact.mo49043c(zzacs, this.f39799a, d >>> 3);
                    if (c2 != null) {
                        zzact.mo49046f(zzaev, c2, zzacs, b);
                    } else {
                        z = zzafn.mo49208p(c, zzaev);
                    }
                } else {
                    z = zzaev.mo48939a0();
                }
                if (!z) {
                    zzafn.mo49206n(obj, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzacc zzacc = null;
                while (true) {
                    try {
                        if (zzaev.mo48938a() == Integer.MAX_VALUE) {
                            break;
                        }
                        int d2 = zzaev.mo48942d();
                        if (d2 == 16) {
                            i = zzaev.mo48946h();
                            obj2 = zzact.mo49043c(zzacs, this.f39799a, i);
                        } else if (d2 == 26) {
                            if (obj2 != null) {
                                zzact.mo49046f(zzaev, obj2, zzacs, b);
                            } else {
                                zzacc = zzaev.mo48951m();
                            }
                        } else if (!zzaev.mo48939a0()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzafn.mo49206n(obj, c);
                        throw th;
                    }
                }
                if (zzaev.mo48942d() != 12) {
                    throw zzadn.m56466b();
                } else if (zzacc != null) {
                    if (obj2 != null) {
                        zzact.mo49047g(zzacc, obj2, zzacs, b);
                    } else {
                        zzafn.mo49203k(c, i, zzacc);
                    }
                }
            }
        }
        zzafn.mo49206n(obj, c);
    }

    /* renamed from: j */
    public final void mo49149j(Object obj, byte[] bArr, int i, int i2, zzabp zzabp) throws IOException {
        zzadf zzadf = (zzadf) obj;
        if (zzadf.zzc == zzafo.m56764c()) {
            zzadf.zzc = zzafo.m56766f();
        }
        zzadc zzadc = (zzadc) obj;
        throw null;
    }
}
