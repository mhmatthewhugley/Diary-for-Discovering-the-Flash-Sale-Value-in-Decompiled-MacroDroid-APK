package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    transient ObjectCountHashMap<E> f16425d;

    /* renamed from: f */
    transient long f16426f;

    abstract class Itr<T> implements Iterator<T> {

        /* renamed from: a */
        int f16429a;

        /* renamed from: c */
        int f16430c = -1;

        /* renamed from: d */
        int f16431d;

        Itr() {
            this.f16429a = AbstractMapBasedMultiset.this.f16425d.mo36249e();
            this.f16431d = AbstractMapBasedMultiset.this.f16425d.f17048d;
        }

        /* renamed from: a */
        private void m26390a() {
            if (AbstractMapBasedMultiset.this.f16425d.f17048d != this.f16431d) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: b */
        public abstract T mo34614b(int i);

        public boolean hasNext() {
            m26390a();
            return this.f16429a >= 0;
        }

        @ParametricNullness
        public T next() {
            if (hasNext()) {
                T b = mo34614b(this.f16429a);
                int i = this.f16429a;
                this.f16430c = i;
                this.f16429a = AbstractMapBasedMultiset.this.f16425d.mo36258s(i);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m26390a();
            CollectPreconditions.m26538e(this.f16430c != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.f16426f -= (long) abstractMapBasedMultiset.f16425d.mo36262x(this.f16430c);
            this.f16429a = AbstractMapBasedMultiset.this.f16425d.mo36259t(this.f16429a, this.f16430c);
            this.f16430c = -1;
            this.f16431d = AbstractMapBasedMultiset.this.f16425d.f17048d;
        }
    }

    AbstractMapBasedMultiset(int i) {
        this.f16425d = mo34610k(i);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int h = Serialization.m28710h(objectInputStream);
        this.f16425d = mo34610k(3);
        Serialization.m28709g(this, objectInputStream, h);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m28713k(this, objectOutputStream);
    }

    /* renamed from: J1 */
    public final int mo34601J1(Object obj) {
        return this.f16425d.mo36250f(obj);
    }

    public final void clear() {
        this.f16425d.mo36247a();
        this.f16426f = 0;
    }

    @CanIgnoreReturnValue
    /* renamed from: e0 */
    public final int mo34603e0(@ParametricNullness E e, int i) {
        CollectPreconditions.m26535b(i, "count");
        ObjectCountHashMap<E> objectCountHashMap = this.f16425d;
        int v = i == 0 ? objectCountHashMap.mo36261v(e) : objectCountHashMap.mo36260u(e, i);
        this.f16426f += (long) (i - v);
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo34604f() {
        return this.f16425d.mo36246C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Iterator<E> mo34605h() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() {
            /* access modifiers changed from: package-private */
            @ParametricNullness
            /* renamed from: b */
            public E mo34614b(int i) {
                return AbstractMapBasedMultiset.this.f16425d.mo36252i(i);
            }
        };
    }

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    public final int mo34606h1(Object obj, int i) {
        if (i == 0) {
            return mo34601J1(obj);
        }
        Preconditions.m5381h(i > 0, "occurrences cannot be negative: %s", i);
        int m = this.f16425d.mo36254m(obj);
        if (m == -1) {
            return 0;
        }
        int k = this.f16425d.mo36253k(m);
        if (k > i) {
            this.f16425d.mo36245B(m, k - i);
        } else {
            this.f16425d.mo36262x(m);
            i = k;
        }
        this.f16426f -= (long) i;
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Iterator<Multiset.Entry<E>> mo34607i() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public Multiset.Entry<E> mo34614b(int i) {
                return AbstractMapBasedMultiset.this.f16425d.mo36251g(i);
            }
        };
    }

    public final Iterator<E> iterator() {
        return Multisets.m28381j(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo34609j(Multiset<? super E> multiset) {
        Preconditions.m5392s(multiset);
        int e = this.f16425d.mo36249e();
        while (e >= 0) {
            multiset.mo34611k1(this.f16425d.mo36252i(e), this.f16425d.mo36253k(e));
            e = this.f16425d.mo36258s(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract ObjectCountHashMap<E> mo34610k(int i);

    @CanIgnoreReturnValue
    /* renamed from: k1 */
    public final int mo34611k1(@ParametricNullness E e, int i) {
        if (i == 0) {
            return mo34601J1(e);
        }
        boolean z = true;
        Preconditions.m5381h(i > 0, "occurrences cannot be negative: %s", i);
        int m = this.f16425d.mo36254m(e);
        if (m == -1) {
            this.f16425d.mo36260u(e, i);
            this.f16426f += (long) i;
            return 0;
        }
        int k = this.f16425d.mo36253k(m);
        long j = (long) i;
        long j2 = ((long) k) + j;
        if (j2 > 2147483647L) {
            z = false;
        }
        Preconditions.m5383j(z, "too many occurrences: %s", j2);
        this.f16425d.mo36245B(m, (int) j2);
        this.f16426f += j;
        return k;
    }

    public final int size() {
        return Ints.m73622k(this.f16426f);
    }

    /* renamed from: z1 */
    public final boolean mo34613z1(@ParametricNullness E e, int i, int i2) {
        CollectPreconditions.m26535b(i, "oldCount");
        CollectPreconditions.m26535b(i2, "newCount");
        int m = this.f16425d.mo36254m(e);
        if (m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.f16425d.mo36260u(e, i2);
                this.f16426f += (long) i2;
            }
            return true;
        } else if (this.f16425d.mo36253k(m) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.f16425d.mo36262x(m);
                this.f16426f -= (long) i;
            } else {
                this.f16425d.mo36245B(m, i2);
                this.f16426f += (long) (i2 - i);
            }
            return true;
        }
    }
}
