package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    @GwtIncompatible
    private static final class SerializedForm<C extends Comparable> implements Serializable {
        final DiscreteDomain<C> domain;
        final Range<C> range;

        private Object readResolve() {
            return new RegularContiguousSet(this.range, this.domain);
        }

        private SerializedForm(Range<C> range2, DiscreteDomain<C> discreteDomain) {
            this.range = range2;
            this.domain = discreteDomain;
        }
    }

    RegularContiguousSet(Range<C> range2, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.range = range2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static boolean m28575A0(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable2 != null && Range.m28547f(comparable, comparable2) == 0;
    }

    /* renamed from: C0 */
    private ContiguousSet<C> m28576C0(Range<C> range2) {
        if (this.range.mo36281p(range2)) {
            return ContiguousSet.m26730m0(this.range.mo36280n(range2), this.domain);
        }
        return new EmptyContiguousSet(this.domain);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public ImmutableList<C> mo35439B() {
        if (this.domain.supportsFastOffset) {
            return new ImmutableAsList<C>() {
                /* access modifiers changed from: package-private */
                /* renamed from: Q */
                public ImmutableSortedSet<C> mo35325P() {
                    return RegularContiguousSet.this;
                }

                /* renamed from: R */
                public C get(int i) {
                    Preconditions.m5390q(i, size());
                    RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                    return regularContiguousSet.domain.mo35006e(regularContiguousSet.first(), (long) i);
                }
            };
        }
        return super.mo35439B();
    }

    /* renamed from: B0 */
    public C first() {
        C q = this.range.lowerBound.mo34953q(this.domain);
        Objects.requireNonNull(q);
        return (Comparable) q;
    }

    /* renamed from: D0 */
    public C last() {
        C m = this.range.upperBound.mo34951m(this.domain);
        Objects.requireNonNull(m);
        return (Comparable) m;
    }

    /* renamed from: E0 */
    public Range<C> mo36292E0(BoundType boundType, BoundType boundType2) {
        return Range.m28548h(this.range.lowerBound.mo34956v(boundType, this.domain), this.range.upperBound.mo34957w(boundType2, this.domain));
    }

    @GwtIncompatible
    /* renamed from: Q */
    public UnmodifiableIterator<C> descendingIterator() {
        return new AbstractSequentialIterator<C>(last()) {

            /* renamed from: c */
            final C f17069c;

            {
                this.f17069c = RegularContiguousSet.this.first();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C mo22419a(C c) {
                if (RegularContiguousSet.m28575A0(c, this.f17069c)) {
                    return null;
                }
                return RegularContiguousSet.this.domain.mo35007f(c);
            }
        };
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.mo36275g((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        return Collections2.m26540b(this, collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.domain.equals(regularContiguousSet.domain)) {
                if (!first().equals(regularContiguousSet.first()) || !last().equals(regularContiguousSet.last())) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Sets.m28723f(this);
    }

    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return false;
    }

    /* renamed from: k */
    public UnmodifiableIterator<C> iterator() {
        return new AbstractSequentialIterator<C>(first()) {

            /* renamed from: c */
            final C f17067c;

            {
                this.f17067c = RegularContiguousSet.this.last();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C mo22419a(C c) {
                if (RegularContiguousSet.m28575A0(c, this.f17067c)) {
                    return null;
                }
                return RegularContiguousSet.this.domain.mo35005d(c);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public ContiguousSet<C> mo34916X(C c, boolean z) {
        return m28576C0(Range.m28556z(c, BoundType.m26528d(z)));
    }

    /* renamed from: r0 */
    public Range<C> mo34928r0() {
        BoundType boundType = BoundType.CLOSED;
        return mo36292E0(boundType, boundType);
    }

    public int size() {
        long a = this.domain.mo35002a(first(), last());
        if (a >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) a) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public ContiguousSet<C> mo34919d0(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return m28576C0(Range.m28553w(c, BoundType.m26528d(z), c2, BoundType.m26528d(z2)));
        }
        return new EmptyContiguousSet(this.domain);
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.range, this.domain);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public ContiguousSet<C> mo34922h0(C c, boolean z) {
        return m28576C0(Range.m28549i(c, BoundType.m26528d(z)));
    }
}
