package p352oe;

import androidx.core.location.LocationRequestCompat;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.apache.commons.cli.HelpFormatter;
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

/* renamed from: oe.o */
/* compiled from: YearMonth */
public final class C15887o extends C16500c implements C16550d, C16552f, Comparable<C15887o>, Serializable {

    /* renamed from: a */
    public static final C16565j<C15887o> f65373a = new C15888a();

    /* renamed from: c */
    private static final C16310b f65374c = new C16313c().mo78955p(C16540a.YEAR, 4, 10, C16341h.EXCEEDS_PAD).mo78945e('-').mo78954o(C16540a.MONTH_OF_YEAR, 2).mo78939D();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    /* renamed from: oe.o$a */
    /* compiled from: YearMonth */
    class C15888a implements C16565j<C15887o> {
        C15888a() {
        }

        /* renamed from: b */
        public C15887o mo75649a(C16551e eVar) {
            return C15887o.m95798v(eVar);
        }
    }

    /* renamed from: oe.o$b */
    /* compiled from: YearMonth */
    static /* synthetic */ class C15889b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65375a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65376b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        static {
            /*
                se.b[] r0 = p392se.C16541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65376b = r0
                r1 = 1
                se.b r2 = p392se.C16541b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f65376b     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r3 = p392se.C16541b.YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f65376b     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r4 = p392se.C16541b.DECADES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f65376b     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r5 = p392se.C16541b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f65376b     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r6 = p392se.C16541b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f65376b     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r6 = p392se.C16541b.ERAS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                se.a[] r5 = p392se.C16540a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f65375a = r5
                se.a r6 = p392se.C16540a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f65375a     // Catch:{ NoSuchFieldError -> 0x0064 }
                se.a r5 = p392se.C16540a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f65375a     // Catch:{ NoSuchFieldError -> 0x006e }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f65375a     // Catch:{ NoSuchFieldError -> 0x0078 }
                se.a r1 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f65375a     // Catch:{ NoSuchFieldError -> 0x0082 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15887o.C15889b.<clinit>():void");
        }
    }

    private C15887o(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    /* renamed from: C */
    public static C15887o m95795C(int i, int i2) {
        C16540a.YEAR.mo79347l((long) i);
        C16540a.MONTH_OF_YEAR.mo79347l((long) i2);
        return new C15887o(i, i2);
    }

    /* renamed from: J */
    static C15887o m95796J(DataInput dataInput) throws IOException {
        return m95795C(dataInput.readInt(), dataInput.readByte());
    }

    /* renamed from: L */
    private C15887o m95797L(int i, int i2) {
        if (this.year == i && this.month == i2) {
            return this;
        }
        return new C15887o(i, i2);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: v */
    public static C15887o m95798v(C16551e eVar) {
        if (eVar instanceof C15887o) {
            return (C15887o) eVar;
        }
        try {
            if (!C16194m.f66460g.equals(C16187h.m97189j(eVar))) {
                eVar = C15861e.m95539T(eVar);
            }
            return m95795C(eVar.mo75647q(C16540a.YEAR), eVar.mo75647q(C16540a.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new C15883m((byte) 68, this);
    }

    /* renamed from: x */
    private long m95799x() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    /* renamed from: A */
    public C15887o mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: E */
    public C15887o mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15887o) kVar.mo79350d(this, j);
        }
        switch (C15889b.f65376b[((C16541b) kVar).ordinal()]) {
            case 1:
                return mo75843G(j);
            case 2:
                return mo75844H(j);
            case 3:
                return mo75844H(C16501d.m98551l(j, 10));
            case 4:
                return mo75844H(C16501d.m98551l(j, 100));
            case 5:
                return mo75844H(C16501d.m98551l(j, 1000));
            case 6:
                C16540a aVar = C16540a.ERA;
                return mo75669d(aVar, C16501d.m98550k(mo75644l(aVar), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    /* renamed from: G */
    public C15887o mo75843G(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return m95797L(C16540a.YEAR.mo79346k(C16501d.m98544e(j2, 12)), C16501d.m98546g(j2, 12) + 1);
    }

    /* renamed from: H */
    public C15887o mo75844H(long j) {
        if (j == 0) {
            return this;
        }
        return m95797L(C16540a.YEAR.mo79346k(((long) this.year) + j), this.month);
    }

    /* renamed from: N */
    public C15887o mo75673k(C16552f fVar) {
        return (C15887o) fVar.mo75646n(this);
    }

    /* renamed from: P */
    public C15887o mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15887o) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        aVar.mo79347l(j);
        int i = C15889b.f65375a[aVar.ordinal()];
        if (i == 1) {
            return mo75847R((int) j);
        }
        if (i == 2) {
            return mo75843G(j - mo75644l(C16540a.PROLEPTIC_MONTH));
        }
        if (i == 3) {
            if (this.year < 1) {
                j = 1 - j;
            }
            return mo75848T((int) j);
        } else if (i == 4) {
            return mo75848T((int) j);
        } else {
            if (i == 5) {
                return mo75644l(C16540a.ERA) == j ? this : mo75848T(1 - this.year);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: R */
    public C15887o mo75847R(int i) {
        C16540a.MONTH_OF_YEAR.mo79347l((long) i);
        return m95797L(this.year, i);
    }

    /* renamed from: T */
    public C15887o mo75848T(int i) {
        C16540a.YEAR.mo79347l((long) i);
        return m95797L(i, this.month);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo75849U(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15887o)) {
            return false;
        }
        C15887o oVar = (C15887o) obj;
        if (this.year == oVar.year && this.month == oVar.month) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar != C16540a.YEAR_OF_ERA) {
            return super.mo75641f(hVar);
        }
        return C16567l.m98757i(1, mo75855y() <= 0 ? 1000000000 : 999999999);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar == C16540a.YEAR || hVar == C16540a.MONTH_OF_YEAR || hVar == C16540a.PROLEPTIC_MONTH || hVar == C16540a.YEAR_OF_ERA || hVar == C16540a.ERA) {
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
        return this.year ^ (this.month << 27);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        int i;
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i2 = C15889b.f65375a[((C16540a) hVar).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i = this.month;
        } else if (i2 == 2) {
            return m95799x();
        } else {
            if (i2 == 3) {
                int i4 = this.year;
                if (i4 < 1) {
                    i4 = 1 - i4;
                }
                return (long) i4;
            } else if (i2 == 4) {
                i = this.year;
            } else if (i2 == 5) {
                if (this.year < 1) {
                    i3 = 0;
                }
                return (long) i3;
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
            }
        }
        return (long) i;
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        if (C16187h.m97189j(dVar).equals(C16194m.f66460g)) {
            return dVar.mo75669d(C16540a.PROLEPTIC_MONTH, m95799x());
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
            return C16541b.MONTHS;
        }
        if (jVar == C16557i.m98734b() || jVar == C16557i.m98735c() || jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d()) {
            return null;
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public int compareTo(C15887o oVar) {
        int i = this.year - oVar.year;
        return i == 0 ? this.month - oVar.month : i;
    }

    public String toString() {
        int abs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.year;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.year);
        }
        sb.append(this.month < 10 ? "-0" : HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(this.month);
        return sb.toString();
    }

    /* renamed from: y */
    public int mo75855y() {
        return this.year;
    }
}
