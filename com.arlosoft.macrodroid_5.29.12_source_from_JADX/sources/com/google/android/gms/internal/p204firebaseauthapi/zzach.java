package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzach implements zzaev {

    /* renamed from: a */
    private final zzacg f39649a;

    /* renamed from: b */
    private int f39650b;

    /* renamed from: c */
    private int f39651c;

    /* renamed from: d */
    private int f39652d = 0;

    private zzach(zzacg zzacg) {
        zzadl.m56462f(zzacg, "input");
        this.f39649a = zzacg;
        zzacg.f39648c = this;
    }

    /* renamed from: K */
    private final void m56210K(Object obj, zzaew zzaew, zzacs zzacs) throws IOException {
        int i = this.f39651c;
        this.f39651c = ((this.f39650b >>> 3) << 3) | 4;
        try {
            zzaew.mo49148i(obj, this, zzacs);
            if (this.f39650b != this.f39651c) {
                throw zzadn.m56471g();
            }
        } finally {
            this.f39651c = i;
        }
    }

    /* renamed from: L */
    private final void m56211L(Object obj, zzaew zzaew, zzacs zzacs) throws IOException {
        int q = ((zzace) this.f39649a).mo48922q();
        zzacg zzacg = this.f39649a;
        if (zzacg.f39646a < zzacg.f39647b) {
            int b = zzacg.mo48910b(q);
            this.f39649a.f39646a++;
            zzaew.mo49148i(obj, this, zzacs);
            this.f39649a.mo48915g(0);
            zzacg zzacg2 = this.f39649a;
            zzacg2.f39646a--;
            zzacg2.mo48916h(b);
            return;
        }
        throw new zzadn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: N */
    private final void m56212N(int i) throws IOException {
        if (this.f39649a.mo48909a() != i) {
            throw zzadn.m56472i();
        }
    }

    /* renamed from: O */
    private final void m56213O(int i) throws IOException {
        if ((this.f39650b & 7) != i) {
            throw zzadn.m56465a();
        }
    }

    /* renamed from: P */
    private static final void m56214P(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzadn.m56471g();
        }
    }

    /* renamed from: Q */
    private static final void m56215Q(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzadn.m56471g();
        }
    }

    /* renamed from: R */
    public static zzach m56216R(zzacg zzacg) {
        zzach zzach = zzacg.f39648c;
        return zzach != null ? zzach : new zzach(zzacg);
    }

    /* renamed from: A */
    public final void mo48927A(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            int i = this.f39650b & 7;
            if (i == 1) {
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48923r());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int q = ((zzace) this.f39649a).mo48922q();
                m56215Q(q);
                int a = this.f39649a.mo48909a() + q;
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48923r());
                } while (this.f39649a.mo48909a() < a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48923r()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int q2 = ((zzace) this.f39649a).mo48922q();
                m56215Q(q2);
                int a2 = this.f39649a.mo48909a() + q2;
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48923r()));
                } while (this.f39649a.mo48909a() < a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: B */
    public final void mo48928B(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzabr) {
            zzabr zzabr = (zzabr) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzabr.mo48879d(this.f39649a.mo48918j());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzabr.mo48879d(this.f39649a.mo48918j());
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f39649a.mo48918j()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Boolean.valueOf(this.f39649a.mo48918j()));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: C */
    public final void mo48929C(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzacz) {
            zzacz zzacz = (zzacz) list;
            int i = this.f39650b & 7;
            if (i == 2) {
                int q = ((zzace) this.f39649a).mo48922q();
                m56214P(q);
                int a = this.f39649a.mo48909a() + q;
                do {
                    zzacz.mo49059d(Float.intBitsToFloat(((zzace) this.f39649a).mo48921p()));
                } while (this.f39649a.mo48909a() < a);
            } else if (i == 5) {
                do {
                    zzacz.mo49059d(Float.intBitsToFloat(((zzace) this.f39649a).mo48921p()));
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 2) {
                int q2 = ((zzace) this.f39649a).mo48922q();
                m56214P(q2);
                int a2 = this.f39649a.mo48909a() + q2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzace) this.f39649a).mo48921p())));
                } while (this.f39649a.mo48909a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzace) this.f39649a).mo48921p())));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: D */
    public final void mo48930D(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48924s());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48924s());
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48924s()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48924s()));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: E */
    public final void mo48931E(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadz.mo49119f(zzacg.m56197m(((zzace) this.f39649a).mo48924s()));
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadz.mo49119f(zzacg.m56197m(((zzace) this.f39649a).mo48924s()));
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(zzacg.m56197m(((zzace) this.f39649a).mo48924s())));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Long.valueOf(zzacg.m56197m(((zzace) this.f39649a).mo48924s())));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: F */
    public final void mo48932F(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadg.mo49093f(zzacg.m56196l(((zzace) this.f39649a).mo48922q()));
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadg.mo49093f(zzacg.m56196l(((zzace) this.f39649a).mo48922q()));
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(zzacg.m56196l(((zzace) this.f39649a).mo48922q())));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Integer.valueOf(zzacg.m56196l(((zzace) this.f39649a).mo48922q())));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: G */
    public final void mo48933G(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48922q());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48922q());
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48922q()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48922q()));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: H */
    public final void mo48934H(Object obj, zzaew zzaew, zzacs zzacs) throws IOException {
        m56213O(2);
        m56211L(obj, zzaew, zzacs);
    }

    /* renamed from: I */
    public final void mo48935I(Object obj, zzaew zzaew, zzacs zzacs) throws IOException {
        m56213O(3);
        m56210K(obj, zzaew, zzacs);
    }

    /* renamed from: J */
    public final void mo48936J(List list, boolean z) throws IOException {
        int c;
        int c2;
        if ((this.f39650b & 7) != 2) {
            throw zzadn.m56465a();
        } else if ((list instanceof zzads) && !z) {
            zzads zzads = (zzads) list;
            do {
                zzads.mo49107V0(mo48951m());
                zzacg zzacg = this.f39649a;
                if (!zzacg.mo48917i()) {
                    c2 = zzacg.mo48911c();
                } else {
                    return;
                }
            } while (c2 == this.f39650b);
            this.f39652d = c2;
        } else {
            do {
                list.add(z ? mo48954p() : mo48955q());
                zzacg zzacg2 = this.f39649a;
                if (!zzacg2.mo48917i()) {
                    c = zzacg2.mo48911c();
                } else {
                    return;
                }
            } while (c == this.f39650b);
            this.f39652d = c;
        }
    }

    /* renamed from: M */
    public final boolean mo48937M() throws IOException {
        m56213O(0);
        return this.f39649a.mo48918j();
    }

    /* renamed from: a */
    public final int mo48938a() throws IOException {
        int i = this.f39652d;
        if (i != 0) {
            this.f39650b = i;
            this.f39652d = 0;
        } else {
            i = this.f39649a.mo48911c();
            this.f39650b = i;
        }
        if (i == 0 || i == this.f39651c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: a0 */
    public final boolean mo48939a0() throws IOException {
        int i;
        zzacg zzacg = this.f39649a;
        if (zzacg.mo48917i() || (i = this.f39650b) == this.f39651c) {
            return false;
        }
        return zzacg.mo48919k(i);
    }

    /* renamed from: b */
    public final int mo48940b() throws IOException {
        m56213O(0);
        return ((zzace) this.f39649a).mo48922q();
    }

    /* renamed from: c */
    public final int mo48941c() throws IOException {
        m56213O(5);
        return ((zzace) this.f39649a).mo48921p();
    }

    /* renamed from: d */
    public final int mo48942d() {
        return this.f39650b;
    }

    /* renamed from: e */
    public final int mo48943e() throws IOException {
        m56213O(5);
        return ((zzace) this.f39649a).mo48921p();
    }

    /* renamed from: f */
    public final int mo48944f() throws IOException {
        m56213O(0);
        return ((zzace) this.f39649a).mo48922q();
    }

    /* renamed from: g */
    public final int mo48945g() throws IOException {
        m56213O(0);
        return zzacg.m56196l(((zzace) this.f39649a).mo48922q());
    }

    /* renamed from: h */
    public final int mo48946h() throws IOException {
        m56213O(0);
        return ((zzace) this.f39649a).mo48922q();
    }

    /* renamed from: i */
    public final long mo48947i() throws IOException {
        m56213O(1);
        return ((zzace) this.f39649a).mo48923r();
    }

    /* renamed from: j */
    public final long mo48948j() throws IOException {
        m56213O(0);
        return ((zzace) this.f39649a).mo48924s();
    }

    /* renamed from: k */
    public final long mo48949k() throws IOException {
        m56213O(1);
        return ((zzace) this.f39649a).mo48923r();
    }

    /* renamed from: l */
    public final long mo48950l() throws IOException {
        m56213O(0);
        return ((zzace) this.f39649a).mo48924s();
    }

    /* renamed from: m */
    public final zzacc mo48951m() throws IOException {
        m56213O(2);
        return this.f39649a.mo48912d();
    }

    /* renamed from: n */
    public final long mo48952n() throws IOException {
        m56213O(0);
        return zzacg.m56197m(((zzace) this.f39649a).mo48924s());
    }

    /* renamed from: o */
    public final void mo48953o(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48922q());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48922q());
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48922q()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48922q()));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: p */
    public final String mo48954p() throws IOException {
        m56213O(2);
        return this.f39649a.mo48914f();
    }

    /* renamed from: q */
    public final String mo48955q() throws IOException {
        m56213O(2);
        return this.f39649a.mo48913e();
    }

    @Deprecated
    /* renamed from: r */
    public final void mo48956r(List list, zzaew zzaew, zzacs zzacs) throws IOException {
        int c;
        int i = this.f39650b;
        if ((i & 7) == 3) {
            do {
                Object b = zzaew.mo49141b();
                m56210K(b, zzaew, zzacs);
                zzaew.mo49143d(b);
                list.add(b);
                zzacg zzacg = this.f39649a;
                if (!zzacg.mo48917i() && this.f39652d == 0) {
                    c = zzacg.mo48911c();
                } else {
                    return;
                }
            } while (c == i);
            this.f39652d = c;
            return;
        }
        throw zzadn.m56465a();
    }

    /* renamed from: s */
    public final void mo48957s(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48924s());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48924s());
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48924s()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48924s()));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: t */
    public final void mo48958t(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzacp) {
            zzacp zzacp = (zzacp) list;
            int i = this.f39650b & 7;
            if (i == 1) {
                do {
                    zzacp.mo49033d(Double.longBitsToDouble(((zzace) this.f39649a).mo48923r()));
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int q = ((zzace) this.f39649a).mo48922q();
                m56215Q(q);
                int a = this.f39649a.mo48909a() + q;
                do {
                    zzacp.mo49033d(Double.longBitsToDouble(((zzace) this.f39649a).mo48923r()));
                } while (this.f39649a.mo48909a() < a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzace) this.f39649a).mo48923r())));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int q2 = ((zzace) this.f39649a).mo48922q();
                m56215Q(q2);
                int a2 = this.f39649a.mo48909a() + q2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzace) this.f39649a).mo48923r())));
                } while (this.f39649a.mo48909a() < a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: u */
    public final void mo48959u(List list, zzaew zzaew, zzacs zzacs) throws IOException {
        int c;
        int i = this.f39650b;
        if ((i & 7) == 2) {
            do {
                Object b = zzaew.mo49141b();
                m56211L(b, zzaew, zzacs);
                zzaew.mo49143d(b);
                list.add(b);
                zzacg zzacg = this.f39649a;
                if (!zzacg.mo48917i() && this.f39652d == 0) {
                    c = zzacg.mo48911c();
                } else {
                    return;
                }
            } while (c == i);
            this.f39652d = c;
            return;
        }
        throw zzadn.m56465a();
    }

    /* renamed from: v */
    public final void mo48960v(List list) throws IOException {
        int c;
        if ((this.f39650b & 7) == 2) {
            do {
                list.add(mo48951m());
                zzacg zzacg = this.f39649a;
                if (!zzacg.mo48917i()) {
                    c = zzacg.mo48911c();
                } else {
                    return;
                }
            } while (c == this.f39650b);
            this.f39652d = c;
            return;
        }
        throw zzadn.m56465a();
    }

    /* renamed from: w */
    public final void mo48961w(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            int i = this.f39650b & 7;
            if (i == 0) {
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48922q());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int a = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48922q());
                } while (this.f39649a.mo48909a() < a);
                m56212N(a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48922q()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int a2 = this.f39649a.mo48909a() + ((zzace) this.f39649a).mo48922q();
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48922q()));
                } while (this.f39649a.mo48909a() < a2);
                m56212N(a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: x */
    public final void mo48962x(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadz) {
            zzadz zzadz = (zzadz) list;
            int i = this.f39650b & 7;
            if (i == 1) {
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48923r());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else if (i == 2) {
                int q = ((zzace) this.f39649a).mo48922q();
                m56215Q(q);
                int a = this.f39649a.mo48909a() + q;
                do {
                    zzadz.mo49119f(((zzace) this.f39649a).mo48923r());
                } while (this.f39649a.mo48909a() < a);
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48923r()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else if (i2 == 2) {
                int q2 = ((zzace) this.f39649a).mo48922q();
                m56215Q(q2);
                int a2 = this.f39649a.mo48909a() + q2;
                do {
                    list.add(Long.valueOf(((zzace) this.f39649a).mo48923r()));
                } while (this.f39649a.mo48909a() < a2);
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: y */
    public final void mo48963y(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            int i = this.f39650b & 7;
            if (i == 2) {
                int q = ((zzace) this.f39649a).mo48922q();
                m56214P(q);
                int a = this.f39649a.mo48909a() + q;
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48921p());
                } while (this.f39649a.mo48909a() < a);
            } else if (i == 5) {
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48921p());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 2) {
                int q2 = ((zzace) this.f39649a).mo48922q();
                m56214P(q2);
                int a2 = this.f39649a.mo48909a() + q2;
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48921p()));
                } while (this.f39649a.mo48909a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48921p()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    /* renamed from: z */
    public final void mo48964z(List list) throws IOException {
        int c;
        int c2;
        if (list instanceof zzadg) {
            zzadg zzadg = (zzadg) list;
            int i = this.f39650b & 7;
            if (i == 2) {
                int q = ((zzace) this.f39649a).mo48922q();
                m56214P(q);
                int a = this.f39649a.mo48909a() + q;
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48921p());
                } while (this.f39649a.mo48909a() < a);
            } else if (i == 5) {
                do {
                    zzadg.mo49093f(((zzace) this.f39649a).mo48921p());
                    zzacg zzacg = this.f39649a;
                    if (!zzacg.mo48917i()) {
                        c2 = zzacg.mo48911c();
                    } else {
                        return;
                    }
                } while (c2 == this.f39650b);
                this.f39652d = c2;
            } else {
                throw zzadn.m56465a();
            }
        } else {
            int i2 = this.f39650b & 7;
            if (i2 == 2) {
                int q2 = ((zzace) this.f39649a).mo48922q();
                m56214P(q2);
                int a2 = this.f39649a.mo48909a() + q2;
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48921p()));
                } while (this.f39649a.mo48909a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzace) this.f39649a).mo48921p()));
                    zzacg zzacg2 = this.f39649a;
                    if (!zzacg2.mo48917i()) {
                        c = zzacg2.mo48911c();
                    } else {
                        return;
                    }
                } while (c == this.f39650b);
                this.f39652d = c;
            } else {
                throw zzadn.m56465a();
            }
        }
    }

    public final double zza() throws IOException {
        m56213O(1);
        return Double.longBitsToDouble(((zzace) this.f39649a).mo48923r());
    }

    public final float zzb() throws IOException {
        m56213O(5);
        return Float.intBitsToFloat(((zzace) this.f39649a).mo48921p());
    }
}
