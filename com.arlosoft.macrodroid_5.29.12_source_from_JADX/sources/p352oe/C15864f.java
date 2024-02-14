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
import p365pe.C16177c;
import p374qe.C16310b;
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

/* renamed from: oe.f */
/* compiled from: LocalDateTime */
public final class C15864f extends C16177c<C15861e> implements Serializable {

    /* renamed from: c */
    public static final C15864f f65328c = m95600c0(C15861e.f65323c, C15867g.f65332a);

    /* renamed from: d */
    public static final C15864f f65329d = m95600c0(C15861e.f65324d, C15867g.f65333c);

    /* renamed from: f */
    public static final C16565j<C15864f> f65330f = new C15865a();
    private static final long serialVersionUID = 6207766400415563566L;
    private final C15861e date;
    private final C15867g time;

    /* renamed from: oe.f$a */
    /* compiled from: LocalDateTime */
    class C15865a implements C16565j<C15864f> {
        C15865a() {
        }

        /* renamed from: b */
        public C15864f mo75649a(C16551e eVar) {
            return C15864f.m95599X(eVar);
        }
    }

    /* renamed from: oe.f$b */
    /* compiled from: LocalDateTime */
    static /* synthetic */ class C15866b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                se.b[] r0 = p392se.C16541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65331a = r0
                se.b r1 = p392se.C16541b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f65331a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r1 = p392se.C16541b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f65331a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r1 = p392se.C16541b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f65331a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r1 = p392se.C16541b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f65331a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r1 = p392se.C16541b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f65331a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r1 = p392se.C16541b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f65331a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.b r1 = p392se.C16541b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15864f.C15866b.<clinit>():void");
        }
    }

    private C15864f(C15861e eVar, C15867g gVar) {
        this.date = eVar;
        this.time = gVar;
    }

    /* renamed from: V */
    private int m95598V(C15864f fVar) {
        int P = this.date.mo75696P(fVar.mo75726L());
        return P == 0 ? this.time.compareTo(fVar.mo75727N()) : P;
    }

    /* renamed from: X */
    public static C15864f m95599X(C16551e eVar) {
        if (eVar instanceof C15864f) {
            return (C15864f) eVar;
        }
        if (eVar instanceof C15895s) {
            return ((C15895s) eVar).mo75873G();
        }
        try {
            return new C15864f(C15861e.m95539T(eVar), C15867g.m95652y(eVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    /* renamed from: c0 */
    public static C15864f m95600c0(C15861e eVar, C15867g gVar) {
        C16501d.m98548i(eVar, "date");
        C16501d.m98548i(gVar, "time");
        return new C15864f(eVar, gVar);
    }

    /* renamed from: d0 */
    public static C15864f m95601d0(long j, int i, C15892q qVar) {
        C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        long E = j + ((long) qVar.mo75866E());
        return new C15864f(C15861e.m95546v0(C16501d.m98544e(E, 86400)), C15867g.m95649P((long) C16501d.m98546g(E, 86400), i));
    }

    /* renamed from: e0 */
    public static C15864f m95602e0(C15858d dVar, C15890p pVar) {
        C16501d.m98548i(dVar, "instant");
        C16501d.m98548i(pVar, "zone");
        return m95601d0(dVar.mo75676y(), dVar.mo75658A(), pVar.mo75860j().mo79501a(dVar));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s0 */
    private C15864f m95603s0(C15861e eVar, long j, long j2, long j3, long j4, int i) {
        C15861e eVar2 = eVar;
        if ((j | j2 | j3 | j4) == 0) {
            return m95605v0(eVar2, this.time);
        }
        long j5 = (long) i;
        long Z = this.time.mo75762Z();
        long j6 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j5) + Z;
        long e = (((j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24)) * j5) + C16501d.m98544e(j6, 86400000000000L);
        long h = C16501d.m98547h(j6, 86400000000000L);
        return m95605v0(eVar2.mo75679A0(e), h == Z ? this.time : C15867g.m95647L(h));
    }

    /* renamed from: t0 */
    static C15864f m95604t0(DataInput dataInput) throws IOException {
        return m95600c0(C15861e.m95536F0(dataInput), C15867g.m95650Y(dataInput));
    }

    /* renamed from: v0 */
    private C15864f m95605v0(C15861e eVar, C15867g gVar) {
        if (this.date == eVar && this.time == gVar) {
            return this;
        }
        return new C15864f(eVar, gVar);
    }

    private Object writeReplace() {
        return new C15883m((byte) 4, this);
    }

    /* renamed from: A */
    public boolean mo75721A(C16177c<?> cVar) {
        if (cVar instanceof C15864f) {
            return m95598V((C15864f) cVar) > 0;
        }
        return super.mo75721A(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo75722A0(DataOutput dataOutput) throws IOException {
        this.date.mo75697P0(dataOutput);
        this.time.mo75773k0(dataOutput);
    }

    /* renamed from: C */
    public boolean mo75723C(C16177c<?> cVar) {
        if (cVar instanceof C15864f) {
            return m95598V((C15864f) cVar) < 0;
        }
        return super.mo75723C(cVar);
    }

    /* renamed from: N */
    public C15867g mo75727N() {
        return this.time;
    }

    /* renamed from: T */
    public C15876j mo75730T(C15892q qVar) {
        return C15876j.m95715C(this, qVar);
    }

    /* renamed from: U */
    public C15895s mo75745t(C15890p pVar) {
        return C15895s.m95862V(this, pVar);
    }

    /* renamed from: Y */
    public int mo75732Y() {
        return this.time.mo75754E();
    }

    /* renamed from: Z */
    public int mo75733Z() {
        return this.time.mo75755G();
    }

    /* renamed from: a0 */
    public int mo75734a0() {
        return this.date.mo75705d0();
    }

    /* renamed from: b0 */
    public C15864f mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15864f)) {
            return false;
        }
        C15864f fVar = (C15864f) obj;
        if (!this.date.equals(fVar.date) || !this.time.equals(fVar.time)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return hVar.mo79345j() ? this.time.mo75641f(hVar) : this.date.mo75641f(hVar);
        }
        return hVar.mo79342f(this);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar.mo79339b() || hVar.mo79345j()) {
                return true;
            }
            return false;
        } else if (hVar == null || !hVar.mo79341e(this)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g0 */
    public C15864f mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15864f) kVar.mo79350d(this, j);
        }
        switch (C15866b.f65331a[((C16541b) kVar).ordinal()]) {
            case 1:
                return mo75743o0(j);
            case 2:
                return mo75740i0(j / 86400000000L).mo75743o0((j % 86400000000L) * 1000);
            case 3:
                return mo75740i0(j / 86400000).mo75743o0((j % 86400000) * 1000000);
            case 4:
                return mo75744r0(j);
            case 5:
                return mo75742m0(j);
            case 6:
                return mo75741k0(j);
            case 7:
                return mo75740i0(j / 256).mo75741k0((j % 256) * 12);
            default:
                return m95605v0(this.date.mo75670e(j, kVar), this.time);
        }
    }

    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    /* renamed from: i0 */
    public C15864f mo75740i0(long j) {
        return m95605v0(this.date.mo75679A0(j), this.time);
    }

    /* renamed from: k0 */
    public C15864f mo75741k0(long j) {
        return m95603s0(this.date, j, 0, 0, 0, 1);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return hVar.mo79345j() ? this.time.mo75644l(hVar) : this.date.mo75644l(hVar);
        }
        return hVar.mo79340d(this);
    }

    /* renamed from: m0 */
    public C15864f mo75742m0(long j) {
        return m95603s0(this.date, 0, j, 0, 0, 1);
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return super.mo75646n(dVar);
    }

    /* renamed from: o0 */
    public C15864f mo75743o0(long j) {
        return m95603s0(this.date, 0, 0, 0, j, 1);
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return hVar.mo79345j() ? this.time.mo75647q(hVar) : this.date.mo75647q(hVar);
        }
        return super.mo75647q(hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98734b()) {
            return mo75726L();
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: r0 */
    public C15864f mo75744r0(long j) {
        return m95603s0(this.date, 0, 0, j, 0, 1);
    }

    public String toString() {
        return this.date.toString() + 'T' + this.time.toString();
    }

    /* renamed from: u0 */
    public C15861e mo75726L() {
        return this.date;
    }

    /* renamed from: v */
    public int compareTo(C16177c<?> cVar) {
        if (cVar instanceof C15864f) {
            return m95598V((C15864f) cVar);
        }
        return super.compareTo(cVar);
    }

    /* renamed from: x */
    public String mo75749x(C16310b bVar) {
        return super.mo75749x(bVar);
    }

    /* renamed from: x0 */
    public C15864f mo75673k(C16552f fVar) {
        if (fVar instanceof C15861e) {
            return m95605v0((C15861e) fVar, this.time);
        }
        if (fVar instanceof C15867g) {
            return m95605v0(this.date, (C15867g) fVar);
        }
        if (fVar instanceof C15864f) {
            return (C15864f) fVar;
        }
        return (C15864f) fVar.mo75646n(this);
    }

    /* renamed from: z0 */
    public C15864f mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15864f) hVar.mo79344i(this, j);
        }
        if (hVar.mo79345j()) {
            return m95605v0(this.date, this.time.mo75669d(hVar, j));
        }
        return m95605v0(this.date.mo75669d(hVar, j), this.time);
    }
}
