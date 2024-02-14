package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SortedMultisets {

    static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {
        @Weak

        /* renamed from: a */
        private final SortedMultiset<E> f17162a;

        ElementSet(SortedMultiset<E> sortedMultiset) {
            this.f17162a = sortedMultiset;
        }

        public Comparator<? super E> comparator() {
            return mo34656i().comparator();
        }

        @ParametricNullness
        public E first() {
            return SortedMultisets.m28803d(mo34656i().firstEntry());
        }

        public SortedSet<E> headSet(@ParametricNullness E e) {
            return mo34656i().mo34979E1(e, BoundType.OPEN).mo34642C();
        }

        public Iterator<E> iterator() {
            return Multisets.m28376e(mo34656i().entrySet().iterator());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public final SortedMultiset<E> mo34656i() {
            return this.f17162a;
        }

        @ParametricNullness
        public E last() {
            return SortedMultisets.m28803d(mo34656i().lastEntry());
        }

        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return mo34656i().mo34696Z0(e, BoundType.CLOSED, e2, BoundType.OPEN).mo34642C();
        }

        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return mo34656i().mo34981T1(e, BoundType.CLOSED).mo34642C();
        }
    }

    @GwtIncompatible
    static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        NavigableElementSet(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        public E ceiling(@ParametricNullness E e) {
            return SortedMultisets.m28802c(mo34656i().mo34981T1(e, BoundType.CLOSED).firstEntry());
        }

        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<E> descendingSet() {
            return new NavigableElementSet(mo34656i().mo34706t1());
        }

        public E floor(@ParametricNullness E e) {
            return SortedMultisets.m28802c(mo34656i().mo34979E1(e, BoundType.CLOSED).lastEntry());
        }

        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return new NavigableElementSet(mo34656i().mo34979E1(e, BoundType.m26528d(z)));
        }

        public E higher(@ParametricNullness E e) {
            return SortedMultisets.m28802c(mo34656i().mo34981T1(e, BoundType.OPEN).firstEntry());
        }

        public E lower(@ParametricNullness E e) {
            return SortedMultisets.m28802c(mo34656i().mo34979E1(e, BoundType.OPEN).lastEntry());
        }

        public E pollFirst() {
            return SortedMultisets.m28802c(mo34656i().pollFirstEntry());
        }

        public E pollLast() {
            return SortedMultisets.m28802c(mo34656i().pollLastEntry());
        }

        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return new NavigableElementSet(mo34656i().mo34696Z0(e, BoundType.m26528d(z), e2, BoundType.m26528d(z2)));
        }

        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return new NavigableElementSet(mo34656i().mo34981T1(e, BoundType.m26528d(z)));
        }
    }

    private SortedMultisets() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <E> E m28802c(Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.mo35049b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <E> E m28803d(Multiset.Entry<E> entry) {
        if (entry != null) {
            return entry.mo35049b();
        }
        throw new NoSuchElementException();
    }
}
