package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final DiscreteDomain<C> domain;

    ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.m28521e());
        this.domain = discreteDomain;
    }

    /* renamed from: m0 */
    public static <C extends Comparable> ContiguousSet<C> m26730m0(Range<C> range, DiscreteDomain<C> discreteDomain) {
        Preconditions.m5392s(range);
        Preconditions.m5392s(discreteDomain);
        try {
            Range<C> n = !range.mo36278l() ? range.mo36280n(Range.m28545c(discreteDomain.mo35004c())) : range;
            if (!range.mo36279m()) {
                n = n.mo36280n(Range.m28546d(discreteDomain.mo35003b()));
            }
            boolean z = true;
            if (!n.mo36282q()) {
                C q = range.lowerBound.mo34953q(discreteDomain);
                Objects.requireNonNull(q);
                C m = range.upperBound.mo34951m(discreteDomain);
                Objects.requireNonNull(m);
                if (Range.m28547f((Comparable) q, (Comparable) m) <= 0) {
                    z = false;
                }
            }
            if (z) {
                return new EmptyContiguousSet(discreteDomain);
            }
            return new RegularContiguousSet(n, discreteDomain);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: P */
    public ImmutableSortedSet<C> mo34913P() {
        return new DescendingImmutableSortedSet(this);
    }

    /* renamed from: n0 */
    public ContiguousSet<C> headSet(C c) {
        return mo34916X((Comparable) Preconditions.m5392s(c), false);
    }

    @GwtIncompatible
    /* renamed from: o0 */
    public ContiguousSet<C> headSet(C c, boolean z) {
        return mo34916X((Comparable) Preconditions.m5392s(c), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public abstract ContiguousSet<C> mo34916X(C c, boolean z);

    /* renamed from: r0 */
    public abstract Range<C> mo34928r0();

    /* renamed from: s0 */
    public ContiguousSet<C> subSet(C c, C c2) {
        Preconditions.m5392s(c);
        Preconditions.m5392s(c2);
        Preconditions.m5377d(comparator().compare(c, c2) <= 0);
        return mo34919d0(c, true, c2, false);
    }

    public String toString() {
        return mo34928r0().toString();
    }

    @GwtIncompatible
    /* renamed from: u0 */
    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        Preconditions.m5392s(c);
        Preconditions.m5392s(c2);
        Preconditions.m5377d(comparator().compare(c, c2) <= 0);
        return mo34919d0(c, z, c2, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public abstract ContiguousSet<C> mo34919d0(C c, boolean z, C c2, boolean z2);

    /* renamed from: w0 */
    public ContiguousSet<C> tailSet(C c) {
        return mo34922h0((Comparable) Preconditions.m5392s(c), true);
    }

    @GwtIncompatible
    /* renamed from: x0 */
    public ContiguousSet<C> tailSet(C c, boolean z) {
        return mo34922h0((Comparable) Preconditions.m5392s(c), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public abstract ContiguousSet<C> mo34922h0(C c, boolean z);
}
