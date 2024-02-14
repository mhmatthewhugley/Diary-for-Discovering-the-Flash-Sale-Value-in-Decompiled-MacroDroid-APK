package p365pe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import p352oe.C15858d;
import p352oe.C15864f;
import p352oe.C15890p;
import p352oe.C15892q;
import p365pe.C16175b;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16541b;
import p392se.C16556h;
import p392se.C16566k;
import p401te.C16627d;
import p401te.C16631f;

/* renamed from: pe.g */
/* compiled from: ChronoZonedDateTimeImpl */
final class C16185g<D extends C16175b> extends C16182f<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final C16179d<D> dateTime;
    private final C15892q offset;
    private final C15890p zone;

    /* renamed from: pe.g$a */
    /* compiled from: ChronoZonedDateTimeImpl */
    static /* synthetic */ class C16186a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66417a;

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
                f66417a = r0
                se.a r1 = p392se.C16540a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66417a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16185g.C16186a.<clinit>():void");
        }
    }

    private C16185g(C16179d<D> dVar, C15892q qVar, C15890p pVar) {
        this.dateTime = (C16179d) C16501d.m98548i(dVar, "dateTime");
        this.offset = (C15892q) C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        this.zone = (C15890p) C16501d.m98548i(pVar, "zone");
    }

    /* renamed from: P */
    private C16185g<D> m97176P(C15858d dVar, C15890p pVar) {
        return m97178T(mo75872E().mo75718y(), dVar, pVar);
    }

    /* renamed from: R */
    static <R extends C16175b> C16182f<R> m97177R(C16179d<R> dVar, C15890p pVar, C15892q qVar) {
        C16501d.m98548i(dVar, "localDateTime");
        C16501d.m98548i(pVar, "zone");
        if (pVar instanceof C15892q) {
            return new C16185g(dVar, (C15892q) pVar, pVar);
        }
        C16631f j = pVar.mo75860j();
        C15864f X = C15864f.m95599X(dVar);
        List<C15892q> c = j.mo79503c(X);
        if (c.size() == 1) {
            qVar = c.get(0);
        } else if (c.size() == 0) {
            C16627d b = j.mo79502b(X);
            dVar = dVar.mo78627a0(b.mo79523f().mo75653e());
            qVar = b.mo79526j();
        } else if (qVar == null || !c.contains(qVar)) {
            qVar = c.get(0);
        }
        C16501d.m98548i(qVar, TypedValues.Cycle.S_WAVE_OFFSET);
        return new C16185g(dVar, qVar, pVar);
    }

    /* renamed from: T */
    static <R extends C16175b> C16185g<R> m97178T(C16187h hVar, C15858d dVar, C15890p pVar) {
        C15892q a = pVar.mo75860j().mo79501a(dVar);
        C16501d.m98548i(a, TypedValues.Cycle.S_WAVE_OFFSET);
        return new C16185g<>((C16179d) hVar.mo78648m(C15864f.m95601d0(dVar.mo75676y(), dVar.mo75658A(), a)), a, pVar);
    }

    /* renamed from: U */
    static C16182f<?> m97179U(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((C16177c) objectInput.readObject()).mo75745t((C15892q) objectInput.readObject()).mo75877N((C15890p) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C16206u((byte) 13, this);
    }

    /* renamed from: A */
    public C16182f<D> mo75670e(long j, C16566k kVar) {
        if (kVar instanceof C16541b) {
            return mo75673k(this.dateTime.mo75670e(j, kVar));
        }
        return mo75872E().mo75718y().mo78643g(kVar.mo79350d(this, j));
    }

    /* renamed from: G */
    public C16177c<D> mo75873G() {
        return this.dateTime;
    }

    /* renamed from: L */
    public C16182f<D> mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return mo75872E().mo75718y().mo78643g(hVar.mo79344i(this, j));
        }
        C16540a aVar = (C16540a) hVar;
        int i = C16186a.f66417a[aVar.ordinal()];
        if (i == 1) {
            return mo75670e(j - mo78631C(), C16541b.SECONDS);
        }
        if (i != 2) {
            return m97177R(this.dateTime.mo75669d(hVar, j), this.zone, this.offset);
        }
        return m97176P(this.dateTime.mo78622J(C15892q.m95835H(aVar.mo79346k(j))), this.zone);
    }

    /* renamed from: N */
    public C16182f<D> mo75877N(C15890p pVar) {
        return m97177R(this.dateTime, pVar, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16182f) || compareTo((C16182f) obj) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo75642g(C16556h hVar) {
        return (hVar instanceof C16540a) || (hVar != null && hVar.mo79341e(this));
    }

    public int hashCode() {
        return (mo75873G().hashCode() ^ mo75890v().hashCode()) ^ Integer.rotateLeft(mo75891x().hashCode(), 3);
    }

    public String toString() {
        String str = mo75873G().toString() + mo75890v().toString();
        if (mo75890v() == mo75891x()) {
            return str;
        }
        return str + '[' + mo75891x().toString() + ']';
    }

    /* renamed from: v */
    public C15892q mo75890v() {
        return this.offset;
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.dateTime);
        objectOutput.writeObject(this.offset);
        objectOutput.writeObject(this.zone);
    }

    /* renamed from: x */
    public C15890p mo75891x() {
        return this.zone;
    }
}
