package p352oe;

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
import p383re.C16500c;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16550d;
import p392se.C16551e;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16567l;

/* renamed from: oe.i */
/* compiled from: MonthDay */
public final class C15873i extends C16500c implements C16552f, Comparable<C15873i>, Serializable {

    /* renamed from: a */
    public static final C16565j<C15873i> f65356a = new C15874a();

    /* renamed from: c */
    private static final C16310b f65357c = new C16313c().mo78946f(HelpFormatter.DEFAULT_LONG_OPT_PREFIX).mo78954o(C16540a.MONTH_OF_YEAR, 2).mo78945e('-').mo78954o(C16540a.DAY_OF_MONTH, 2).mo78939D();
    private static final long serialVersionUID = -939150713474957432L;
    private final int day;
    private final int month;

    /* renamed from: oe.i$a */
    /* compiled from: MonthDay */
    class C15874a implements C16565j<C15873i> {
        C15874a() {
        }

        /* renamed from: b */
        public C15873i mo75649a(C16551e eVar) {
            return C15873i.m95702v(eVar);
        }
    }

    /* renamed from: oe.i$b */
    /* compiled from: MonthDay */
    static /* synthetic */ class C15875b {

        /* renamed from: a */
        static final /* synthetic */ int[] f65358a;

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
                f65358a = r0
                se.a r1 = p392se.C16540a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f65358a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p352oe.C15873i.C15875b.<clinit>():void");
        }
    }

    private C15873i(int i, int i2) {
        this.month = i;
        this.day = i2;
    }

    /* renamed from: A */
    public static C15873i m95700A(C15870h hVar, int i) {
        C16501d.m98548i(hVar, "month");
        C16540a.DAY_OF_MONTH.mo79347l((long) i);
        if (i <= hVar.mo75781t()) {
            return new C15873i(hVar.getValue(), i);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + hVar.name());
    }

    /* renamed from: C */
    static C15873i m95701C(DataInput dataInput) throws IOException {
        return m95703y(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: v */
    public static C15873i m95702v(C16551e eVar) {
        if (eVar instanceof C15873i) {
            return (C15873i) eVar;
        }
        try {
            if (!C16194m.f66460g.equals(C16187h.m97189j(eVar))) {
                eVar = C15861e.m95539T(eVar);
            }
            return m95703y(eVar.mo75647q(C16540a.MONTH_OF_YEAR), eVar.mo75647q(C16540a.DAY_OF_MONTH));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new C15883m((byte) 64, this);
    }

    /* renamed from: y */
    public static C15873i m95703y(int i, int i2) {
        return m95700A(C15870h.m95686w(i), i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo75785E(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15873i)) {
            return false;
        }
        C15873i iVar = (C15873i) obj;
        if (this.month == iVar.month && this.day == iVar.day) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (hVar == C16540a.MONTH_OF_YEAR) {
            return hVar.mo79343g();
        }
        if (hVar == C16540a.DAY_OF_MONTH) {
            return C16567l.m98758j(1, (long) mo75791x().mo75782v(), (long) mo75791x().mo75781t());
        }
        return super.mo75641f(hVar);
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        if (hVar instanceof C16540a) {
            if (hVar == C16540a.MONTH_OF_YEAR || hVar == C16540a.DAY_OF_MONTH) {
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
        return (this.month << 6) + this.day;
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        int i;
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i2 = C15875b.f65358a[((C16540a) hVar).ordinal()];
        if (i2 == 1) {
            i = this.day;
        } else if (i2 == 2) {
            i = this.month;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
        return (long) i;
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        if (C16187h.m97189j(dVar).equals(C16194m.f66460g)) {
            C16550d d = dVar.mo75669d(C16540a.MONTH_OF_YEAR, (long) this.month);
            C16540a aVar = C16540a.DAY_OF_MONTH;
            return d.mo75669d(aVar, Math.min(d.mo75641f(aVar).mo79366c(), (long) this.day));
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
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public int compareTo(C15873i iVar) {
        int i = this.month - iVar.month;
        return i == 0 ? this.day - iVar.day : i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        sb.append(this.month < 10 ? "0" : "");
        sb.append(this.month);
        sb.append(this.day < 10 ? "-0" : HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(this.day);
        return sb.toString();
    }

    /* renamed from: x */
    public C15870h mo75791x() {
        return C15870h.m95686w(this.month);
    }
}
