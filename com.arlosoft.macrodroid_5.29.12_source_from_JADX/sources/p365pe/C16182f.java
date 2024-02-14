package p365pe;

import java.util.Comparator;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p352oe.C15861e;
import p352oe.C15867g;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16175b;
import p383re.C16499b;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16566k;
import p392se.C16567l;

/* renamed from: pe.f */
/* compiled from: ChronoZonedDateTime */
public abstract class C16182f<D extends C16175b> extends C16499b implements Comparable<C16182f<?>> {

    /* renamed from: a */
    private static Comparator<C16182f<?>> f66415a = new C16183a();

    /* renamed from: pe.f$a */
    /* compiled from: ChronoZonedDateTime */
    class C16183a implements Comparator<C16182f<?>> {
        C16183a() {
        }

        /* renamed from: a */
        public int compare(C16182f<?> fVar, C16182f<?> fVar2) {
            int b = C16501d.m98541b(fVar.mo78631C(), fVar2.mo78631C());
            return b == 0 ? C16501d.m98541b(fVar.mo75874H().mo75762Z(), fVar2.mo75874H().mo75762Z()) : b;
        }
    }

    /* renamed from: pe.f$b */
    /* compiled from: ChronoZonedDateTime */
    static /* synthetic */ class C16184b {

        /* renamed from: a */
        static final /* synthetic */ int[] f66416a;

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
                f66416a = r0
                se.a r1 = p392se.C16540a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66416a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16182f.C16184b.<clinit>():void");
        }
    }

    /* renamed from: A */
    public abstract C16182f<D> mo75670e(long j, C16566k kVar);

    /* renamed from: C */
    public long mo78631C() {
        return ((mo75872E().mo75686H() * 86400) + ((long) mo75874H().mo75763a0())) - ((long) mo75890v().mo75866E());
    }

    /* renamed from: E */
    public D mo75872E() {
        return mo75873G().mo75726L();
    }

    /* renamed from: G */
    public abstract C16177c<D> mo75873G();

    /* renamed from: H */
    public C15867g mo75874H() {
        return mo75873G().mo75727N();
    }

    /* renamed from: J */
    public C16182f<D> mo75673k(C16552f fVar) {
        return mo75872E().mo75718y().mo78643g(super.mo75673k(fVar));
    }

    /* renamed from: L */
    public abstract C16182f<D> mo75669d(C16556h hVar, long j);

    /* renamed from: N */
    public abstract C16182f<D> mo75877N(C15890p pVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16182f) || compareTo((C16182f) obj) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        if (hVar == C16540a.INSTANT_SECONDS || hVar == C16540a.OFFSET_SECONDS) {
            return hVar.mo79343g();
        }
        return mo75873G().mo75641f(hVar);
    }

    public int hashCode() {
        return (mo75873G().hashCode() ^ mo75890v().hashCode()) ^ Integer.rotateLeft(mo75891x().hashCode(), 3);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        int i = C16184b.f66416a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            return mo78631C();
        }
        if (i != 2) {
            return mo75873G().mo75644l(hVar);
        }
        return (long) mo75890v().mo75866E();
    }

    /* renamed from: q */
    public int mo75647q(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return super.mo75647q(hVar);
        }
        int i = C16184b.f66416a[((C16540a) hVar).ordinal()];
        if (i == 1) {
            throw new UnsupportedTemporalTypeException("Field too large for an int: " + hVar);
        } else if (i != 2) {
            return mo75873G().mo75647q(hVar);
        } else {
            return mo75890v().mo75866E();
        }
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98739g() || jVar == C16557i.m98738f()) {
            return mo75891x();
        }
        if (jVar == C16557i.m98733a()) {
            return mo75872E().mo75718y();
        }
        if (jVar == C16557i.m98737e()) {
            return C16541b.NANOS;
        }
        if (jVar == C16557i.m98736d()) {
            return mo75890v();
        }
        if (jVar == C16557i.m98734b()) {
            return C15861e.m95546v0(mo75872E().mo75686H());
        }
        if (jVar == C16557i.m98735c()) {
            return mo75874H();
        }
        return super.mo75648r(jVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [pe.f<?>, pe.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p365pe.C16182f<?> r5) {
        /*
            r4 = this;
            long r0 = r4.mo78631C()
            long r2 = r5.mo78631C()
            int r0 = p383re.C16501d.m98541b(r0, r2)
            if (r0 != 0) goto L_0x0059
            oe.g r0 = r4.mo75874H()
            int r0 = r0.mo75754E()
            oe.g r1 = r5.mo75874H()
            int r1 = r1.mo75754E()
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x0059
            pe.c r0 = r4.mo75873G()
            pe.c r1 = r5.mo75873G()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            oe.p r0 = r4.mo75891x()
            java.lang.String r0 = r0.getId()
            oe.p r1 = r5.mo75891x()
            java.lang.String r1 = r1.getId()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            pe.b r0 = r4.mo75872E()
            pe.h r0 = r0.mo75718y()
            pe.b r5 = r5.mo75872E()
            pe.h r5 = r5.mo75718y()
            int r0 = r0.compareTo(r5)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365pe.C16182f.compareTo(pe.f):int");
    }

    public String toString() {
        String str = mo75873G().toString() + mo75890v().toString();
        if (mo75890v() == mo75891x()) {
            return str;
        }
        return str + '[' + mo75891x().toString() + ']';
    }

    /* renamed from: v */
    public abstract C15892q mo75890v();

    /* renamed from: x */
    public abstract C15890p mo75891x();

    /* renamed from: y */
    public C16182f<D> mo75667b(long j, C16566k kVar) {
        return mo75872E().mo75718y().mo78643g(super.mo75667b(j, kVar));
    }
}
