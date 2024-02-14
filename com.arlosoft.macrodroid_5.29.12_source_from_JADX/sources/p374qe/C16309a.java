package p374qe;

import java.util.HashMap;
import java.util.Map;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15861e;
import p352oe.C15867g;
import p352oe.C15882l;
import p352oe.C15890p;
import p365pe.C16175b;
import p365pe.C16187h;
import p383re.C16500c;
import p383re.C16501d;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;

/* renamed from: qe.a */
/* compiled from: DateTimeBuilder */
final class C16309a extends C16500c implements Cloneable {

    /* renamed from: a */
    final Map<C16556h, Long> f66709a = new HashMap();

    /* renamed from: c */
    C16187h f66710c;

    /* renamed from: d */
    C15890p f66711d;

    /* renamed from: f */
    C16175b f66712f;

    /* renamed from: g */
    C15867g f66713g;

    /* renamed from: o */
    boolean f66714o;

    /* renamed from: p */
    C15882l f66715p;

    /* renamed from: t */
    private Long m97926t(C16556h hVar) {
        return this.f66709a.get(hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        C16175b bVar;
        C15867g gVar;
        if (hVar == null) {
            return false;
        }
        if (this.f66709a.containsKey(hVar) || (((bVar = this.f66712f) != null && bVar.mo75642g(hVar)) || ((gVar = this.f66713g) != null && gVar.mo75642g(hVar)))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        C16501d.m98548i(hVar, "field");
        Long t = m97926t(hVar);
        if (t != null) {
            return t.longValue();
        }
        C16175b bVar = this.f66712f;
        if (bVar != null && bVar.mo75642g(hVar)) {
            return this.f66712f.mo75644l(hVar);
        }
        C15867g gVar = this.f66713g;
        if (gVar != null && gVar.mo75642g(hVar)) {
            return this.f66713g.mo75644l(hVar);
        }
        throw new DateTimeException("Field not found: " + hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98739g()) {
            return this.f66711d;
        }
        if (jVar == C16557i.m98733a()) {
            return this.f66710c;
        }
        if (jVar == C16557i.m98734b()) {
            C16175b bVar = this.f66712f;
            if (bVar != null) {
                return C15861e.m95539T(bVar);
            }
            return null;
        } else if (jVar == C16557i.m98735c()) {
            return this.f66713g;
        } else {
            if (jVar == C16557i.m98738f() || jVar == C16557i.m98736d()) {
                return jVar.mo75649a(this);
            }
            if (jVar == C16557i.m98737e()) {
                return null;
            }
            return jVar.mo75649a(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.f66709a.size() > 0) {
            sb.append("fields=");
            sb.append(this.f66709a);
        }
        sb.append(", ");
        sb.append(this.f66710c);
        sb.append(", ");
        sb.append(this.f66711d);
        sb.append(", ");
        sb.append(this.f66712f);
        sb.append(", ");
        sb.append(this.f66713g);
        sb.append(']');
        return sb.toString();
    }
}
