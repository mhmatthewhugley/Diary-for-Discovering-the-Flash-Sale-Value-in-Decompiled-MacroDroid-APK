package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    /* renamed from: a */
    private transient Comparator<? super E> f16551a;

    /* renamed from: c */
    private transient NavigableSet<E> f16552c;

    /* renamed from: d */
    private transient Set<Multiset.Entry<E>> f16553d;

    DescendingMultiset() {
    }

    /* renamed from: E1 */
    public SortedMultiset<E> mo34979E1(@ParametricNullness E e, BoundType boundType) {
        return mo34708h0().mo34981T1(e, boundType).mo34706t1();
    }

    /* renamed from: T1 */
    public SortedMultiset<E> mo34981T1(@ParametricNullness E e, BoundType boundType) {
        return mo34708h0().mo34979E1(e, boundType).mo34706t1();
    }

    /* renamed from: Z0 */
    public SortedMultiset<E> mo34696Z0(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2) {
        return mo34708h0().mo34696Z0(e2, boundType2, e, boundType).mo34706t1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Multiset<E> mo34397R() {
        return mo34708h0();
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f16551a;
        if (comparator != null) {
            return comparator;
        }
        Ordering j = Ordering.m28520a(mo34708h0().comparator()).mo34739j();
        this.f16551a = j;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public Set<Multiset.Entry<E>> mo34999d0() {
        return new Multisets.EntrySet<E>() {
            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Multiset<E> mo34658i() {
                return DescendingMultiset.this;
            }

            public Iterator<Multiset.Entry<E>> iterator() {
                return DescendingMultiset.this.mo34707g0();
            }

            public int size() {
                return DescendingMultiset.this.mo34708h0().entrySet().size();
            }
        };
    }

    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f16553d;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> d0 = mo34999d0();
        this.f16553d = d0;
        return d0;
    }

    public Multiset.Entry<E> firstEntry() {
        return mo34708h0().lastEntry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public abstract Iterator<Multiset.Entry<E>> mo34707g0();

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public abstract SortedMultiset<E> mo34708h0();

    public Iterator<E> iterator() {
        return Multisets.m28381j(this);
    }

    public Multiset.Entry<E> lastEntry() {
        return mo34708h0().firstEntry();
    }

    public Multiset.Entry<E> pollFirstEntry() {
        return mo34708h0().pollLastEntry();
    }

    public Multiset.Entry<E> pollLastEntry() {
        return mo34708h0().pollFirstEntry();
    }

    /* renamed from: t1 */
    public SortedMultiset<E> mo34706t1() {
        return mo34708h0();
    }

    public Object[] toArray() {
        return mo35131X();
    }

    public String toString() {
        return entrySet().toString();
    }

    /* renamed from: C */
    public NavigableSet<E> m26868C() {
        NavigableSet<E> navigableSet = this.f16552c;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.f16552c = navigableElementSet;
        return navigableElementSet;
    }

    public <T> T[] toArray(T[] tArr) {
        return mo35132Y(tArr);
    }
}
