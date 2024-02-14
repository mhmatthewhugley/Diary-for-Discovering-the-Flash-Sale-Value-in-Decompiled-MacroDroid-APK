package p365pe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p352oe.C15861e;
import p352oe.C15867g;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16566k;
import p392se.C16567l;

/* renamed from: pe.w */
/* compiled from: ThaiBuddhistDate */
public final class C16209w extends C16173a<C16209w> {
    private static final long serialVersionUID = -8722293800195731463L;
    private final C15861e isoDate;

    /* renamed from: pe.w$a */
    /* compiled from: ThaiBuddhistDate */
    static /* synthetic */ class C16210a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66490a;

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
                f66490a = r0
                se.a r1 = p392se.C16540a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66490a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66490a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66490a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66490a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.a r1 = p392se.C16540a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66490a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.a r1 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f66490a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16209w.C16210a.<clinit>():void");
        }
    }

    C16209w(C15861e eVar) {
        C16501d.m98548i(eVar, "date");
        this.isoDate = eVar;
    }

    /* renamed from: X */
    private long m97418X() {
        return ((((long) m97419Y()) * 12) + ((long) this.isoDate.mo75703b0())) - 1;
    }

    /* renamed from: Y */
    private int m97419Y() {
        return this.isoDate.mo75705d0() + 543;
    }

    /* renamed from: e0 */
    static C16175b m97420e0(DataInput dataInput) throws IOException {
        return C16207v.f66488g.mo78714w(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: g0 */
    private C16209w m97421g0(C15861e eVar) {
        return eVar.equals(this.isoDate) ? this : new C16209w(eVar);
    }

    private Object writeReplace() {
        return new C16206u((byte) 7, this);
    }

    /* renamed from: H */
    public long mo75686H() {
        return this.isoDate.mo75686H();
    }

    /* renamed from: U */
    public C16207v mo75718y() {
        return C16207v.f66488g;
    }

    /* renamed from: V */
    public C16211x mo75678A() {
        return (C16211x) super.mo75678A();
    }

    /* renamed from: Z */
    public C16209w mo75667b(long j, C16566k kVar) {
        return (C16209w) super.mo75667b(j, kVar);
    }

    /* renamed from: a0 */
    public C16209w mo75670e(long j, C16566k kVar) {
        return (C16209w) super.mo75670e(j, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C16209w mo78616P(long j) {
        return m97421g0(this.isoDate.mo75679A0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C16209w mo78617R(long j) {
        return m97421g0(this.isoDate.mo75680B0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public C16209w mo78618T(long j) {
        return m97421g0(this.isoDate.mo75683D0(j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16209w) {
            return this.isoDate.equals(((C16209w) obj).isoDate);
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
            int i = C16210a.f66490a[aVar.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.isoDate.mo75641f(hVar);
            }
            if (i != 4) {
                return mo75718y().mo78713A(aVar);
            }
            C16567l g = C16540a.YEAR.mo79343g();
            return C16567l.m98757i(1, m97419Y() <= 0 ? (-(g.mo79367d() + 543)) + 1 : 543 + g.mo79366c());
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    public int hashCode() {
        return mo75718y().getId().hashCode() ^ this.isoDate.hashCode();
    }

    /* renamed from: i0 */
    public C16209w mo75673k(C16552f fVar) {
        return (C16209w) super.mo75673k(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 != 7) goto L_0x0053;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p365pe.C16209w mo75669d(p392se.C16556h r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p392se.C16540a
            if (r0 == 0) goto L_0x0093
            r0 = r8
            se.a r0 = (p392se.C16540a) r0
            long r1 = r7.mo75644l(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0010
            return r7
        L_0x0010:
            int[] r1 = p365pe.C16209w.C16210a.f66490a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L_0x003a
            r6 = 5
            if (r2 == r6) goto L_0x0025
            if (r2 == r4) goto L_0x003a
            if (r2 == r3) goto L_0x003a
            goto L_0x0053
        L_0x0025:
            pe.v r8 = r7.mo75718y()
            se.l r8 = r8.mo78713A(r0)
            r8.mo79365b(r9, r0)
            long r0 = r7.m97418X()
            long r9 = r9 - r0
            pe.w r8 = r7.mo78617R(r9)
            return r8
        L_0x003a:
            pe.v r2 = r7.mo75718y()
            se.l r2 = r2.mo78713A(r0)
            int r2 = r2.mo79364a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r5) goto L_0x007d
            if (r0 == r4) goto L_0x0070
            if (r0 == r3) goto L_0x005e
        L_0x0053:
            oe.e r0 = r7.isoDate
            oe.e r8 = r0.mo75669d(r8, r9)
            pe.w r8 = r7.m97421g0(r8)
            return r8
        L_0x005e:
            oe.e r8 = r7.isoDate
            int r9 = r7.m97419Y()
            int r1 = r1 - r9
            int r1 = r1 + -543
            oe.e r8 = r8.mo75695O0(r1)
            pe.w r8 = r7.m97421g0(r8)
            return r8
        L_0x0070:
            oe.e r8 = r7.isoDate
            int r2 = r2 + -543
            oe.e r8 = r8.mo75695O0(r2)
            pe.w r8 = r7.m97421g0(r8)
            return r8
        L_0x007d:
            oe.e r8 = r7.isoDate
            int r9 = r7.m97419Y()
            if (r9 < r1) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            int r2 = 1 - r2
        L_0x0088:
            int r2 = r2 + -543
            oe.e r8 = r8.mo75695O0(r2)
            pe.w r8 = r7.m97421g0(r8)
            return r8
        L_0x0093:
            se.d r8 = r8.mo79344i(r7, r9)
            pe.w r8 = (p365pe.C16209w) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p365pe.C16209w.mo75669d(se.h, long):pe.w");
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i = C16210a.f66490a[((C16540a) hVar).ordinal()];
        int i2 = 1;
        if (i == 4) {
            int Y = m97419Y();
            if (Y < 1) {
                Y = 1 - Y;
            }
            return (long) Y;
        } else if (i == 5) {
            return m97418X();
        } else {
            if (i == 6) {
                return (long) m97419Y();
            }
            if (i != 7) {
                return this.isoDate.mo75644l(hVar);
            }
            if (m97419Y() < 1) {
                i2 = 0;
            }
            return (long) i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo78726m0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(mo75647q(C16540a.YEAR));
        dataOutput.writeByte(mo75647q(C16540a.MONTH_OF_YEAR));
        dataOutput.writeByte(mo75647q(C16540a.DAY_OF_MONTH));
    }

    /* renamed from: t */
    public final C16177c<C16209w> mo75714t(C15867g gVar) {
        return super.mo75714t(gVar);
    }
}
