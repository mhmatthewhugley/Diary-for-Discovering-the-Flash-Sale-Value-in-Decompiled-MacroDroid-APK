package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.NavigableSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
public abstract class ForwardingSortedMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    protected abstract class StandardDescendingMultiset extends DescendingMultiset<E> {

        /* renamed from: f */
        final /* synthetic */ ForwardingSortedMultiset f16606f;

        /* access modifiers changed from: package-private */
        /* renamed from: h0 */
        public SortedMultiset<E> mo34708h0() {
            return this.f16606f;
        }
    }

    protected class StandardElementSet extends SortedMultisets.NavigableElementSet<E> {
    }

    protected ForwardingSortedMultiset() {
    }

    /* renamed from: E1 */
    public SortedMultiset<E> mo34979E1(@ParametricNullness E e, BoundType boundType) {
        return mo34998b0().mo34979E1(e, boundType);
    }

    /* renamed from: T1 */
    public SortedMultiset<E> mo34981T1(@ParametricNullness E e, BoundType boundType) {
        return mo34998b0().mo34981T1(e, boundType);
    }

    /* renamed from: Z0 */
    public SortedMultiset<E> mo34696Z0(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2) {
        return mo34998b0().mo34696Z0(e, boundType, e2, boundType2);
    }

    public Comparator<? super E> comparator() {
        return mo34998b0().comparator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public abstract SortedMultiset<E> mo34998b0();

    public Multiset.Entry<E> firstEntry() {
        return mo34998b0().firstEntry();
    }

    public Multiset.Entry<E> lastEntry() {
        return mo34998b0().lastEntry();
    }

    public Multiset.Entry<E> pollFirstEntry() {
        return mo34998b0().pollFirstEntry();
    }

    public Multiset.Entry<E> pollLastEntry() {
        return mo34998b0().pollLastEntry();
    }

    /* renamed from: t1 */
    public SortedMultiset<E> mo34706t1() {
        return mo34998b0().mo34706t1();
    }

    /* renamed from: C */
    public NavigableSet<E> m27140C() {
        return mo34998b0().mo34642C();
    }
}
