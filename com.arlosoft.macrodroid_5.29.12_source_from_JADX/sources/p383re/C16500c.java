package p383re;

import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p392se.C16540a;
import p392se.C16551e;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: re.c */
/* compiled from: DefaultInterfaceTemporalAccessor */
public abstract class C16500c implements C16551e {
    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        if (mo75642g(hVar)) {
            return hVar.mo79343g();
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98739g() || jVar == C16557i.m98733a() || jVar == C16557i.m98737e()) {
            return null;
        }
        return jVar.mo75649a(this);
    }
}
