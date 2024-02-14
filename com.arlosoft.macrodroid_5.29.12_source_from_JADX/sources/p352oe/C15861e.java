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
import p365pe.C16175b;
import p365pe.C16189i;
import p365pe.C16194m;
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

/* renamed from: oe.e */
/* compiled from: LocalDate */
public final class C15861e extends C16175b implements Serializable {

    /* renamed from: c */
    public static final C15861e f65323c = m95544t0(-999999999, 1, 1);

    /* renamed from: d */
    public static final C15861e f65324d = m95544t0(999999999, 12, 31);

    /* renamed from: f */
    public static final C16565j<C15861e> f65325f = new C15862a();
    private static final long serialVersionUID = 2942565459149668126L;
    private final short day;
    private final short month;
    private final int year;

    /* renamed from: oe.e$a */
    /* compiled from: LocalDate */
    class C15862a implements C16565j<C15861e> {
        C15862a() {
        }

        /* renamed from: b */
        public C15861e mo75649a(C16551e eVar) {
            return C15861e.m95539T(eVar);
        }
    }

    /* renamed from: oe.e$b */
    /* compiled from: LocalDate */
    static /* synthetic */ class C15863b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65326a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65327b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        static {
            /*
                se.b[] r0 = p392se.C16541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65327b = r0
                r1 = 1
                se.b r2 = p392se.C16541b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f65327b     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r3 = p392se.C16541b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f65327b     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r4 = p392se.C16541b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f65327b     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r5 = p392se.C16541b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f65327b     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r6 = p392se.C16541b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f65327b     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r7 = p392se.C16541b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f65327b     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.b r8 = p392se.C16541b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f65327b     // Catch:{ NoSuchFieldError -> 0x0060 }
                se.b r9 = p392se.C16541b.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                se.a[] r8 = p392se.C16540a.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f65326a = r8
                se.a r9 = p392se.C16540a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = f65326a     // Catch:{ NoSuchFieldError -> 0x007b }
                se.a r8 = p392se.C16540a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x0085 }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x008f }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x0099 }
                se.a r1 = p392se.C16540a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                se.a r1 = p392se.C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00ad }
                se.a r1 = p392se.C16540a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                se.a r1 = p392se.C16540a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00cf }
                se.a r1 = p392se.C16540a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00db }
                se.a r1 = p392se.C16540a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00e7 }
                se.a r1 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = f65326a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15861e.C15863b.<clinit>():void");
        }
    }

    private C15861e(int i, int i2, int i3) {
        this.year = i;
        this.month = (short) i2;
        this.day = (short) i3;
    }

    /* renamed from: F0 */
    static C15861e m95536F0(DataInput dataInput) throws IOException {
        return m95544t0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: G0 */
    private static C15861e m95537G0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C16194m.f66460g.mo78676y((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return m95544t0(i, i2, i3);
    }

    /* renamed from: R */
    private static C15861e m95538R(int i, C15870h hVar, int i2) {
        if (i2 <= 28 || i2 <= hVar.mo75780m(C16194m.f66460g.mo78676y((long) i))) {
            return new C15861e(i, hVar.getValue(), i2);
        }
        if (i2 == 29) {
            throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
        }
        throw new DateTimeException("Invalid date '" + hVar.name() + " " + i2 + "'");
    }

    /* renamed from: T */
    public static C15861e m95539T(C16551e eVar) {
        C15861e eVar2 = (C15861e) eVar.mo75648r(C16557i.m98734b());
        if (eVar2 != null) {
            return eVar2;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* renamed from: U */
    private int m95540U(C16556h hVar) {
        switch (C15863b.f65326a[((C16540a) hVar).ordinal()]) {
            case 1:
                return this.day;
            case 2:
                return mo75701Z();
            case 3:
                return ((this.day - 1) / 7) + 1;
            case 4:
                int i = this.year;
                return i >= 1 ? i : 1 - i;
            case 5:
                return mo75700Y().getValue();
            case 6:
                return ((this.day - 1) % 7) + 1;
            case 7:
                return ((mo75701Z() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Field too large for an int: " + hVar);
            case 9:
                return ((mo75701Z() - 1) / 7) + 1;
            case 10:
                return this.month;
            case 11:
                throw new DateTimeException("Field too large for an int: " + hVar);
            case 12:
                return this.year;
            case 13:
                if (this.year >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: c0 */
    private long m95541c0() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    /* renamed from: r0 */
    public static C15861e m95542r0() {
        return m95543s0(C15853a.m95481c());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s0 */
    public static C15861e m95543s0(C15853a aVar) {
        C16501d.m98548i(aVar, "clock");
        C15858d b = aVar.mo75636b();
        return m95546v0(C16501d.m98544e(b.mo75676y() + ((long) aVar.mo75635a().mo75860j().mo79501a(b).mo75866E()), 86400));
    }

    /* renamed from: t0 */
    public static C15861e m95544t0(int i, int i2, int i3) {
        C16540a.YEAR.mo79347l((long) i);
        C16540a.MONTH_OF_YEAR.mo79347l((long) i2);
        C16540a.DAY_OF_MONTH.mo79347l((long) i3);
        return m95538R(i, C15870h.m95686w(i2), i3);
    }

    /* renamed from: u0 */
    public static C15861e m95545u0(int i, C15870h hVar, int i2) {
        C16540a.YEAR.mo79347l((long) i);
        C16501d.m98548i(hVar, "month");
        C16540a.DAY_OF_MONTH.mo79347l((long) i2);
        return m95538R(i, hVar, i2);
    }

    /* renamed from: v0 */
    public static C15861e m95546v0(long j) {
        long j2;
        long j3 = j;
        C16540a.EPOCH_DAY.mo79347l(j3);
        long j4 = (j3 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i = (int) j7;
        int i2 = ((i * 5) + 2) / 153;
        return new C15861e(C16540a.YEAR.mo79346k(j6 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private Object writeReplace() {
        return new C15883m((byte) 3, this);
    }

    /* renamed from: x0 */
    public static C15861e m95547x0(int i, int i2) {
        long j = (long) i;
        C16540a.YEAR.mo79347l(j);
        C16540a.DAY_OF_YEAR.mo79347l((long) i2);
        boolean y = C16194m.f66460g.mo78676y(j);
        if (i2 != 366 || y) {
            C15870h w = C15870h.m95686w(((i2 - 1) / 31) + 1);
            if (i2 > (w.mo75779i(y) + w.mo75780m(y)) - 1) {
                w = w.mo75783x(1);
            }
            return m95538R(i, w, (i2 - w.mo75779i(y)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    /* renamed from: A */
    public C16189i mo75678A() {
        return super.mo75678A();
    }

    /* renamed from: A0 */
    public C15861e mo75679A0(long j) {
        if (j == 0) {
            return this;
        }
        return m95546v0(C16501d.m98550k(mo75686H(), j));
    }

    /* renamed from: B0 */
    public C15861e mo75680B0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return m95537G0(C16540a.YEAR.mo79346k(C16501d.m98544e(j2, 12)), C16501d.m98546g(j2, 12) + 1, this.day);
    }

    /* renamed from: C */
    public boolean mo75681C(C16175b bVar) {
        if (bVar instanceof C15861e) {
            return mo75696P((C15861e) bVar) < 0;
        }
        return super.mo75681C(bVar);
    }

    /* renamed from: C0 */
    public C15861e mo75682C0(long j) {
        return mo75679A0(C16501d.m98551l(j, 7));
    }

    /* renamed from: D0 */
    public C15861e mo75683D0(long j) {
        if (j == 0) {
            return this;
        }
        return m95537G0(C16540a.YEAR.mo79346k(((long) this.year) + j), this.month, this.day);
    }

    /* renamed from: H */
    public long mo75686H() {
        long j;
        long j2 = (long) this.year;
        long j3 = (long) this.month;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j4 - (((j2 / -4) - (j2 / -100)) + (j2 / -400));
        }
        long j5 = j + (((367 * j3) - 362) / 12) + ((long) (this.day - 1));
        if (j3 > 2) {
            j5--;
            if (!mo75706e0()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: H0 */
    public C15861e mo75673k(C16552f fVar) {
        if (fVar instanceof C15861e) {
            return (C15861e) fVar;
        }
        return (C15861e) fVar.mo75646n(this);
    }

    /* renamed from: I0 */
    public C15861e mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15861e) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        aVar.mo79347l(j);
        switch (C15863b.f65326a[aVar.ordinal()]) {
            case 1:
                return mo75690J0((int) j);
            case 2:
                return mo75692L0((int) j);
            case 3:
                return mo75682C0(j - mo75644l(C16540a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.year < 1) {
                    j = 1 - j;
                }
                return mo75695O0((int) j);
            case 5:
                return mo75679A0(j - ((long) mo75700Y().getValue()));
            case 6:
                return mo75679A0(j - mo75644l(C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return mo75679A0(j - mo75644l(C16540a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m95546v0(j);
            case 9:
                return mo75682C0(j - mo75644l(C16540a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return mo75693M0((int) j);
            case 11:
                return mo75680B0(j - mo75644l(C16540a.PROLEPTIC_MONTH));
            case 12:
                return mo75695O0((int) j);
            case 13:
                return mo75644l(C16540a.ERA) == j ? this : mo75695O0(1 - this.year);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: J0 */
    public C15861e mo75690J0(int i) {
        if (this.day == i) {
            return this;
        }
        return m95544t0(this.year, this.month, i);
    }

    /* renamed from: L0 */
    public C15861e mo75692L0(int i) {
        if (mo75701Z() == i) {
            return this;
        }
        return m95547x0(this.year, i);
    }

    /* renamed from: M0 */
    public C15861e mo75693M0(int i) {
        if (this.month == i) {
            return this;
        }
        C16540a.MONTH_OF_YEAR.mo79347l((long) i);
        return m95537G0(this.year, i, this.day);
    }

    /* renamed from: N */
    public C15864f mo75714t(C15867g gVar) {
        return C15864f.m95600c0(this, gVar);
    }

    /* renamed from: O0 */
    public C15861e mo75695O0(int i) {
        if (this.year == i) {
            return this;
        }
        C16540a.YEAR.mo79347l((long) i);
        return m95537G0(i, this.month, this.day);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo75696P(C15861e eVar) {
        int i = this.year - eVar.year;
        if (i != 0) {
            return i;
        }
        int i2 = this.month - eVar.month;
        return i2 == 0 ? this.day - eVar.day : i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo75697P0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    /* renamed from: V */
    public C16194m mo75718y() {
        return C16194m.f66460g;
    }

    /* renamed from: X */
    public int mo75699X() {
        return this.day;
    }

    /* renamed from: Y */
    public C15855b mo75700Y() {
        return C15855b.m95488j(C16501d.m98546g(mo75686H() + 3, 7) + 1);
    }

    /* renamed from: Z */
    public int mo75701Z() {
        return (mo75702a0().mo75779i(mo75706e0()) + this.day) - 1;
    }

    /* renamed from: a0 */
    public C15870h mo75702a0() {
        return C15870h.m95686w(this.month);
    }

    /* renamed from: b0 */
    public int mo75703b0() {
        return this.month;
    }

    /* renamed from: d0 */
    public int mo75705d0() {
        return this.year;
    }

    /* renamed from: e0 */
    public boolean mo75706e0() {
        return C16194m.f66460g.mo78676y((long) this.year);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15861e) || mo75696P((C15861e) obj) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        C16540a aVar = (C16540a) hVar;
        if (aVar.mo79339b()) {
            int i = C15863b.f65326a[aVar.ordinal()];
            if (i == 1) {
                return C16567l.m98757i(1, (long) mo75708g0());
            }
            if (i == 2) {
                return C16567l.m98757i(1, (long) mo75710i0());
            }
            if (i == 3) {
                return C16567l.m98757i(1, (mo75702a0() != C15870h.FEBRUARY || mo75706e0()) ? 5 : 4);
            } else if (i != 4) {
                return hVar.mo79343g();
            } else {
                return C16567l.m98757i(1, mo75705d0() <= 0 ? 1000000000 : 999999999);
            }
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        return super.mo75642g(hVar);
    }

    /* renamed from: g0 */
    public int mo75708g0() {
        short s = this.month;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : mo75706e0() ? 29 : 28;
    }

    public int hashCode() {
        int i = this.year;
        return (((i << 11) + (this.month << 6)) + this.day) ^ (i & -2048);
    }

    /* renamed from: i0 */
    public int mo75710i0() {
        return mo75706e0() ? 366 : 365;
    }

    /* renamed from: k0 */
    public C15861e mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        if (hVar == C16540a.EPOCH_DAY) {
            return mo75686H();
        }
        if (hVar == C16540a.PROLEPTIC_MONTH) {
            return m95541c0();
        }
        return (long) m95540U(hVar);
    }

    /* renamed from: m0 */
    public C15861e mo75712m0(long j) {
        return j == Long.MIN_VALUE ? mo75679A0(LocationRequestCompat.PASSIVE_INTERVAL).mo75679A0(1) : mo75679A0(-j);
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return super.mo75646n(dVar);
    }

    /* renamed from: o0 */
    public C15861e mo75713o0(long j) {
        return j == Long.MIN_VALUE ? mo75683D0(LocationRequestCompat.PASSIVE_INTERVAL).mo75683D0(1) : mo75683D0(-j);
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return m95540U(hVar);
        }
        return super.mo75647q(hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98734b()) {
            return this;
        }
        return super.mo75648r(jVar);
    }

    public String toString() {
        int i = this.year;
        short s = this.month;
        short s2 = this.day;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
            sb.deleteCharAt(0);
        }
        String str = "-0";
        sb.append(s < 10 ? str : HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(s);
        if (s2 >= 10) {
            str = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    /* renamed from: v */
    public int compareTo(C16175b bVar) {
        if (bVar instanceof C15861e) {
            return mo75696P((C15861e) bVar);
        }
        return super.compareTo(bVar);
    }

    /* renamed from: x */
    public String mo75717x(C16310b bVar) {
        return super.mo75717x(bVar);
    }

    /* renamed from: z0 */
    public C15861e mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15861e) kVar.mo79350d(this, j);
        }
        switch (C15863b.f65327b[((C16541b) kVar).ordinal()]) {
            case 1:
                return mo75679A0(j);
            case 2:
                return mo75682C0(j);
            case 3:
                return mo75680B0(j);
            case 4:
                return mo75683D0(j);
            case 5:
                return mo75683D0(C16501d.m98551l(j, 10));
            case 6:
                return mo75683D0(C16501d.m98551l(j, 100));
            case 7:
                return mo75683D0(C16501d.m98551l(j, 1000));
            case 8:
                C16540a aVar = C16540a.ERA;
                return mo75669d(aVar, C16501d.m98550k(mo75644l(aVar), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }
}
