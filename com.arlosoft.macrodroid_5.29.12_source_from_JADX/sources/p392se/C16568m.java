package p392se;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p352oe.C15855b;
import p352oe.C15884n;
import p365pe.C16187h;
import p383re.C16501d;

/* renamed from: se.m */
/* compiled from: WeekFields */
public final class C16568m implements Serializable {

    /* renamed from: o */
    private static final ConcurrentMap<String, C16568m> f67342o = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: p */
    public static final C16568m f67343p = new C16568m(C15855b.MONDAY, 4);

    /* renamed from: s */
    public static final C16568m f67344s = m98770f(C15855b.SUNDAY, 1);
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a */
    private final transient C16556h f67345a = C16569a.m98781l(this);

    /* renamed from: c */
    private final transient C16556h f67346c = C16569a.m98783n(this);

    /* renamed from: d */
    private final transient C16556h f67347d = C16569a.m98785p(this);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient C16556h f67348f = C16569a.m98784o(this);
    private final C15855b firstDayOfWeek;

    /* renamed from: g */
    private final transient C16556h f67349g = C16569a.m98782m(this);
    private final int minimalDays;

    /* renamed from: se.m$a */
    /* compiled from: WeekFields */
    static class C16569a implements C16556h {

        /* renamed from: A */
        private static final C16567l f67350A = C16540a.YEAR.mo79343g();

        /* renamed from: o */
        private static final C16567l f67351o = C16567l.m98757i(1, 7);

        /* renamed from: p */
        private static final C16567l f67352p = C16567l.m98759k(0, 1, 4, 6);

        /* renamed from: s */
        private static final C16567l f67353s = C16567l.m98759k(0, 1, 52, 54);

        /* renamed from: z */
        private static final C16567l f67354z = C16567l.m98758j(1, 52, 53);

        /* renamed from: a */
        private final String f67355a;

        /* renamed from: c */
        private final C16568m f67356c;

        /* renamed from: d */
        private final C16566k f67357d;

        /* renamed from: f */
        private final C16566k f67358f;

        /* renamed from: g */
        private final C16567l f67359g;

        private C16569a(String str, C16568m mVar, C16566k kVar, C16566k kVar2, C16567l lVar) {
            this.f67355a = str;
            this.f67356c = mVar;
            this.f67357d = kVar;
            this.f67358f = kVar2;
            this.f67359g = lVar;
        }

        /* renamed from: a */
        private int m98777a(int i, int i2) {
            return ((i + 7) + (i2 - 1)) / 7;
        }

        /* renamed from: c */
        private int m98778c(C16551e eVar) {
            int f = C16501d.m98545f(eVar.mo75647q(C16540a.DAY_OF_WEEK) - this.f67356c.mo79376c().getValue(), 7) + 1;
            int q = eVar.mo75647q(C16540a.YEAR);
            long k = m98780k(eVar, f);
            if (k == 0) {
                return q - 1;
            }
            if (k < 53) {
                return q;
            }
            return k >= ((long) m98777a(m98787r(eVar.mo75647q(C16540a.DAY_OF_YEAR), f), (C15884n.m95775x((long) q) ? 366 : 365) + this.f67356c.mo79377d())) ? q + 1 : q;
        }

        /* renamed from: h */
        private int m98779h(C16551e eVar) {
            int f = C16501d.m98545f(eVar.mo75647q(C16540a.DAY_OF_WEEK) - this.f67356c.mo79376c().getValue(), 7) + 1;
            long k = m98780k(eVar, f);
            if (k == 0) {
                return ((int) m98780k(C16187h.m97189j(eVar).mo78639d(eVar).mo75667b(1, C16541b.WEEKS), f)) + 1;
            }
            if (k >= 53) {
                int a = m98777a(m98787r(eVar.mo75647q(C16540a.DAY_OF_YEAR), f), (C15884n.m95775x((long) eVar.mo75647q(C16540a.YEAR)) ? 366 : 365) + this.f67356c.mo79377d());
                if (k >= ((long) a)) {
                    return (int) (k - ((long) (a - 1)));
                }
            }
            return (int) k;
        }

        /* renamed from: k */
        private long m98780k(C16551e eVar, int i) {
            int q = eVar.mo75647q(C16540a.DAY_OF_YEAR);
            return (long) m98777a(m98787r(q, i), q);
        }

        /* renamed from: l */
        static C16569a m98781l(C16568m mVar) {
            return new C16569a("DayOfWeek", mVar, C16541b.DAYS, C16541b.WEEKS, f67351o);
        }

        /* renamed from: m */
        static C16569a m98782m(C16568m mVar) {
            return new C16569a("WeekBasedYear", mVar, C16542c.f67321e, C16541b.FOREVER, f67350A);
        }

        /* renamed from: n */
        static C16569a m98783n(C16568m mVar) {
            return new C16569a("WeekOfMonth", mVar, C16541b.WEEKS, C16541b.MONTHS, f67352p);
        }

        /* renamed from: o */
        static C16569a m98784o(C16568m mVar) {
            return new C16569a("WeekOfWeekBasedYear", mVar, C16541b.WEEKS, C16542c.f67321e, f67354z);
        }

        /* renamed from: p */
        static C16569a m98785p(C16568m mVar) {
            return new C16569a("WeekOfYear", mVar, C16541b.WEEKS, C16541b.YEARS, f67353s);
        }

        /* renamed from: q */
        private C16567l m98786q(C16551e eVar) {
            int f = C16501d.m98545f(eVar.mo75647q(C16540a.DAY_OF_WEEK) - this.f67356c.mo79376c().getValue(), 7) + 1;
            long k = m98780k(eVar, f);
            if (k == 0) {
                return m98786q(C16187h.m97189j(eVar).mo78639d(eVar).mo75667b(2, C16541b.WEEKS));
            }
            int a = m98777a(m98787r(eVar.mo75647q(C16540a.DAY_OF_YEAR), f), (C15884n.m95775x((long) eVar.mo75647q(C16540a.YEAR)) ? 366 : 365) + this.f67356c.mo79377d());
            if (k >= ((long) a)) {
                return m98786q(C16187h.m97189j(eVar).mo78639d(eVar).mo75670e(2, C16541b.WEEKS));
            }
            return C16567l.m98757i(1, (long) (a - 1));
        }

        /* renamed from: r */
        private int m98787r(int i, int i2) {
            int f = C16501d.m98545f(i - i2, 7);
            return f + 1 > this.f67356c.mo79377d() ? 7 - f : -f;
        }

        /* renamed from: b */
        public boolean mo79339b() {
            return true;
        }

        /* renamed from: d */
        public long mo79340d(C16551e eVar) {
            int c;
            int f = C16501d.m98545f(eVar.mo75647q(C16540a.DAY_OF_WEEK) - this.f67356c.mo79376c().getValue(), 7) + 1;
            C16566k kVar = this.f67358f;
            if (kVar == C16541b.WEEKS) {
                return (long) f;
            }
            if (kVar == C16541b.MONTHS) {
                int q = eVar.mo75647q(C16540a.DAY_OF_MONTH);
                c = m98777a(m98787r(q, f), q);
            } else if (kVar == C16541b.YEARS) {
                int q2 = eVar.mo75647q(C16540a.DAY_OF_YEAR);
                c = m98777a(m98787r(q2, f), q2);
            } else if (kVar == C16542c.f67321e) {
                c = m98779h(eVar);
            } else if (kVar == C16541b.FOREVER) {
                c = m98778c(eVar);
            } else {
                throw new IllegalStateException("unreachable");
            }
            return (long) c;
        }

        /* renamed from: e */
        public boolean mo79341e(C16551e eVar) {
            if (!eVar.mo75642g(C16540a.DAY_OF_WEEK)) {
                return false;
            }
            C16566k kVar = this.f67358f;
            if (kVar == C16541b.WEEKS) {
                return true;
            }
            if (kVar == C16541b.MONTHS) {
                return eVar.mo75642g(C16540a.DAY_OF_MONTH);
            }
            if (kVar == C16541b.YEARS) {
                return eVar.mo75642g(C16540a.DAY_OF_YEAR);
            }
            if (kVar == C16542c.f67321e) {
                return eVar.mo75642g(C16540a.EPOCH_DAY);
            }
            if (kVar == C16541b.FOREVER) {
                return eVar.mo75642g(C16540a.EPOCH_DAY);
            }
            return false;
        }

        /* renamed from: f */
        public C16567l mo79342f(C16551e eVar) {
            C16540a aVar;
            C16566k kVar = this.f67358f;
            if (kVar == C16541b.WEEKS) {
                return this.f67359g;
            }
            if (kVar == C16541b.MONTHS) {
                aVar = C16540a.DAY_OF_MONTH;
            } else if (kVar == C16541b.YEARS) {
                aVar = C16540a.DAY_OF_YEAR;
            } else if (kVar == C16542c.f67321e) {
                return m98786q(eVar);
            } else {
                if (kVar == C16541b.FOREVER) {
                    return eVar.mo75641f(C16540a.YEAR);
                }
                throw new IllegalStateException("unreachable");
            }
            int value = this.f67356c.mo79376c().getValue();
            int r = m98787r(eVar.mo75647q(aVar), C16501d.m98545f(eVar.mo75647q(C16540a.DAY_OF_WEEK) - value, 7) + 1);
            C16567l f = eVar.mo75641f(aVar);
            return C16567l.m98757i((long) m98777a(r, (int) f.mo79367d()), (long) m98777a(r, (int) f.mo79366c()));
        }

        /* renamed from: g */
        public C16567l mo79343g() {
            return this.f67359g;
        }

        /* renamed from: i */
        public <R extends C16550d> R mo79344i(R r, long j) {
            int a = this.f67359g.mo79364a(j, this);
            int q = r.mo75647q(this);
            if (a == q) {
                return r;
            }
            if (this.f67358f != C16541b.FOREVER) {
                return r.mo75670e((long) (a - q), this.f67357d);
            }
            int q2 = r.mo75647q(this.f67356c.f67348f);
            C16541b bVar = C16541b.WEEKS;
            C16550d e = r.mo75670e((long) (((double) (j - ((long) q))) * 52.1775d), bVar);
            if (e.mo75647q(this) > a) {
                return e.mo75667b((long) e.mo75647q(this.f67356c.f67348f), bVar);
            }
            if (e.mo75647q(this) < a) {
                e = e.mo75670e(2, bVar);
            }
            R e2 = e.mo75670e((long) (q2 - e.mo75647q(this.f67356c.f67348f)), bVar);
            return e2.mo75647q(this) > a ? e2.mo75667b(1, bVar) : e2;
        }

        /* renamed from: j */
        public boolean mo79345j() {
            return false;
        }

        public String toString() {
            return this.f67355a + "[" + this.f67356c.toString() + "]";
        }
    }

    private C16568m(C15855b bVar, int i) {
        C16501d.m98548i(bVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = bVar;
        this.minimalDays = i;
    }

    /* renamed from: e */
    public static C16568m m98769e(Locale locale) {
        C16501d.m98548i(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return m98770f(C15855b.SUNDAY.mo75645m((long) (gregorianCalendar.getFirstDayOfWeek() - 1)), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    /* renamed from: f */
    public static C16568m m98770f(C15855b bVar, int i) {
        String str = bVar.toString() + i;
        ConcurrentMap<String, C16568m> concurrentMap = f67342o;
        C16568m mVar = (C16568m) concurrentMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        concurrentMap.putIfAbsent(str, new C16568m(bVar, i));
        return (C16568m) concurrentMap.get(str);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m98770f(this.firstDayOfWeek, this.minimalDays);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid WeekFields" + e.getMessage());
        }
    }

    /* renamed from: b */
    public C16556h mo79375b() {
        return this.f67345a;
    }

    /* renamed from: c */
    public C15855b mo79376c() {
        return this.firstDayOfWeek;
    }

    /* renamed from: d */
    public int mo79377d() {
        return this.minimalDays;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16568m) || hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C16556h mo79379g() {
        return this.f67349g;
    }

    /* renamed from: h */
    public C16556h mo79380h() {
        return this.f67346c;
    }

    public int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    /* renamed from: i */
    public C16556h mo79382i() {
        return this.f67348f;
    }

    public String toString() {
        return "WeekFields[" + this.firstDayOfWeek + ',' + this.minimalDays + ']';
    }
}
