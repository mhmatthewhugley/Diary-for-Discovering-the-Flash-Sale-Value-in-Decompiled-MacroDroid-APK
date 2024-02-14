package p466lf;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: lf.b */
/* compiled from: SpscAtomicArrayQueue */
public final class C17188b<E> extends C17187a<E> {

    /* renamed from: p */
    private static final Integer f68732p = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: d */
    final AtomicLong f68733d = new AtomicLong();

    /* renamed from: f */
    long f68734f;

    /* renamed from: g */
    final AtomicLong f68735g = new AtomicLong();

    /* renamed from: o */
    final int f68736o;

    public C17188b(int i) {
        super(i);
        this.f68736o = Math.min(i / 4, f68732p.intValue());
    }

    /* renamed from: j */
    private long m100704j() {
        return this.f68735g.get();
    }

    /* renamed from: k */
    private long m100705k() {
        return this.f68733d.get();
    }

    /* renamed from: l */
    private void m100706l(long j) {
        this.f68735g.lazySet(j);
    }

    /* renamed from: m */
    private void m100707m(long j) {
        this.f68733d.lazySet(j);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public boolean isEmpty() {
        return m100705k() == m100704j();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        AtomicReferenceArray<E> atomicReferenceArray = this.f68730a;
        int i = this.f68731c;
        long j = this.f68733d.get();
        int d = mo80466d(j, i);
        if (j >= this.f68734f) {
            long j2 = ((long) this.f68736o) + j;
            if (mo80468h(atomicReferenceArray, mo80466d(j2, i)) == null) {
                this.f68734f = j2;
            } else if (mo80468h(atomicReferenceArray, d) != null) {
                return false;
            }
        }
        mo80469i(atomicReferenceArray, d, e);
        m100707m(j + 1);
        return true;
    }

    public E peek() {
        return mo80467f(mo80464c(this.f68735g.get()));
    }

    public E poll() {
        long j = this.f68735g.get();
        int c = mo80464c(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.f68730a;
        E h = mo80468h(atomicReferenceArray, c);
        if (h == null) {
            return null;
        }
        mo80469i(atomicReferenceArray, c, null);
        m100706l(j + 1);
        return h;
    }

    public int size() {
        long j = m100704j();
        while (true) {
            long k = m100705k();
            long j2 = m100704j();
            if (j == j2) {
                return (int) (k - j2);
            }
            j = j2;
        }
    }
}
