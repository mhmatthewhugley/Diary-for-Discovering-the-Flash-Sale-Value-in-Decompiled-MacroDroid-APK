package p473rx.internal.util.unsafe;

import java.util.Objects;

/* renamed from: rx.internal.util.unsafe.s */
/* compiled from: SpscArrayQueue */
public final class C17410s<E> extends C17415x<E> {
    public C17410s(int i) {
        super(i);
    }

    /* renamed from: n */
    private long m101176n() {
        return C17417z.f69168a.getLongVolatile(this, C17412u.f69166z);
    }

    /* renamed from: o */
    private long m101177o() {
        return C17417z.f69168a.getLongVolatile(this, C17416y.f69167s);
    }

    /* renamed from: p */
    private void m101178p(long j) {
        C17417z.f69168a.putOrderedLong(this, C17412u.f69166z, j);
    }

    /* renamed from: q */
    private void m101179q(long j) {
        C17417z.f69168a.putOrderedLong(this, C17416y.f69167s, j);
    }

    public boolean isEmpty() {
        return m101177o() == m101176n();
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e, "null elements not allowed");
        E[] eArr = this.f69155c;
        long j = this.producerIndex;
        long c = mo80711c(j);
        if (mo80718j(eArr, c) != null) {
            return false;
        }
        mo80719k(eArr, c, e);
        m101179q(j + 1);
        return true;
    }

    public E peek() {
        return mo80716i(mo80711c(this.consumerIndex));
    }

    public E poll() {
        long j = this.consumerIndex;
        long c = mo80711c(j);
        E[] eArr = this.f69155c;
        E j2 = mo80718j(eArr, c);
        if (j2 == null) {
            return null;
        }
        mo80719k(eArr, c, null);
        m101178p(j + 1);
        return j2;
    }

    public int size() {
        long n = m101176n();
        while (true) {
            long o = m101177o();
            long n2 = m101176n();
            if (n == n2) {
                return (int) (o - n2);
            }
            n = n2;
        }
    }
}
