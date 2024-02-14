package p352oe;

import androidx.core.location.LocationRequestCompat;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.apache.commons.p353io.FilenameUtils;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
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

/* renamed from: oe.g */
/* compiled from: LocalTime */
public final class C15867g extends C16500c implements C16550d, C16552f, Comparable<C15867g>, Serializable {

    /* renamed from: a */
    public static final C15867g f65332a;

    /* renamed from: c */
    public static final C15867g f65333c = new C15867g(23, 59, 59, 999999999);

    /* renamed from: d */
    public static final C15867g f65334d;

    /* renamed from: f */
    public static final C15867g f65335f;

    /* renamed from: g */
    public static final C16565j<C15867g> f65336g = new C15868a();

    /* renamed from: o */
    private static final C15867g[] f65337o = new C15867g[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    /* renamed from: oe.g$a */
    /* compiled from: LocalTime */
    class C15868a implements C16565j<C15867g> {
        C15868a() {
        }

        /* renamed from: b */
        public C15867g mo75649a(C16551e eVar) {
            return C15867g.m95652y(eVar);
        }
    }

    /* renamed from: oe.g$b */
    /* compiled from: LocalTime */
    static /* synthetic */ class C15869b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65338a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65339b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f5 */
        static {
            /*
                se.b[] r0 = p392se.C16541b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65339b = r0
                r1 = 1
                se.b r2 = p392se.C16541b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f65339b     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r3 = p392se.C16541b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f65339b     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r4 = p392se.C16541b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f65339b     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r5 = p392se.C16541b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f65339b     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r6 = p392se.C16541b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f65339b     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r7 = p392se.C16541b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f65339b     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.b r8 = p392se.C16541b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                se.a[] r7 = p392se.C16540a.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f65338a = r7
                se.a r8 = p392se.C16540a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f65338a     // Catch:{ NoSuchFieldError -> 0x006f }
                se.a r7 = p392se.C16540a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x0079 }
                se.a r1 = p392se.C16540a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x0083 }
                se.a r1 = p392se.C16540a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x008d }
                se.a r1 = p392se.C16540a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x0097 }
                se.a r1 = p392se.C16540a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00a1 }
                se.a r1 = p392se.C16540a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00ad }
                se.a r1 = p392se.C16540a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                se.a r1 = p392se.C16540a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00c5 }
                se.a r1 = p392se.C16540a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                se.a r1 = p392se.C16540a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00dd }
                se.a r1 = p392se.C16540a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                se.a r1 = p392se.C16540a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                se.a r1 = p392se.C16540a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = f65338a     // Catch:{ NoSuchFieldError -> 0x0101 }
                se.a r1 = p392se.C16540a.AMPM_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15867g.C15869b.<clinit>():void");
        }
    }

    static {
        int i = 0;
        while (true) {
            C15867g[] gVarArr = f65337o;
            if (i < gVarArr.length) {
                gVarArr[i] = new C15867g(i, 0, 0, 0);
                i++;
            } else {
                f65334d = gVarArr[0];
                f65335f = gVarArr[12];
                f65332a = gVarArr[0];
                return;
            }
        }
    }

    private C15867g(int i, int i2, int i3, int i4) {
        this.hour = (byte) i;
        this.minute = (byte) i2;
        this.second = (byte) i3;
        this.nano = i4;
    }

    /* renamed from: A */
    private int m95645A(C16556h hVar) {
        switch (C15869b.f65338a[((C16540a) hVar).ordinal()]) {
            case 1:
                return this.nano;
            case 2:
                throw new DateTimeException("Field too large for an int: " + hVar);
            case 3:
                return this.nano / 1000;
            case 4:
                throw new DateTimeException("Field too large for an int: " + hVar);
            case 5:
                return this.nano / 1000000;
            case 6:
                return (int) (mo75762Z() / 1000000);
            case 7:
                return this.second;
            case 8:
                return mo75763a0();
            case 9:
                return this.minute;
            case 10:
                return (this.hour * 60) + this.minute;
            case 11:
                return this.hour % 12;
            case 12:
                int i = this.hour % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.hour;
            case 14:
                byte b = this.hour;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.hour / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: J */
    public static C15867g m95646J(int i, int i2, int i3, int i4) {
        C16540a.HOUR_OF_DAY.mo79347l((long) i);
        C16540a.MINUTE_OF_HOUR.mo79347l((long) i2);
        C16540a.SECOND_OF_MINUTE.mo79347l((long) i3);
        C16540a.NANO_OF_SECOND.mo79347l((long) i4);
        return m95651x(i, i2, i3, i4);
    }

    /* renamed from: L */
    public static C15867g m95647L(long j) {
        C16540a.NANO_OF_DAY.mo79347l(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m95651x(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: N */
    public static C15867g m95648N(long j) {
        C16540a.SECOND_OF_DAY.mo79347l(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return m95651x(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    /* renamed from: P */
    static C15867g m95649P(long j, int i) {
        C16540a.SECOND_OF_DAY.mo79347l(j);
        C16540a.NANO_OF_SECOND.mo79347l((long) i);
        int i2 = (int) (j / 3600);
        long j2 = j - ((long) (i2 * 3600));
        int i3 = (int) (j2 / 60);
        return m95651x(i2, i3, (int) (j2 - ((long) (i3 * 60))), i);
    }

    /* renamed from: Y */
    static C15867g m95650Y(DataInput dataInput) throws IOException {
        byte b;
        int i;
        int readByte = dataInput.readByte();
        byte b2 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            b = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i2 = ~readByte2;
                i = 0;
                b2 = i2;
                b = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b = ~readByte3;
                    b2 = readByte2;
                } else {
                    int readInt = dataInput.readInt();
                    b = readByte3;
                    byte b3 = readByte2;
                    i = readInt;
                    b2 = b3;
                }
            }
            return m95646J(readByte, b2, b, i);
        }
        i = 0;
        return m95646J(readByte, b2, b, i);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15883m((byte) 5, this);
    }

    /* renamed from: x */
    private static C15867g m95651x(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f65337o[i];
        }
        return new C15867g(i, i2, i3, i4);
    }

    /* renamed from: y */
    public static C15867g m95652y(C16551e eVar) {
        C15867g gVar = (C15867g) eVar.mo75648r(C16557i.m98735c());
        if (gVar != null) {
            return gVar;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* renamed from: C */
    public int mo75753C() {
        return this.hour;
    }

    /* renamed from: E */
    public int mo75754E() {
        return this.nano;
    }

    /* renamed from: G */
    public int mo75755G() {
        return this.second;
    }

    /* renamed from: H */
    public C15867g mo75667b(long j, C16566k kVar) {
        return j == Long.MIN_VALUE ? mo75670e(LocationRequestCompat.PASSIVE_INTERVAL, kVar).mo75670e(1, kVar) : mo75670e(-j, kVar);
    }

    /* renamed from: R */
    public C15867g mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C15867g) kVar.mo79350d(this, j);
        }
        switch (C15869b.f65339b[((C16541b) kVar).ordinal()]) {
            case 1:
                return mo75760V(j);
            case 2:
                return mo75760V((j % 86400000000L) * 1000);
            case 3:
                return mo75760V((j % 86400000) * 1000000);
            case 4:
                return mo75761X(j);
            case 5:
                return mo75759U(j);
            case 6:
                return mo75758T(j);
            case 7:
                return mo75758T((j % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + kVar);
        }
    }

    /* renamed from: T */
    public C15867g mo75758T(long j) {
        if (j == 0) {
            return this;
        }
        return m95651x(((((int) (j % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    /* renamed from: U */
    public C15867g mo75759U(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 60) + this.minute;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        if (i == i2) {
            return this;
        }
        return m95651x(i2 / 60, i2 % 60, this.second, this.nano);
    }

    /* renamed from: V */
    public C15867g mo75760V(long j) {
        if (j == 0) {
            return this;
        }
        long Z = mo75762Z();
        long j2 = (((j % 86400000000000L) + Z) + 86400000000000L) % 86400000000000L;
        if (Z == j2) {
            return this;
        }
        return m95651x((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: X */
    public C15867g mo75761X(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 3600) + (this.minute * 60) + this.second;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        if (i == i2) {
            return this;
        }
        return m95651x(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.nano);
    }

    /* renamed from: Z */
    public long mo75762Z() {
        return (((long) this.hour) * 3600000000000L) + (((long) this.minute) * 60000000000L) + (((long) this.second) * 1000000000) + ((long) this.nano);
    }

    /* renamed from: a0 */
    public int mo75763a0() {
        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }

    /* renamed from: b0 */
    public C15867g mo75673k(C16552f fVar) {
        if (fVar instanceof C15867g) {
            return (C15867g) fVar;
        }
        return (C15867g) fVar.mo75646n(this);
    }

    /* renamed from: c0 */
    public C15867g mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C15867g) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        aVar.mo79347l(j);
        switch (C15869b.f65338a[aVar.ordinal()]) {
            case 1:
                return mo75770g0((int) j);
            case 2:
                return m95647L(j);
            case 3:
                return mo75770g0(((int) j) * 1000);
            case 4:
                return m95647L(j * 1000);
            case 5:
                return mo75770g0(((int) j) * 1000000);
            case 6:
                return m95647L(j * 1000000);
            case 7:
                return mo75772i0((int) j);
            case 8:
                return mo75761X(j - ((long) mo75763a0()));
            case 9:
                return mo75768e0((int) j);
            case 10:
                return mo75759U(j - ((long) ((this.hour * 60) + this.minute)));
            case 11:
                return mo75758T(j - ((long) (this.hour % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return mo75758T(j - ((long) (this.hour % 12)));
            case 13:
                return mo75767d0((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return mo75767d0((int) j);
            case 15:
                return mo75758T((j - ((long) (this.hour / 12))) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* renamed from: d0 */
    public C15867g mo75767d0(int i) {
        if (this.hour == i) {
            return this;
        }
        C16540a.HOUR_OF_DAY.mo79347l((long) i);
        return m95651x(i, this.minute, this.second, this.nano);
    }

    /* renamed from: e0 */
    public C15867g mo75768e0(int i) {
        if (this.minute == i) {
            return this;
        }
        C16540a.MINUTE_OF_HOUR.mo79347l((long) i);
        return m95651x(this.hour, i, this.second, this.nano);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15867g)) {
            return false;
        }
        C15867g gVar = (C15867g) obj;
        if (this.hour == gVar.hour && this.minute == gVar.minute && this.second == gVar.second && this.nano == gVar.nano) {
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
            return hVar.mo79345j();
        }
        return hVar != null && hVar.mo79341e(this);
    }

    /* renamed from: g0 */
    public C15867g mo75770g0(int i) {
        if (this.nano == i) {
            return this;
        }
        C16540a.NANO_OF_SECOND.mo79347l((long) i);
        return m95651x(this.hour, this.minute, this.second, i);
    }

    public int hashCode() {
        long Z = mo75762Z();
        return (int) (Z ^ (Z >>> 32));
    }

    /* renamed from: i0 */
    public C15867g mo75772i0(int i) {
        if (this.second == i) {
            return this;
        }
        C16540a.SECOND_OF_MINUTE.mo79347l((long) i);
        return m95651x(this.hour, this.minute, i, this.nano);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo75773k0(DataOutput dataOutput) throws IOException {
        if (this.nano != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second);
            dataOutput.writeInt(this.nano);
        } else if (this.second != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(~this.second);
        } else if (this.minute == 0) {
            dataOutput.writeByte(~this.hour);
        } else {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(~this.minute);
        }
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        if (hVar == C16540a.NANO_OF_DAY) {
            return mo75762Z();
        }
        if (hVar == C16540a.MICRO_OF_DAY) {
            return mo75762Z() / 1000;
        }
        return (long) m95645A(hVar);
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.NANO_OF_DAY, mo75762Z());
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return m95645A(hVar);
        }
        return super.mo75647q(hVar);
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98737e()) {
            return C16541b.NANOS;
        }
        if (jVar == C16557i.m98735c()) {
            return this;
        }
        if (jVar == C16557i.m98733a() || jVar == C16557i.m98739g() || jVar == C16557i.m98738f() || jVar == C16557i.m98736d() || jVar == C16557i.m98734b()) {
            return null;
        }
        return jVar.mo75649a(this);
    }

    /* renamed from: t */
    public C15880k mo75774t(C15892q qVar) {
        return C15880k.m95745A(this, qVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.hour;
        byte b2 = this.minute;
        byte b3 = this.second;
        int i = this.nano;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i > 0) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: v */
    public int compareTo(C15867g gVar) {
        int a = C16501d.m98540a(this.hour, gVar.hour);
        if (a != 0) {
            return a;
        }
        int a2 = C16501d.m98540a(this.minute, gVar.minute);
        if (a2 != 0) {
            return a2;
        }
        int a3 = C16501d.m98540a(this.second, gVar.second);
        return a3 == 0 ? C16501d.m98540a(this.nano, gVar.nano) : a3;
    }
}
