package p352oe;

import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p365pe.C16187h;
import p365pe.C16194m;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16551e;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: oe.h */
/* compiled from: Month */
public enum C15870h implements C16551e, C16552f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: D */
    public static final C16565j<C15870h> f65343D = null;

    /* renamed from: E */
    private static final C15870h[] f65344E = null;

    /* renamed from: oe.h$a */
    /* compiled from: Month */
    class C15871a implements C16565j<C15870h> {
        C15871a() {
        }

        /* renamed from: b */
        public C15870h mo75649a(C16551e eVar) {
            return C15870h.m95685j(eVar);
        }
    }

    /* renamed from: oe.h$b */
    /* compiled from: Month */
    static /* synthetic */ class C15872b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65355a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                oe.h[] r0 = p352oe.C15870h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65355a = r0
                oe.h r1 = p352oe.C15870h.FEBRUARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x001d }
                oe.h r1 = p352oe.C15870h.APRIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0028 }
                oe.h r1 = p352oe.C15870h.JUNE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0033 }
                oe.h r1 = p352oe.C15870h.SEPTEMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x003e }
                oe.h r1 = p352oe.C15870h.NOVEMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0049 }
                oe.h r1 = p352oe.C15870h.JANUARY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0054 }
                oe.h r1 = p352oe.C15870h.MARCH     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0060 }
                oe.h r1 = p352oe.C15870h.MAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x006c }
                oe.h r1 = p352oe.C15870h.JULY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0078 }
                oe.h r1 = p352oe.C15870h.AUGUST     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0084 }
                oe.h r1 = p352oe.C15870h.OCTOBER     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f65355a     // Catch:{ NoSuchFieldError -> 0x0090 }
                oe.h r1 = p352oe.C15870h.DECEMBER     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15870h.C15872b.<clinit>():void");
        }
    }

    static {
        f65343D = new C15871a();
        f65344E = values();
    }

    /* renamed from: j */
    public static C15870h m95685j(C16551e eVar) {
        if (eVar instanceof C15870h) {
            return (C15870h) eVar;
        }
        try {
            if (!C16194m.f66460g.equals(C16187h.m97189j(eVar))) {
                eVar = C15861e.m95539T(eVar);
            }
            return m95686w(eVar.mo75647q(C16540a.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e);
        }
    }

    /* renamed from: w */
    public static C15870h m95686w(int i) {
        if (i >= 1 && i <= 12) {
            return f65344E[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar == C16540a.MONTH_OF_YEAR) {
            return hVar.mo79343g();
        }
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar == C16540a.MONTH_OF_YEAR) {
                return true;
            }
            return false;
        } else if (hVar == null || !hVar.mo79341e(this)) {
            return false;
        } else {
            return true;
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    /* renamed from: i */
    public int mo75779i(boolean z) {
        switch (C15872b.f65355a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (hVar == C16540a.MONTH_OF_YEAR) {
            return (long) getValue();
        }
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: m */
    public int mo75780m(boolean z) {
        int i = C15872b.f65355a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        if (C16187h.m97189j(dVar).equals(C16194m.f66460g)) {
            return dVar.mo75669d(C16540a.MONTH_OF_YEAR, (long) getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar == C16540a.MONTH_OF_YEAR) {
            return getValue();
        }
        return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98733a()) {
            return C16194m.f66460g;
        }
        if (jVar == C16557i.m98737e()) {
            return C16541b.MONTHS;
        }
        if (jVar == C16557i.m98734b() || jVar == C16557i.m98735c() || jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d()) {
            return null;
        }
        return jVar.mo75649a(this);
    }

    /* renamed from: t */
    public int mo75781t() {
        int i = C15872b.f65355a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    /* renamed from: v */
    public int mo75782v() {
        int i = C15872b.f65355a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    /* renamed from: x */
    public C15870h mo75783x(long j) {
        return f65344E[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }
}
