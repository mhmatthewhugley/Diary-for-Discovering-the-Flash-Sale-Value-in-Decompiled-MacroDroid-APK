package p473rx.internal.util.unsafe;

import androidx.core.location.LocationRequestCompat;
import java.util.Objects;

/* renamed from: rx.internal.util.unsafe.e */
/* compiled from: MpmcArrayQueue */
public class C17396e<E> extends C17397f<E> {
    public C17396e(int i) {
        super(Math.max(2, i));
    }

    public boolean isEmpty() {
        return mo80731u() == mo80733s();
    }

    public boolean offer(E e) {
        E e2 = e;
        Objects.requireNonNull(e2, "Null is not a valid element");
        long j = this.f69154a + 1;
        long[] jArr = this.f69158o;
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        while (true) {
            long s = mo80733s();
            long n = mo80722n(s);
            int i = ((mo80723o(jArr, n) - s) > 0 ? 1 : ((mo80723o(jArr, n) - s) == 0 ? 0 : -1));
            if (i == 0) {
                long j3 = s + 1;
                if (mo80732q(s, j3)) {
                    mo80720l(mo80711c(s), e2);
                    mo80724p(jArr, n, j3);
                    return true;
                }
            } else if (i < 0) {
                long j4 = s - j;
                if (j4 <= j2) {
                    j2 = mo80731u();
                    if (j4 <= j2) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E peek() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = r6.mo80731u()
            long r2 = r6.mo80711c(r0)
            java.lang.Object r2 = r6.mo80714f(r2)
            if (r2 != 0) goto L_0x0016
            long r3 = r6.mo80733s()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0000
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p473rx.internal.util.unsafe.C17396e.peek():java.lang.Object");
    }

    public E poll() {
        long[] jArr = this.f69158o;
        long j = -1;
        while (true) {
            long u = mo80731u();
            long n = mo80722n(u);
            long j2 = u + 1;
            int i = ((mo80723o(jArr, n) - j2) > 0 ? 1 : ((mo80723o(jArr, n) - j2) == 0 ? 0 : -1));
            if (i == 0) {
                if (mo80730t(u, j2)) {
                    long c = mo80711c(u);
                    E f = mo80714f(c);
                    mo80720l(c, null);
                    mo80724p(jArr, n, u + this.f69154a + 1);
                    return f;
                }
            } else if (i < 0 && u >= j) {
                j = mo80733s();
                if (u == j) {
                    return null;
                }
            }
        }
    }

    public int size() {
        long u = mo80731u();
        while (true) {
            long s = mo80733s();
            long u2 = mo80731u();
            if (u == u2) {
                return (int) (s - u2);
            }
            u = u2;
        }
    }
}
