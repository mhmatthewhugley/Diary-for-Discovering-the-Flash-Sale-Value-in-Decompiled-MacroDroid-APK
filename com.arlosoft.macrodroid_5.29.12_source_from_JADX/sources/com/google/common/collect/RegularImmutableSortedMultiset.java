package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.util.Comparator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: A */
    static final ImmutableSortedMultiset<Comparable> f17104A = new RegularImmutableSortedMultiset(Ordering.m28521e());

    /* renamed from: z */
    private static final long[] f17105z = {0};
    @VisibleForTesting

    /* renamed from: g */
    final transient RegularImmutableSortedSet<E> f17106g;

    /* renamed from: o */
    private final transient long[] f17107o;

    /* renamed from: p */
    private final transient int f17108p;

    /* renamed from: s */
    private final transient int f17109s;

    RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.f17106g = ImmutableSortedSet.m27619T(comparator);
        this.f17107o = f17105z;
        this.f17108p = 0;
        this.f17109s = 0;
    }

    /* renamed from: I */
    private int m28652I(int i) {
        long[] jArr = this.f17107o;
        int i2 = this.f17108p;
        return (int) (jArr[(i2 + i) + 1] - jArr[i2 + i]);
    }

    /* renamed from: B */
    public ImmutableSortedMultiset<E> mo34979E1(E e, BoundType boundType) {
        return mo36316J(0, this.f17106g.mo36320n0(e, Preconditions.m5392s(boundType) == BoundType.CLOSED));
    }

    /* renamed from: F */
    public ImmutableSortedMultiset<E> mo34981T1(E e, BoundType boundType) {
        return mo36316J(this.f17106g.mo36321o0(e, Preconditions.m5392s(boundType) == BoundType.CLOSED), this.f17109s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public ImmutableSortedMultiset<E> mo36316J(int i, int i2) {
        Preconditions.m5397x(i, i2, this.f17109s);
        if (i == i2) {
            return ImmutableSortedMultiset.m27593z(comparator());
        }
        if (i == 0 && i2 == this.f17109s) {
            return this;
        }
        return new RegularImmutableSortedMultiset(this.f17106g.mo36319m0(i, i2), this.f17107o, this.f17108p + i, i2 - i);
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        int indexOf = this.f17106g.indexOf(obj);
        if (indexOf >= 0) {
            return m28652I(indexOf);
        }
        return 0;
    }

    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return mo34983q(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return this.f17108p > 0 || this.f17109s < this.f17107o.length - 1;
    }

    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return mo34983q(this.f17109s - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Multiset.Entry<E> mo34983q(int i) {
        return Multisets.m28379h(this.f17106g.mo35029c().get(i), m28652I(i));
    }

    public int size() {
        long[] jArr = this.f17107o;
        int i = this.f17108p;
        return Ints.m73622k(jArr[this.f17109s + i] - jArr[i]);
    }

    /* renamed from: w */
    public ImmutableSortedSet<E> mo34982n() {
        return this.f17106g;
    }

    RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.f17106g = regularImmutableSortedSet;
        this.f17107o = jArr;
        this.f17108p = i;
        this.f17109s = i2;
    }
}
