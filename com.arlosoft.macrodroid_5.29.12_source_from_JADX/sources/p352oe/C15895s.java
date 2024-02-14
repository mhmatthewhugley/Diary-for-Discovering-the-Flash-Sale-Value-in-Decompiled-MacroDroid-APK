package p352oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.p356bp.DateTimeException;
import p365pe.C16182f;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16551e;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16566k;
import p392se.C16567l;
import p401te.C16627d;
import p401te.C16631f;

/* renamed from: oe.s */
/* compiled from: ZonedDateTime */
public final class C15895s extends C16182f<C15861e> implements Serializable {

    /* renamed from: c */
    public static final C16565j<C15895s> f65389c = new C15896a();
    private static final long serialVersionUID = -6260982410461394882L;
    private final C15864f dateTime;
    private final C15892q offset;
    private final C15890p zone;

    /* renamed from: oe.s$a */
    /* compiled from: ZonedDateTime */
    class C15896a implements C16565j<C15895s> {
        C15896a() {
        }

        /* renamed from: b */
        public C15895s mo75649a(C16551e eVar) {
            return C15895s.m95861R(eVar);
        }
    }

    /* renamed from: oe.s$b */
    /* compiled from: ZonedDateTime */
    static /* synthetic */ class C15897b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65390a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                se.a[] r0 = p392se.C16540a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65390a = r0
                se.a r1 = p392se.C16540a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f65390a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15895s.C15897b.<clinit>():void");
        }
    }

    private C15895s(C15864f fVar, C15892q qVar, C15890p pVar) {
        this.dateTime = fVar;
        this.offset = qVar;
        this.zone = pVar;
    }

    /* renamed from: P */
    private static C15895s m95860P(long j, int i, C15890p pVar) {
        C15892q a = pVar.mo75860j().mo79501a(C15858d.m95508H(j, (long) i));
        return new C15895s(C15864f.m95601d0(j, i, a), a, pVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(3:7|8|9)|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352oe.C15895s m95861R(p392se.C16551e r4) {
        /*
            boolean r0 = r4 instanceof p352oe.C15895s
            if (r0 == 0) goto L_0x0007
            oe.s r4 = (p352oe.C15895s) r4
            return r4
        L_0x0007:
            oe.p r0 = p352oe.C15890p.m95823i(r4)     // Catch:{ DateTimeException -> 0x002b }
            se.a r1 = p392se.C16540a.INSTANT_SECONDS     // Catch:{ DateTimeException -> 0x002b }
            boolean r2 = r4.mo75642g(r1)     // Catch:{ DateTimeException -> 0x002b }
            if (r2 == 0) goto L_0x0022
            long r1 = r4.mo75644l(r1)     // Catch:{ DateTimeException -> 0x0022 }
            se.a r3 = p392se.C16540a.NANO_OF_SECOND     // Catch:{ DateTimeException -> 0x0022 }
            int r3 = r4.mo75647q(r3)     // Catch:{ DateTimeException -> 0x0022 }
            oe.s r4 = m95860P(r1, r3, r0)     // Catch:{ DateTimeException -> 0x0022 }
            return r4
        L_0x0022:
            oe.f r1 = p352oe.C15864f.m95599X(r4)     // Catch:{ DateTimeException -> 0x002b }
            oe.s r4 = m95862V(r1, r0)     // Catch:{ DateTimeException -> 0x002b }
            return r4
        L_0x002b:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain ZonedDateTime from TemporalAccessor: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", type "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352oe.C15895s.m95861R(se.e):oe.s");
    }

    /* renamed from: V */
    public static C15895s m95862V(C15864f fVar, C15890p pVar) {
        return m95866a0(fVar, pVar, (C15892q) null);
    }

    /* renamed from: X */
    public static C15895s m95863X(C15858d dVar, C15890p pVar) {
        C16501d.m98548i(dVar, "instant");
        C16501d.m98548i(pVar, "zone");
        return m95860P(dVar.mo75676y(), dVar.mo75658A(), pVar);
    }

    /* renamed from: Y */
    public static C15895s m95864Y(C15864f fVar, C15892q qVar, C15890p pVar) {
        C16501d.m98548i(fVar, "localDateTime");
        C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        C16501d.m98548i(pVar, "zone");
        return m95860P(fVar.mo78621H(qVar), fVar.mo75732Y(), pVar);
    }

    /* renamed from: Z */
    private static C15895s m95865Z(C15864f fVar, C15892q qVar, C15890p pVar) {
        C16501d.m98548i(fVar, "localDateTime");
        C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        C16501d.m98548i(pVar, "zone");
        if (!(pVar instanceof C15892q) || qVar.equals(pVar)) {
            return new C15895s(fVar, qVar, pVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    /* renamed from: a0 */
    public static C15895s m95866a0(C15864f fVar, C15890p pVar, C15892q qVar) {
        C16501d.m98548i(fVar, "localDateTime");
        C16501d.m98548i(pVar, "zone");
        if (pVar instanceof C15892q) {
            return new C15895s(fVar, (C15892q) pVar, pVar);
        }
        C16631f j = pVar.mo75860j();
        List<C15892q> c = j.mo79503c(fVar);
        if (c.size() == 1) {
            qVar = c.get(0);
        } else if (c.size() == 0) {
            C16627d b = j.mo79502b(fVar);
            fVar = fVar.mo75744r0(b.mo79523f().mo75653e());
            qVar = b.mo79526j();
        } else if (qVar == null || !c.contains(qVar)) {
            qVar = (C15892q) C16501d.m98548i(c.get(0), TypedValues.Cycle.S_WAVE_OFFSET);
        }
        return new C15895s(fVar, qVar, pVar);
    }

    /* renamed from: c0 */
    static C15895s m95867c0(DataInput dataInput) throws IOException {
        return m95865Z(C15864f.m95604t0(dataInput), C15892q.m95837J(dataInput), (C15890p) C15883m.m95769a(dataInput));
    }

    /* renamed from: d0 */
    private C15895s m95868d0(C15864f fVar) {
        return m95864Y(fVar, this.offset, this.zone);
    }

    /* renamed from: e0 */
    private C15895s m95869e0(C15864f fVar) {
        return m95866a0(fVar, this.zone, this.offset);
    }

    /* renamed from: g0 */
    private C15895s m95870g0(C15892q qVar) {
        return (qVar.equals(this.offset) || !this.zone.mo75860j().mo79507f(this.dateTime, qVar)) ? this : new C15895s(this.dateTime, qVar, this.zone);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15883m((byte) 6, this);
    }

    /* renamed from: H */
    public C15867g mo75874H() {
        return this.dateTime.mo75727N();
    }

    /* renamed from: T */
    public int mo75878T() {
        return this.dateTime.mo75732Y();
    }

    /* renamed from: U */
    public C15895s mo75892y(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: b0 */
    public C15895s mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15895s) kVar.mo79350d(this, j);
        }
        if (kVar.mo79349b()) {
            return m95869e0(this.dateTime.mo75670e(j, kVar));
        }
        return m95868d0(this.dateTime.mo75670e(j, kVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15895s)) {
            return false;
        }
        C15895s sVar = (C15895s) obj;
        if (!this.dateTime.equals(sVar.dateTime) || !this.offset.equals(sVar.offset) || !this.zone.equals(sVar.zone)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        if (hVar == C16540a.INSTANT_SECONDS || hVar == C16540a.OFFSET_SECONDS) {
            return hVar.mo79343g();
        }
        return this.dateTime.mo75641f(hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        return (hVar instanceof C16540a) || (hVar != null && hVar.mo79341e(this));
    }

    public int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    /* renamed from: i0 */
    public C15861e mo75872E() {
        return this.dateTime.mo75726L();
    }

    /* renamed from: k0 */
    public C15864f mo75873G() {
        return this.dateTime;
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i = C15897b.f65390a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            return mo78631C();
        }
        if (i != 2) {
            return this.dateTime.mo75644l(hVar);
        }
        return (long) mo75890v().mo75866E();
    }

    /* renamed from: m0 */
    public C15895s mo75673k(C16552f fVar) {
        if (fVar instanceof C15861e) {
            return m95869e0(C15864f.m95600c0((C15861e) fVar, this.dateTime.mo75727N()));
        }
        if (fVar instanceof C15867g) {
            return m95869e0(C15864f.m95600c0(this.dateTime.mo75726L(), (C15867g) fVar));
        }
        if (fVar instanceof C15864f) {
            return m95869e0((C15864f) fVar);
        }
        if (fVar instanceof C15858d) {
            C15858d dVar = (C15858d) fVar;
            return m95860P(dVar.mo75676y(), dVar.mo75658A(), this.zone);
        } else if (fVar instanceof C15892q) {
            return m95870g0((C15892q) fVar);
        } else {
            return (C15895s) fVar.mo75646n(this);
        }
    }

    /* renamed from: o0 */
    public C15895s mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15895s) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        int i = C15897b.f65390a[aVar.ordinal()];
        if (i == 1) {
            return m95860P(j, mo75878T(), this.zone);
        }
        if (i != 2) {
            return m95869e0(this.dateTime.mo75669d(hVar, j));
        }
        return m95870g0(C15892q.m95835H(aVar.mo79346k(j)));
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return super.mo75647q(hVar);
        }
        int i = C15897b.f65390a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            throw new DateTimeException("Field too large for an int: " + hVar);
        } else if (i != 2) {
            return this.dateTime.mo75647q(hVar);
        } else {
            return mo75890v().mo75866E();
        }
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98734b()) {
            return mo75872E();
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: r0 */
    public C15895s mo75877N(C15890p pVar) {
        C16501d.m98548i(pVar, "zone");
        return this.zone.equals(pVar) ? this : m95866a0(this.dateTime, pVar, this.offset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo75888s0(DataOutput dataOutput) throws IOException {
        this.dateTime.mo75722A0(dataOutput);
        this.offset.mo75867P(dataOutput);
        this.zone.mo75863x(dataOutput);
    }

    public String toString() {
        String str = this.dateTime.toString() + this.offset.toString();
        if (this.offset == this.zone) {
            return str;
        }
        return str + '[' + this.zone.toString() + ']';
    }

    /* renamed from: v */
    public C15892q mo75890v() {
        return this.offset;
    }

    /* renamed from: x */
    public C15890p mo75891x() {
        return this.zone;
    }
}
