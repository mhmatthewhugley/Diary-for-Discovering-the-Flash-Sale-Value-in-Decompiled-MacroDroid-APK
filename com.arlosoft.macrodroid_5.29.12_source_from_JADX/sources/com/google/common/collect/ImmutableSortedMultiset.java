package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements SortedMultiset<E> {
    @LazyInit

    /* renamed from: f */
    transient ImmutableSortedMultiset<E> f16727f;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* renamed from: d */
        private final Comparator<? super E> f16728d;
        @VisibleForTesting

        /* renamed from: e */
        E[] f16729e = new Object[4];

        /* renamed from: f */
        private int[] f16730f = new int[4];

        /* renamed from: g */
        private int f16731g;

        /* renamed from: h */
        private boolean f16732h;

        public Builder(Comparator<? super E> comparator) {
            super(true);
            this.f16728d = (Comparator) Preconditions.m5392s(comparator);
        }

        /* renamed from: n */
        private void m27606n(boolean z) {
            int i = this.f16731g;
            if (i != 0) {
                E[] copyOf = Arrays.copyOf(this.f16729e, i);
                Arrays.sort(copyOf, this.f16728d);
                int i2 = 1;
                for (int i3 = 1; i3 < copyOf.length; i3++) {
                    if (this.f16728d.compare(copyOf[i2 - 1], copyOf[i3]) < 0) {
                        copyOf[i2] = copyOf[i3];
                        i2++;
                    }
                }
                Arrays.fill(copyOf, i2, this.f16731g, (Object) null);
                if (z) {
                    int i4 = i2 * 4;
                    int i5 = this.f16731g;
                    if (i4 > i5 * 3) {
                        copyOf = Arrays.copyOf(copyOf, IntMath.m73473i(i5, (i5 / 2) + 1));
                    }
                }
                int[] iArr = new int[copyOf.length];
                for (int i6 = 0; i6 < this.f16731g; i6++) {
                    int binarySearch = Arrays.binarySearch(copyOf, 0, i2, this.f16729e[i6], this.f16728d);
                    int[] iArr2 = this.f16730f;
                    if (iArr2[i6] >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + iArr2[i6];
                    } else {
                        iArr[binarySearch] = ~iArr2[i6];
                    }
                }
                this.f16729e = copyOf;
                this.f16730f = iArr;
                this.f16731g = i2;
            }
        }

        /* renamed from: o */
        private void m27607o() {
            m27606n(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f16731g;
                if (i < i3) {
                    int[] iArr = this.f16730f;
                    if (iArr[i] > 0) {
                        E[] eArr = this.f16729e;
                        eArr[i2] = eArr[i];
                        iArr[i2] = iArr[i];
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f16729e, i2, i3, (Object) null);
                    Arrays.fill(this.f16730f, i2, this.f16731g, 0);
                    this.f16731g = i2;
                    return;
                }
            }
        }

        /* renamed from: p */
        private void m27608p() {
            int i = this.f16731g;
            E[] eArr = this.f16729e;
            if (i == eArr.length) {
                m27606n(true);
            } else if (this.f16732h) {
                this.f16729e = Arrays.copyOf(eArr, eArr.length);
            }
            this.f16732h = false;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public Builder<E> mo35474e(E e) {
            return mo35476g(e, 1);
        }

        @CanIgnoreReturnValue
        /* renamed from: k */
        public Builder<E> mo35475f(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry entry : ((Multiset) iterable).entrySet()) {
                    mo35476g(entry.mo35049b(), entry.getCount());
                }
            } else {
                for (Object j : iterable) {
                    mo35474e(j);
                }
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: l */
        public Builder<E> mo35476g(E e, int i) {
            Preconditions.m5392s(e);
            CollectPreconditions.m26535b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            m27608p();
            E[] eArr = this.f16729e;
            int i2 = this.f16731g;
            eArr[i2] = e;
            this.f16730f[i2] = i;
            this.f16731g = i2 + 1;
            return this;
        }

        /* renamed from: m */
        public ImmutableSortedMultiset<E> mo35477h() {
            m27607o();
            int i = this.f16731g;
            if (i == 0) {
                return ImmutableSortedMultiset.m27593z(this.f16728d);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.m27618O(this.f16728d, i, this.f16729e);
            long[] jArr = new long[(this.f16731g + 1)];
            int i2 = 0;
            while (i2 < this.f16731g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f16730f[i2]);
                i2 = i3;
            }
            this.f16732h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f16731g);
        }
    }

    private static final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        SerializedForm(SortedMultiset<E> sortedMultiset) {
            this.comparator = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry next : sortedMultiset.entrySet()) {
                this.elements[i] = next.mo35049b();
                this.counts[i] = next.getCount();
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            int length = this.elements.length;
            Builder builder = new Builder(this.comparator);
            for (int i = 0; i < length; i++) {
                builder.mo35476g(this.elements[i], this.counts[i]);
            }
            return builder.mo35477h();
        }
    }

    ImmutableSortedMultiset() {
    }

    /* renamed from: z */
    static <E> ImmutableSortedMultiset<E> m27593z(Comparator<? super E> comparator) {
        if (Ordering.m28521e().equals(comparator)) {
            return RegularImmutableSortedMultiset.f17104A;
        }
        return new RegularImmutableSortedMultiset(comparator);
    }

    /* renamed from: B */
    public abstract ImmutableSortedMultiset<E> mo34979E1(E e, BoundType boundType);

    /* renamed from: D */
    public ImmutableSortedMultiset<E> mo34696Z0(E e, BoundType boundType, E e2, BoundType boundType2) {
        Preconditions.m5387n(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return mo34981T1(e, boundType).mo34979E1(e2, boundType2);
    }

    /* renamed from: F */
    public abstract ImmutableSortedMultiset<E> mo34981T1(E e, BoundType boundType);

    public final Comparator<? super E> comparator() {
        return mo34982n().comparator();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: u */
    public ImmutableSortedMultiset<E> mo34706t1() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.f16727f;
        if (immutableSortedMultiset == null) {
            if (isEmpty()) {
                immutableSortedMultiset = m27593z(Ordering.m28520a(comparator()).mo34739j());
            } else {
                immutableSortedMultiset = new DescendingImmutableSortedMultiset<>(this);
            }
            this.f16727f = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    /* renamed from: w */
    public abstract ImmutableSortedSet<E> mo34982n();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
