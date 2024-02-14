package p365pe;

import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: pe.n */
/* compiled from: IsoEra */
public enum C16195n implements C16189i {
    BCE,
    CE;

    /* renamed from: i */
    public static C16195n m97296i(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar == C16540a.ERA) {
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
            if (hVar == C16540a.ERA) {
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
        return ordinal();
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (hVar == C16540a.ERA) {
            return (long) getValue();
        }
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.ERA, (long) getValue());
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar == C16540a.ERA) {
            return getValue();
        }
        return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98737e()) {
            return C16541b.ERAS;
        }
        if (jVar == C16557i.m98733a() || jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d() || jVar == C16557i.m98734b() || jVar == C16557i.m98735c()) {
            return null;
        }
        return jVar.mo75649a(this);
    }
}
