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
import p374qe.C16310b;
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

/* renamed from: oe.d */
/* compiled from: Instant */
public final class C15858d extends C16500c implements C16550d, C16552f, Comparable<C15858d>, Serializable {

    /* renamed from: a */
    public static final C15858d f65317a = new C15858d(0, 0);

    /* renamed from: c */
    public static final C15858d f65318c = m95508H(-31557014167219200L, 0);

    /* renamed from: d */
    public static final C15858d f65319d = m95508H(31556889864403199L, 999999999);

    /* renamed from: f */
    public static final C16565j<C15858d> f65320f = new C15859a();
    private static final long serialVersionUID = -665713676816604388L;
    private final int nanos;
    private final long seconds;

    /* renamed from: oe.d$a */
    /* compiled from: Instant */
    class C15859a implements C16565j<C15858d> {
        C15859a() {
        }

        /* renamed from: b */
        public C15858d mo75649a(C16551e eVar) {
            return C15858d.m95512x(eVar);
        }
    }

    /* renamed from: oe.d$b */
    /* compiled from: Instant */
    static /* synthetic */ class C15860b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65321a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65322b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
        static {
            /*
                se.b[] r0 = p392se.C16541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65322b = r0
                r1 = 1
                se.b r2 = p392se.C16541b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f65322b     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r3 = p392se.C16541b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f65322b     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r4 = p392se.C16541b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f65322b     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r5 = p392se.C16541b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f65322b     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r5 = p392se.C16541b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f65322b     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r5 = p392se.C16541b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f65322b     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.b r5 = p392se.C16541b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = f65322b     // Catch:{ NoSuchFieldError -> 0x0060 }
                se.b r5 = p392se.C16541b.DAYS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                se.a[] r4 = p392se.C16540a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f65321a = r4
                se.a r5 = p392se.C16540a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = f65321a     // Catch:{ NoSuchFieldError -> 0x007b }
                se.a r4 = p392se.C16540a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x007b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f65321a     // Catch:{ NoSuchFieldError -> 0x0085 }
                se.a r1 = p392se.C16540a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f65321a     // Catch:{ NoSuchFieldError -> 0x008f }
                se.a r1 = p392se.C16540a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15858d.C15860b.<clinit>():void");
        }
    }

    private C15858d(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    /* renamed from: E */
    public static C15858d m95506E(long j) {
        return m95511v(C16501d.m98544e(j, 1000), C16501d.m98546g(j, 1000) * 1000000);
    }

    /* renamed from: G */
    public static C15858d m95507G(long j) {
        return m95511v(j, 0);
    }

    /* renamed from: H */
    public static C15858d m95508H(long j, long j2) {
        return m95511v(C16501d.m98550k(j, C16501d.m98544e(j2, 1000000000)), C16501d.m98546g(j2, 1000000000));
    }

    /* renamed from: J */
    private C15858d m95509J(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m95508H(C16501d.m98550k(C16501d.m98550k(this.seconds, j), j2 / 1000000000), ((long) this.nanos) + (j2 % 1000000000));
    }

    /* renamed from: T */
    static C15858d m95510T(DataInput dataInput) throws IOException {
        return m95508H(dataInput.readLong(), (long) dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: v */
    private static C15858d m95511v(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f65317a;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new C15858d(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    private Object writeReplace() {
        return new C15883m((byte) 2, this);
    }

    /* renamed from: x */
    public static C15858d m95512x(C16551e eVar) {
        try {
            return m95508H(eVar.mo75644l(C16540a.INSTANT_SECONDS), (long) eVar.mo75647q(C16540a.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e);
        }
    }

    /* renamed from: A */
    public int mo75658A() {
        return this.nanos;
    }

    /* renamed from: C */
    public C15858d mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: L */
    public C15858d mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15858d) kVar.mo79350d(this, j);
        }
        switch (C15860b.f65322b[((C16541b) kVar).ordinal()]) {
            case 1:
                return mo75662P(j);
            case 2:
                return m95509J(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return mo75661N(j);
            case 4:
                return mo75663R(j);
            case 5:
                return mo75663R(C16501d.m98551l(j, 60));
            case 6:
                return mo75663R(C16501d.m98551l(j, 3600));
            case 7:
                return mo75663R(C16501d.m98551l(j, 43200));
            case 8:
                return mo75663R(C16501d.m98551l(j, 86400));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    /* renamed from: N */
    public C15858d mo75661N(long j) {
        return m95509J(j / 1000, (j % 1000) * 1000000);
    }

    /* renamed from: P */
    public C15858d mo75662P(long j) {
        return m95509J(0, j);
    }

    /* renamed from: R */
    public C15858d mo75663R(long j) {
        return m95509J(j, 0);
    }

    /* renamed from: U */
    public C15858d mo75673k(C16552f fVar) {
        return (C15858d) fVar.mo75646n(this);
    }

    /* renamed from: V */
    public C15858d mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15858d) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        aVar.mo79347l(j);
        int i = C15860b.f65321a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.nanos) ? m95511v(this.seconds, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.nanos ? m95511v(this.seconds, i2) : this;
        } else if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.nanos ? m95511v(this.seconds, i3) : this;
        } else if (i == 4) {
            return j != this.seconds ? m95511v(j, this.nanos) : this;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo75666X(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15858d)) {
            return false;
        }
        C15858d dVar = (C15858d) obj;
        if (this.seconds == dVar.seconds && this.nanos == dVar.nanos) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        return super.mo75641f(hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar == C16540a.INSTANT_SECONDS || hVar == C16540a.NANO_OF_SECOND || hVar == C16540a.MICRO_OF_SECOND || hVar == C16540a.MILLI_OF_SECOND) {
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
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        int i;
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i2 = C15860b.f65321a[((C16540a) hVar).ordinal()];
        if (i2 == 1) {
            i = this.nanos;
        } else if (i2 == 2) {
            i = this.nanos / 1000;
        } else if (i2 == 3) {
            i = this.nanos / 1000000;
        } else if (i2 == 4) {
            return this.seconds;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
        return (long) i;
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.INSTANT_SECONDS, this.seconds).mo75669d(C16540a.NANO_OF_SECOND, (long) this.nanos);
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return mo75641f(hVar).mo79364a(hVar.mo79340d(this), hVar);
        }
        int i = C15860b.f65321a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            return this.nanos;
        }
        if (i == 2) {
            return this.nanos / 1000;
        }
        if (i == 3) {
            return this.nanos / 1000000;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98737e()) {
            return C16541b.NANOS;
        }
        if (jVar == C16557i.m98734b() || jVar == C16557i.m98735c() || jVar == C16557i.m98733a() || jVar == C16557i.m98739g() || jVar == C16557i.m98738f() || jVar == C16557i.m98736d()) {
            return null;
        }
        return jVar.mo75649a(this);
    }

    /* renamed from: t */
    public int compareTo(C15858d dVar) {
        int b = C16501d.m98541b(this.seconds, dVar.seconds);
        if (b != 0) {
            return b;
        }
        return this.nanos - dVar.nanos;
    }

    public String toString() {
        return C16310b.f66728t.mo78926a(this);
    }

    /* renamed from: y */
    public long mo75676y() {
        return this.seconds;
    }
}
