package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* renamed from: o */
    static final RegularImmutableSortedSet<Comparable> f17110o = new RegularImmutableSortedSet<>(ImmutableList.m27301D(), Ordering.m28521e());
    @VisibleForTesting

    /* renamed from: g */
    final transient ImmutableList<E> f17111g;

    RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f17111g = immutableList;
    }

    /* renamed from: q0 */
    private int m28665q0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f17111g, obj, mo36322r0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public ImmutableSortedSet<E> mo34913P() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.f16733d);
        if (isEmpty()) {
            return ImmutableSortedSet.m27619T(reverseOrder);
        }
        return new RegularImmutableSortedSet(this.f17111g.mo35381I(), reverseOrder);
    }

    @GwtIncompatible
    /* renamed from: Q */
    public UnmodifiableIterator<E> descendingIterator() {
        return this.f17111g.mo35381I().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public ImmutableSortedSet<E> mo34916X(E e, boolean z) {
        return mo36319m0(0, mo36320n0(e, z));
    }

    /* renamed from: c */
    public ImmutableList<E> mo35029c() {
        return this.f17111g;
    }

    public E ceiling(E e) {
        int o0 = mo36321o0(e, true);
        if (o0 == size()) {
            return null;
        }
        return this.f17111g.get(o0);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m28665q0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo34642C();
        }
        if (!SortedIterables.m28779b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator k = iterator();
        Iterator<?> it = collection.iterator();
        if (!k.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = k.next();
        while (true) {
            try {
                int i0 = mo35581i0(next2, next);
                if (i0 < 0) {
                    if (!k.hasNext()) {
                        return false;
                    }
                    next2 = k.next();
                } else if (i0 == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (i0 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        return this.f17111g.mo35355d(objArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public ImmutableSortedSet<E> mo34919d0(E e, boolean z, E e2, boolean z2) {
        return mo34922h0(e, z).mo34916X(e2, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.f16733d
            boolean r1 = com.google.common.collect.SortedIterables.m28779b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.UnmodifiableIterator r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.mo35581i0(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo35356f() {
        return this.f17111g.mo35356f();
    }

    public E first() {
        if (!isEmpty()) {
            return this.f17111g.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e) {
        int n0 = mo36320n0(e, true) - 1;
        if (n0 == -1) {
            return null;
        }
        return this.f17111g.get(n0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo35357h() {
        return this.f17111g.mo35357h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public ImmutableSortedSet<E> mo34922h0(E e, boolean z) {
        return mo36319m0(mo36321o0(e, z), size());
    }

    public E higher(E e) {
        int o0 = mo36321o0(e, false);
        if (o0 == size()) {
            return null;
        }
        return this.f17111g.get(o0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo35358i() {
        return this.f17111g.mo35358i();
    }

    /* access modifiers changed from: package-private */
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.f17111g, obj, mo36322r0());
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return this.f17111g.mo34781j();
    }

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return this.f17111g.iterator();
    }

    public E last() {
        if (!isEmpty()) {
            return this.f17111g.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e) {
        int n0 = mo36320n0(e, false) - 1;
        if (n0 == -1) {
            return null;
        }
        return this.f17111g.get(n0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public RegularImmutableSortedSet<E> mo36319m0(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new RegularImmutableSortedSet<>(this.f17111g.subList(i, i2), this.f16733d);
        }
        return ImmutableSortedSet.m27619T(this.f16733d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public int mo36320n0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f17111g, Preconditions.m5392s(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public int mo36321o0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f17111g, Preconditions.m5392s(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public Comparator<Object> mo36322r0() {
        return this.f16733d;
    }

    public int size() {
        return this.f17111g.size();
    }
}
