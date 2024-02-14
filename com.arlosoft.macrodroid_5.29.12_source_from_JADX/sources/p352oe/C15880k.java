package p352oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p356bp.DateTimeException;
import p383re.C16500c;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16551e;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16566k;
import p392se.C16567l;

/* renamed from: oe.k */
/* compiled from: OffsetTime */
public final class C15880k extends C16500c implements C16550d, C16552f, Comparable<C15880k>, Serializable {

    /* renamed from: a */
    public static final C15880k f65364a = C15867g.f65332a.mo75774t(C15892q.f65384z);

    /* renamed from: c */
    public static final C15880k f65365c = C15867g.f65333c.mo75774t(C15892q.f65383s);

    /* renamed from: d */
    public static final C16565j<C15880k> f65366d = new C15881a();
    private static final long serialVersionUID = 7264499704384272492L;
    private final C15892q offset;
    private final C15867g time;

    /* renamed from: oe.k$a */
    /* compiled from: OffsetTime */
    class C15881a implements C16565j<C15880k> {
        C15881a() {
        }

        /* renamed from: b */
        public C15880k mo75649a(C16551e eVar) {
            return C15880k.m95749v(eVar);
        }
    }

    private C15880k(C15867g gVar, C15892q qVar) {
        this.time = (C15867g) C16501d.m98548i(gVar, "time");
        this.offset = (C15892q) C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
    }

    /* renamed from: A */
    public static C15880k m95745A(C15867g gVar, C15892q qVar) {
        return new C15880k(gVar, qVar);
    }

    /* renamed from: E */
    static C15880k m95746E(DataInput dataInput) throws IOException {
        return m95745A(C15867g.m95650Y(dataInput), C15892q.m95837J(dataInput));
    }

    /* renamed from: G */
    private long m95747G() {
        return this.time.mo75762Z() - (((long) this.offset.mo75866E()) * 1000000000);
    }

    /* renamed from: H */
    private C15880k m95748H(C15867g gVar, C15892q qVar) {
        if (this.time != gVar || !this.offset.equals(qVar)) {
            return new C15880k(gVar, qVar);
        }
        return this;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: v */
    public static C15880k m95749v(C16551e eVar) {
        if (eVar instanceof C15880k) {
            return (C15880k) eVar;
        }
        try {
            return new C15880k(C15867g.m95652y(eVar), C15892q.m95832C(eVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new C15883m((byte) 66, this);
    }

    /* renamed from: C */
    public C15880k mo75670e(long j, C16566k kVar) {
        if (kVar instanceof C16541b) {
            return m95748H(this.time.mo75670e(j, kVar), this.offset);
        }
        return (C15880k) kVar.mo79350d(this, j);
    }

    /* renamed from: J */
    public C15880k mo75673k(C16552f fVar) {
        if (fVar instanceof C15867g) {
            return m95748H((C15867g) fVar, this.offset);
        }
        if (fVar instanceof C15892q) {
            return m95748H(this.time, (C15892q) fVar);
        }
        if (fVar instanceof C15880k) {
            return (C15880k) fVar;
        }
        return (C15880k) fVar.mo75646n(this);
    }

    /* renamed from: L */
    public C15880k mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15880k) hVar.mo79344i(this, j);
        }
        if (hVar == C16540a.OFFSET_SECONDS) {
            return m95748H(this.time, C15892q.m95835H(((C16540a) hVar).mo79346k(j)));
        }
        return m95748H(this.time.mo75669d(hVar, j), this.offset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo75815N(DataOutput dataOutput) throws IOException {
        this.time.mo75773k0(dataOutput);
        this.offset.mo75867P(dataOutput);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15880k)) {
            return false;
        }
        C15880k kVar = (C15880k) obj;
        if (!this.time.equals(kVar.time) || !this.offset.equals(kVar.offset)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        if (hVar == C16540a.OFFSET_SECONDS) {
            return hVar.mo79343g();
        }
        return this.time.mo75641f(hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar.mo79345j() || hVar == C16540a.OFFSET_SECONDS) {
                return true;
            }
            return false;
        } else if (hVar == null || !hVar.mo79341e(this)) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return this.time.hashCode() ^ this.offset.hashCode();
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        if (hVar == C16540a.OFFSET_SECONDS) {
            return (long) mo75821x().mo75866E();
        }
        return this.time.mo75644l(hVar);
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.NANO_OF_DAY, this.time.mo75762Z()).mo75669d(C16540a.OFFSET_SECONDS, (long) mo75821x().mo75866E());
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        return super.mo75647q(hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98737e()) {
            return C16541b.NANOS;
        }
        if (jVar == C16557i.m98736d() || jVar == C16557i.m98738f()) {
            return mo75821x();
        }
        if (jVar == C16557i.m98735c()) {
            return this.time;
        }
        if (jVar == C16557i.m98733a() || jVar == C16557i.m98734b() || jVar == C16557i.m98739g()) {
            return null;
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public int compareTo(C15880k kVar) {
        if (this.offset.equals(kVar.offset)) {
            return this.time.compareTo(kVar.time);
        }
        int b = C16501d.m98541b(m95747G(), kVar.m95747G());
        return b == 0 ? this.time.compareTo(kVar.time) : b;
    }

    public String toString() {
        return this.time.toString() + this.offset.toString();
    }

    /* renamed from: x */
    public C15892q mo75821x() {
        return this.offset;
    }

    /* renamed from: y */
    public C15880k mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }
}
