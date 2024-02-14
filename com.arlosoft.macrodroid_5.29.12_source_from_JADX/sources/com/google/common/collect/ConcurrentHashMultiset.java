package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final transient ConcurrentMap<E, AtomicInteger> f16534d;

    private class EntrySet extends AbstractMultiset<E>.EntrySet {
        private EntrySet() {
            super();
        }

        /* renamed from: k */
        private List<Multiset.Entry<E>> m26726k() {
            ArrayList l = Lists.m27836l(size());
            Iterators.m27705a(l, iterator());
            return l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public ConcurrentHashMultiset<E> mo34658i() {
            return ConcurrentHashMultiset.this;
        }

        public Object[] toArray() {
            return m26726k().toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return m26726k().toArray(tArr);
        }
    }

    private static class FieldSettersHolder {

        /* renamed from: a */
        static final Serialization.FieldSetter<ConcurrentHashMultiset> f16542a = Serialization.m28703a(ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    /* renamed from: k */
    private List<E> m26706k() {
        ArrayList l = Lists.m27836l(size());
        for (Multiset.Entry entry : entrySet()) {
            Object b = entry.mo35049b();
            for (int count = entry.getCount(); count > 0; count--) {
                l.add(b);
            }
        }
        return l;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        FieldSettersHolder.f16542a.mo36337b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16534d);
    }

    /* renamed from: C */
    public /* bridge */ /* synthetic */ Set mo34642C() {
        return super.mo34642C();
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m28068K(this.f16534d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<E> mo34645c() {
        final Set keySet = this.f16534d.keySet();
        return new ForwardingSet<E>(this) {
            /* access modifiers changed from: protected */
            /* renamed from: b0 */
            public Set<E> mo34397R() {
                return keySet;
            }

            public boolean contains(Object obj) {
                return obj != null && Collections2.m26545g(keySet, obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return mo35129V(collection);
            }

            public boolean remove(Object obj) {
                return obj != null && Collections2.m26546h(keySet, obj);
            }

            public boolean removeAll(Collection<?> collection) {
                return mo35235d0(collection);
            }
        };
    }

    public void clear() {
        this.f16534d.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Deprecated
    /* renamed from: d */
    public Set<Multiset.Entry<E>> mo34647d() {
        return new EntrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.f16534d.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34603e0(E r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.Preconditions.m5392s(r5)
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.m26535b(r6, r0)
        L_0x0008:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f16534d
            java.lang.Object r0 = com.google.common.collect.Maps.m28068K(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x0026
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f16534d
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r0.get()
            if (r2 != 0) goto L_0x0045
            if (r6 != 0) goto L_0x002f
            return r1
        L_0x002f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f16534d
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f16534d
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x0008
        L_0x0044:
            return r1
        L_0x0045:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.f16534d
            r6.remove(r5, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.mo34603e0(java.lang.Object, int):int");
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo34604f() {
        return this.f16534d.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<E> mo34605h() {
        throw new AssertionError("should never be called");
    }

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    public int mo34606h1(Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return mo34601J1(obj);
        }
        CollectPreconditions.m26537d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m28068K(this.f16534d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.f16534d.remove(obj, atomicInteger);
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Iterator<Multiset.Entry<E>> mo34607i() {
        final C69462 r0 = new AbstractIterator<Multiset.Entry<E>>() {

            /* renamed from: d */
            private final Iterator<Map.Entry<E, AtomicInteger>> f16536d;

            {
                this.f16536d = ConcurrentHashMultiset.this.f16534d.entrySet().iterator();
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public Multiset.Entry<E> mo34417a() {
                while (this.f16536d.hasNext()) {
                    Map.Entry next = this.f16536d.next();
                    int i = ((AtomicInteger) next.getValue()).get();
                    if (i != 0) {
                        return Multisets.m28379h(next.getKey(), i);
                    }
                }
                return (Multiset.Entry) mo34418b();
            }
        };
        return new ForwardingIterator<Multiset.Entry<E>>() {

            /* renamed from: a */
            private Multiset.Entry<E> f16538a;

            /* access modifiers changed from: protected */
            /* renamed from: R */
            public Iterator<Multiset.Entry<E>> mo22325Q() {
                return r0;
            }

            /* renamed from: T */
            public Multiset.Entry<E> next() {
                Multiset.Entry<E> entry = (Multiset.Entry) super.next();
                this.f16538a = entry;
                return entry;
            }

            public void remove() {
                Preconditions.m5399z(this.f16538a != null, "no calls to next() since the last call to remove()");
                ConcurrentHashMultiset.this.mo34603e0(this.f16538a.mo35049b(), 0);
                this.f16538a = null;
            }
        };
    }

    public boolean isEmpty() {
        return this.f16534d.isEmpty();
    }

    public Iterator<E> iterator() {
        return Multisets.m28381j(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r4.f16534d.putIfAbsent(r5, r2) == null) goto L_0x0071;
     */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34611k1(E r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.Preconditions.m5392s(r5)
            if (r6 != 0) goto L_0x000a
            int r5 = r4.mo34601J1(r5)
            return r5
        L_0x000a:
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.m26537d(r6, r0)
        L_0x000f:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f16534d
            java.lang.Object r0 = com.google.common.collect.Maps.m28068K(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f16534d
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x005c
            int r3 = com.google.common.math.IntMath.m73466b(r2, r6)     // Catch:{ ArithmeticException -> 0x003b }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x003b }
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = 65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Overflow adding "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L_0x005c:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f16534d
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0071
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f16534d
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x000f
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.mo34611k1(java.lang.Object, int):int");
    }

    public int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.f16534d.values()) {
            j += (long) atomicInteger.get();
        }
        return Ints.m73622k(j);
    }

    public Object[] toArray() {
        return m26706k().toArray();
    }

    @CanIgnoreReturnValue
    /* renamed from: z1 */
    public boolean mo34613z1(E e, int i, int i2) {
        Preconditions.m5392s(e);
        CollectPreconditions.m26535b(i, "oldCount");
        CollectPreconditions.m26535b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m28068K(this.f16534d, e);
        if (atomicInteger != null) {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.f16534d.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    if (this.f16534d.putIfAbsent(e, atomicInteger2) == null || this.f16534d.replace(e, atomicInteger, atomicInteger2)) {
                        return true;
                    }
                    return false;
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.f16534d.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 == 0 || this.f16534d.putIfAbsent(e, new AtomicInteger(i2)) == null) {
                return true;
            }
            return false;
        }
    }

    public <T> T[] toArray(T[] tArr) {
        return m26706k().toArray(tArr);
    }
}
