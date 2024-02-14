package p365pe;

import java.util.Comparator;
import org.apache.commons.cli.HelpFormatter;
import p352oe.C15861e;
import p352oe.C15867g;
import p374qe.C16310b;
import p383re.C16499b;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16566k;

/* renamed from: pe.b */
/* compiled from: ChronoLocalDate */
public abstract class C16175b extends C16499b implements C16552f, Comparable<C16175b> {

    /* renamed from: a */
    private static final Comparator<C16175b> f66412a = new C16176a();

    /* renamed from: pe.b$a */
    /* compiled from: ChronoLocalDate */
    class C16176a implements Comparator<C16175b> {
        C16176a() {
        }

        /* renamed from: a */
        public int compare(C16175b bVar, C16175b bVar2) {
            return C16501d.m98541b(bVar.mo75686H(), bVar2.mo75686H());
        }
    }

    /* renamed from: A */
    public C16189i mo75678A() {
        return mo75718y().mo78646i(mo75647q(C16540a.ERA));
    }

    /* renamed from: C */
    public boolean mo75681C(C16175b bVar) {
        return mo75686H() < bVar.mo75686H();
    }

    /* renamed from: E */
    public C16175b mo75667b(long j, C16566k kVar) {
        return mo75718y().mo78640e(super.mo75667b(j, kVar));
    }

    /* renamed from: G */
    public abstract C16175b mo75670e(long j, C16566k kVar);

    /* renamed from: H */
    public long mo75686H() {
        return mo75644l(C16540a.EPOCH_DAY);
    }

    /* renamed from: J */
    public C16175b mo75673k(C16552f fVar) {
        return mo75718y().mo78640e(super.mo75673k(fVar));
    }

    /* renamed from: L */
    public abstract C16175b mo75669d(C16556h hVar, long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16175b) || compareTo((C16175b) obj) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return hVar.mo79339b();
        }
        return hVar != null && hVar.mo79341e(this);
    }

    public int hashCode() {
        long H = mo75686H();
        return mo75718y().hashCode() ^ ((int) (H ^ (H >>> 32)));
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.EPOCH_DAY, mo75686H());
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98733a()) {
            return mo75718y();
        }
        if (jVar == C16557i.m98737e()) {
            return C16541b.DAYS;
        }
        if (jVar == C16557i.m98734b()) {
            return C15861e.m95546v0(mo75686H());
        }
        if (jVar == C16557i.m98735c() || jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d()) {
            return null;
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public C16177c<?> mo75714t(C15867g gVar) {
        return C16179d.m97130T(this, gVar);
    }

    public String toString() {
        long l = mo75644l(C16540a.YEAR_OF_ERA);
        long l2 = mo75644l(C16540a.MONTH_OF_YEAR);
        long l3 = mo75644l(C16540a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(mo75718y().toString());
        sb.append(" ");
        sb.append(mo75678A());
        sb.append(" ");
        sb.append(l);
        String str = "-0";
        sb.append(l2 < 10 ? str : HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(l2);
        if (l3 >= 10) {
            str = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        sb.append(str);
        sb.append(l3);
        return sb.toString();
    }

    /* renamed from: v */
    public int compareTo(C16175b bVar) {
        int b = C16501d.m98541b(mo75686H(), bVar.mo75686H());
        return b == 0 ? mo75718y().compareTo(bVar.mo75718y()) : b;
    }

    /* renamed from: x */
    public String mo75717x(C16310b bVar) {
        C16501d.m98548i(bVar, "formatter");
        return bVar.mo78926a(this);
    }

    /* renamed from: y */
    public abstract C16187h mo75718y();
}
