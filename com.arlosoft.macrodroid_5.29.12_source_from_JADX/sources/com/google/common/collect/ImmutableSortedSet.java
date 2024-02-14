package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, SortedIterable<E> {

    /* renamed from: d */
    final transient Comparator<? super E> f16733d;
    @GwtIncompatible
    @LazyInit

    /* renamed from: f */
    transient ImmutableSortedSet<E> f16734f;

    public static final class Builder<E> extends ImmutableSet.Builder<E> {

        /* renamed from: f */
        private final Comparator<? super E> f16735f;

        public Builder(Comparator<? super E> comparator) {
            this.f16735f = (Comparator) Preconditions.m5392s(comparator);
        }

        @CanIgnoreReturnValue
        /* renamed from: n */
        public Builder<E> mo35517i(E e) {
            super.mo35365e(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: o */
        public Builder<E> mo35585o(E... eArr) {
            super.mo35518j(eArr);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: p */
        public Builder<E> mo35519k(Iterator<? extends E> it) {
            super.mo35519k(it);
            return this;
        }

        /* renamed from: q */
        public ImmutableSortedSet<E> mo35520m() {
            ImmutableSortedSet<E> O = ImmutableSortedSet.m27618O(this.f16735f, this.f16644b, this.f16643a);
            this.f16644b = O.size();
            this.f16645c = true;
            return O;
        }
    }

    private static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new Builder(this.comparator).mo35585o(this.elements).mo35520m();
        }
    }

    ImmutableSortedSet(Comparator<? super E> comparator) {
        this.f16733d = comparator;
    }

    /* renamed from: O */
    static <E> ImmutableSortedSet<E> m27618O(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return m27619T(comparator);
        }
        ObjectArrays.m28467c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator.compare(e, eArr[i2 - 1]) != 0) {
                eArr[i2] = e;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.m27305m(eArr, i2), comparator);
    }

    /* renamed from: T */
    static <E> RegularImmutableSortedSet<E> m27619T(Comparator<? super E> comparator) {
        if (Ordering.m28521e().equals(comparator)) {
            return RegularImmutableSortedSet.f17110o;
        }
        return new RegularImmutableSortedSet<>(ImmutableList.m27301D(), comparator);
    }

    /* renamed from: Y */
    public static <E> ImmutableSortedSet<E> m27620Y() {
        return RegularImmutableSortedSet.f17110o;
    }

    /* renamed from: l0 */
    static int m27621l0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: P */
    public abstract ImmutableSortedSet<E> mo34913P();

    @GwtIncompatible
    /* renamed from: Q */
    public abstract UnmodifiableIterator<E> descendingIterator();

    @GwtIncompatible
    /* renamed from: R */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.f16734f;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> P = mo34913P();
        this.f16734f = P;
        P.f16734f = this;
        return P;
    }

    /* renamed from: V */
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    /* renamed from: W */
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return mo34916X(Preconditions.m5392s(e), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public abstract ImmutableSortedSet<E> mo34916X(E e, boolean z);

    /* renamed from: a0 */
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @GwtIncompatible
    /* renamed from: b0 */
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        Preconditions.m5392s(e);
        Preconditions.m5392s(e2);
        Preconditions.m5377d(this.f16733d.compare(e, e2) <= 0);
        return mo34919d0(e, z, e2, z2);
    }

    public E ceiling(E e) {
        return Iterables.m27681h(tailSet(e, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.f16733d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public abstract ImmutableSortedSet<E> mo34919d0(E e, boolean z, E e2, boolean z2);

    /* renamed from: f0 */
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return Iterators.m27725u(headSet(e, true).descendingIterator(), null);
    }

    /* renamed from: g0 */
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return mo34922h0(Preconditions.m5392s(e), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public abstract ImmutableSortedSet<E> mo34922h0(E e, boolean z);

    @GwtIncompatible
    public E higher(E e) {
        return Iterables.m27681h(tailSet(e, false), null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public int mo35581i0(Object obj, Object obj2) {
        return m27621l0(this.f16733d, obj, obj2);
    }

    /* renamed from: k */
    public abstract UnmodifiableIterator<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    @GwtIncompatible
    public E lower(E e) {
        return Iterators.m27725u(headSet(e, false).descendingIterator(), null);
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this.f16733d, toArray());
    }
}
