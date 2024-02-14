package p352oe;

import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16551e;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: oe.b */
/* compiled from: DayOfWeek */
public enum C15855b implements C16551e, C16552f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: s */
    public static final C16565j<C15855b> f65312s = null;

    /* renamed from: z */
    private static final C15855b[] f65313z = null;

    /* renamed from: oe.b$a */
    /* compiled from: DayOfWeek */
    class C15856a implements C16565j<C15855b> {
        C15856a() {
        }

        /* renamed from: b */
        public C15855b mo75649a(C16551e eVar) {
            return C15855b.m95487i(eVar);
        }
    }

    static {
        f65312s = new C15856a();
        f65313z = values();
    }

    /* renamed from: i */
    public static C15855b m95487i(C16551e eVar) {
        if (eVar instanceof C15855b) {
            return (C15855b) eVar;
        }
        try {
            return m95488j(eVar.mo75647q(C16540a.DAY_OF_WEEK));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e);
        }
    }

    /* renamed from: j */
    public static C15855b m95488j(int i) {
        if (i >= 1 && i <= 7) {
            return f65313z[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar == C16540a.DAY_OF_WEEK) {
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
            if (hVar == C16540a.DAY_OF_WEEK) {
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

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (hVar == C16540a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: m */
    public C15855b mo75645m(long j) {
        return f65313z[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.DAY_OF_WEEK, (long) getValue());
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar == C16540a.DAY_OF_WEEK) {
            return getValue();
        }
        return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98737e()) {
            return C16541b.DAYS;
        }
        if (jVar == C16557i.m98734b() || jVar == C16557i.m98735c() || jVar == C16557i.m98733a() || jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d()) {
            return null;
        }
        return jVar.mo75649a(this);
    }
}
