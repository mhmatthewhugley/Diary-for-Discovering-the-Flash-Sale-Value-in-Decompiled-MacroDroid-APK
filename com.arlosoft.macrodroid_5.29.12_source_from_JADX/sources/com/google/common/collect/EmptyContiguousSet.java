package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    @GwtIncompatible
    private static final class SerializedForm<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;
        private final DiscreteDomain<C> domain;

        private Object readResolve() {
            return new EmptyContiguousSet(this.domain);
        }

        private SerializedForm(DiscreteDomain<C> discreteDomain) {
            this.domain = discreteDomain;
        }
    }

    EmptyContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    /* renamed from: A0 */
    public C last() {
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: D */
    public boolean mo35028D() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: P */
    public ImmutableSortedSet<C> mo34913P() {
        return ImmutableSortedSet.m27619T(Ordering.m28521e().mo34739j());
    }

    @GwtIncompatible
    /* renamed from: Q */
    public UnmodifiableIterator<C> descendingIterator() {
        return Iterators.m27717m();
    }

    /* renamed from: c */
    public ImmutableList<C> mo35029c() {
        return ImmutableList.m27301D();
    }

    public boolean contains(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return false;
    }

    /* renamed from: k */
    public UnmodifiableIterator<C> iterator() {
        return Iterators.m27717m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public ContiguousSet<C> mo34916X(C c, boolean z) {
        return this;
    }

    /* renamed from: r0 */
    public Range<C> mo34928r0() {
        throw new NoSuchElementException();
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public ContiguousSet<C> mo34919d0(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.domain);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public ContiguousSet<C> mo34922h0(C c, boolean z) {
        return this;
    }

    /* renamed from: z0 */
    public C first() {
        throw new NoSuchElementException();
    }
}
