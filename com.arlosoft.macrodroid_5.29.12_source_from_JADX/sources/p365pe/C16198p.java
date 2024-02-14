package p365pe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p352oe.C15861e;
import p352oe.C15867g;
import p392se.C16540a;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16566k;
import p392se.C16567l;

/* renamed from: pe.p */
/* compiled from: JapaneseDate */
public final class C16198p extends C16173a<C16198p> {

    /* renamed from: f */
    static final C15861e f66470f = C15861e.m95544t0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: c */
    private transient C16200q f66471c;

    /* renamed from: d */
    private transient int f66472d;
    private final C15861e isoDate;

    /* renamed from: pe.p$a */
    /* compiled from: JapaneseDate */
    static /* synthetic */ class C16199a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66473a;

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
                se.a[] r0 = p392se.C16540a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66473a = r0
                se.a r1 = p392se.C16540a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66473a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66473a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.a r1 = p392se.C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66473a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.a r1 = p392se.C16540a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66473a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66473a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f66473a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16198p.C16199a.<clinit>():void");
        }
    }

    C16198p(C15861e eVar) {
        if (!eVar.mo75681C(f66470f)) {
            C16200q v = C16200q.m97350v(eVar);
            this.f66471c = v;
            this.f66472d = eVar.mo75705d0() - (v.mo78692C().mo75705d0() - 1);
            this.isoDate = eVar;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    /* renamed from: U */
    private C16567l m97313U(int i) {
        Calendar instance = Calendar.getInstance(C16196o.f66464g);
        instance.set(0, this.f66471c.getValue() + 2);
        instance.set(this.f66472d, this.isoDate.mo75703b0() - 1, this.isoDate.mo75699X());
        return C16567l.m98757i((long) instance.getActualMinimum(i), (long) instance.getActualMaximum(i));
    }

    /* renamed from: X */
    private long m97314X() {
        int Z;
        if (this.f66472d == 1) {
            Z = (this.isoDate.mo75701Z() - this.f66471c.mo78692C().mo75701Z()) + 1;
        } else {
            Z = this.isoDate.mo75701Z();
        }
        return (long) Z;
    }

    /* renamed from: e0 */
    static C16175b m97315e0(DataInput dataInput) throws IOException {
        return C16196o.f66465o.mo78679w(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: g0 */
    private C16198p m97316g0(C15861e eVar) {
        return eVar.equals(this.isoDate) ? this : new C16198p(eVar);
    }

    /* renamed from: m0 */
    private C16198p m97317m0(int i) {
        return m97318o0(mo75678A(), i);
    }

    /* renamed from: o0 */
    private C16198p m97318o0(C16200q qVar, int i) {
        return m97316g0(this.isoDate.mo75695O0(C16196o.f66465o.mo78677A(qVar, i)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        C16200q v = C16200q.m97350v(this.isoDate);
        this.f66471c = v;
        this.f66472d = this.isoDate.mo75705d0() - (v.mo78692C().mo75705d0() - 1);
    }

    private Object writeReplace() {
        return new C16206u((byte) 1, this);
    }

    /* renamed from: H */
    public long mo75686H() {
        return this.isoDate.mo75686H();
    }

    /* renamed from: V */
    public C16196o mo75718y() {
        return C16196o.f66465o;
    }

    /* renamed from: Y */
    public C16200q mo75678A() {
        return this.f66471c;
    }

    /* renamed from: Z */
    public C16198p mo75667b(long j, C16566k kVar) {
        return (C16198p) super.mo75667b(j, kVar);
    }

    /* renamed from: a0 */
    public C16198p mo75670e(long j, C16566k kVar) {
        return (C16198p) super.mo75670e(j, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C16198p mo78616P(long j) {
        return m97316g0(this.isoDate.mo75679A0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C16198p mo78617R(long j) {
        return m97316g0(this.isoDate.mo75680B0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public C16198p mo78618T(long j) {
        return m97316g0(this.isoDate.mo75683D0(j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16198p) {
            return this.isoDate.equals(((C16198p) obj).isoDate);
        }
        return false;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        if (mo75642g(hVar)) {
            C16540a aVar = (C16540a) hVar;
            int i = C16199a.f66473a[aVar.ordinal()];
            if (i == 1) {
                return m97313U(6);
            }
            if (i != 2) {
                return mo75718y().mo78678C(aVar);
            }
            return m97313U(1);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar == C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH || hVar == C16540a.ALIGNED_DAY_OF_WEEK_IN_YEAR || hVar == C16540a.ALIGNED_WEEK_OF_MONTH || hVar == C16540a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.mo75642g(hVar);
    }

    public int hashCode() {
        return mo75718y().getId().hashCode() ^ this.isoDate.hashCode();
    }

    /* renamed from: i0 */
    public C16198p mo75673k(C16552f fVar) {
        return (C16198p) super.mo75673k(fVar);
    }

    /* renamed from: k0 */
    public C16198p mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C16198p) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        if (mo75644l(aVar) == j) {
            return this;
        }
        int[] iArr = C16199a.f66473a;
        int i = iArr[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 7) {
            int a = mo75718y().mo78678C(aVar).mo79364a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 1) {
                return m97316g0(this.isoDate.mo75679A0(((long) a) - m97314X()));
            }
            if (i2 == 2) {
                return m97317m0(a);
            }
            if (i2 == 7) {
                return m97318o0(C16200q.m97351x(a), this.f66472d);
            }
        }
        return m97316g0(this.isoDate.mo75669d(hVar, j));
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        switch (C16199a.f66473a[((C16540a) hVar).ordinal()]) {
            case 1:
                return m97314X();
            case 2:
                return (long) this.f66472d;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
            case 7:
                return (long) this.f66471c.getValue();
            default:
                return this.isoDate.mo75644l(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo78691r0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(mo75647q(C16540a.YEAR));
        dataOutput.writeByte(mo75647q(C16540a.MONTH_OF_YEAR));
        dataOutput.writeByte(mo75647q(C16540a.DAY_OF_MONTH));
    }

    /* renamed from: t */
    public final C16177c<C16198p> mo75714t(C15867g gVar) {
        return super.mo75714t(gVar);
    }
}
