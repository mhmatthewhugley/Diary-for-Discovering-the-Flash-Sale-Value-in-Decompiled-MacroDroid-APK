package p365pe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: pe.x */
/* compiled from: ThaiBuddhistEra */
public enum C16211x implements C16189i {
    BEFORE_BE,
    BE;

    /* renamed from: i */
    public static C16211x m97450i(int i) {
        if (i == 0) {
            return BEFORE_BE;
        }
        if (i == 1) {
            return BE;
        }
        throw new DateTimeException("Era is not valid for ThaiBuddhistEra");
    }

    /* renamed from: j */
    static C16211x m97451j(DataInput dataInput) throws IOException {
        return m97450i(dataInput.readByte());
    }

    private Object writeReplace() {
        return new C16206u((byte) 8, this);
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

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo78727m(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
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
