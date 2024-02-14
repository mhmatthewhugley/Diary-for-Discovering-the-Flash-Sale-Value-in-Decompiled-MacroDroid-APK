package p365pe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Comparator;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15867g;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16175b;
import p374qe.C16310b;
import p383re.C16499b;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16550d;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16557i;
import p392se.C16565j;
import p392se.C16566k;

/* renamed from: pe.c */
/* compiled from: ChronoLocalDateTime */
public abstract class C16177c<D extends C16175b> extends C16499b implements C16552f, Comparable<C16177c<?>> {

    /* renamed from: a */
    private static final Comparator<C16177c<?>> f66413a = new C16178a();

    /* renamed from: pe.c$a */
    /* compiled from: ChronoLocalDateTime */
    class C16178a implements Comparator<C16177c<?>> {
        C16178a() {
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [pe.c<?>, pe.c] */
        /* JADX WARNING: type inference failed for: r6v0, types: [pe.c<?>, pe.c] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(p365pe.C16177c<?> r5, p365pe.C16177c<?> r6) {
            /*
                r4 = this;
                pe.b r0 = r5.mo75726L()
                long r0 = r0.mo75686H()
                pe.b r2 = r6.mo75726L()
                long r2 = r2.mo75686H()
                int r0 = p383re.C16501d.m98541b(r0, r2)
                if (r0 != 0) goto L_0x002a
                oe.g r5 = r5.mo75727N()
                long r0 = r5.mo75762Z()
                oe.g r5 = r6.mo75727N()
                long r5 = r5.mo75762Z()
                int r0 = p383re.C16501d.m98541b(r0, r5)
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16177c.C16178a.compare(pe.c, pe.c):int");
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [pe.c<?>, pe.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo75721A(p365pe.C16177c<?> r6) {
        /*
            r5 = this;
            pe.b r0 = r5.mo75726L()
            long r0 = r0.mo75686H()
            pe.b r2 = r6.mo75726L()
            long r2 = r2.mo75686H()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x002d
            if (r4 != 0) goto L_0x002b
            oe.g r0 = r5.mo75727N()
            long r0 = r0.mo75762Z()
            oe.g r6 = r6.mo75727N()
            long r2 = r6.mo75762Z()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p365pe.C16177c.mo75721A(pe.c):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [pe.c<?>, pe.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo75723C(p365pe.C16177c<?> r6) {
        /*
            r5 = this;
            pe.b r0 = r5.mo75726L()
            long r0 = r0.mo75686H()
            pe.b r2 = r6.mo75726L()
            long r2 = r2.mo75686H()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            if (r4 != 0) goto L_0x002b
            oe.g r0 = r5.mo75727N()
            long r0 = r0.mo75762Z()
            oe.g r6 = r6.mo75727N()
            long r2 = r6.mo75762Z()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p365pe.C16177c.mo75723C(pe.c):boolean");
    }

    /* renamed from: E */
    public C16177c<D> mo75667b(long j, C16566k kVar) {
        return mo75726L().mo75718y().mo78642f(super.mo75667b(j, kVar));
    }

    /* renamed from: G */
    public abstract C16177c<D> mo75670e(long j, C16566k kVar);

    /* renamed from: H */
    public long mo78621H(C15892q qVar) {
        C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        return ((mo75726L().mo75686H() * 86400) + ((long) mo75727N().mo75763a0())) - ((long) qVar.mo75866E());
    }

    /* renamed from: J */
    public C15858d mo78622J(C15892q qVar) {
        return C15858d.m95508H(mo78621H(qVar), (long) mo75727N().mo75754E());
    }

    /* renamed from: L */
    public abstract D mo75726L();

    /* renamed from: N */
    public abstract C15867g mo75727N();

    /* renamed from: P */
    public C16177c<D> mo75673k(C16552f fVar) {
        return mo75726L().mo75718y().mo78642f(super.mo75673k(fVar));
    }

    /* renamed from: R */
    public abstract C16177c<D> mo75669d(C16556h hVar, long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16177c) || compareTo((C16177c) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo75726L().hashCode() ^ mo75727N().hashCode();
    }

    /* renamed from: n */
    public C16550d mo75646n(C16550d dVar) {
        return dVar.mo75669d(C16540a.EPOCH_DAY, mo75726L().mo75686H()).mo75669d(C16540a.NANO_OF_DAY, mo75727N().mo75762Z());
    }

    /* renamed from: r */
    public <R> R mo75648r(C16565j<R> jVar) {
        if (jVar == C16557i.m98733a()) {
            return mo78623y();
        }
        if (jVar == C16557i.m98737e()) {
            return C16541b.NANOS;
        }
        if (jVar == C16557i.m98734b()) {
            return C15861e.m95546v0(mo75726L().mo75686H());
        }
        if (jVar == C16557i.m98735c()) {
            return mo75727N();
        }
        if (jVar == C16557i.m98738f() || jVar == C16557i.m98739g() || jVar == C16557i.m98736d()) {
            return null;
        }
        return super.mo75648r(jVar);
    }

    /* renamed from: t */
    public abstract C16182f<D> mo75745t(C15890p pVar);

    public String toString() {
        return mo75726L().toString() + 'T' + mo75727N().toString();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [pe.c<?>, pe.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p365pe.C16177c<?> r3) {
        /*
            r2 = this;
            pe.b r0 = r2.mo75726L()
            pe.b r1 = r3.mo75726L()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            oe.g r0 = r2.mo75727N()
            oe.g r1 = r3.mo75727N()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            pe.h r0 = r2.mo78623y()
            pe.h r3 = r3.mo78623y()
            int r0 = r0.compareTo(r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365pe.C16177c.compareTo(pe.c):int");
    }

    /* renamed from: x */
    public String mo75749x(C16310b bVar) {
        C16501d.m98548i(bVar, "formatter");
        return bVar.mo78926a(this);
    }

    /* renamed from: y */
    public C16187h mo78623y() {
        return mo75726L().mo75718y();
    }
}
