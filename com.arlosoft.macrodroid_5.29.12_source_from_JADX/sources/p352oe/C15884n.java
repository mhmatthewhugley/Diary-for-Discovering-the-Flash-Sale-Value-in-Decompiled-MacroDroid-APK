package p352oe;

import androidx.core.location.LocationRequestCompat;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p365pe.C16187h;
import p365pe.C16194m;
import p374qe.C16310b;
import p374qe.C16313c;
import p374qe.C16341h;
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

/* renamed from: oe.n */
/* compiled from: Year */
public final class C15884n extends C16500c implements C16550d, C16552f, Comparable<C15884n>, Serializable {

    /* renamed from: a */
    public static final C16565j<C15884n> f65369a = new C15885a();

    /* renamed from: c */
    private static final C16310b f65370c = new C16313c().mo78955p(C16540a.YEAR, 4, 10, C16341h.EXCEEDS_PAD).mo78939D();
    private static final long serialVersionUID = -23038383694477807L;
    private final int year;

    /* renamed from: oe.n$a */
    /* compiled from: Year */
    class C15885a implements C16565j<C15884n> {
        C15885a() {
        }

        /* renamed from: b */
        public C15884n mo75649a(C16551e eVar) {
            return C15884n.m95774v(eVar);
        }
    }

    /* renamed from: oe.n$b */
    /* compiled from: Year */
    static /* synthetic */ class C15886b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65371a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65372b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                se.b[] r0 = p392se.C16541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65372b = r0
                r1 = 1
                se.b r2 = p392se.C16541b.YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f65372b     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r3 = p392se.C16541b.DECADES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f65372b     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r4 = p392se.C16541b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f65372b     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r4 = p392se.C16541b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f65372b     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r4 = p392se.C16541b.ERAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                se.a[] r3 = p392se.C16540a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f65371a = r3
                se.a r4 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f65371a     // Catch:{ NoSuchFieldError -> 0x0059 }
                se.a r3 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f65371a     // Catch:{ NoSuchFieldError -> 0x0063 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15884n.C15886b.<clinit>():void");
        }
    }

    private C15884n(int i) {
        this.year = i;
    }

    /* renamed from: A */
    public static C15884n m95772A(int i) {
        C16540a.YEAR.mo79347l((long) i);
        return new C15884n(i);
    }

    /* renamed from: G */
    static C15884n m95773G(DataInput dataInput) throws IOException {
        return m95772A(dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: v */
    public static C15884n m95774v(C16551e eVar) {
        if (eVar instanceof C15884n) {
            return (C15884n) eVar;
        }
        try {
            if (!C16194m.f66460g.equals(C16187h.m97189j(eVar))) {
                eVar = C15861e.m95539T(eVar);
            }
            return m95772A(eVar.mo75647q(C16540a.YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new C15883m((byte) 67, this);
    }

    /* renamed from: x */
    public static boolean m95775x(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    /* renamed from: C */
    public C15884n mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15884n) kVar.mo79350d(this, j);
        }
        int i = C15886b.f65372b[((C16541b) kVar).ordinal()];
        if (i == 1) {
            return mo75830E(j);
        }
        if (i == 2) {
            return mo75830E(C16501d.m98551l(j, 10));
        }
        if (i == 3) {
            return mo75830E(C16501d.m98551l(j, 100));
        }
        if (i == 4) {
            return mo75830E(C16501d.m98551l(j, 1000));
        }
        if (i == 5) {
            C16540a aVar = C16540a.ERA;
            return mo75669d(aVar, C16501d.m98550k(mo75644l(aVar), j));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
    }

    /* renamed from: E */
    public C15884n mo75830E(long j) {
        return j == 0 ? this : m95772A(C16540a.YEAR.mo79346k(((long) this.year) + j));
    }

    /* renamed from: H */
    public C15884n mo75673k(C16552f fVar) {
        return (C15884n) fVar.mo75646n(this);
    }

    /* renamed from: J */
    public C15884n mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15884n) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        aVar.mo79347l(j);
        int i = C15886b.f65371a[aVar.ordinal()];
        if (i == 1) {
            if (this.year < 1) {
                j = 1 - j;
            }
            return m95772A((int) j);
        } else if (i == 2) {
            return m95772A((int) j);
        } else {
            if (i == 3) {
                return mo75644l(C16540a.ERA) == j ? this : m95772A(1 - this.year);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo75833L(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15884n) || this.year != ((C15884n) obj).year) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar != C16540a.YEAR_OF_ERA) {
            return super.mo75641f(hVar);
        }
        return C16567l.m98757i(1, this.year <= 0 ? 1000000000 : 999999999);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar == C16540a.YEAR || hVar == C16540a.YEAR_OF_ERA || hVar == C16540a.ERA) {
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
        return this.year;
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i = C15886b.f65371a[((C16540a) hVar).ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = this.year;
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return (long) i3;
        } else if (i == 2) {
            return (long) this.year;
        } else {
            if (i == 3) {
                if (this.year < 1) {
                    i2 = 0;
                }
                return (long) i2;
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        if (C16187h.m97189j(dVar).equals(C16194m.f66460g)) {
            return dVar.mo75669d(C16540a.YEAR, (long) this.year);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98733a()) {
            return C16194m.f66460g;
        }
        if (jVar == C16557i.m98737e()) {
            return C16541b.YEARS;
        }
        if (jVar == C16557i.m98734b() || jVar == C16557i.m98735c() || jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d()) {
            return null;
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public int compareTo(C15884n nVar) {
        return this.year - nVar.year;
    }

    public String toString() {
        return Integer.toString(this.year);
    }

    /* renamed from: y */
    public C15884n mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }
}
