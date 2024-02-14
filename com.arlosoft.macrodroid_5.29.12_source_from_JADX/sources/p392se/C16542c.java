package p392se;

import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p352oe.C15855b;
import p352oe.C15857c;
import p352oe.C15861e;
import p365pe.C16187h;
import p365pe.C16194m;
import p383re.C16501d;

/* renamed from: se.c */
/* compiled from: IsoFields */
public final class C16542c {

    /* renamed from: a */
    public static final C16556h f67317a = C16544b.DAY_OF_QUARTER;

    /* renamed from: b */
    public static final C16556h f67318b = C16544b.QUARTER_OF_YEAR;

    /* renamed from: c */
    public static final C16556h f67319c = C16544b.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: d */
    public static final C16556h f67320d = C16544b.WEEK_BASED_YEAR;

    /* renamed from: e */
    public static final C16566k f67321e = C16549c.WEEK_BASED_YEARS;

    /* renamed from: f */
    public static final C16566k f67322f = C16549c.QUARTER_YEARS;

    /* renamed from: se.c$a */
    /* compiled from: IsoFields */
    static /* synthetic */ class C16543a {

        /* renamed from: a */
        static final /* synthetic */ int[] f67323a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                se.c$c[] r0 = p392se.C16542c.C16549c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67323a = r0
                se.c$c r1 = p392se.C16542c.C16549c.WEEK_BASED_YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f67323a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.c$c r1 = p392se.C16542c.C16549c.QUARTER_YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p392se.C16542c.C16543a.<clinit>():void");
        }
    }

    /* renamed from: se.c$b */
    /* compiled from: IsoFields */
    private enum C16544b implements C16556h {
        DAY_OF_QUARTER {
            /* renamed from: d */
            public long mo79340d(C16551e eVar) {
                if (eVar.mo75642g(this)) {
                    return (long) (eVar.mo75647q(C16540a.DAY_OF_YEAR) - C16544b.f67328g[((eVar.mo75647q(C16540a.MONTH_OF_YEAR) - 1) / 3) + (C16194m.f66460g.mo78676y(eVar.mo75644l(C16540a.YEAR)) ? 4 : 0)]);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            /* renamed from: e */
            public boolean mo79341e(C16551e eVar) {
                return eVar.mo75642g(C16540a.DAY_OF_YEAR) && eVar.mo75642g(C16540a.MONTH_OF_YEAR) && eVar.mo75642g(C16540a.YEAR) && C16544b.m98688y(eVar);
            }

            /* renamed from: f */
            public C16567l mo79342f(C16551e eVar) {
                if (eVar.mo75642g(this)) {
                    long l = eVar.mo75644l(C16544b.QUARTER_OF_YEAR);
                    if (l == 1) {
                        return C16194m.f66460g.mo78676y(eVar.mo75644l(C16540a.YEAR)) ? C16567l.m98757i(1, 91) : C16567l.m98757i(1, 90);
                    } else if (l == 2) {
                        return C16567l.m98757i(1, 91);
                    } else {
                        if (l == 3 || l == 4) {
                            return C16567l.m98757i(1, 92);
                        }
                        return mo79343g();
                    }
                } else {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
            }

            /* renamed from: g */
            public C16567l mo79343g() {
                return C16567l.m98758j(1, 90, 92);
            }

            /* renamed from: i */
            public <R extends C16550d> R mo79344i(R r, long j) {
                long d = mo79340d(r);
                mo79343g().mo79365b(j, this);
                C16540a aVar = C16540a.DAY_OF_YEAR;
                return r.mo75669d(aVar, r.mo75644l(aVar) + (j - d));
            }

            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR {
            /* renamed from: d */
            public long mo79340d(C16551e eVar) {
                if (eVar.mo75642g(this)) {
                    return (eVar.mo75644l(C16540a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            /* renamed from: e */
            public boolean mo79341e(C16551e eVar) {
                return eVar.mo75642g(C16540a.MONTH_OF_YEAR) && C16544b.m98688y(eVar);
            }

            /* renamed from: f */
            public C16567l mo79342f(C16551e eVar) {
                return mo79343g();
            }

            /* renamed from: g */
            public C16567l mo79343g() {
                return C16567l.m98757i(1, 4);
            }

            /* renamed from: i */
            public <R extends C16550d> R mo79344i(R r, long j) {
                long d = mo79340d(r);
                mo79343g().mo79365b(j, this);
                C16540a aVar = C16540a.MONTH_OF_YEAR;
                return r.mo75669d(aVar, r.mo75644l(aVar) + ((j - d) * 3));
            }

            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            /* renamed from: d */
            public long mo79340d(C16551e eVar) {
                if (eVar.mo75642g(this)) {
                    return (long) C16544b.m98684t(C15861e.m95539T(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            /* renamed from: e */
            public boolean mo79341e(C16551e eVar) {
                return eVar.mo75642g(C16540a.EPOCH_DAY) && C16544b.m98688y(eVar);
            }

            /* renamed from: f */
            public C16567l mo79342f(C16551e eVar) {
                if (eVar.mo75642g(this)) {
                    return C16544b.m98687x(C15861e.m95539T(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            /* renamed from: g */
            public C16567l mo79343g() {
                return C16567l.m98758j(1, 52, 53);
            }

            /* renamed from: i */
            public <R extends C16550d> R mo79344i(R r, long j) {
                mo79343g().mo79365b(j, this);
                return r.mo75670e(C16501d.m98553n(j, mo79340d(r)), C16541b.WEEKS);
            }

            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR {
            /* renamed from: d */
            public long mo79340d(C16551e eVar) {
                if (eVar.mo75642g(this)) {
                    return (long) C16544b.m98685v(C15861e.m95539T(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            /* renamed from: e */
            public boolean mo79341e(C16551e eVar) {
                return eVar.mo75642g(C16540a.EPOCH_DAY) && C16544b.m98688y(eVar);
            }

            /* renamed from: f */
            public C16567l mo79342f(C16551e eVar) {
                return C16540a.YEAR.mo79343g();
            }

            /* renamed from: g */
            public C16567l mo79343g() {
                return C16540a.YEAR.mo79343g();
            }

            /* renamed from: i */
            public <R extends C16550d> R mo79344i(R r, long j) {
                if (mo79341e(r)) {
                    int a = mo79343g().mo79364a(j, C16544b.WEEK_BASED_YEAR);
                    C15861e T = C15861e.m95539T(r);
                    C16540a aVar = C16540a.DAY_OF_WEEK;
                    int q = T.mo75647q(aVar);
                    int n = C16544b.m98684t(T);
                    if (n == 53 && C16544b.m98686w(a) == 52) {
                        n = 52;
                    }
                    C15861e t0 = C15861e.m95544t0(a, 1, 4);
                    return r.mo75673k(t0.mo75679A0((long) ((q - t0.mo75647q(aVar)) + ((n - 1) * 7))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final int[] f67328g = null;

        static {
            f67328g = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static int m98684t(C15861e eVar) {
            int ordinal = eVar.mo75700Y().ordinal();
            int Z = eVar.mo75701Z() - 1;
            int i = (3 - ordinal) + Z;
            int i2 = (i - ((i / 7) * 7)) - 3;
            if (i2 < -3) {
                i2 += 7;
            }
            if (Z < i2) {
                return (int) m98687x(eVar.mo75692L0(180).mo75713o0(1)).mo79366c();
            }
            int i3 = ((Z - i2) / 7) + 1;
            if (i3 == 53) {
                if (!(i2 == -3 || (i2 == -2 && eVar.mo75706e0()))) {
                    return 1;
                }
            }
            return i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public static int m98685v(C15861e eVar) {
            int d0 = eVar.mo75705d0();
            int Z = eVar.mo75701Z();
            if (Z <= 3) {
                if (Z - eVar.mo75700Y().ordinal() < -2) {
                    return d0 - 1;
                }
                return d0;
            } else if (Z < 363) {
                return d0;
            } else {
                return ((Z - 363) - (eVar.mo75706e0() ? 1 : 0)) - eVar.mo75700Y().ordinal() >= 0 ? d0 + 1 : d0;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public static int m98686w(int i) {
            C15861e t0 = C15861e.m95544t0(i, 1, 1);
            if (t0.mo75700Y() != C15855b.THURSDAY) {
                return (t0.mo75700Y() != C15855b.WEDNESDAY || !t0.mo75706e0()) ? 52 : 53;
            }
            return 53;
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public static C16567l m98687x(C15861e eVar) {
            return C16567l.m98757i(1, (long) m98686w(m98685v(eVar)));
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public static boolean m98688y(C16551e eVar) {
            return C16187h.m97189j(eVar).equals(C16194m.f66460g);
        }

        /* renamed from: b */
        public boolean mo79339b() {
            return true;
        }

        /* renamed from: j */
        public boolean mo79345j() {
            return false;
        }
    }

    /* renamed from: se.c$c */
    /* compiled from: IsoFields */
    private enum C16549c implements C16566k {
        WEEK_BASED_YEARS("WeekBasedYears", C15857c.m95500g(31556952)),
        QUARTER_YEARS("QuarterYears", C15857c.m95500g(7889238));
        
        private final C15857c duration;
        private final String name;

        private C16549c(String str, C15857c cVar) {
            this.name = str;
            this.duration = cVar;
        }

        /* renamed from: b */
        public boolean mo79349b() {
            return true;
        }

        /* renamed from: d */
        public <R extends C16550d> R mo79350d(R r, long j) {
            int i = C16543a.f67323a[ordinal()];
            if (i == 1) {
                C16556h hVar = C16542c.f67320d;
                return r.mo75669d(hVar, C16501d.m98550k((long) r.mo75647q(hVar), j));
            } else if (i == 2) {
                return r.mo75670e(j / 256, C16541b.YEARS).mo75670e((j % 256) * 3, C16541b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public String toString() {
            return this.name;
        }
    }
}
