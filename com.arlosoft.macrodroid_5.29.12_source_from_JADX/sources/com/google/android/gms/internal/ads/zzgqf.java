package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqf implements zzgsz {

    /* renamed from: a */
    private final zzgqe f37051a;

    /* renamed from: b */
    private int f37052b;

    /* renamed from: c */
    private int f37053c;

    /* renamed from: d */
    private int f37054d = 0;

    private zzgqf(zzgqe zzgqe) {
        zzgro.m53028f(zzgqe, "input");
        this.f37051a = zzgqe;
        zzgqe.f37050c = this;
    }

    /* renamed from: L */
    private final Object m52731L(zzgth zzgth, zzgqq zzgqq) throws IOException {
        int s = this.f37051a.mo47135s();
        zzgqe zzgqe = this.f37051a;
        if (zzgqe.f37048a < zzgqe.f37049b) {
            int l = zzgqe.mo47128l(s);
            Object b = zzgth.mo47413b();
            this.f37051a.f37048a++;
            zzgth.mo47419h(b, this, zzgqq);
            zzgth.mo47415d(b);
            this.f37051a.mo47113B(0);
            zzgqe zzgqe2 = this.f37051a;
            zzgqe2.f37048a--;
            zzgqe2.mo47121a(l);
            return b;
        }
        throw new zzgrq("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: N */
    private final void m52732N(int i) throws IOException {
        if (this.f37051a.mo47127k() != i) {
            throw zzgrq.m53040j();
        }
    }

    /* renamed from: O */
    private final void m52733O(int i) throws IOException {
        if ((this.f37052b & 7) != i) {
            throw zzgrq.m53032a();
        }
    }

    /* renamed from: P */
    private static final void m52734P(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzgrq.m53038g();
        }
    }

    /* renamed from: Q */
    private static final void m52735Q(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzgrq.m53038g();
        }
    }

    /* renamed from: R */
    public static zzgqf m52736R(zzgqe zzgqe) {
        zzgqf zzgqf = zzgqe.f37050c;
        return zzgqf != null ? zzgqf : new zzgqf(zzgqe);
    }

    /* renamed from: q */
    private final Object m52737q(zzgth zzgth, zzgqq zzgqq) throws IOException {
        int i = this.f37053c;
        this.f37053c = ((this.f37052b >>> 3) << 3) | 4;
        try {
            Object b = zzgth.mo47413b();
            zzgth.mo47419h(b, this, zzgqq);
            zzgth.mo47415d(b);
            if (this.f37052b == this.f37053c) {
                return b;
            }
            throw zzgrq.m53038g();
        } finally {
            this.f37053c = i;
        }
    }

    /* renamed from: A */
    public final void mo47160A(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            int i = this.f37052b & 7;
            if (i == 1) {
                do {
                    zzgsd.mo47392h(this.f37051a.mo47136t());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int s = this.f37051a.mo47135s();
                m52735Q(s);
                int k = this.f37051a.mo47127k() + s;
                do {
                    zzgsd.mo47392h(this.f37051a.mo47136t());
                } while (this.f37051a.mo47127k() < k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f37051a.mo47136t()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int s2 = this.f37051a.mo47135s();
                m52735Q(s2);
                int k2 = this.f37051a.mo47127k() + s2;
                do {
                    list.add(Long.valueOf(this.f37051a.mo47136t()));
                } while (this.f37051a.mo47127k() < k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: B */
    public final void mo47161B(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgpk) {
            zzgpk zzgpk = (zzgpk) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgpk.mo47069d(this.f37051a.mo47123c());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgpk.mo47069d(this.f37051a.mo47123c());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f37051a.mo47123c()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Boolean.valueOf(this.f37051a.mo47123c()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: C */
    public final void mo47162C(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgqx) {
            zzgqx zzgqx = (zzgqx) list;
            int i = this.f37052b & 7;
            if (i == 2) {
                int s = this.f37051a.mo47135s();
                m52734P(s);
                int k = this.f37051a.mo47127k() + s;
                do {
                    zzgqx.mo47292d(this.f37051a.mo47126j());
                } while (this.f37051a.mo47127k() < k);
            } else if (i == 5) {
                do {
                    zzgqx.mo47292d(this.f37051a.mo47126j());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 2) {
                int s2 = this.f37051a.mo47135s();
                m52734P(s2);
                int k2 = this.f37051a.mo47127k() + s2;
                do {
                    list.add(Float.valueOf(this.f37051a.mo47126j()));
                } while (this.f37051a.mo47127k() < k2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f37051a.mo47126j()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: D */
    public final void mo47163D(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgsd.mo47392h(this.f37051a.mo47140x());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgsd.mo47392h(this.f37051a.mo47140x());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f37051a.mo47140x()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Long.valueOf(this.f37051a.mo47140x()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: E */
    public final void mo47164E(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgsd.mo47392h(this.f37051a.mo47139w());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgsd.mo47392h(this.f37051a.mo47139w());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f37051a.mo47139w()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Long.valueOf(this.f37051a.mo47139w()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: F */
    public final void mo47165F(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgrf.mo47354E(this.f37051a.mo47133q());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgrf.mo47354E(this.f37051a.mo47133q());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47133q()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47133q()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: G */
    public final void mo47166G(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgrf.mo47354E(this.f37051a.mo47135s());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgrf.mo47354E(this.f37051a.mo47135s());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47135s()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47135s()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: H */
    public final Object mo47167H(zzgth zzgth, zzgqq zzgqq) throws IOException {
        m52733O(2);
        return m52731L(zzgth, zzgqq);
    }

    @Deprecated
    /* renamed from: I */
    public final Object mo47168I(zzgth zzgth, zzgqq zzgqq) throws IOException {
        m52733O(3);
        return m52737q(zzgth, zzgqq);
    }

    @Deprecated
    /* renamed from: J */
    public final void mo47169J(List list, zzgth zzgth, zzgqq zzgqq) throws IOException {
        int r;
        int i = this.f37052b;
        if ((i & 7) == 3) {
            do {
                list.add(m52737q(zzgth, zzgqq));
                if (!this.f37051a.mo47122b() && this.f37054d == 0) {
                    r = this.f37051a.mo47134r();
                } else {
                    return;
                }
            } while (r == i);
            this.f37054d = r;
            return;
        }
        throw zzgrq.m53032a();
    }

    /* renamed from: K */
    public final void mo47170K(List list, zzgth zzgth, zzgqq zzgqq) throws IOException {
        int r;
        int i = this.f37052b;
        if ((i & 7) == 2) {
            do {
                list.add(m52731L(zzgth, zzgqq));
                if (!this.f37051a.mo47122b() && this.f37054d == 0) {
                    r = this.f37051a.mo47134r();
                } else {
                    return;
                }
            } while (r == i);
            this.f37054d = r;
            return;
        }
        throw zzgrq.m53032a();
    }

    /* renamed from: M */
    public final boolean mo47171M() throws IOException {
        m52733O(0);
        return this.f37051a.mo47123c();
    }

    /* renamed from: a */
    public final int mo47172a() throws IOException {
        int i = this.f37054d;
        if (i != 0) {
            this.f37052b = i;
            this.f37054d = 0;
        } else {
            i = this.f37051a.mo47134r();
            this.f37052b = i;
        }
        if (i == 0 || i == this.f37053c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: a0 */
    public final boolean mo47173a0() throws IOException {
        int i;
        if (this.f37051a.mo47122b() || (i = this.f37052b) == this.f37053c) {
            return false;
        }
        return this.f37051a.mo47124d(i);
    }

    /* renamed from: b */
    public final int mo47174b() throws IOException {
        m52733O(0);
        return this.f37051a.mo47129m();
    }

    /* renamed from: c */
    public final int mo47175c() throws IOException {
        m52733O(5);
        return this.f37051a.mo47130n();
    }

    /* renamed from: d */
    public final int mo47176d() {
        return this.f37052b;
    }

    /* renamed from: e */
    public final int mo47177e() throws IOException {
        m52733O(5);
        return this.f37051a.mo47132p();
    }

    /* renamed from: f */
    public final int mo47178f() throws IOException {
        m52733O(0);
        return this.f37051a.mo47131o();
    }

    /* renamed from: g */
    public final int mo47179g() throws IOException {
        m52733O(0);
        return this.f37051a.mo47133q();
    }

    /* renamed from: h */
    public final int mo47180h() throws IOException {
        m52733O(0);
        return this.f37051a.mo47135s();
    }

    /* renamed from: i */
    public final long mo47181i() throws IOException {
        m52733O(1);
        return this.f37051a.mo47136t();
    }

    /* renamed from: j */
    public final long mo47182j() throws IOException {
        m52733O(0);
        return this.f37051a.mo47137u();
    }

    /* renamed from: k */
    public final long mo47183k() throws IOException {
        m52733O(1);
        return this.f37051a.mo47138v();
    }

    /* renamed from: l */
    public final long mo47184l() throws IOException {
        m52733O(0);
        return this.f37051a.mo47140x();
    }

    /* renamed from: m */
    public final zzgpw mo47185m() throws IOException {
        m52733O(2);
        return this.f37051a.mo47141y();
    }

    /* renamed from: n */
    public final long mo47186n() throws IOException {
        m52733O(0);
        return this.f37051a.mo47139w();
    }

    /* renamed from: o */
    public final void mo47187o(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgrf.mo47354E(this.f37051a.mo47129m());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgrf.mo47354E(this.f37051a.mo47129m());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47129m()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47129m()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: p */
    public final void mo47188p(List list, boolean z) throws IOException {
        int r;
        int r2;
        if ((this.f37052b & 7) != 2) {
            throw zzgrq.m53032a();
        } else if ((list instanceof zzgrw) && !z) {
            zzgrw zzgrw = (zzgrw) list;
            do {
                zzgrw.mo47381j1(mo47185m());
                if (!this.f37051a.mo47122b()) {
                    r2 = this.f37051a.mo47134r();
                } else {
                    return;
                }
            } while (r2 == this.f37052b);
            this.f37054d = r2;
        } else {
            do {
                list.add(z ? mo47192u() : mo47189r());
                if (!this.f37051a.mo47122b()) {
                    r = this.f37051a.mo47134r();
                } else {
                    return;
                }
            } while (r == this.f37052b);
            this.f37054d = r;
        }
    }

    /* renamed from: r */
    public final String mo47189r() throws IOException {
        m52733O(2);
        return this.f37051a.mo47142z();
    }

    /* renamed from: s */
    public final void mo47190s(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgsd.mo47392h(this.f37051a.mo47137u());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgsd.mo47392h(this.f37051a.mo47137u());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f37051a.mo47137u()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Long.valueOf(this.f37051a.mo47137u()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: t */
    public final void mo47191t(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i = this.f37052b & 7;
            if (i == 1) {
                do {
                    zzgqn.mo47266d(this.f37051a.mo47125i());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int s = this.f37051a.mo47135s();
                m52735Q(s);
                int k = this.f37051a.mo47127k() + s;
                do {
                    zzgqn.mo47266d(this.f37051a.mo47125i());
                } while (this.f37051a.mo47127k() < k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f37051a.mo47125i()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int s2 = this.f37051a.mo47135s();
                m52735Q(s2);
                int k2 = this.f37051a.mo47127k() + s2;
                do {
                    list.add(Double.valueOf(this.f37051a.mo47125i()));
                } while (this.f37051a.mo47127k() < k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: u */
    public final String mo47192u() throws IOException {
        m52733O(2);
        return this.f37051a.mo47112A();
    }

    /* renamed from: v */
    public final void mo47193v(List list) throws IOException {
        int r;
        if ((this.f37052b & 7) == 2) {
            do {
                list.add(mo47185m());
                if (!this.f37051a.mo47122b()) {
                    r = this.f37051a.mo47134r();
                } else {
                    return;
                }
            } while (r == this.f37052b);
            this.f37054d = r;
            return;
        }
        throw zzgrq.m53032a();
    }

    /* renamed from: w */
    public final void mo47194w(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            int i = this.f37052b & 7;
            if (i == 0) {
                do {
                    zzgrf.mo47354E(this.f37051a.mo47131o());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int k = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    zzgrf.mo47354E(this.f37051a.mo47131o());
                } while (this.f37051a.mo47127k() < k);
                m52732N(k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47131o()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int k2 = this.f37051a.mo47127k() + this.f37051a.mo47135s();
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47131o()));
                } while (this.f37051a.mo47127k() < k2);
                m52732N(k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: x */
    public final void mo47195x(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgsd) {
            zzgsd zzgsd = (zzgsd) list;
            int i = this.f37052b & 7;
            if (i == 1) {
                do {
                    zzgsd.mo47392h(this.f37051a.mo47138v());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else if (i == 2) {
                int s = this.f37051a.mo47135s();
                m52735Q(s);
                int k = this.f37051a.mo47127k() + s;
                do {
                    zzgsd.mo47392h(this.f37051a.mo47138v());
                } while (this.f37051a.mo47127k() < k);
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f37051a.mo47138v()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else if (i2 == 2) {
                int s2 = this.f37051a.mo47135s();
                m52735Q(s2);
                int k2 = this.f37051a.mo47127k() + s2;
                do {
                    list.add(Long.valueOf(this.f37051a.mo47138v()));
                } while (this.f37051a.mo47127k() < k2);
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: y */
    public final void mo47196y(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            int i = this.f37052b & 7;
            if (i == 2) {
                int s = this.f37051a.mo47135s();
                m52734P(s);
                int k = this.f37051a.mo47127k() + s;
                do {
                    zzgrf.mo47354E(this.f37051a.mo47132p());
                } while (this.f37051a.mo47127k() < k);
            } else if (i == 5) {
                do {
                    zzgrf.mo47354E(this.f37051a.mo47132p());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 2) {
                int s2 = this.f37051a.mo47135s();
                m52734P(s2);
                int k2 = this.f37051a.mo47127k() + s2;
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47132p()));
                } while (this.f37051a.mo47127k() < k2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47132p()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    /* renamed from: z */
    public final void mo47197z(List list) throws IOException {
        int r;
        int r2;
        if (list instanceof zzgrf) {
            zzgrf zzgrf = (zzgrf) list;
            int i = this.f37052b & 7;
            if (i == 2) {
                int s = this.f37051a.mo47135s();
                m52734P(s);
                int k = this.f37051a.mo47127k() + s;
                do {
                    zzgrf.mo47354E(this.f37051a.mo47130n());
                } while (this.f37051a.mo47127k() < k);
            } else if (i == 5) {
                do {
                    zzgrf.mo47354E(this.f37051a.mo47130n());
                    if (!this.f37051a.mo47122b()) {
                        r2 = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r2 == this.f37052b);
                this.f37054d = r2;
            } else {
                throw zzgrq.m53032a();
            }
        } else {
            int i2 = this.f37052b & 7;
            if (i2 == 2) {
                int s2 = this.f37051a.mo47135s();
                m52734P(s2);
                int k2 = this.f37051a.mo47127k() + s2;
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47130n()));
                } while (this.f37051a.mo47127k() < k2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f37051a.mo47130n()));
                    if (!this.f37051a.mo47122b()) {
                        r = this.f37051a.mo47134r();
                    } else {
                        return;
                    }
                } while (r == this.f37052b);
                this.f37054d = r;
            } else {
                throw zzgrq.m53032a();
            }
        }
    }

    public final double zza() throws IOException {
        m52733O(1);
        return this.f37051a.mo47125i();
    }

    public final float zzb() throws IOException {
        m52733O(5);
        return this.f37051a.mo47126j();
    }
}
