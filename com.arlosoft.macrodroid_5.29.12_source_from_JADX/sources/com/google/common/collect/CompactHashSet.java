package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a */
    private transient Object f16514a;

    /* renamed from: c */
    private transient int[] f16515c;
    @VisibleForTesting

    /* renamed from: d */
    transient Object[] f16516d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient int f16517f;

    /* renamed from: g */
    private transient int f16518g;

    CompactHashSet() {
        mo34888z(3);
    }

    /* renamed from: I */
    private Object[] m26618I() {
        Object[] objArr = this.f16516d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: J */
    private int[] m26619J() {
        int[] iArr = this.f16515c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: M */
    private Object m26620M() {
        Object obj = this.f16514a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: P */
    private void m26621P(int i) {
        int min;
        int length = m26619J().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            mo34871O(min);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: Q */
    private int m26622Q(int i, int i2, int i3, int i4) {
        Object a = CompactHashing.m26648a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.m26656i(a, i3 & i5, i4 + 1);
        }
        Object M = m26620M();
        int[] J = m26619J();
        for (int i6 = 0; i6 <= i; i6++) {
            int h = CompactHashing.m26655h(M, i6);
            while (h != 0) {
                int i7 = h - 1;
                int i8 = J[i7];
                int b = CompactHashing.m26649b(i8, i) | i6;
                int i9 = b & i5;
                int h2 = CompactHashing.m26655h(a, i9);
                CompactHashing.m26656i(a, i9, h);
                J[i7] = CompactHashing.m26651d(b, h2, i5);
                h = CompactHashing.m26650c(i8, i);
            }
        }
        this.f16514a = a;
        m26625V(i5);
        return i5;
    }

    /* renamed from: R */
    private void m26623R(int i, E e) {
        m26618I()[i] = e;
    }

    /* renamed from: T */
    private void m26624T(int i, int i2) {
        m26619J()[i] = i2;
    }

    /* renamed from: V */
    private void m26625V(int i) {
        this.f16517f = CompactHashing.m26651d(this.f16517f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: j */
    public static <E> CompactHashSet<E> m26628j() {
        return new CompactHashSet<>();
    }

    /* renamed from: k */
    private Set<E> m26629k(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    /* renamed from: l */
    public static <E> CompactHashSet<E> m26630l(int i) {
        return new CompactHashSet<>(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public E m26631n(int i) {
        return m26618I()[i];
    }

    /* renamed from: p */
    private int m26632p(int i) {
        return m26619J()[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo34888z(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    /* renamed from: u */
    private int m26633u() {
        return (1 << (this.f16517f & 31)) - 1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo34868B(int i, @ParametricNullness E e, int i2, int i3) {
        m26624T(i, CompactHashing.m26651d(i2, 0, i3));
        m26623R(i, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo34869D(int i, int i2) {
        Object M = m26620M();
        int[] J = m26619J();
        Object[] I = m26618I();
        int size = size() - 1;
        if (i < size) {
            Object obj = I[size];
            I[i] = obj;
            I[size] = null;
            J[i] = J[size];
            J[size] = 0;
            int d = Hashing.m27250d(obj) & i2;
            int h = CompactHashing.m26655h(M, d);
            int i3 = size + 1;
            if (h == i3) {
                CompactHashing.m26656i(M, d, i + 1);
                return;
            }
            while (true) {
                int i4 = h - 1;
                int i5 = J[i4];
                int c = CompactHashing.m26650c(i5, i2);
                if (c == i3) {
                    J[i4] = CompactHashing.m26651d(i5, i + 1, i2);
                    return;
                }
                h = c;
            }
        } else {
            I[i] = null;
            J[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: F */
    public boolean mo34870F() {
        return this.f16514a == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo34871O(int i) {
        this.f16515c = Arrays.copyOf(m26619J(), i);
        this.f16516d = Arrays.copyOf(m26618I(), i);
    }

    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
        if (mo34870F()) {
            mo34876h();
        }
        Set m = mo34880m();
        if (m != null) {
            return m.add(e);
        }
        int[] J = m26619J();
        Object[] I = m26618I();
        int i = this.f16518g;
        int i2 = i + 1;
        int d = Hashing.m27250d(e);
        int u = m26633u();
        int i3 = d & u;
        int h = CompactHashing.m26655h(m26620M(), i3);
        if (h != 0) {
            int b = CompactHashing.m26649b(d, u);
            int i4 = 0;
            while (true) {
                int i5 = h - 1;
                int i6 = J[i5];
                if (CompactHashing.m26649b(i6, u) == b && com.google.common.base.Objects.m5349a(e, I[i5])) {
                    return false;
                }
                int c = CompactHashing.m26650c(i6, u);
                i4++;
                if (c != 0) {
                    h = c;
                } else if (i4 >= 9) {
                    return mo34877i().add(e);
                } else {
                    if (i2 > u) {
                        u = m26622Q(u, CompactHashing.m26652e(u), d, i);
                    } else {
                        J[i5] = CompactHashing.m26651d(i6, i2, u);
                    }
                }
            }
        } else if (i2 > u) {
            u = m26622Q(u, CompactHashing.m26652e(u), d, i);
        } else {
            CompactHashing.m26656i(m26620M(), i3, i2);
        }
        m26621P(i2);
        mo34868B(i, e, d, u);
        this.f16518g = i2;
        mo34887w();
        return true;
    }

    public void clear() {
        if (!mo34870F()) {
            mo34887w();
            Set m = mo34880m();
            if (m != null) {
                this.f16517f = Ints.m73616e(size(), 3, 1073741823);
                m.clear();
                this.f16514a = null;
                this.f16518g = 0;
                return;
            }
            Arrays.fill(m26618I(), 0, this.f16518g, (Object) null);
            CompactHashing.m26654g(m26620M());
            Arrays.fill(m26619J(), 0, this.f16518g, 0);
            this.f16518g = 0;
        }
    }

    public boolean contains(Object obj) {
        if (mo34870F()) {
            return false;
        }
        Set m = mo34880m();
        if (m != null) {
            return m.contains(obj);
        }
        int d = Hashing.m27250d(obj);
        int u = m26633u();
        int h = CompactHashing.m26655h(m26620M(), d & u);
        if (h == 0) {
            return false;
        }
        int b = CompactHashing.m26649b(d, u);
        do {
            int i = h - 1;
            int p = m26632p(i);
            if (CompactHashing.m26649b(p, u) == b && com.google.common.base.Objects.m5349a(obj, m26631n(i))) {
                return true;
            }
            h = CompactHashing.m26650c(p, u);
        } while (h != 0);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo34875f(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: h */
    public int mo34876h() {
        Preconditions.m5399z(mo34870F(), "Arrays already allocated");
        int i = this.f16517f;
        int j = CompactHashing.m26657j(i);
        this.f16514a = CompactHashing.m26648a(j);
        m26625V(j - 1);
        this.f16515c = new int[i];
        this.f16516d = new Object[i];
        return i;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    @VisibleForTesting
    /* renamed from: i */
    public Set<E> mo34877i() {
        Set<E> k = m26629k(m26633u() + 1);
        int q = mo34881q();
        while (q >= 0) {
            k.add(m26631n(q));
            q = mo34884t(q);
        }
        this.f16514a = k;
        this.f16515c = null;
        this.f16516d = null;
        mo34887w();
        return k;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<E> iterator() {
        Set m = mo34880m();
        if (m != null) {
            return m.iterator();
        }
        return new Iterator<E>() {

            /* renamed from: a */
            int f16519a;

            /* renamed from: c */
            int f16520c;

            /* renamed from: d */
            int f16521d = -1;

            {
                this.f16519a = CompactHashSet.this.f16517f;
                this.f16520c = CompactHashSet.this.mo34881q();
            }

            /* renamed from: a */
            private void m26646a() {
                if (CompactHashSet.this.f16517f != this.f16519a) {
                    throw new ConcurrentModificationException();
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo34889b() {
                this.f16519a += 32;
            }

            public boolean hasNext() {
                return this.f16520c >= 0;
            }

            @ParametricNullness
            public E next() {
                m26646a();
                if (hasNext()) {
                    int i = this.f16520c;
                    this.f16521d = i;
                    E d = CompactHashSet.this.m26631n(i);
                    this.f16520c = CompactHashSet.this.mo34884t(this.f16520c);
                    return d;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                m26646a();
                CollectPreconditions.m26538e(this.f16521d >= 0);
                mo34889b();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.m26631n(this.f16521d));
                this.f16520c = CompactHashSet.this.mo34875f(this.f16520c, this.f16521d);
                this.f16521d = -1;
            }
        };
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: m */
    public Set<E> mo34880m() {
        Object obj = this.f16514a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo34881q() {
        return isEmpty() ? -1 : 0;
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        if (mo34870F()) {
            return false;
        }
        Set m = mo34880m();
        if (m != null) {
            return m.remove(obj);
        }
        int u = m26633u();
        int f = CompactHashing.m26653f(obj, (Object) null, u, m26620M(), m26619J(), m26618I(), (Object[]) null);
        if (f == -1) {
            return false;
        }
        mo34869D(f, u);
        this.f16518g--;
        mo34887w();
        return true;
    }

    public int size() {
        Set m = mo34880m();
        return m != null ? m.size() : this.f16518g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo34884t(int i) {
        int i2 = i + 1;
        if (i2 < this.f16518g) {
            return i2;
        }
        return -1;
    }

    public Object[] toArray() {
        if (mo34870F()) {
            return new Object[0];
        }
        Set m = mo34880m();
        return m != null ? m.toArray() : Arrays.copyOf(m26618I(), this.f16518g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo34887w() {
        this.f16517f += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo34888z(int i) {
        Preconditions.m5378e(i >= 0, "Expected size must be >= 0");
        this.f16517f = Ints.m73616e(i, 1, 1073741823);
    }

    CompactHashSet(int i) {
        mo34888z(i);
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (mo34870F()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set m = mo34880m();
        if (m != null) {
            return m.toArray(tArr);
        }
        return ObjectArrays.m28474j(m26618I(), 0, this.f16518g, tArr);
    }
}
