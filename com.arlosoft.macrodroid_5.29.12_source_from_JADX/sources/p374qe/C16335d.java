package p374qe;

import java.util.Locale;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15858d;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16175b;
import p365pe.C16187h;
import p365pe.C16194m;
import p383re.C16500c;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16551e;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: qe.d */
/* compiled from: DateTimePrintContext */
final class C16335d {

    /* renamed from: a */
    private C16551e f66795a;

    /* renamed from: b */
    private Locale f66796b;

    /* renamed from: c */
    private C16339f f66797c;

    /* renamed from: d */
    private int f66798d;

    /* renamed from: qe.d$a */
    /* compiled from: DateTimePrintContext */
    class C16336a extends C16500c {

        /* renamed from: a */
        final /* synthetic */ C16175b f66799a;

        /* renamed from: c */
        final /* synthetic */ C16551e f66800c;

        /* renamed from: d */
        final /* synthetic */ C16187h f66801d;

        /* renamed from: f */
        final /* synthetic */ C15890p f66802f;

        C16336a(C16175b bVar, C16551e eVar, C16187h hVar, C15890p pVar) {
            this.f66799a = bVar;
            this.f66800c = eVar;
            this.f66801d = hVar;
            this.f66802f = pVar;
        }

        /* renamed from: f */
        public C16567l mo75641f(C16556h hVar) {
            if (this.f66799a == null || !hVar.mo79339b()) {
                return this.f66800c.mo75641f(hVar);
            }
            return this.f66799a.mo75641f(hVar);
        }

        /* renamed from: g */
        public boolean mo75642g(C16556h hVar) {
            if (this.f66799a == null || !hVar.mo79339b()) {
                return this.f66800c.mo75642g(hVar);
            }
            return this.f66799a.mo75642g(hVar);
        }

        /* renamed from: l */
        public long mo75644l(C16556h hVar) {
            if (this.f66799a == null || !hVar.mo79339b()) {
                return this.f66800c.mo75644l(hVar);
            }
            return this.f66799a.mo75644l(hVar);
        }

        /* renamed from: r */
        public <R> R mo75648r(C16565j<R> jVar) {
            if (jVar == C16557i.m98733a()) {
                return this.f66801d;
            }
            if (jVar == C16557i.m98739g()) {
                return this.f66802f;
            }
            if (jVar == C16557i.m98737e()) {
                return this.f66800c.mo75648r(jVar);
            }
            return jVar.mo75649a(this);
        }
    }

    C16335d(C16551e eVar, C16310b bVar) {
        this.f66795a = m98008a(eVar, bVar);
        this.f66796b = bVar.mo78930e();
        this.f66797c = bVar.mo78929d();
    }

    /* renamed from: a */
    private static C16551e m98008a(C16551e eVar, C16310b bVar) {
        C16187h c = bVar.mo78928c();
        C15890p f = bVar.mo78931f();
        if (c == null && f == null) {
            return eVar;
        }
        C16187h hVar = (C16187h) eVar.mo75648r(C16557i.m98733a());
        C15890p pVar = (C15890p) eVar.mo75648r(C16557i.m98739g());
        C16175b bVar2 = null;
        if (C16501d.m98542c(hVar, c)) {
            c = null;
        }
        if (C16501d.m98542c(pVar, f)) {
            f = null;
        }
        if (c == null && f == null) {
            return eVar;
        }
        C16187h hVar2 = c != null ? c : hVar;
        if (f != null) {
            pVar = f;
        }
        if (f != null) {
            if (eVar.mo75642g(C16540a.INSTANT_SECONDS)) {
                if (hVar2 == null) {
                    hVar2 = C16194m.f66460g;
                }
                return hVar2.mo78651v(C15858d.m95512x(eVar), f);
            }
            C15890p m = f.mo75861m();
            C15892q qVar = (C15892q) eVar.mo75648r(C16557i.m98736d());
            if ((m instanceof C15892q) && qVar != null && !m.equals(qVar)) {
                throw new DateTimeException("Invalid override zone for temporal: " + f + " " + eVar);
            }
        }
        if (c != null) {
            if (eVar.mo75642g(C16540a.EPOCH_DAY)) {
                bVar2 = hVar2.mo78639d(eVar);
            } else if (!(c == C16194m.f66460g && hVar == null)) {
                C16540a[] values = C16540a.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    C16540a aVar = values[i];
                    if (!aVar.mo79339b() || !eVar.mo75642g(aVar)) {
                        i++;
                    } else {
                        throw new DateTimeException("Invalid override chronology for temporal: " + c + " " + eVar);
                    }
                }
            }
        }
        return new C16336a(bVar2, eVar, hVar2, pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78991b() {
        this.f66798d--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Locale mo78992c() {
        return this.f66796b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C16339f mo78993d() {
        return this.f66797c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C16551e mo78994e() {
        return this.f66795a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Long mo78995f(C16556h hVar) {
        try {
            return Long.valueOf(this.f66795a.mo75644l(hVar));
        } catch (DateTimeException e) {
            if (this.f66798d > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <R> R mo78996g(C16565j<R> jVar) {
        R r = this.f66795a.mo75648r(jVar);
        if (r != null || this.f66798d != 0) {
            return r;
        }
        throw new DateTimeException("Unable to extract value: " + this.f66795a.getClass());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo78997h() {
        this.f66798d++;
    }

    public String toString() {
        return this.f66795a.toString();
    }
}
