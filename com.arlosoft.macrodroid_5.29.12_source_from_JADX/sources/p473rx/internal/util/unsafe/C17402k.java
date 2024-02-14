package p473rx.internal.util.unsafe;

import java.util.Objects;

/* renamed from: rx.internal.util.unsafe.k */
/* compiled from: SpmcArrayQueue */
public final class C17402k<E> extends C17406o<E> {
    public C17402k(int i) {
        super(i);
    }

    public boolean isEmpty() {
        return mo80739q() == mo80740n();
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        E[] eArr = this.f69155c;
        long j = this.f69154a;
        long n = mo80740n();
        long c = mo80711c(n);
        if (mo80718j(eArr, c) == null) {
            mo80721m(eArr, c, e);
            mo80741o(n + 1);
        } else if (n - mo80739q() > j) {
            return false;
        } else {
            do {
            } while (mo80718j(eArr, c) != null);
        }
        mo80721m(eArr, c, e);
        mo80741o(n + 1);
        return true;
    }

    public E peek() {
        E i;
        long s = mo80742s();
        do {
            long q = mo80739q();
            if (q >= s) {
                long n = mo80740n();
                if (q >= n) {
                    return null;
                }
                mo80743t(n);
            }
            i = mo80716i(mo80711c(q));
        } while (i == null);
        return i;
    }

    public E poll() {
        long q;
        long s = mo80742s();
        do {
            q = mo80739q();
            if (q >= s) {
                long n = mo80740n();
                if (q >= n) {
                    return null;
                }
                mo80743t(n);
            }
        } while (!mo80738p(q, 1 + q));
        long c = mo80711c(q);
        E[] eArr = this.f69155c;
        E h = mo80715h(eArr, c);
        mo80719k(eArr, c, null);
        return h;
    }

    public int size() {
        long q = mo80739q();
        while (true) {
            long n = mo80740n();
            long q2 = mo80739q();
            if (q == q2) {
                return (int) (n - q2);
            }
            q = q2;
        }
    }
}
