package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    @LazyInit

    /* renamed from: a */
    private transient Set<E> f16440a;
    @LazyInit

    /* renamed from: c */
    private transient Set<Multiset.Entry<E>> f16441c;

    class ElementSet extends Multisets.ElementSet<E> {
        ElementSet() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Multiset<E> mo34656i() {
            return AbstractMultiset.this;
        }

        public Iterator<E> iterator() {
            return AbstractMultiset.this.mo34605h();
        }
    }

    class EntrySet extends Multisets.EntrySet<E> {
        EntrySet() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Multiset<E> mo34658i() {
            return AbstractMultiset.this;
        }

        public Iterator<Multiset.Entry<E>> iterator() {
            return AbstractMultiset.this.mo34607i();
        }

        public int size() {
            return AbstractMultiset.this.mo34604f();
        }
    }

    AbstractMultiset() {
    }

    /* renamed from: C */
    public Set<E> mo34642C() {
        Set<E> set = this.f16440a;
        if (set != null) {
            return set;
        }
        Set<E> c = mo34645c();
        this.f16440a = c;
        return c;
    }

    @CanIgnoreReturnValue
    public final boolean add(@ParametricNullness E e) {
        mo34611k1(e, 1);
        return true;
    }

    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.m28374c(this, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<E> mo34645c() {
        return new ElementSet();
    }

    public boolean contains(Object obj) {
        return mo34601J1(obj) > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Set<Multiset.Entry<E>> mo34647d() {
        return new EntrySet();
    }

    @CanIgnoreReturnValue
    /* renamed from: e0 */
    public int mo34603e0(@ParametricNullness E e, int i) {
        return Multisets.m28385n(this, e, i);
    }

    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f16441c;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> d = mo34647d();
        this.f16441c = d;
        return d;
    }

    public final boolean equals(Object obj) {
        return Multisets.m28377f(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract int mo34604f();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Iterator<E> mo34605h();

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    public int mo34606h1(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Iterator<Multiset.Entry<E>> mo34607i();

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @CanIgnoreReturnValue
    /* renamed from: k1 */
    public int mo34611k1(@ParametricNullness E e, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public final boolean remove(Object obj) {
        return mo34606h1(obj, 1) > 0;
    }

    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.m28383l(this, collection);
    }

    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.m28384m(this, collection);
    }

    public final String toString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    /* renamed from: z1 */
    public boolean mo34613z1(@ParametricNullness E e, int i, int i2) {
        return Multisets.m28386o(this, e, i, i2);
    }
}
