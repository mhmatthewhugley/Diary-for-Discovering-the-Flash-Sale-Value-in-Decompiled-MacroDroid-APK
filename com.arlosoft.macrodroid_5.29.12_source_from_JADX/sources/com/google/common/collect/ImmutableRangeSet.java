package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.SortedLists;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* renamed from: c */
    private static final ImmutableRangeSet<Comparable<?>> f16700c = new ImmutableRangeSet<>(ImmutableList.m27301D());

    /* renamed from: d */
    private static final ImmutableRangeSet<Comparable<?>> f16701d = new ImmutableRangeSet<>(ImmutableList.m27302F(Range.m28544a()));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient ImmutableList<Range<C>> f16702a;

    private final class AsSet extends ImmutableSortedSet<C> {
        /* access modifiers changed from: private */
        public final DiscreteDomain<C> domain;

        /* renamed from: g */
        private transient Integer f16703g;

        AsSet(DiscreteDomain<C> discreteDomain) {
            super(Ordering.m28521e());
            this.domain = discreteDomain;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public ImmutableSortedSet<C> mo34913P() {
            return new DescendingImmutableSortedSet(this);
        }

        @GwtIncompatible
        /* renamed from: Q */
        public UnmodifiableIterator<C> descendingIterator() {
            return new AbstractIterator<C>() {

                /* renamed from: d */
                final Iterator<Range<C>> f16707d;

                /* renamed from: f */
                Iterator<C> f16708f = Iterators.m27717m();

                {
                    this.f16707d = ImmutableRangeSet.this.f16702a.mo35381I().iterator();
                }

                /* access modifiers changed from: protected */
                /* renamed from: d */
                public C mo34417a() {
                    while (!this.f16708f.hasNext()) {
                        if (!this.f16707d.hasNext()) {
                            return (Comparable) mo34418b();
                        }
                        this.f16708f = ContiguousSet.m26730m0(this.f16707d.next(), AsSet.this.domain).descendingIterator();
                    }
                    return (Comparable) this.f16708f.next();
                }
            };
        }

        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.mo34685b((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return ImmutableRangeSet.this.f16702a.mo34781j();
        }

        /* renamed from: k */
        public UnmodifiableIterator<C> iterator() {
            return new AbstractIterator<C>() {

                /* renamed from: d */
                final Iterator<Range<C>> f16704d;

                /* renamed from: f */
                Iterator<C> f16705f = Iterators.m27717m();

                {
                    this.f16704d = ImmutableRangeSet.this.f16702a.iterator();
                }

                /* access modifiers changed from: protected */
                /* renamed from: d */
                public C mo34417a() {
                    while (!this.f16705f.hasNext()) {
                        if (!this.f16704d.hasNext()) {
                            return (Comparable) mo34418b();
                        }
                        this.f16705f = ContiguousSet.m26730m0(this.f16704d.next(), AsSet.this.domain).iterator();
                    }
                    return (Comparable) this.f16705f.next();
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n0 */
        public ImmutableSortedSet<C> mo34916X(C c, boolean z) {
            return mo35505o0(Range.m28556z(c, BoundType.m26528d(z)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public ImmutableSortedSet<C> mo35505o0(Range<C> range) {
            return ImmutableRangeSet.this.mo35499l(range).mo35496g(this.domain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q0 */
        public ImmutableSortedSet<C> mo34919d0(C c, boolean z, C c2, boolean z2) {
            if (z || z2 || Range.m28547f(c, c2) != 0) {
                return mo35505o0(Range.m28553w(c, BoundType.m26528d(z), c2, BoundType.m26528d(z2)));
            }
            return ImmutableSortedSet.m27620Y();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r0 */
        public ImmutableSortedSet<C> mo34922h0(C c, boolean z) {
            return mo35505o0(Range.m28549i(c, BoundType.m26528d(z)));
        }

        public int size() {
            Integer num = this.f16703g;
            if (num == null) {
                long j = 0;
                UnmodifiableIterator k = ImmutableRangeSet.this.f16702a.iterator();
                while (k.hasNext()) {
                    j += (long) ContiguousSet.m26730m0((Range) k.next(), this.domain).size();
                    if (j >= 2147483647L) {
                        break;
                    }
                }
                num = Integer.valueOf(Ints.m73622k(j));
                this.f16703g = num;
            }
            return num.intValue();
        }

        public String toString() {
            return ImmutableRangeSet.this.f16702a.toString();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.f16702a, this.domain);
        }
    }

    private static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.ranges = immutableList;
            this.domain = discreteDomain;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new ImmutableRangeSet(this.ranges).mo35496g(this.domain);
        }
    }

    public static class Builder<C extends Comparable<?>> {

        /* renamed from: a */
        private final List<Range<C>> f16710a = Lists.m27832h();
    }

    private final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;
        final /* synthetic */ ImmutableRangeSet this$0;

        /* renamed from: P */
        public Range<C> get(int i) {
            Cut<C> cut;
            Cut<C> cut2;
            Preconditions.m5390q(i, this.size);
            if (this.positiveBoundedBelow) {
                cut = i == 0 ? Cut.m26753e() : ((Range) this.this$0.f16702a.get(i - 1)).upperBound;
            } else {
                cut = ((Range) this.this$0.f16702a.get(i)).upperBound;
            }
            if (!this.positiveBoundedAbove || i != this.size - 1) {
                cut2 = ((Range) this.this$0.f16702a.get(i + (this.positiveBoundedBelow ^ true ? 1 : 0))).lowerBound;
            } else {
                cut2 = Cut.m26751b();
            }
            return Range.m28548h(cut, cut2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        public int size() {
            return this.size;
        }
    }

    private static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.ranges = immutableList;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            if (this.ranges.isEmpty()) {
                return ImmutableRangeSet.m27477j();
            }
            if (this.ranges.equals(ImmutableList.m27302F(Range.m28544a()))) {
                return ImmutableRangeSet.m27475e();
            }
            return new ImmutableRangeSet(this.ranges);
        }
    }

    ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f16702a = immutableList;
    }

    /* renamed from: e */
    static <C extends Comparable> ImmutableRangeSet<C> m27475e() {
        return f16701d;
    }

    /* renamed from: h */
    private ImmutableList<Range<C>> m27476h(final Range<C> range) {
        int i;
        if (this.f16702a.isEmpty() || range.mo36282q()) {
            return ImmutableList.m27301D();
        }
        if (range.mo36277j(mo35498k())) {
            return this.f16702a;
        }
        final int a = range.mo36278l() ? SortedLists.m28780a(this.f16702a, Range.m28543A(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        if (range.mo36279m()) {
            i = SortedLists.m28780a(this.f16702a, Range.m28552t(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        } else {
            i = this.f16702a.size();
        }
        final int i2 = i - a;
        if (i2 == 0) {
            return ImmutableList.m27301D();
        }
        return new ImmutableList<Range<C>>() {
            /* renamed from: P */
            public Range<C> get(int i) {
                Preconditions.m5390q(i, i2);
                if (i == 0 || i == i2 - 1) {
                    return ((Range) ImmutableRangeSet.this.f16702a.get(i + a)).mo36280n(range);
                }
                return (Range) ImmutableRangeSet.this.f16702a.get(i + a);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public boolean mo34781j() {
                return true;
            }

            public int size() {
                return i2;
            }
        };
    }

    /* renamed from: j */
    public static <C extends Comparable> ImmutableRangeSet<C> m27477j() {
        return f16700c;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo34685b(Comparable comparable) {
        return super.mo34685b(comparable);
    }

    /* renamed from: c */
    public Range<C> mo34686c(C c) {
        int b = SortedLists.m28781b(this.f16702a, Range.m28552t(), Cut.m26754f(c), Ordering.m28521e(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (b == -1) {
            return null;
        }
        Range<C> range = this.f16702a.get(b);
        if (range.mo36275g(c)) {
            return range;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public ImmutableSet<Range<C>> mo35494a() {
        if (this.f16702a.isEmpty()) {
            return ImmutableSet.m27506F();
        }
        return new RegularImmutableSortedSet(this.f16702a, Range.m28554x());
    }

    /* renamed from: g */
    public ImmutableSortedSet<C> mo35496g(DiscreteDomain<C> discreteDomain) {
        Preconditions.m5392s(discreteDomain);
        if (mo35497i()) {
            return ImmutableSortedSet.m27620Y();
        }
        Range<C> e = mo35498k().mo36274e(discreteDomain);
        if (e.mo36278l()) {
            if (!e.mo36279m()) {
                try {
                    discreteDomain.mo35003b();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new AsSet(discreteDomain);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    /* renamed from: i */
    public boolean mo35497i() {
        return this.f16702a.isEmpty();
    }

    /* renamed from: k */
    public Range<C> mo35498k() {
        if (!this.f16702a.isEmpty()) {
            Cut<C> cut = this.f16702a.get(0).lowerBound;
            ImmutableList<Range<C>> immutableList = this.f16702a;
            return Range.m28548h(cut, immutableList.get(immutableList.size() - 1).upperBound);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public ImmutableRangeSet<C> mo35499l(Range<C> range) {
        if (!mo35497i()) {
            Range k = mo35498k();
            if (range.mo36277j(k)) {
                return this;
            }
            if (range.mo36281p(k)) {
                return new ImmutableRangeSet<>(m27476h(range));
            }
        }
        return m27477j();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this.f16702a);
    }
}
