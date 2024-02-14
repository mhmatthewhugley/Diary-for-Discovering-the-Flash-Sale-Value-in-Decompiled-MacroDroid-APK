package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgss implements zzgth {

    /* renamed from: a */
    private final zzgso f37235a;

    /* renamed from: b */
    private final zzgty f37236b;

    /* renamed from: c */
    private final boolean f37237c;

    /* renamed from: d */
    private final zzgqr f37238d;

    private zzgss(zzgty zzgty, zzgqr zzgqr, zzgso zzgso) {
        this.f37236b = zzgty;
        this.f37237c = zzgqr.mo47281h(zzgso);
        this.f37238d = zzgqr;
        this.f37235a = zzgso;
    }

    /* renamed from: k */
    static zzgss m53165k(zzgty zzgty, zzgqr zzgqr, zzgso zzgso) {
        return new zzgss(zzgty, zzgqr, zzgso);
    }

    /* renamed from: a */
    public final int mo47412a(Object obj) {
        zzgty zzgty = this.f37236b;
        int b = zzgty.mo47472b(zzgty.mo47474d(obj));
        if (!this.f37237c) {
            return b;
        }
        this.f37238d.mo47274a(obj);
        throw null;
    }

    /* renamed from: b */
    public final Object mo47413b() {
        return this.f37235a.mo47351s().mo47336D1();
    }

    /* renamed from: c */
    public final int mo47414c(Object obj) {
        int hashCode = this.f37236b.mo47474d(obj).hashCode();
        if (!this.f37237c) {
            return hashCode;
        }
        this.f37238d.mo47274a(obj);
        throw null;
    }

    /* renamed from: d */
    public final void mo47415d(Object obj) {
        this.f37236b.mo47483m(obj);
        this.f37238d.mo47278e(obj);
    }

    /* renamed from: e */
    public final boolean mo47416e(Object obj) {
        this.f37238d.mo47274a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo47417f(Object obj, Object obj2) {
        zzgtj.m53293f(this.f37236b, obj, obj2);
        if (this.f37237c) {
            zzgtj.m53292e(this.f37238d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo47418g(Object obj, Object obj2) {
        if (!this.f37236b.mo47474d(obj).equals(this.f37236b.mo47474d(obj2))) {
            return false;
        }
        if (!this.f37237c) {
            return true;
        }
        this.f37238d.mo47274a(obj);
        this.f37238d.mo47274a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo47419h(Object obj, zzgsz zzgsz, zzgqq zzgqq) throws IOException {
        boolean z;
        zzgty zzgty = this.f37236b;
        zzgqr zzgqr = this.f37238d;
        Object c = zzgty.mo47473c(obj);
        zzgqv b = zzgqr.mo47275b(obj);
        while (zzgsz.mo47172a() != Integer.MAX_VALUE) {
            int d = zzgsz.mo47176d();
            if (d != 11) {
                if ((d & 7) == 2) {
                    Object c2 = zzgqr.mo47276c(zzgqq, this.f37235a, d >>> 3);
                    if (c2 != null) {
                        zzgqr.mo47279f(zzgsz, c2, zzgqq, b);
                    } else {
                        z = zzgty.mo47486p(c, zzgsz);
                    }
                } else {
                    z = zzgsz.mo47173a0();
                }
                if (!z) {
                    zzgty.mo47484n(obj, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzgpw zzgpw = null;
                while (true) {
                    try {
                        if (zzgsz.mo47172a() == Integer.MAX_VALUE) {
                            break;
                        }
                        int d2 = zzgsz.mo47176d();
                        if (d2 == 16) {
                            i = zzgsz.mo47180h();
                            obj2 = zzgqr.mo47276c(zzgqq, this.f37235a, i);
                        } else if (d2 == 26) {
                            if (obj2 != null) {
                                zzgqr.mo47279f(zzgsz, obj2, zzgqq, b);
                            } else {
                                zzgpw = zzgsz.mo47185m();
                            }
                        } else if (!zzgsz.mo47173a0()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzgty.mo47484n(obj, c);
                        throw th;
                    }
                }
                if (zzgsz.mo47176d() != 12) {
                    throw zzgrq.m53033b();
                } else if (zzgpw != null) {
                    if (obj2 != null) {
                        zzgqr.mo47280g(zzgpw, obj2, zzgqq, b);
                    } else {
                        zzgty.mo47481k(c, i, zzgpw);
                    }
                }
            }
        }
        zzgty.mo47484n(obj, c);
    }

    /* renamed from: i */
    public final void mo47420i(Object obj, zzgqm zzgqm) throws IOException {
        this.f37238d.mo47274a(obj);
        throw null;
    }

    /* renamed from: j */
    public final void mo47421j(Object obj, byte[] bArr, int i, int i2, zzgpi zzgpi) throws IOException {
        zzgre zzgre = (zzgre) obj;
        if (zzgre.zzc == zzgtz.m53355c()) {
            zzgre.zzc = zzgtz.m53357e();
        }
        zzgrb zzgrb = (zzgrb) obj;
        throw null;
    }
}
