package p365pe;

import java.io.Serializable;
import org.threeten.p356bp.DateTimeException;
import p352oe.C15867g;
import p365pe.C16175b;
import p383re.C16501d;
import p392se.C16541b;
import p392se.C16566k;

/* renamed from: pe.a */
/* compiled from: ChronoDateImpl */
abstract class C16173a<D extends C16175b> extends C16175b implements Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* renamed from: pe.a$a */
    /* compiled from: ChronoDateImpl */
    static /* synthetic */ class C16174a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66411a;

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
                f66411a = r0
                se.b r1 = p392se.C16541b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66411a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.b r1 = p392se.C16541b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66411a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.b r1 = p392se.C16541b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66411a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.b r1 = p392se.C16541b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66411a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.b r1 = p392se.C16541b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66411a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.b r1 = p392se.C16541b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f66411a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.b r1 = p392se.C16541b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16173a.C16174a.<clinit>():void");
        }
    }

    C16173a() {
    }

    /* renamed from: N */
    public C16173a<D> mo75670e(long j, C16566k kVar) {
        if (!(kVar instanceof C16541b)) {
            return (C16173a) mo75718y().mo78640e(kVar.mo79350d(this, j));
        }
        switch (C16174a.f66411a[((C16541b) kVar).ordinal()]) {
            case 1:
                return mo78616P(j);
            case 2:
                return mo78616P(C16501d.m98551l(j, 7));
            case 3:
                return mo78617R(j);
            case 4:
                return mo78618T(j);
            case 5:
                return mo78618T(C16501d.m98551l(j, 10));
            case 6:
                return mo78618T(C16501d.m98551l(j, 100));
            case 7:
                return mo78618T(C16501d.m98551l(j, 1000));
            default:
                throw new DateTimeException(kVar + " not valid for chronology " + mo75718y().getId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public abstract C16173a<D> mo78616P(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public abstract C16173a<D> mo78617R(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract C16173a<D> mo78618T(long j);

    /* renamed from: t */
    public C16177c<?> mo75714t(C15867g gVar) {
        return C16179d.m97130T(this, gVar);
    }
}
