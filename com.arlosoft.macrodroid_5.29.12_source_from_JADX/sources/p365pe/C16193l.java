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

/* renamed from: pe.l */
/* compiled from: HijrahEra */
public enum C16193l implements C16189i {
    BEFORE_AH,
    AH;

    /* renamed from: i */
    public static C16193l m97276i(int i) {
        if (i == 0) {
            return BEFORE_AH;
        }
        if (i == 1) {
            return AH;
        }
        throw new DateTimeException("HijrahEra not valid");
    }

    /* renamed from: m */
    static C16193l m97277m(DataInput dataInput) throws IOException {
        return m97276i(dataInput.readByte());
    }

    private Object writeReplace() {
        return new C16206u((byte) 4, this);
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar == C16540a.ERA) {
            return C16567l.m98757i(1, 1);
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

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo78670j(int i) {
        return this == AH ? i : 1 - i;
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

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo78671t(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }
}
