package p352oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;
import org.threeten.p356bp.DateTimeException;
import p365pe.C16194m;
import p383re.C16499b;
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

/* renamed from: oe.j */
/* compiled from: OffsetDateTime */
public final class C15876j extends C16499b implements C16552f, Comparable<C15876j>, Serializable {

    /* renamed from: a */
    public static final C15876j f65359a = C15864f.f65328c.mo75730T(C15892q.f65384z);

    /* renamed from: c */
    public static final C15876j f65360c = C15864f.f65329d.mo75730T(C15892q.f65383s);

    /* renamed from: d */
    public static final C16565j<C15876j> f65361d = new C15877a();

    /* renamed from: f */
    private static final Comparator<C15876j> f65362f = new C15878b();
    private static final long serialVersionUID = 2287754244819255394L;
    private final C15864f dateTime;
    private final C15892q offset;

    /* renamed from: oe.j$a */
    /* compiled from: OffsetDateTime */
    class C15877a implements C16565j<C15876j> {
        C15877a() {
        }

        /* renamed from: b */
        public C15876j mo75649a(C16551e eVar) {
            return C15876j.m95719v(eVar);
        }
    }

    /* renamed from: oe.j$b */
    /* compiled from: OffsetDateTime */
    class C15878b implements Comparator<C15876j> {
        C15878b() {
        }

        /* renamed from: a */
        public int compare(C15876j jVar, C15876j jVar2) {
            int b = C16501d.m98541b(jVar.mo75795J(), jVar2.mo75795J());
            return b == 0 ? C16501d.m98541b((long) jVar.mo75807x(), (long) jVar2.mo75807x()) : b;
        }
    }

    /* renamed from: oe.j$c */
    /* compiled from: OffsetDateTime */
    static /* synthetic */ class C15879c {

        /* renamed from: a */
        static final /* synthetic */ int[] f65363a;

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
                f65363a = r0
                se.a r1 = p392se.C16540a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f65363a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15876j.C15879c.<clinit>():void");
        }
    }

    private C15876j(C15864f fVar, C15892q qVar) {
        this.dateTime = (C15864f) C16501d.m98548i(fVar, "dateTime");
        this.offset = (C15892q) C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
    }

    /* renamed from: C */
    public static C15876j m95715C(C15864f fVar, C15892q qVar) {
        return new C15876j(fVar, qVar);
    }

    /* renamed from: E */
    public static C15876j m95716E(C15858d dVar, C15890p pVar) {
        C16501d.m98548i(dVar, "instant");
        C16501d.m98548i(pVar, "zone");
        C15892q a = pVar.mo75860j().mo79501a(dVar);
        return new C15876j(C15864f.m95601d0(dVar.mo75676y(), dVar.mo75658A(), a), a);
    }

    /* renamed from: H */
    static C15876j m95717H(DataInput dataInput) throws IOException {
        return m95715C(C15864f.m95604t0(dataInput), C15892q.m95837J(dataInput));
    }

    /* renamed from: R */
    private C15876j m95718R(C15864f fVar, C15892q qVar) {
        if (this.dateTime != fVar || !this.offset.equals(qVar)) {
            return new C15876j(fVar, qVar);
        }
        return this;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return m95716E(p352oe.C15858d.m95512x(r3), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352oe.C15876j m95719v(p392se.C16551e r3) {
        /*
            boolean r0 = r3 instanceof p352oe.C15876j
            if (r0 == 0) goto L_0x0007
            oe.j r3 = (p352oe.C15876j) r3
            return r3
        L_0x0007:
            oe.q r0 = p352oe.C15892q.m95832C(r3)     // Catch:{ DateTimeException -> 0x001d }
            oe.f r1 = p352oe.C15864f.m95599X(r3)     // Catch:{ DateTimeException -> 0x0014 }
            oe.j r3 = m95715C(r1, r0)     // Catch:{ DateTimeException -> 0x0014 }
            return r3
        L_0x0014:
            oe.d r1 = p352oe.C15858d.m95512x(r3)     // Catch:{ DateTimeException -> 0x001d }
            oe.j r3 = m95716E(r1, r0)     // Catch:{ DateTimeException -> 0x001d }
            return r3
        L_0x001d:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain OffsetDateTime from TemporalAccessor: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", type "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352oe.C15876j.m95719v(se.e):oe.j");
    }

    private Object writeReplace() {
        return new C15883m((byte) 69, this);
    }

    /* renamed from: A */
    public C15876j mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: G */
    public C15876j mo75670e(long j, C16566k kVar) {
        if (kVar instanceof C16541b) {
            return m95718R(this.dateTime.mo75670e(j, kVar), this.offset);
        }
        return (C15876j) kVar.mo79350d(this, j);
    }

    /* renamed from: J */
    public long mo75795J() {
        return this.dateTime.mo78621H(this.offset);
    }

    /* renamed from: L */
    public C15861e mo75796L() {
        return this.dateTime.mo75726L();
    }

    /* renamed from: N */
    public C15864f mo75797N() {
        return this.dateTime;
    }

    /* renamed from: P */
    public C15867g mo75798P() {
        return this.dateTime.mo75727N();
    }

    /* renamed from: T */
    public C15876j mo75673k(C16552f fVar) {
        if ((fVar instanceof C15861e) || (fVar instanceof C15867g) || (fVar instanceof C15864f)) {
            return m95718R(this.dateTime.mo75673k(fVar), this.offset);
        }
        if (fVar instanceof C15858d) {
            return m95716E((C15858d) fVar, this.offset);
        }
        if (fVar instanceof C15892q) {
            return m95718R(this.dateTime, (C15892q) fVar);
        }
        if (fVar instanceof C15876j) {
            return (C15876j) fVar;
        }
        return (C15876j) fVar.mo75646n(this);
    }

    /* renamed from: U */
    public C15876j mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15876j) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        int i = C15879c.f65363a[aVar.ordinal()];
        if (i == 1) {
            return m95716E(C15858d.m95508H(j, (long) mo75807x()), this.offset);
        }
        if (i != 2) {
            return m95718R(this.dateTime.mo75669d(hVar, j), this.offset);
        }
        return m95718R(this.dateTime, C15892q.m95835H(aVar.mo79346k(j)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo75801V(DataOutput dataOutput) throws IOException {
        this.dateTime.mo75722A0(dataOutput);
        this.offset.mo75867P(dataOutput);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15876j)) {
            return false;
        }
        C15876j jVar = (C15876j) obj;
        if (!this.dateTime.equals(jVar.dateTime) || !this.offset.equals(jVar.offset)) {
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
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i = C15879c.f65363a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            return mo75795J();
        }
        if (i != 2) {
            return this.dateTime.mo75644l(hVar);
        }
        return (long) mo75808y().mo75866E();
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.EPOCH_DAY, mo75796L().mo75686H()).mo75669d(C16540a.NANO_OF_DAY, mo75798P().mo75762Z()).mo75669d(C16540a.OFFSET_SECONDS, (long) mo75808y().mo75866E());
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return super.mo75647q(hVar);
        }
        int i = C15879c.f65363a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            throw new DateTimeException("Field too large for an int: " + hVar);
        } else if (i != 2) {
            return this.dateTime.mo75647q(hVar);
        } else {
            return mo75808y().mo75866E();
        }
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98733a()) {
            return C16194m.f66460g;
        }
        if (jVar == C16557i.m98737e()) {
            return C16541b.NANOS;
        }
        if (jVar == C16557i.m98736d() || jVar == C16557i.m98738f()) {
            return mo75808y();
        }
        if (jVar == C16557i.m98734b()) {
            return mo75796L();
        }
        if (jVar == C16557i.m98735c()) {
            return mo75798P();
        }
        if (jVar == C16557i.m98739g()) {
            return null;
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public int compareTo(C15876j jVar) {
        if (mo75808y().equals(jVar.mo75808y())) {
            return mo75797N().compareTo(jVar.mo75797N());
        }
        int b = C16501d.m98541b(mo75795J(), jVar.mo75795J());
        if (b != 0) {
            return b;
        }
        int E = mo75798P().mo75754E() - jVar.mo75798P().mo75754E();
        return E == 0 ? mo75797N().compareTo(jVar.mo75797N()) : E;
    }

    public String toString() {
        return this.dateTime.toString() + this.offset.toString();
    }

    /* renamed from: x */
    public int mo75807x() {
        return this.dateTime.mo75732Y();
    }

    /* renamed from: y */
    public C15892q mo75808y() {
        return this.offset;
    }
}
