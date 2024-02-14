package p365pe;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import p352oe.C15867g;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16175b;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16566k;
import p392se.C16567l;

/* renamed from: pe.d */
/* compiled from: ChronoLocalDateTimeImpl */
final class C16179d<D extends C16175b> extends C16177c<D> implements Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final D date;
    private final C15867g time;

    /* renamed from: pe.d$a */
    /* compiled from: ChronoLocalDateTimeImpl */
    static /* synthetic */ class C16180a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66414a;

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
                f66414a = r0
                se.b r1 = p392se.C16541b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66414a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r1 = p392se.C16541b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66414a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r1 = p392se.C16541b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66414a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r1 = p392se.C16541b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66414a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r1 = p392se.C16541b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66414a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r1 = p392se.C16541b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f66414a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.b r1 = p392se.C16541b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16179d.C16180a.<clinit>():void");
        }
    }

    private C16179d(D d, C15867g gVar) {
        C16501d.m98548i(d, "date");
        C16501d.m98548i(gVar, "time");
        this.date = d;
        this.time = gVar;
    }

    /* renamed from: T */
    static <R extends C16175b> C16179d<R> m97130T(R r, C15867g gVar) {
        return new C16179d<>(r, gVar);
    }

    /* renamed from: V */
    private C16179d<D> m97131V(long j) {
        return m97137d0(this.date.mo75670e(j, C16541b.DAYS), this.time);
    }

    /* renamed from: X */
    private C16179d<D> m97132X(long j) {
        return m97135b0(this.date, j, 0, 0, 0);
    }

    /* renamed from: Y */
    private C16179d<D> m97133Y(long j) {
        return m97135b0(this.date, 0, j, 0, 0);
    }

    /* renamed from: Z */
    private C16179d<D> m97134Z(long j) {
        return m97135b0(this.date, 0, 0, 0, j);
    }

    /* renamed from: b0 */
    private C16179d<D> m97135b0(D d, long j, long j2, long j3, long j4) {
        D d2 = d;
        if ((j | j2 | j3 | j4) == 0) {
            return m97137d0(d2, this.time);
        }
        long Z = this.time.mo75762Z();
        long j5 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L) + Z;
        long e = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24) + C16501d.m98544e(j5, 86400000000000L);
        long h = C16501d.m98547h(j5, 86400000000000L);
        return m97137d0(d2.mo75670e(e, C16541b.DAYS), h == Z ? this.time : C15867g.m95647L(h));
    }

    /* renamed from: c0 */
    static C16177c<?> m97136c0(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((C16175b) objectInput.readObject()).mo75714t((C15867g) objectInput.readObject());
    }

    /* renamed from: d0 */
    private C16179d<D> m97137d0(C16550d dVar, C15867g gVar) {
        D d = this.date;
        if (d == dVar && this.time == gVar) {
            return this;
        }
        return new C16179d<>(d.mo75718y().mo78640e(dVar), gVar);
    }

    private Object writeReplace() {
        return new C16206u((byte) 12, this);
    }

    /* renamed from: L */
    public D mo75726L() {
        return this.date;
    }

    /* renamed from: N */
    public C15867g mo75727N() {
        return this.time;
    }

    /* renamed from: U */
    public C16179d<D> mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return this.date.mo75718y().mo78642f(kVar.mo79350d(this, j));
        }
        switch (C16180a.f66414a[((C16541b) kVar).ordinal()]) {
            case 1:
                return m97134Z(j);
            case 2:
                return m97131V(j / 86400000000L).m97134Z((j % 86400000000L) * 1000);
            case 3:
                return m97131V(j / 86400000).m97134Z((j % 86400000) * 1000000);
            case 4:
                return mo78627a0(j);
            case 5:
                return m97133Y(j);
            case 6:
                return m97132X(j);
            case 7:
                return m97131V(j / 256).m97132X((j % 256) * 12);
            default:
                return m97137d0(this.date.mo75670e(j, kVar), this.time);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C16179d<D> mo78627a0(long j) {
        return m97135b0(this.date, 0, 0, j, 0);
    }

    /* renamed from: e0 */
    public C16179d<D> mo75673k(C16552f fVar) {
        if (fVar instanceof C16175b) {
            return m97137d0((C16175b) fVar, this.time);
        }
        if (fVar instanceof C15867g) {
            return m97137d0(this.date, (C15867g) fVar);
        }
        if (fVar instanceof C16179d) {
            return this.date.mo75718y().mo78642f((C16179d) fVar);
        }
        return this.date.mo75718y().mo78642f((C16179d) fVar.mo75646n(this));
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
    public C16179d<D> mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return this.date.mo75718y().mo78642f(hVar.mo79344i(this, j));
        }
        if (hVar.mo79345j()) {
            return m97137d0(this.date, this.time.mo75669d(hVar, j));
        }
        return m97137d0(this.date.mo75669d(hVar, j), this.time);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return hVar.mo79345j() ? this.time.mo75644l(hVar) : this.date.mo75644l(hVar);
        }
        return hVar.mo79340d(this);
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (hVar instanceof C16540a) {
            return hVar.mo79345j() ? this.time.mo75647q(hVar) : this.date.mo75647q(hVar);
        }
        return mo75641f(hVar).mo79364a(mo75644l(hVar), hVar);
    }

    /* renamed from: t */
    public C16182f<D> mo75745t(C15890p pVar) {
        return C16185g.m97177R(this, pVar, (C15892q) null);
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }
}
