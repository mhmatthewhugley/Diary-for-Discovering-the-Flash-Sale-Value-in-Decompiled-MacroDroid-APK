package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* renamed from: a */
    private final MinMaxPriorityQueue<E>.Heap f16966a;

    /* renamed from: c */
    private final MinMaxPriorityQueue<E>.Heap f16967c;
    @VisibleForTesting

    /* renamed from: d */
    final int f16968d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Object[] f16969f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f16970g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f16971o;

    @Beta
    public static final class Builder<B> {
    }

    private class Heap {

        /* renamed from: a */
        final Ordering<E> f16972a;
        @Weak

        /* renamed from: b */
        MinMaxPriorityQueue<E>.Heap f16973b;

        /* renamed from: c */
        final /* synthetic */ MinMaxPriorityQueue f16974c;

        /* renamed from: j */
        private int m28239j(int i) {
            return m28241l(m28241l(i));
        }

        /* renamed from: k */
        private int m28240k(int i) {
            return (i * 2) + 1;
        }

        /* renamed from: l */
        private int m28241l(int i) {
            return (i - 1) / 2;
        }

        /* renamed from: m */
        private int m28242m(int i) {
            return (i * 2) + 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36156a(int i, E e) {
            Heap heap;
            int e2 = mo36160e(i, e);
            if (e2 == i) {
                e2 = i;
                heap = this;
            } else {
                heap = this.f16973b;
            }
            heap.mo36157b(e2, e);
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        /* renamed from: b */
        public int mo36157b(int i, E e) {
            while (i > 2) {
                int j = m28239j(i);
                Object j2 = this.f16974c.mo36148j(j);
                if (this.f16972a.compare(j2, e) <= 0) {
                    break;
                }
                this.f16974c.f16969f[i] = j2;
                i = j;
            }
            this.f16974c.f16969f[i] = e;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo36158c(int i, int i2) {
            return this.f16972a.compare(this.f16974c.mo36148j(i), this.f16974c.mo36148j(i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo36159d(int i, E e) {
            int h = mo36163h(i);
            if (h <= 0 || this.f16972a.compare(this.f16974c.mo36148j(h), e) >= 0) {
                return mo36160e(i, e);
            }
            this.f16974c.f16969f[i] = this.f16974c.mo36148j(h);
            this.f16974c.f16969f[h] = e;
            return h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo36160e(int i, E e) {
            int m;
            if (i == 0) {
                this.f16974c.f16969f[0] = e;
                return 0;
            }
            int l = m28241l(i);
            Object j = this.f16974c.mo36148j(l);
            if (!(l == 0 || (m = m28242m(m28241l(l))) == l || m28240k(m) < this.f16974c.f16970g)) {
                Object j2 = this.f16974c.mo36148j(m);
                if (this.f16972a.compare(j2, j) < 0) {
                    l = m;
                    j = j2;
                }
            }
            if (this.f16972a.compare(j, e) < 0) {
                this.f16974c.f16969f[i] = j;
                this.f16974c.f16969f[l] = e;
                return l;
            }
            this.f16974c.f16969f[i] = e;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo36161f(int i) {
            while (true) {
                int i2 = mo36164i(i);
                if (i2 <= 0) {
                    return i;
                }
                this.f16974c.f16969f[i] = this.f16974c.mo36148j(i2);
                i = i2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo36162g(int i, int i2) {
            if (i >= this.f16974c.f16970g) {
                return -1;
            }
            Preconditions.m5398y(i > 0);
            int min = Math.min(i, this.f16974c.f16970g - i2) + i2;
            for (int i3 = i + 1; i3 < min; i3++) {
                if (mo36158c(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo36163h(int i) {
            return mo36162g(m28240k(i), 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo36164i(int i) {
            int k = m28240k(i);
            if (k < 0) {
                return -1;
            }
            return mo36162g(m28240k(k), 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo36165n(E e) {
            int m;
            int l = m28241l(this.f16974c.f16970g);
            if (!(l == 0 || (m = m28242m(m28241l(l))) == l || m28240k(m) < this.f16974c.f16970g)) {
                Object j = this.f16974c.mo36148j(m);
                if (this.f16972a.compare(j, e) < 0) {
                    this.f16974c.f16969f[m] = e;
                    this.f16974c.f16969f[this.f16974c.f16970g] = j;
                    return m;
                }
            }
            return this.f16974c.f16970g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public MoveDesc<E> mo36166o(int i, int i2, E e) {
            Object obj;
            int d = mo36159d(i2, e);
            if (d == i2) {
                return null;
            }
            if (d < i) {
                obj = this.f16974c.mo36148j(i);
            } else {
                obj = this.f16974c.mo36148j(m28241l(i));
            }
            if (this.f16973b.mo36157b(d, e) < i) {
                return new MoveDesc<>(e, obj);
            }
            return null;
        }
    }

    static class MoveDesc<E> {

        /* renamed from: a */
        final E f16975a;

        /* renamed from: b */
        final E f16976b;

        MoveDesc(E e, E e2) {
            this.f16975a = e;
            this.f16976b = e2;
        }
    }

    private class QueueIterator implements Iterator<E> {

        /* renamed from: a */
        private int f16977a;

        /* renamed from: c */
        private int f16978c;

        /* renamed from: d */
        private int f16979d;

        /* renamed from: f */
        private Queue<E> f16980f;

        /* renamed from: g */
        private List<E> f16981g;

        /* renamed from: o */
        private E f16982o;

        /* renamed from: p */
        private boolean f16983p;

        private QueueIterator() {
            this.f16977a = -1;
            this.f16978c = -1;
            this.f16979d = MinMaxPriorityQueue.this.f16971o;
        }

        /* renamed from: a */
        private void m28254a() {
            if (MinMaxPriorityQueue.this.f16971o != this.f16979d) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        private boolean m28255b(Iterable<E> iterable, E e) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        private void m28256c(int i) {
            if (this.f16978c < i) {
                if (this.f16981g != null) {
                    while (i < MinMaxPriorityQueue.this.size() && m28255b(this.f16981g, MinMaxPriorityQueue.this.mo36148j(i))) {
                        i++;
                    }
                }
                this.f16978c = i;
            }
        }

        /* renamed from: d */
        private boolean m28257d(Object obj) {
            for (int i = 0; i < MinMaxPriorityQueue.this.f16970g; i++) {
                if (MinMaxPriorityQueue.this.f16969f[i] == obj) {
                    MinMaxPriorityQueue.this.mo36153q(i);
                    return true;
                }
            }
            return false;
        }

        public boolean hasNext() {
            m28254a();
            m28256c(this.f16977a + 1);
            if (this.f16978c < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue<E> queue = this.f16980f;
            if (queue == null || queue.isEmpty()) {
                return false;
            }
            return true;
        }

        public E next() {
            m28254a();
            m28256c(this.f16977a + 1);
            if (this.f16978c < MinMaxPriorityQueue.this.size()) {
                int i = this.f16978c;
                this.f16977a = i;
                this.f16983p = true;
                return MinMaxPriorityQueue.this.mo36148j(i);
            }
            if (this.f16980f != null) {
                this.f16977a = MinMaxPriorityQueue.this.size();
                E poll = this.f16980f.poll();
                this.f16982o = poll;
                if (poll != null) {
                    this.f16983p = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        public void remove() {
            CollectPreconditions.m26538e(this.f16983p);
            m28254a();
            this.f16983p = false;
            this.f16979d++;
            if (this.f16977a < MinMaxPriorityQueue.this.size()) {
                MoveDesc q = MinMaxPriorityQueue.this.mo36153q(this.f16977a);
                if (q != null) {
                    if (this.f16980f == null || this.f16981g == null) {
                        this.f16980f = new ArrayDeque();
                        this.f16981g = new ArrayList(3);
                    }
                    if (!m28255b(this.f16981g, q.f16975a)) {
                        this.f16980f.add(q.f16975a);
                    }
                    if (!m28255b(this.f16980f, q.f16976b)) {
                        this.f16981g.add(q.f16976b);
                    }
                }
                this.f16977a--;
                this.f16978c--;
                return;
            }
            E e = this.f16982o;
            Objects.requireNonNull(e);
            Preconditions.m5398y(m28257d(e));
            this.f16982o = null;
        }
    }

    /* renamed from: h */
    private int m28229h() {
        int i;
        int length = this.f16969f.length;
        if (length < 64) {
            i = (length + 1) * 2;
        } else {
            i = IntMath.m73467c(length / 2, 3);
        }
        return m28230i(i, this.f16968d);
    }

    /* renamed from: i */
    private static int m28230i(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    /* renamed from: k */
    private MoveDesc<E> m28231k(int i, E e) {
        MinMaxPriorityQueue<E>.Heap n = m28234n(i);
        int f = n.mo36161f(i);
        int b = n.mo36157b(f, e);
        if (b == f) {
            return n.mo36166o(i, f, e);
        }
        if (b < i) {
            return new MoveDesc<>(e, mo36148j(i));
        }
        return null;
    }

    /* renamed from: l */
    private int m28232l() {
        int i = this.f16970g;
        if (i == 1) {
            return 0;
        }
        if (i == 2 || this.f16967c.mo36158c(1, 2) <= 0) {
            return 1;
        }
        return 2;
    }

    /* renamed from: m */
    private void m28233m() {
        if (this.f16970g > this.f16969f.length) {
            Object[] objArr = new Object[m28229h()];
            Object[] objArr2 = this.f16969f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16969f = objArr;
        }
    }

    /* renamed from: n */
    private MinMaxPriorityQueue<E>.Heap m28234n(int i) {
        return m28235o(i) ? this.f16966a : this.f16967c;
    }

    @VisibleForTesting
    /* renamed from: o */
    static boolean m28235o(int i) {
        int i2 = ~(~(i + 1));
        Preconditions.m5399z(i2 > 0, "negative index");
        return (1431655765 & i2) > (i2 & -1431655766);
    }

    /* renamed from: p */
    private E m28236p(int i) {
        E j = mo36148j(i);
        mo36153q(i);
        return j;
    }

    @CanIgnoreReturnValue
    public boolean add(E e) {
        offer(e);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        for (Object offer : collection) {
            offer(offer);
            z = true;
        }
        return z;
    }

    public void clear() {
        for (int i = 0; i < this.f16970g; i++) {
            this.f16969f[i] = null;
        }
        this.f16970g = 0;
    }

    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public E mo36148j(int i) {
        E e = this.f16969f[i];
        Objects.requireNonNull(e);
        return e;
    }

    @CanIgnoreReturnValue
    public boolean offer(E e) {
        Preconditions.m5392s(e);
        this.f16971o++;
        int i = this.f16970g;
        this.f16970g = i + 1;
        m28233m();
        m28234n(i).mo36156a(i, e);
        if (this.f16970g <= this.f16968d || pollLast() != e) {
            return true;
        }
        return false;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return mo36148j(0);
    }

    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return m28236p(0);
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return m28236p(m28232l());
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    @VisibleForTesting
    /* renamed from: q */
    public MoveDesc<E> mo36153q(int i) {
        Preconditions.m5395v(i, this.f16970g);
        this.f16971o++;
        int i2 = this.f16970g - 1;
        this.f16970g = i2;
        if (i2 == i) {
            this.f16969f[i2] = null;
            return null;
        }
        Object j = mo36148j(i2);
        int n = m28234n(this.f16970g).mo36165n(j);
        if (n == i) {
            this.f16969f[this.f16970g] = null;
            return null;
        }
        Object j2 = mo36148j(this.f16970g);
        this.f16969f[this.f16970g] = null;
        MoveDesc<E> k = m28231k(i, j2);
        if (n >= i) {
            return k;
        }
        if (k == null) {
            return new MoveDesc<>(j, j2);
        }
        return new MoveDesc<>(j, k.f16976b);
    }

    public int size() {
        return this.f16970g;
    }

    public Object[] toArray() {
        int i = this.f16970g;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f16969f, 0, objArr, 0, i);
        return objArr;
    }
}
