package p365pe;

import java.io.Serializable;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15890p;
import p392se.C16540a;
import p392se.C16551e;
import p392se.C16567l;

/* renamed from: pe.r */
/* compiled from: MinguoChronology */
public final class C16201r extends C16187h implements Serializable {

    /* renamed from: g */
    public static final C16201r f66482g = new C16201r();
    private static final long serialVersionUID = 1039765215346859963L;

    /* renamed from: pe.r$a */
    /* compiled from: MinguoChronology */
    static /* synthetic */ class C16202a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66483a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                se.a[] r0 = p392se.C16540a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66483a = r0
                se.a r1 = p392se.C16540a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66483a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66483a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.a r1 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16201r.C16202a.<clinit>():void");
        }
    }

    private C16201r() {
    }

    private Object readResolve() {
        return f66482g;
    }

    /* renamed from: A */
    public C16567l mo78696A(C16540a aVar) {
        int i = C16202a.f66483a[aVar.ordinal()];
        if (i == 1) {
            C16567l g = C16540a.PROLEPTIC_MONTH.mo79343g();
            return C16567l.m98757i(g.mo79367d() - 22932, g.mo79366c() - 22932);
        } else if (i == 2) {
            C16567l g2 = C16540a.YEAR.mo79343g();
            return C16567l.m98758j(1, g2.mo79366c() - 1911, (-g2.mo79367d()) + 1 + 1911);
        } else if (i != 3) {
            return aVar.mo79343g();
        } else {
            C16567l g3 = C16540a.YEAR.mo79343g();
            return C16567l.m98757i(g3.mo79367d() - 1911, g3.mo79366c() - 1911);
        }
    }

    public String getId() {
        return "Minguo";
    }

    /* renamed from: k */
    public String mo78647k() {
        return "roc";
    }

    /* renamed from: m */
    public C16177c<C16203s> mo78648m(C16551e eVar) {
        return super.mo78648m(eVar);
    }

    /* renamed from: v */
    public C16182f<C16203s> mo78651v(C15858d dVar, C15890p pVar) {
        return super.mo78651v(dVar, pVar);
    }

    /* renamed from: w */
    public C16203s mo78697w(int i, int i2, int i3) {
        return new C16203s(C15861e.m95544t0(i + 1911, i2, i3));
    }

    /* renamed from: x */
    public C16203s mo78639d(C16551e eVar) {
        if (eVar instanceof C16203s) {
            return (C16203s) eVar;
        }
        return new C16203s(C15861e.m95539T(eVar));
    }

    /* renamed from: y */
    public C16205t mo78646i(int i) {
        return C16205t.m97398i(i);
    }
}
