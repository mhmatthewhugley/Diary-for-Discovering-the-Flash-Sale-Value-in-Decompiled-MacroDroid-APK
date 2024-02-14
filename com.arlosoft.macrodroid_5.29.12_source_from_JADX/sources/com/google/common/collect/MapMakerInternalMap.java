package com.google.common.collect;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

@GwtIncompatible
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: s */
    static final WeakValueReference<Object, Object, DummyInternalEntry> f16863s = new WeakValueReference<Object, Object, DummyInternalEntry>() {
        /* renamed from: b */
        public WeakValueReference<Object, Object, DummyInternalEntry> mo35817a(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        public void clear() {
        }

        /* renamed from: d */
        public DummyInternalEntry mo35819c() {
            return null;
        }

        public Object get() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;

    /* renamed from: a */
    final transient int f16864a;

    /* renamed from: c */
    final transient int f16865c;
    final int concurrencyLevel;

    /* renamed from: d */
    final transient Segment<K, V, E, S>[] f16866d;

    /* renamed from: f */
    final transient InternalEntryHelper<K, V, E, S> f16867f;

    /* renamed from: g */
    transient Set<K> f16868g;
    final Equivalence<Object> keyEquivalence;

    /* renamed from: o */
    transient Collection<V> f16869o;

    /* renamed from: p */
    transient Set<Map.Entry<K, V>> f16870p;

    static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: a */
        transient ConcurrentMap<K, V> f16871a;
        final int concurrencyLevel;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.f16871a = concurrentMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public ConcurrentMap<K, V> mo34375R() {
            return this.f16871a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public void mo35823W(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f16871a.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public MapMaker mo35824X(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().mo35784g(objectInputStream.readInt()).mo35787j(this.keyStrength).mo35788k(this.valueStrength).mo35785h(this.keyEquivalence).mo35778a(this.concurrencyLevel);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Y */
        public void mo35825Y(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f16871a.size());
            for (Map.Entry entry : this.f16871a.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }
    }

    static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {

        /* renamed from: a */
        final K f16872a;

        /* renamed from: c */
        final int f16873c;

        /* renamed from: d */
        final E f16874d;

        AbstractStrongKeyEntry(K k, int i, E e) {
            this.f16872a = k;
            this.f16873c = i;
            this.f16874d = e;
        }

        /* renamed from: d */
        public int mo35826d() {
            return this.f16873c;
        }

        /* renamed from: e */
        public E mo35827e() {
            return this.f16874d;
        }

        public K getKey() {
            return this.f16872a;
        }
    }

    static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {

        /* renamed from: a */
        final int f16875a;

        /* renamed from: c */
        final E f16876c;

        AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f16875a = i;
            this.f16876c = e;
        }

        /* renamed from: d */
        public int mo35826d() {
            return this.f16875a;
        }

        /* renamed from: e */
        public E mo35827e() {
            return this.f16876c;
        }

        public K getKey() {
            return get();
        }
    }

    static final class CleanupMapTask implements Runnable {

        /* renamed from: a */
        final WeakReference<MapMakerInternalMap<?, ?, ?, ?>> f16877a;

        public void run() {
            MapMakerInternalMap mapMakerInternalMap = (MapMakerInternalMap) this.f16877a.get();
            if (mapMakerInternalMap != null) {
                for (Segment<K, V, E, S> D : mapMakerInternalMap.f16866d) {
                    D.mo35865D();
                }
                return;
            }
            throw new CancellationException();
        }
    }

    static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new AssertionError();
        }

        /* renamed from: a */
        public DummyInternalEntry mo35827e() {
            throw new AssertionError();
        }

        /* renamed from: d */
        public int mo35826d() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }
    }

    final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return mo35842c();
        }
    }

    final class EntrySet extends SafeToArraySet<Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                com.google.common.base.Equivalence r2 = r2.mo35806n()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.mo22143d(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.EntrySet.contains(java.lang.Object):boolean");
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(MapMakerInternalMap.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.EntrySet.remove(java.lang.Object):boolean");
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: a */
        int f16879a;

        /* renamed from: c */
        int f16880c = -1;

        /* renamed from: d */
        Segment<K, V, E, S> f16881d;

        /* renamed from: f */
        AtomicReferenceArray<E> f16882f;

        /* renamed from: g */
        E f16883g;

        /* renamed from: o */
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry f16884o;

        /* renamed from: p */
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry f16885p;

        HashIterator() {
            this.f16879a = MapMakerInternalMap.this.f16866d.length - 1;
            mo35840a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo35840a() {
            this.f16884o = null;
            if (!mo35843d() && !mo35844e()) {
                while (true) {
                    int i = this.f16879a;
                    if (i >= 0) {
                        Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.f16866d;
                        this.f16879a = i - 1;
                        Segment<K, V, E, S> segment = segmentArr[i];
                        this.f16881d = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f16881d.table;
                            this.f16882f = atomicReferenceArray;
                            this.f16880c = atomicReferenceArray.length() - 1;
                            if (mo35844e()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo35841b(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object e2 = MapMakerInternalMap.this.mo35796e(e);
                if (e2 != null) {
                    this.f16884o = new WriteThroughEntry(key, e2);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f16881d.mo35886t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry mo35842c() {
            MapMakerInternalMap<K, V, E, S>.WriteThroughEntry writeThroughEntry = this.f16884o;
            if (writeThroughEntry != null) {
                this.f16885p = writeThroughEntry;
                mo35840a();
                return this.f16885p;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo35843d() {
            E e = this.f16883g;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f16883g = e.mo35827e();
                E e2 = this.f16883g;
                if (e2 == null) {
                    return false;
                }
                if (mo35841b(e2)) {
                    return true;
                }
                e = this.f16883g;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo35844e() {
            while (true) {
                int i = this.f16880c;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f16882f;
                this.f16880c = i - 1;
                E e = (InternalEntry) atomicReferenceArray.get(i);
                this.f16883g = e;
                if (e != null && (mo35841b(e) || mo35843d())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.f16884o != null;
        }

        public void remove() {
            CollectPreconditions.m26538e(this.f16885p != null);
            MapMakerInternalMap.this.remove(this.f16885p.getKey());
            this.f16885p = null;
        }
    }

    interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        /* renamed from: d */
        int mo35826d();

        /* renamed from: e */
        E mo35827e();

        K getKey();

        V getValue();
    }

    interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        /* renamed from: a */
        E mo35847a(S s, E e, E e2);

        /* renamed from: b */
        Strength mo35848b();

        /* renamed from: c */
        void mo35849c(S s, E e, V v);

        /* renamed from: d */
        E mo35850d(S s, K k, int i, E e);

        /* renamed from: e */
        Strength mo35851e();

        /* renamed from: f */
        S mo35852f(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);
    }

    final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public K next() {
            return mo35842c().getKey();
        }
    }

    final class KeySet extends SafeToArraySet<K> {
        KeySet() {
            super();
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new KeyIterator(MapMakerInternalMap.this);
        }

        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    private static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        private SafeToArraySet() {
        }

        public Object[] toArray() {
            return MapMakerInternalMap.m27872l(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.m27872l(this).toArray(tArr);
        }
    }

    static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        @Weak
        final MapMakerInternalMap<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            mo35882m(mo35885r(i));
        }

        /* renamed from: n */
        static <K, V, E extends InternalEntry<K, V, E>> boolean m27914n(E e) {
            return e.getValue() == null;
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: A */
        public E mo35862A(E e, E e2) {
            int i = this.count;
            E e3 = e2.mo35827e();
            while (e != e2) {
                E d = mo35873d(e, e3);
                if (d != null) {
                    e3 = d;
                } else {
                    i--;
                }
                e = e.mo35827e();
            }
            this.count = i;
            return e3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public V mo35863B(K k, int i, V v) {
            lock();
            try {
                mo35887u();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.mo35826d() != i || key == null || !this.map.keyEquivalence.mo22143d(k, key)) {
                        internalEntry2 = internalEntry2.mo35827e();
                    } else {
                        V value = internalEntry2.getValue();
                        if (value == null) {
                            if (m27914n(internalEntry2)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, mo35862A(internalEntry, internalEntry2));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        mo35868G(internalEntry2, v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public boolean mo35864C(K k, int i, V v, V v2) {
            lock();
            try {
                mo35887u();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.mo35826d() != i || key == null || !this.map.keyEquivalence.mo22143d(k, key)) {
                        internalEntry2 = internalEntry2.mo35827e();
                    } else {
                        Object value = internalEntry2.getValue();
                        if (value == null) {
                            if (m27914n(internalEntry2)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, mo35862A(internalEntry, internalEntry2));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.mo35806n().mo22143d(v, value)) {
                            this.modCount++;
                            mo35868G(internalEntry2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo35865D() {
            mo35866E();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo35866E() {
            if (tryLock()) {
                try {
                    mo35884q();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public abstract S mo35867F();

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo35868G(E e, V v) {
            this.map.f16867f.mo35849c(mo35867F(), e, v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo35869H() {
            if (tryLock()) {
                try {
                    mo35884q();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35870a() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, (Object) null);
                    }
                    mo35883p();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public <T> void mo35871b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo35872c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    InternalEntry k = mo35880k(obj, i);
                    if (!(k == null || k.getValue() == null)) {
                        z = true;
                    }
                    return z;
                }
                mo35886t();
                return false;
            } finally {
                mo35886t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public E mo35873d(E e, E e2) {
            return this.map.f16867f.mo35847a(mo35867F(), e, e2);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: e */
        public void mo35874e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.mo35801h((InternalEntry) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: f */
        public void mo35875f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.mo35802i((WeakValueReference) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: g */
        public void mo35876g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<E> r = mo35885r(length << 1);
                this.threshold = (r.length() * 3) / 4;
                int length2 = r.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i2);
                    if (internalEntry != null) {
                        InternalEntry e = internalEntry.mo35827e();
                        int d = internalEntry.mo35826d() & length2;
                        if (e == null) {
                            r.set(d, internalEntry);
                        } else {
                            InternalEntry internalEntry2 = internalEntry;
                            while (e != null) {
                                int d2 = e.mo35826d() & length2;
                                if (d2 != d) {
                                    internalEntry2 = e;
                                    d = d2;
                                }
                                e = e.mo35827e();
                            }
                            r.set(d, internalEntry2);
                            while (internalEntry != internalEntry2) {
                                int d3 = internalEntry.mo35826d() & length2;
                                InternalEntry d4 = mo35873d(internalEntry, (InternalEntry) r.get(d3));
                                if (d4 != null) {
                                    r.set(d3, d4);
                                } else {
                                    i--;
                                }
                                internalEntry = internalEntry.mo35827e();
                            }
                        }
                    }
                }
                this.table = r;
                this.count = i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public V mo35877h(Object obj, int i) {
            try {
                InternalEntry k = mo35880k(obj, i);
                if (k == null) {
                    return null;
                }
                V value = k.getValue();
                if (value == null) {
                    mo35869H();
                }
                mo35886t();
                return value;
            } finally {
                mo35886t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public E mo35878i(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E j = mo35879j(i); j != null; j = j.mo35827e()) {
                if (j.mo35826d() == i) {
                    Object key = j.getKey();
                    if (key == null) {
                        mo35869H();
                    } else if (this.map.keyEquivalence.mo22143d(obj, key)) {
                        return j;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public E mo35879j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return (InternalEntry) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public E mo35880k(Object obj, int i) {
            return mo35878i(obj, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public V mo35881l(E e) {
            if (e.getKey() == null) {
                mo35869H();
                return null;
            }
            V value = e.getValue();
            if (value != null) {
                return value;
            }
            mo35869H();
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo35882m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo35883p() {
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: q */
        public void mo35884q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public AtomicReferenceArray<E> mo35885r(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo35886t() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                mo35865D();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: u */
        public void mo35887u() {
            mo35866E();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public V mo35888v(K k, int i, V v, boolean z) {
            lock();
            try {
                mo35887u();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    mo35876g();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.mo35826d() != i || key == null || !this.map.keyEquivalence.mo22143d(k, key)) {
                        internalEntry2 = internalEntry2.mo35827e();
                    } else {
                        V value = internalEntry2.getValue();
                        if (value == null) {
                            this.modCount++;
                            mo35868G(internalEntry2, v);
                            this.count = this.count;
                            return null;
                        } else if (z) {
                            unlock();
                            return value;
                        } else {
                            this.modCount++;
                            mo35868G(internalEntry2, v);
                            unlock();
                            return value;
                        }
                    }
                }
                this.modCount++;
                E d = this.map.f16867f.mo35850d(mo35867F(), k, i, internalEntry);
                mo35868G(d, v);
                atomicReferenceArray.set(length, d);
                this.count = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        /* renamed from: w */
        public boolean mo35889w(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (InternalEntry) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.mo35827e()) {
                    if (e3 == e) {
                        this.modCount++;
                        atomicReferenceArray.set(length, mo35862A(e2, e3));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        /* renamed from: x */
        public boolean mo35890x(K k, int i, WeakValueReference<K, V, E> weakValueReference) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.mo35826d() != i || key == null || !this.map.keyEquivalence.mo22143d(k, key)) {
                        internalEntry2 = internalEntry2.mo35827e();
                    } else if (((WeakValueEntry) internalEntry2).mo35909b() == weakValueReference) {
                        this.modCount++;
                        atomicReferenceArray.set(length, mo35862A(internalEntry, internalEntry2));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        /* renamed from: y */
        public V mo35891y(Object obj, int i) {
            lock();
            try {
                mo35887u();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (internalEntry2 != null) {
                    Object key = internalEntry2.getKey();
                    if (internalEntry2.mo35826d() != i || key == null || !this.map.keyEquivalence.mo22143d(obj, key)) {
                        internalEntry2 = internalEntry2.mo35827e();
                    } else {
                        V value = internalEntry2.getValue();
                        if (value == null) {
                            if (!m27914n(internalEntry2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, mo35862A(internalEntry, internalEntry2));
                        this.count--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo35892z(Object obj, int i, Object obj2) {
            lock();
            try {
                mo35887u();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                InternalEntry internalEntry2 = internalEntry;
                while (true) {
                    boolean z = false;
                    if (internalEntry2 != null) {
                        Object key = internalEntry2.getKey();
                        if (internalEntry2.mo35826d() != i || key == null || !this.map.keyEquivalence.mo22143d(obj, key)) {
                            internalEntry2 = internalEntry2.mo35827e();
                        } else {
                            if (this.map.mo35806n().mo22143d(obj2, internalEntry2.getValue())) {
                                z = true;
                            } else if (!m27914n(internalEntry2)) {
                                unlock();
                                return false;
                            }
                            this.modCount++;
                            atomicReferenceArray.set(length, mo35862A(internalEntry, internalEntry2));
                            this.count--;
                            return z;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }
    }

    private static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f16871a = mo35824X(objectInputStream).mo35786i();
            mo35823W(objectInputStream);
        }

        private Object readResolve() {
            return this.f16871a;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            mo35825Y(objectOutputStream);
        }
    }

    enum Strength {
        STRONG {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Equivalence<Object> mo35893d() {
                return Equivalence.m5277c();
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Equivalence<Object> mo35893d() {
                return Equivalence.m5278f();
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Equivalence<Object> mo35893d();
    }

    static final class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {

            /* renamed from: a */
            private static final Helper<?> f16891a = new Helper<>();

            Helper() {
            }

            /* renamed from: b */
            public Strength mo35848b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo35851e() {
                return Strength.STRONG;
            }

            /* renamed from: g */
            public StrongKeyDummyValueEntry<K> mo35847a(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry2) {
                return strongKeyDummyValueEntry.mo35894a(strongKeyDummyValueEntry2);
            }

            /* renamed from: h */
            public StrongKeyDummyValueEntry<K> mo35850d(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                return new StrongKeyDummyValueEntry<>(k, i, strongKeyDummyValueEntry);
            }

            /* renamed from: i */
            public StrongKeyDummyValueSegment<K> mo35852f(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: j */
            public void mo35849c(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }
        }

        StrongKeyDummyValueEntry(K k, int i, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
            super(k, i, strongKeyDummyValueEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public StrongKeyDummyValueEntry<K> mo35894a(StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
            return new StrongKeyDummyValueEntry<>(this.f16872a, this.f16873c, strongKeyDummyValueEntry);
        }

        /* renamed from: c */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public StrongKeyDummyValueSegment<K> mo35867F() {
            return this;
        }
    }

    static final class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {

        /* renamed from: f */
        private volatile V f16892f = null;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f16893a = new Helper<>();

            Helper() {
            }

            /* renamed from: h */
            static <K, V> Helper<K, V> m27966h() {
                return f16893a;
            }

            /* renamed from: b */
            public Strength mo35848b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo35851e() {
                return Strength.STRONG;
            }

            /* renamed from: g */
            public StrongKeyStrongValueEntry<K, V> mo35847a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
                return strongKeyStrongValueEntry.mo35901a(strongKeyStrongValueEntry2);
            }

            /* renamed from: i */
            public StrongKeyStrongValueEntry<K, V> mo35850d(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                return new StrongKeyStrongValueEntry<>(k, i, strongKeyStrongValueEntry);
            }

            /* renamed from: j */
            public StrongKeyStrongValueSegment<K, V> mo35852f(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo35849c(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v) {
                strongKeyStrongValueEntry.mo35902c(v);
            }
        }

        StrongKeyStrongValueEntry(K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            super(k, i, strongKeyStrongValueEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public StrongKeyStrongValueEntry<K, V> mo35901a(StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2 = new StrongKeyStrongValueEntry<>(this.f16872a, this.f16873c, strongKeyStrongValueEntry);
            strongKeyStrongValueEntry2.f16892f = this.f16892f;
            return strongKeyStrongValueEntry2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35902c(V v) {
            this.f16892f = v;
        }

        public V getValue() {
            return this.f16892f;
        }
    }

    static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public StrongKeyStrongValueSegment<K, V> mo35867F() {
            return this;
        }
    }

    static final class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {

        /* renamed from: f */
        private volatile WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> f16894f = MapMakerInternalMap.m27873m();

        static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f16895a = new Helper<>();

            Helper() {
            }

            /* renamed from: h */
            static <K, V> Helper<K, V> m27982h() {
                return f16895a;
            }

            /* renamed from: b */
            public Strength mo35848b() {
                return Strength.WEAK;
            }

            /* renamed from: e */
            public Strength mo35851e() {
                return Strength.STRONG;
            }

            /* renamed from: g */
            public StrongKeyWeakValueEntry<K, V> mo35847a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
                if (Segment.m27914n(strongKeyWeakValueEntry)) {
                    return null;
                }
                return strongKeyWeakValueEntry.mo35908a(strongKeyWeakValueSegment.queueForValues, strongKeyWeakValueEntry2);
            }

            /* renamed from: i */
            public StrongKeyWeakValueEntry<K, V> mo35850d(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                return new StrongKeyWeakValueEntry<>(k, i, strongKeyWeakValueEntry);
            }

            /* renamed from: j */
            public StrongKeyWeakValueSegment<K, V> mo35852f(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo35849c(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v) {
                strongKeyWeakValueEntry.mo35910c(v, strongKeyWeakValueSegment.queueForValues);
            }
        }

        StrongKeyWeakValueEntry(K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            super(k, i, strongKeyWeakValueEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public StrongKeyWeakValueEntry<K, V> mo35908a(ReferenceQueue<V> referenceQueue, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2 = new StrongKeyWeakValueEntry<>(this.f16872a, this.f16873c, strongKeyWeakValueEntry);
            strongKeyWeakValueEntry2.f16894f = this.f16894f.mo35817a(referenceQueue, strongKeyWeakValueEntry2);
            return strongKeyWeakValueEntry2;
        }

        /* renamed from: b */
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> mo35909b() {
            return this.f16894f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35910c(V v, ReferenceQueue<V> referenceQueue) {
            WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> weakValueReference = this.f16894f;
            this.f16894f = new WeakValueReferenceImpl(referenceQueue, v, this);
            weakValueReference.clear();
        }

        public V getValue() {
            return this.f16894f.get();
        }
    }

    static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public StrongKeyWeakValueSegment<K, V> mo35867F() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo35883p() {
            mo35871b(this.queueForValues);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo35884q() {
            mo35875f(this.queueForValues);
        }
    }

    interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public V next() {
            return mo35842c().getValue();
        }
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new ValueIterator(MapMakerInternalMap.this);
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }

        public Object[] toArray() {
            return MapMakerInternalMap.m27872l(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.m27872l(this).toArray(tArr);
        }
    }

    static final class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

            /* renamed from: a */
            private static final Helper<?> f16897a = new Helper<>();

            Helper() {
            }

            /* renamed from: b */
            public Strength mo35848b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo35851e() {
                return Strength.WEAK;
            }

            /* renamed from: g */
            public WeakKeyDummyValueEntry<K> mo35847a(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry2) {
                if (weakKeyDummyValueEntry.getKey() == null) {
                    return null;
                }
                return weakKeyDummyValueEntry.mo35924a(weakKeyDummyValueSegment.queueForKeys, weakKeyDummyValueEntry2);
            }

            /* renamed from: h */
            public WeakKeyDummyValueEntry<K> mo35850d(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                return new WeakKeyDummyValueEntry<>(weakKeyDummyValueSegment.queueForKeys, k, i, weakKeyDummyValueEntry);
            }

            /* renamed from: i */
            public WeakKeyDummyValueSegment<K> mo35852f(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: j */
            public void mo35849c(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }
        }

        WeakKeyDummyValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
            super(referenceQueue, k, i, weakKeyDummyValueEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public WeakKeyDummyValueEntry<K> mo35924a(ReferenceQueue<K> referenceQueue, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
            return new WeakKeyDummyValueEntry<>(referenceQueue, getKey(), this.f16875a, weakKeyDummyValueEntry);
        }

        /* renamed from: c */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public WeakKeyDummyValueSegment<K> mo35867F() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo35883p() {
            mo35871b(this.queueForKeys);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo35884q() {
            mo35874e(this.queueForKeys);
        }
    }

    static final class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* renamed from: d */
        private volatile V f16898d = null;

        static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f16899a = new Helper<>();

            Helper() {
            }

            /* renamed from: h */
            static <K, V> Helper<K, V> m28017h() {
                return f16899a;
            }

            /* renamed from: b */
            public Strength mo35848b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo35851e() {
                return Strength.WEAK;
            }

            /* renamed from: g */
            public WeakKeyStrongValueEntry<K, V> mo35847a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
                if (weakKeyStrongValueEntry.getKey() == null) {
                    return null;
                }
                return weakKeyStrongValueEntry.mo35931a(weakKeyStrongValueSegment.queueForKeys, weakKeyStrongValueEntry2);
            }

            /* renamed from: i */
            public WeakKeyStrongValueEntry<K, V> mo35850d(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                return new WeakKeyStrongValueEntry<>(weakKeyStrongValueSegment.queueForKeys, k, i, weakKeyStrongValueEntry);
            }

            /* renamed from: j */
            public WeakKeyStrongValueSegment<K, V> mo35852f(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo35849c(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v) {
                weakKeyStrongValueEntry.mo35932c(v);
            }
        }

        WeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            super(referenceQueue, k, i, weakKeyStrongValueEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public WeakKeyStrongValueEntry<K, V> mo35931a(ReferenceQueue<K> referenceQueue, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2 = new WeakKeyStrongValueEntry<>(referenceQueue, getKey(), this.f16875a, weakKeyStrongValueEntry);
            weakKeyStrongValueEntry2.mo35932c(this.f16898d);
            return weakKeyStrongValueEntry2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35932c(V v) {
            this.f16898d = v;
        }

        public V getValue() {
            return this.f16898d;
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public WeakKeyStrongValueSegment<K, V> mo35867F() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo35883p() {
            mo35871b(this.queueForKeys);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo35884q() {
            mo35874e(this.queueForKeys);
        }
    }

    static final class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* renamed from: d */
        private volatile WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> f16900d = MapMakerInternalMap.m27873m();

        static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f16901a = new Helper<>();

            Helper() {
            }

            /* renamed from: h */
            static <K, V> Helper<K, V> m28036h() {
                return f16901a;
            }

            /* renamed from: b */
            public Strength mo35848b() {
                return Strength.WEAK;
            }

            /* renamed from: e */
            public Strength mo35851e() {
                return Strength.WEAK;
            }

            /* renamed from: g */
            public WeakKeyWeakValueEntry<K, V> mo35847a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
                if (weakKeyWeakValueEntry.getKey() != null && !Segment.m27914n(weakKeyWeakValueEntry)) {
                    return weakKeyWeakValueEntry.mo35938a(weakKeyWeakValueSegment.queueForKeys, weakKeyWeakValueSegment.queueForValues, weakKeyWeakValueEntry2);
                }
                return null;
            }

            /* renamed from: i */
            public WeakKeyWeakValueEntry<K, V> mo35850d(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                return new WeakKeyWeakValueEntry<>(weakKeyWeakValueSegment.queueForKeys, k, i, weakKeyWeakValueEntry);
            }

            /* renamed from: j */
            public WeakKeyWeakValueSegment<K, V> mo35852f(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo35849c(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v) {
                weakKeyWeakValueEntry.mo35939c(v, weakKeyWeakValueSegment.queueForValues);
            }
        }

        WeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            super(referenceQueue, k, i, weakKeyWeakValueEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public WeakKeyWeakValueEntry<K, V> mo35938a(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2 = new WeakKeyWeakValueEntry<>(referenceQueue, getKey(), this.f16875a, weakKeyWeakValueEntry);
            weakKeyWeakValueEntry2.f16900d = this.f16900d.mo35817a(referenceQueue2, weakKeyWeakValueEntry2);
            return weakKeyWeakValueEntry2;
        }

        /* renamed from: b */
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> mo35909b() {
            return this.f16900d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo35939c(V v, ReferenceQueue<V> referenceQueue) {
            WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> weakValueReference = this.f16900d;
            this.f16900d = new WeakValueReferenceImpl(referenceQueue, v, this);
            weakValueReference.clear();
        }

        public V getValue() {
            return this.f16900d.get();
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();
        /* access modifiers changed from: private */
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public WeakKeyWeakValueSegment<K, V> mo35867F() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo35883p() {
            mo35871b(this.queueForKeys);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo35884q() {
            mo35874e(this.queueForKeys);
            mo35875f(this.queueForValues);
        }
    }

    interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        /* renamed from: b */
        WeakValueReference<K, V, E> mo35909b();
    }

    interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        /* renamed from: a */
        WeakValueReference<K, V, E> mo35817a(ReferenceQueue<V> referenceQueue, E e);

        /* renamed from: c */
        E mo35819c();

        void clear();

        V get();
    }

    static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        @Weak

        /* renamed from: a */
        final E f16902a;

        WeakValueReferenceImpl(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f16902a = e;
        }

        /* renamed from: a */
        public WeakValueReference<K, V, E> mo35817a(ReferenceQueue<V> referenceQueue, E e) {
            return new WeakValueReferenceImpl(referenceQueue, get(), e);
        }

        /* renamed from: c */
        public E mo35819c() {
            return this.f16902a;
        }
    }

    final class WriteThroughEntry extends AbstractMapEntry<K, V> {

        /* renamed from: a */
        final K f16903a;

        /* renamed from: c */
        V f16904c;

        WriteThroughEntry(K k, V v) {
            this.f16903a = k;
            this.f16904c = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f16903a.equals(entry.getKey()) || !this.f16904c.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f16903a;
        }

        public V getValue() {
            return this.f16904c;
        }

        public int hashCode() {
            return this.f16903a.hashCode() ^ this.f16904c.hashCode();
        }

        public V setValue(V v) {
            V put = MapMakerInternalMap.this.put(this.f16903a, v);
            this.f16904c = v;
            return put;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.concurrencyLevel = Math.min(mapMaker.mo35779b(), 65536);
        this.keyEquivalence = mapMaker.mo35781d();
        this.f16867f = internalEntryHelper;
        int min = Math.min(mapMaker.mo35780c(), BasicMeasure.EXACTLY);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel) {
            i4++;
            i3 <<= 1;
        }
        this.f16865c = 32 - i4;
        this.f16864a = i3 - 1;
        this.f16866d = mo35799g(i3);
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.f16866d;
            if (i < segmentArr.length) {
                segmentArr[i] = mo35791c(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    static <K, V> MapMakerInternalMap<K, V, ? extends InternalEntry<K, V, ?>, ?> m27870b(MapMaker mapMaker) {
        Strength e = mapMaker.mo35782e();
        Strength strength = Strength.STRONG;
        if (e == strength && mapMaker.mo35783f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyStrongValueEntry.Helper.m27966h());
        }
        if (mapMaker.mo35782e() == strength && mapMaker.mo35783f() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyWeakValueEntry.Helper.m27982h());
        }
        Strength e2 = mapMaker.mo35782e();
        Strength strength2 = Strength.WEAK;
        if (e2 == strength2 && mapMaker.mo35783f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyStrongValueEntry.Helper.m28017h());
        }
        if (mapMaker.mo35782e() == strength2 && mapMaker.mo35783f() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyWeakValueEntry.Helper.m28036h());
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    static int m27871j(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static <E> ArrayList<E> m27872l(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.m27705a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: m */
    static <K, V, E extends InternalEntry<K, V, E>> WeakValueReference<K, V, E> m27873m() {
        return f16863s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Segment<K, V, E, S> mo35791c(int i, int i2) {
        return this.f16867f.mo35852f(this, i, i2);
    }

    public void clear() {
        for (Segment<K, V, E, S> a : this.f16866d) {
            a.mo35870a();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int f = mo35798f(obj);
        return mo35804k(f).mo35872c(obj, f);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.f16866d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (Segment<K, V, E, S> segment : segmentArr) {
                int i2 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i3); internalEntry != null; internalEntry = internalEntry.mo35827e()) {
                        V l = segment.mo35881l(internalEntry);
                        if (l != null && mo35806n().mo22143d(obj2, l)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public E mo35795d(Object obj) {
        if (obj == null) {
            return null;
        }
        int f = mo35798f(obj);
        return mo35804k(f).mo35878i(obj, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public V mo35796e(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return e.getValue();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f16870p;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f16870p = entrySet;
        return entrySet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo35798f(Object obj) {
        return m27871j(this.keyEquivalence.mo22144e(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Segment<K, V, E, S>[] mo35799g(int i) {
        return new Segment[i];
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int f = mo35798f(obj);
        return mo35804k(f).mo35877h(obj, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo35801h(E e) {
        int d = e.mo35826d();
        mo35804k(d).mo35889w(e, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo35802i(WeakValueReference<K, V, E> weakValueReference) {
        E c = weakValueReference.mo35819c();
        int d = c.mo35826d();
        mo35804k(d).mo35890x(c.getKey(), d, weakValueReference);
    }

    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.f16866d;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Segment<K, V, E, S> mo35804k(int i) {
        return this.f16866d[(i >>> this.f16865c) & this.f16864a];
    }

    public Set<K> keySet() {
        Set<K> set = this.f16868g;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f16868g = keySet;
        return keySet;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n */
    public Equivalence<Object> mo35806n() {
        return this.f16867f.mo35848b().mo35893d();
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        int f = mo35798f(k);
        return mo35804k(f).mo35888v(k, f, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public V putIfAbsent(K k, V v) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        int f = mo35798f(k);
        return mo35804k(f).mo35888v(k, f, v, true);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int f = mo35798f(obj);
        return mo35804k(f).mo35891y(obj, f);
    }

    @CanIgnoreReturnValue
    public boolean replace(K k, V v, V v2) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v2);
        if (v == null) {
            return false;
        }
        int f = mo35798f(k);
        return mo35804k(f).mo35864C(k, f, v, v2);
    }

    public int size() {
        Segment<K, V, E, S>[] segmentArr = this.f16866d;
        long j = 0;
        for (Segment<K, V, E, S> segment : segmentArr) {
            j += (long) segment.count;
        }
        return Ints.m73622k(j);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f16869o;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.f16869o = values;
        return values;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializationProxy(this.f16867f.mo35851e(), this.f16867f.mo35848b(), this.keyEquivalence, this.f16867f.mo35848b().mo35893d(), this.concurrencyLevel, this);
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int f = mo35798f(obj);
        return mo35804k(f).mo35892z(obj, f, obj2);
    }

    @CanIgnoreReturnValue
    public V replace(K k, V v) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        int f = mo35798f(k);
        return mo35804k(f).mo35863B(k, f, v);
    }
}
