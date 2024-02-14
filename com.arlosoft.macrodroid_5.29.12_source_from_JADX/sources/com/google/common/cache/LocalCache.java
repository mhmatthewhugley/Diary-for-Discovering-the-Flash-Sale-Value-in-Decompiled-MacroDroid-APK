package com.google.common.cache;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.location.LocationRequestCompat;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: N */
    static final Logger f4335N = Logger.getLogger(LocalCache.class.getName());

    /* renamed from: O */
    static final ValueReference<Object, Object> f4336O = new ValueReference<Object, Object>() {
        /* renamed from: b */
        public boolean mo22372b() {
            return false;
        }

        /* renamed from: c */
        public ReferenceEntry<Object, Object> mo22373c() {
            return null;
        }

        /* renamed from: d */
        public void mo22374d(Object obj) {
        }

        /* renamed from: e */
        public int mo22375e() {
            return 0;
        }

        /* renamed from: f */
        public boolean mo22376f() {
            return false;
        }

        /* renamed from: g */
        public ValueReference<Object, Object> mo22377g(ReferenceQueue<Object> referenceQueue, Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        public Object get() {
            return null;
        }

        /* renamed from: h */
        public Object mo22379h() {
            return null;
        }
    };

    /* renamed from: P */
    static final Queue<?> f4337P = new AbstractQueue<Object>() {
        public Iterator<Object> iterator() {
            return ImmutableSet.m27506F().iterator();
        }

        public boolean offer(Object obj) {
            return true;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        public int size() {
            return 0;
        }
    };

    /* renamed from: A */
    final Weigher<K, V> f4338A;

    /* renamed from: B */
    final long f4339B;

    /* renamed from: C */
    final long f4340C;

    /* renamed from: D */
    final long f4341D;

    /* renamed from: E */
    final Queue<RemovalNotification<K, V>> f4342E;

    /* renamed from: F */
    final RemovalListener<K, V> f4343F;

    /* renamed from: G */
    final Ticker f4344G;

    /* renamed from: H */
    final EntryFactory f4345H;

    /* renamed from: I */
    final AbstractCache.StatsCounter f4346I;

    /* renamed from: J */
    final CacheLoader<? super K, V> f4347J;
    @RetainedWith

    /* renamed from: K */
    Set<K> f4348K;
    @RetainedWith

    /* renamed from: L */
    Collection<V> f4349L;
    @RetainedWith

    /* renamed from: M */
    Set<Map.Entry<K, V>> f4350M;

    /* renamed from: a */
    final int f4351a;

    /* renamed from: c */
    final int f4352c;

    /* renamed from: d */
    final Segment<K, V>[] f4353d;

    /* renamed from: f */
    final int f4354f;

    /* renamed from: g */
    final Equivalence<Object> f4355g;

    /* renamed from: o */
    final Equivalence<Object> f4356o;

    /* renamed from: p */
    final Strength f4357p;

    /* renamed from: s */
    final Strength f4358s;

    /* renamed from: z */
    final long f4359z;

    abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        AbstractCacheSet() {
        }

        public void clear() {
            LocalCache.this.clear();
        }

        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        public int size() {
            return LocalCache.this.size();
        }

        public Object[] toArray() {
            return LocalCache.m5576C(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.m5576C(this).toArray(eArr);
        }
    }

    static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        /* renamed from: b */
        public ValueReference<K, V> mo22390b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public int mo22391d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public ReferenceEntry<K, V> mo22392e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> mo22393f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public ReferenceEntry<K, V> mo22394g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo22396i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public ReferenceEntry<K, V> mo22398k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public void mo22399l(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: m */
        public long mo22400m() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo22401n(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public long mo22402q() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: r */
        public void mo22403r(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: a */
        final ReferenceEntry<K, V> f4361a = new AbstractReferenceEntry<K, V>(this) {
            @Weak

            /* renamed from: a */
            ReferenceEntry<K, V> f4362a = this;
            @Weak

            /* renamed from: c */
            ReferenceEntry<K, V> f4363c = this;

            /* renamed from: f */
            public ReferenceEntry<K, V> mo22393f() {
                return this.f4363c;
            }

            /* renamed from: i */
            public ReferenceEntry<K, V> mo22396i() {
                return this.f4362a;
            }

            /* renamed from: j */
            public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
                this.f4363c = referenceEntry;
            }

            /* renamed from: n */
            public void mo22401n(long j) {
            }

            /* renamed from: q */
            public long mo22402q() {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }

            /* renamed from: t */
            public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
                this.f4362a = referenceEntry;
            }
        };

        AccessQueue() {
        }

        /* renamed from: c */
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.m5579b(referenceEntry.mo22393f(), referenceEntry.mo22396i());
            LocalCache.m5579b(this.f4361a.mo22393f(), referenceEntry);
            LocalCache.m5579b(referenceEntry, this.f4361a);
            return true;
        }

        public void clear() {
            ReferenceEntry<K, V> i = this.f4361a.mo22396i();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f4361a;
                if (i != referenceEntry) {
                    ReferenceEntry<K, V> i2 = i.mo22396i();
                    LocalCache.m5583r(i);
                    i = i2;
                } else {
                    referenceEntry.mo22404t(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f4361a;
                    referenceEntry2.mo22397j(referenceEntry2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).mo22396i() != NullEntry.INSTANCE;
        }

        /* renamed from: d */
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> i = this.f4361a.mo22396i();
            if (i == this.f4361a) {
                return null;
            }
            return i;
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> i = this.f4361a.mo22396i();
            if (i == this.f4361a) {
                return null;
            }
            remove(i);
            return i;
        }

        public boolean isEmpty() {
            return this.f4361a.mo22396i() == this.f4361a;
        }

        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
                /* access modifiers changed from: protected */
                /* renamed from: b */
                public ReferenceEntry<K, V> mo22419a(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> i = referenceEntry.mo22396i();
                    if (i == AccessQueue.this.f4361a) {
                        return null;
                    }
                    return i;
                }
            };
        }

        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry f = referenceEntry.mo22393f();
            ReferenceEntry i = referenceEntry.mo22396i();
            LocalCache.m5579b(f, i);
            LocalCache.m5583r(referenceEntry);
            return i != NullEntry.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> i2 = this.f4361a.mo22396i(); i2 != this.f4361a; i2 = i2.mo22396i()) {
                i++;
            }
            return i;
        }
    }

    enum EntryFactory {
        STRONG {
            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> e = super.mo22422e(segment, referenceEntry, referenceEntry2);
                mo22421d(referenceEntry, e);
                return e;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k, i, referenceEntry);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> e = super.mo22422e(segment, referenceEntry, referenceEntry2);
                mo22423f(referenceEntry, e);
                return e;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> e = super.mo22422e(segment, referenceEntry, referenceEntry2);
                mo22421d(referenceEntry, e);
                mo22423f(referenceEntry, e);
                return e;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k, i, referenceEntry);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> e = super.mo22422e(segment, referenceEntry, referenceEntry2);
                mo22421d(referenceEntry, e);
                return e;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> e = super.mo22422e(segment, referenceEntry, referenceEntry2);
                mo22423f(referenceEntry, e);
                return e;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> e = super.mo22422e(segment, referenceEntry, referenceEntry2);
                mo22421d(referenceEntry, e);
                mo22423f(referenceEntry, e);
                return e;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        };
        

        /* renamed from: z */
        static final EntryFactory[] f4374z = null;

        static {
            C17871 r0;
            C17882 r1;
            C17893 r3;
            C17904 r5;
            C17915 r7;
            C17926 r9;
            C17937 r11;
            C17948 r13;
            f4374z = new EntryFactory[]{r0, r1, r3, r5, r7, r9, r11, r13};
        }

        /* renamed from: g */
        static EntryFactory m5646g(Strength strength, boolean z, boolean z2) {
            char c = 0;
            boolean z3 = (strength == Strength.WEAK ? (char) 4 : 0) | z;
            if (z2) {
                c = 2;
            }
            return f4374z[z3 | c];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <K, V> void mo22421d(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.mo22401n(referenceEntry.mo22402q());
            LocalCache.m5579b(referenceEntry.mo22393f(), referenceEntry2);
            LocalCache.m5579b(referenceEntry2, referenceEntry.mo22396i());
            LocalCache.m5583r(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <K, V> ReferenceEntry<K, V> mo22422e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return mo22424i(segment, referenceEntry.getKey(), referenceEntry.mo22391d(), referenceEntry2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public <K, V> void mo22423f(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.mo22403r(referenceEntry.mo22400m());
            LocalCache.m5580c(referenceEntry.mo22398k(), referenceEntry2);
            LocalCache.m5580c(referenceEntry2, referenceEntry.mo22394g());
            LocalCache.m5584s(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract <K, V> ReferenceEntry<K, V> mo22424i(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry);
    }

    final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        EntryIterator(LocalCache localCache) {
            super();
        }

        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return mo22432c();
        }
    }

    final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        EntrySet() {
            super();
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
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0026
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.f4356o
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.mo22143d(r4, r0)
                if (r4 == 0) goto L_0x0026
                r1 = 1
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.EntrySet.contains(java.lang.Object):boolean");
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(LocalCache.this);
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
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.EntrySet.remove(java.lang.Object):boolean");
        }
    }

    abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: a */
        int f4376a;

        /* renamed from: c */
        int f4377c = -1;

        /* renamed from: d */
        Segment<K, V> f4378d;

        /* renamed from: f */
        AtomicReferenceArray<ReferenceEntry<K, V>> f4379f;

        /* renamed from: g */
        ReferenceEntry<K, V> f4380g;

        /* renamed from: o */
        LocalCache<K, V>.WriteThroughEntry f4381o;

        /* renamed from: p */
        LocalCache<K, V>.WriteThroughEntry f4382p;

        HashIterator() {
            this.f4376a = LocalCache.this.f4353d.length - 1;
            mo22430a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo22430a() {
            this.f4381o = null;
            if (!mo22433d() && !mo22434e()) {
                while (true) {
                    int i = this.f4376a;
                    if (i >= 0) {
                        Segment<K, V>[] segmentArr = LocalCache.this.f4353d;
                        this.f4376a = i - 1;
                        Segment<K, V> segment = segmentArr[i];
                        this.f4378d = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f4378d.table;
                            this.f4379f = atomicReferenceArray;
                            this.f4377c = atomicReferenceArray.length() - 1;
                            if (mo22434e()) {
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
        public boolean mo22431b(ReferenceEntry<K, V> referenceEntry) {
            boolean z;
            try {
                long a = LocalCache.this.f4344G.mo22274a();
                K key = referenceEntry.getKey();
                V k = LocalCache.this.mo22349k(referenceEntry, a);
                if (k != null) {
                    this.f4381o = new WriteThroughEntry(key, k);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f4378d.mo22455G();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public LocalCache<K, V>.WriteThroughEntry mo22432c() {
            LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.f4381o;
            if (writeThroughEntry != null) {
                this.f4382p = writeThroughEntry;
                mo22430a();
                return this.f4382p;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22433d() {
            ReferenceEntry<K, V> referenceEntry = this.f4380g;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.f4380g = referenceEntry.mo22392e();
                ReferenceEntry<K, V> referenceEntry2 = this.f4380g;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (mo22431b(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.f4380g;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo22434e() {
            while (true) {
                int i = this.f4377c;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f4379f;
                this.f4377c = i - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.f4380g = referenceEntry;
                if (referenceEntry != null && (mo22431b(referenceEntry) || mo22433d())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.f4381o != null;
        }

        public void remove() {
            Preconditions.m5398y(this.f4382p != null);
            LocalCache.this.remove(this.f4382p.getKey());
            this.f4382p = null;
        }
    }

    final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        KeyIterator(LocalCache localCache) {
            super();
        }

        public K next() {
            return mo22432c().getKey();
        }
    }

    final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        KeySet() {
            super();
        }

        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new KeyIterator(LocalCache.this);
        }

        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        /* renamed from: c */
        transient LoadingCache<K, V> f4385c;

        LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f4385c = mo22448T().mo22289b(this.loader);
        }

        private Object readResolve() {
            return this.f4385c;
        }

        public final V apply(K k) {
            return this.f4385c.apply(k);
        }
    }

    static class LoadingValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: a */
        volatile ValueReference<K, V> f4386a;

        /* renamed from: c */
        final SettableFuture<V> f4387c;

        /* renamed from: d */
        final Stopwatch f4388d;

        public LoadingValueReference() {
            this(LocalCache.m5577D());
        }

        /* renamed from: i */
        private ListenableFuture<V> m5671i(Throwable th) {
            return Futures.m74209c(th);
        }

        /* renamed from: a */
        public long mo22441a() {
            return this.f4388d.mo22252e(TimeUnit.NANOSECONDS);
        }

        /* renamed from: b */
        public boolean mo22372b() {
            return this.f4386a.mo22372b();
        }

        /* renamed from: c */
        public ReferenceEntry<K, V> mo22373c() {
            return null;
        }

        /* renamed from: d */
        public void mo22374d(V v) {
            if (v != null) {
                mo22444l(v);
            } else {
                this.f4386a = LocalCache.m5577D();
            }
        }

        /* renamed from: e */
        public int mo22375e() {
            return this.f4386a.mo22375e();
        }

        /* renamed from: f */
        public boolean mo22376f() {
            return true;
        }

        /* renamed from: g */
        public ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public V get() {
            return this.f4386a.get();
        }

        /* renamed from: h */
        public V mo22379h() throws ExecutionException {
            return Uninterruptibles.m74365a(this.f4387c);
        }

        /* renamed from: j */
        public ValueReference<K, V> mo22442j() {
            return this.f4386a;
        }

        /* renamed from: k */
        public ListenableFuture<V> mo22443k(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f4388d.mo22255i();
                V v = this.f4386a.get();
                if (v == null) {
                    V a = cacheLoader.mo22319a(k);
                    return mo22444l(a) ? this.f4387c : Futures.m74210d(a);
                }
                ListenableFuture<V> b = cacheLoader.mo22320b(k, v);
                if (b == null) {
                    return Futures.m74210d(null);
                }
                return Futures.m74212f(b, new Function<V, V>() {
                    public V apply(V v) {
                        LoadingValueReference.this.mo22444l(v);
                        return v;
                    }
                }, MoreExecutors.m74259a());
            } catch (Throwable th) {
                ListenableFuture<V> i = mo22445m(th) ? this.f4387c : m5671i(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return i;
            }
        }

        /* renamed from: l */
        public boolean mo22444l(V v) {
            return this.f4387c.mo61562C(v);
        }

        /* renamed from: m */
        public boolean mo22445m(Throwable th) {
            return this.f4387c.mo61563D(th);
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
            this.f4387c = SettableFuture.m74324G();
            this.f4388d = Stopwatch.m5464d();
            this.f4386a = valueReference;
        }
    }

    static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super();
        }

        /* renamed from: a */
        public V mo22446a(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        public final V apply(K k) {
            return mo22446a(k);
        }

        public V get(K k) throws ExecutionException {
            return this.localCache.mo22351l(k);
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$1 */
        class C17961 extends CacheLoader<Object, Object> {

            /* renamed from: a */
            final /* synthetic */ Callable f4390a;

            /* renamed from: a */
            public Object mo22319a(Object obj) throws Exception {
                return this.f4390a.call();
            }
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, (CacheLoader) null));
        }

        private LocalManualCache(LocalCache<K, V> localCache2) {
            this.localCache = localCache2;
        }
    }

    static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        transient Cache<K, V> f4391a;
        final int concurrencyLevel;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final RemovalListener<? super K, ? super V> removalListener;
        final Ticker ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final Weigher<K, V> weigher;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ManualSerializationProxy(com.google.common.cache.LocalCache<K, V> r17) {
            /*
                r16 = this;
                r0 = r17
                com.google.common.cache.LocalCache$Strength r1 = r0.f4357p
                com.google.common.cache.LocalCache$Strength r2 = r0.f4358s
                com.google.common.base.Equivalence<java.lang.Object> r3 = r0.f4355g
                com.google.common.base.Equivalence<java.lang.Object> r4 = r0.f4356o
                long r5 = r0.f4340C
                long r7 = r0.f4339B
                long r9 = r0.f4359z
                com.google.common.cache.Weigher<K, V> r11 = r0.f4338A
                int r12 = r0.f4354f
                com.google.common.cache.RemovalListener<K, V> r13 = r0.f4343F
                com.google.common.base.Ticker r14 = r0.f4344G
                com.google.common.cache.CacheLoader<? super K, V> r15 = r0.f4347J
                r0 = r16
                r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.ManualSerializationProxy.<init>(com.google.common.cache.LocalCache):void");
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f4391a = mo22448T().mo22288a();
        }

        private Object readResolve() {
            return this.f4391a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Cache<K, V> mo22325Q() {
            return this.f4391a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public CacheBuilder<K, V> mo22448T() {
            CacheBuilder<K1, V1> z = CacheBuilder.m5516y().mo22282A(this.keyStrength).mo22283B(this.valueStrength).mo22308v(this.keyEquivalence).mo22285D(this.valueEquivalence).mo22290e(this.concurrencyLevel).mo22311z(this.removalListener);
            z.f4282a = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                z.mo22292g(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                z.mo22291f(j2, TimeUnit.NANOSECONDS);
            }
            Weigher<K, V> weigher2 = this.weigher;
            if (weigher2 != CacheBuilder.OneWeigher.INSTANCE) {
                z.mo22287F(weigher2);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    z.mo22310x(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    z.mo22309w(j4);
                }
            }
            Ticker ticker2 = this.ticker;
            if (ticker2 != null) {
                z.mo22284C(ticker2);
            }
            return z;
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, Weigher<K, V> weigher2, int i, RemovalListener<? super K, ? super V> removalListener2, Ticker ticker2, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = weigher2;
            this.concurrencyLevel = i;
            this.removalListener = removalListener2;
            this.ticker = (ticker2 == Ticker.m5495b() || ticker2 == CacheBuilder.f4280t) ? null : ticker2;
            this.loader = cacheLoader;
        }
    }

    private enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        /* renamed from: b */
        public ValueReference<Object, Object> mo22390b() {
            return null;
        }

        /* renamed from: d */
        public int mo22391d() {
            return 0;
        }

        /* renamed from: e */
        public ReferenceEntry<Object, Object> mo22392e() {
            return null;
        }

        /* renamed from: f */
        public ReferenceEntry<Object, Object> mo22393f() {
            return this;
        }

        /* renamed from: g */
        public ReferenceEntry<Object, Object> mo22394g() {
            return this;
        }

        public Object getKey() {
            return null;
        }

        /* renamed from: i */
        public ReferenceEntry<Object, Object> mo22396i() {
            return this;
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<Object, Object> referenceEntry) {
        }

        /* renamed from: k */
        public ReferenceEntry<Object, Object> mo22398k() {
            return this;
        }

        /* renamed from: l */
        public void mo22399l(ValueReference<Object, Object> valueReference) {
        }

        /* renamed from: m */
        public long mo22400m() {
            return 0;
        }

        /* renamed from: n */
        public void mo22401n(long j) {
        }

        /* renamed from: q */
        public long mo22402q() {
            return 0;
        }

        /* renamed from: r */
        public void mo22403r(long j) {
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<Object, Object> referenceEntry) {
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<Object, Object> referenceEntry) {
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<Object, Object> referenceEntry) {
        }
    }

    static class Segment<K, V> extends ReentrantLock {
        @GuardedBy
        final Queue<ReferenceEntry<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        @Weak
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<ReferenceEntry<K, V>> recencyQueue;
        final AbstractCache.StatsCounter statsCounter;
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        int threshold;
        @GuardedBy
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy
        final Queue<ReferenceEntry<K, V>> writeQueue;

        Segment(LocalCache<K, V> localCache, int i, long j, AbstractCache.StatsCounter statsCounter2) {
            Queue<ReferenceEntry<K, V>> queue;
            Queue<ReferenceEntry<K, V>> queue2;
            Queue<ReferenceEntry<K, V>> queue3;
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (AbstractCache.StatsCounter) Preconditions.m5392s(statsCounter2);
            mo22505z(mo22454F(i));
            ReferenceQueue<V> referenceQueue = null;
            this.keyReferenceQueue = localCache.mo22332G() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.mo22333H() ? new ReferenceQueue<>() : referenceQueue;
            if (localCache.mo22331F()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = LocalCache.m5581f();
            }
            this.recencyQueue = queue;
            if (localCache.mo22335K()) {
                queue2 = new WriteQueue<>();
            } else {
                queue2 = LocalCache.m5581f();
            }
            this.writeQueue = queue2;
            if (localCache.mo22331F()) {
                queue3 = new AccessQueue<>();
            } else {
                queue3 = LocalCache.m5581f();
            }
            this.accessQueue = queue3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public LoadingValueReference<K, V> mo22449A(K k, int i, boolean z) {
            lock();
            try {
                long a = this.map.f4344G.mo22274a();
                mo22457I(a);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (referenceEntry2 != null) {
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.mo22391d() != i || key == null || !this.map.f4355g.mo22143d(k, key)) {
                        referenceEntry2 = referenceEntry2.mo22392e();
                    } else {
                        ValueReference b = referenceEntry2.mo22390b();
                        if (!b.mo22376f()) {
                            if (!z || a - referenceEntry2.mo22400m() >= this.map.f4341D) {
                                this.modCount++;
                                LoadingValueReference<K, V> loadingValueReference = new LoadingValueReference<>(b);
                                referenceEntry2.mo22399l(loadingValueReference);
                                unlock();
                                mo22456H();
                                return loadingValueReference;
                            }
                        }
                        return null;
                    }
                }
                this.modCount++;
                LoadingValueReference<K, V> loadingValueReference2 = new LoadingValueReference<>();
                ReferenceEntry E = mo22453E(k, i, referenceEntry);
                E.mo22399l(loadingValueReference2);
                atomicReferenceArray.set(length, E);
                unlock();
                mo22456H();
                return loadingValueReference2;
            } finally {
                unlock();
                mo22456H();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public ListenableFuture<V> mo22450B(K k, int i, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
            ListenableFuture<V> k2 = loadingValueReference.mo22443k(k, cacheLoader);
            final K k3 = k;
            final int i2 = i;
            final LoadingValueReference<K, V> loadingValueReference2 = loadingValueReference;
            final ListenableFuture<V> listenableFuture = k2;
            k2.addListener(new Runnable() {
                public void run() {
                    try {
                        Segment.this.mo22499t(k3, i2, loadingValueReference2, listenableFuture);
                    } catch (Throwable th) {
                        LocalCache.f4335N.log(Level.WARNING, "Exception thrown during refresh", th);
                        loadingValueReference2.mo22445m(th);
                    }
                }
            }, MoreExecutors.m74259a());
            return k2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public V mo22451C(K k, int i, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return mo22499t(k, i, loadingValueReference, loadingValueReference.mo22443k(k, cacheLoader));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public V mo22452D(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            LoadingValueReference loadingValueReference;
            ValueReference valueReference;
            boolean z;
            V C;
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.map.f4344G.mo22274a();
                mo22457I(a);
                int i3 = this.count - 1;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntry2 == null) {
                        valueReference = null;
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.mo22391d() != i2 || key == null || !this.map.f4355g.mo22143d(k2, key)) {
                        referenceEntry2 = referenceEntry2.mo22392e();
                    } else {
                        ValueReference b = referenceEntry2.mo22390b();
                        if (b.mo22376f()) {
                            z = false;
                            valueReference = b;
                        } else {
                            V v = b.get();
                            if (v == null) {
                                mo22493l(key, i, v, b.mo22375e(), RemovalCause.COLLECTED);
                            } else if (this.map.mo22353n(referenceEntry2, a)) {
                                mo22493l(key, i, v, b.mo22375e(), RemovalCause.EXPIRED);
                            } else {
                                mo22461N(referenceEntry2, a);
                                this.statsCounter.mo22276a(1);
                                unlock();
                                mo22456H();
                                return v;
                            }
                            this.writeQueue.remove(referenceEntry2);
                            this.accessQueue.remove(referenceEntry2);
                            this.count = i3;
                            valueReference = b;
                        }
                    }
                }
                z = true;
                if (z) {
                    loadingValueReference = new LoadingValueReference();
                    if (referenceEntry2 == null) {
                        referenceEntry2 = mo22453E(k2, i2, referenceEntry);
                        referenceEntry2.mo22399l(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntry2);
                    } else {
                        referenceEntry2.mo22399l(loadingValueReference);
                    }
                }
                if (!z) {
                    return mo22490i0(referenceEntry2, k2, valueReference);
                }
                try {
                    synchronized (referenceEntry2) {
                        C = mo22451C(k2, i2, loadingValueReference, cacheLoader);
                    }
                    this.statsCounter.mo22277b(1);
                    return C;
                } catch (Throwable th) {
                    this.statsCounter.mo22277b(1);
                    throw th;
                }
            } finally {
                unlock();
                mo22456H();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: E */
        public ReferenceEntry<K, V> mo22453E(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            return this.map.f4345H.mo22424i(this, Preconditions.m5392s(k), i, referenceEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public AtomicReferenceArray<ReferenceEntry<K, V>> mo22454F(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo22455G() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                mo22473a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo22456H() {
            mo22478c0();
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: I */
        public void mo22457I(long j) {
            mo22476b0(j);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            r1 = r12.mo22390b();
            r10 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            if (r10 != null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
            r7.modCount++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
            if (r1.mo22372b() == false) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
            mo22493l(r15, r16, r10, r1.mo22375e(), com.google.common.cache.RemovalCause.f4451d);
            mo22482e0(r12, r15, r17, r8);
            r0 = r7.count;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
            mo22482e0(r12, r15, r17, r8);
            r0 = r7.count + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
            r7.count = r0;
            mo22494m(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
            if (r18 == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            mo22461N(r12, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
            unlock();
            mo22456H();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r7.modCount++;
            mo22493l(r15, r16, r10, r1.mo22375e(), com.google.common.cache.RemovalCause.f4450c);
            mo22482e0(r12, r15, r17, r8);
            mo22494m(r12);
         */
        /* renamed from: J */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo22458J(K r15, int r16, V r17, boolean r18) {
            /*
                r14 = this;
                r7 = r14
                r0 = r15
                r3 = r16
                r14.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r7.map     // Catch:{ all -> 0x00e3 }
                com.google.common.base.Ticker r1 = r1.f4344G     // Catch:{ all -> 0x00e3 }
                long r8 = r1.mo22274a()     // Catch:{ all -> 0x00e3 }
                r14.mo22457I(r8)     // Catch:{ all -> 0x00e3 }
                int r1 = r7.count     // Catch:{ all -> 0x00e3 }
                int r1 = r1 + 1
                int r2 = r7.threshold     // Catch:{ all -> 0x00e3 }
                if (r1 <= r2) goto L_0x001d
                r14.mo22495n()     // Catch:{ all -> 0x00e3 }
            L_0x001d:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r7.table     // Catch:{ all -> 0x00e3 }
                int r1 = r10.length()     // Catch:{ all -> 0x00e3 }
                int r1 = r1 + -1
                r11 = r3 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch:{ all -> 0x00e3 }
                r12 = r1
            L_0x002e:
                r13 = 0
                if (r12 == 0) goto L_0x00c3
                java.lang.Object r2 = r12.getKey()     // Catch:{ all -> 0x00e3 }
                int r4 = r12.mo22391d()     // Catch:{ all -> 0x00e3 }
                if (r4 != r3) goto L_0x00bd
                if (r2 == 0) goto L_0x00bd
                com.google.common.cache.LocalCache<K, V> r4 = r7.map     // Catch:{ all -> 0x00e3 }
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.f4355g     // Catch:{ all -> 0x00e3 }
                boolean r2 = r4.mo22143d(r15, r2)     // Catch:{ all -> 0x00e3 }
                if (r2 == 0) goto L_0x00bd
                com.google.common.cache.LocalCache$ValueReference r1 = r12.mo22390b()     // Catch:{ all -> 0x00e3 }
                java.lang.Object r10 = r1.get()     // Catch:{ all -> 0x00e3 }
                if (r10 != 0) goto L_0x0090
                int r2 = r7.modCount     // Catch:{ all -> 0x00e3 }
                int r2 = r2 + 1
                r7.modCount = r2     // Catch:{ all -> 0x00e3 }
                boolean r2 = r1.mo22372b()     // Catch:{ all -> 0x00e3 }
                if (r2 == 0) goto L_0x0077
                int r5 = r1.mo22375e()     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r10
                r1.mo22493l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                int r0 = r7.count     // Catch:{ all -> 0x00e3 }
                goto L_0x0084
            L_0x0077:
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                int r0 = r7.count     // Catch:{ all -> 0x00e3 }
                int r0 = r0 + 1
            L_0x0084:
                r7.count = r0     // Catch:{ all -> 0x00e3 }
                r14.mo22494m(r12)     // Catch:{ all -> 0x00e3 }
            L_0x0089:
                r14.unlock()
                r14.mo22456H()
                return r13
            L_0x0090:
                if (r18 == 0) goto L_0x009c
                r14.mo22461N(r12, r8)     // Catch:{ all -> 0x00e3 }
            L_0x0095:
                r14.unlock()
                r14.mo22456H()
                return r10
            L_0x009c:
                int r2 = r7.modCount     // Catch:{ all -> 0x00e3 }
                int r2 = r2 + 1
                r7.modCount = r2     // Catch:{ all -> 0x00e3 }
                int r5 = r1.mo22375e()     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r10
                r1.mo22493l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                r14.mo22494m(r12)     // Catch:{ all -> 0x00e3 }
                goto L_0x0095
            L_0x00bd:
                com.google.common.cache.ReferenceEntry r12 = r12.mo22392e()     // Catch:{ all -> 0x00e3 }
                goto L_0x002e
            L_0x00c3:
                int r2 = r7.modCount     // Catch:{ all -> 0x00e3 }
                int r2 = r2 + 1
                r7.modCount = r2     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.ReferenceEntry r12 = r14.mo22453E(r15, r3, r1)     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                r10.set(r11, r12)     // Catch:{ all -> 0x00e3 }
                int r0 = r7.count     // Catch:{ all -> 0x00e3 }
                int r0 = r0 + 1
                r7.count = r0     // Catch:{ all -> 0x00e3 }
                r14.mo22494m(r12)     // Catch:{ all -> 0x00e3 }
                goto L_0x0089
            L_0x00e3:
                r0 = move-exception
                r14.unlock()
                r14.mo22456H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.mo22458J(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo22459L(ReferenceEntry<K, V> referenceEntry, int i) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.mo22392e()) {
                    if (referenceEntry3 == referenceEntry) {
                        this.modCount++;
                        atomicReferenceArray.set(length, mo22471Y(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.mo22390b().get(), referenceEntry3.mo22390b(), RemovalCause.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                mo22456H();
                return false;
            } finally {
                unlock();
                mo22456H();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public boolean mo22460M(K k, int i, ValueReference<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (referenceEntry2 != null) {
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.mo22391d() != i || key == null || !this.map.f4355g.mo22143d(k, key)) {
                        referenceEntry2 = referenceEntry2.mo22392e();
                    } else if (referenceEntry2.mo22390b() == valueReference) {
                        this.modCount++;
                        atomicReferenceArray.set(length, mo22471Y(referenceEntry, referenceEntry2, key, i, valueReference.get(), valueReference, RemovalCause.COLLECTED));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            mo22456H();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo22456H();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    mo22456H();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: N */
        public void mo22461N(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.map.mo22368w()) {
                referenceEntry.mo22401n(j);
            }
            this.accessQueue.add(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo22462O(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.map.mo22368w()) {
                referenceEntry.mo22401n(j);
            }
            this.recencyQueue.add(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: P */
        public void mo22463P(ReferenceEntry<K, V> referenceEntry, int i, long j) {
            mo22489i();
            this.totalWeight += (long) i;
            if (this.map.mo22368w()) {
                referenceEntry.mo22401n(j);
            }
            if (this.map.mo22370y()) {
                referenceEntry.mo22403r(j);
            }
            this.accessQueue.add(referenceEntry);
            this.writeQueue.add(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public V mo22464Q(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            LoadingValueReference A = mo22449A(k, i, z);
            if (A == null) {
                return null;
            }
            ListenableFuture<V> B = mo22450B(k, i, A, cacheLoader);
            if (B.isDone()) {
                try {
                    return Uninterruptibles.m74365a(B);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public V mo22465R(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                mo22457I(this.map.f4344G.mo22274a());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.mo22391d() != i || key == null || !this.map.f4355g.mo22143d(obj, key)) {
                        referenceEntry2 = referenceEntry2.mo22392e();
                    } else {
                        ValueReference b = referenceEntry2.mo22390b();
                        V v = b.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (b.mo22372b()) {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        atomicReferenceArray.set(length, mo22471Y(referenceEntry, referenceEntry2, key, i, v, b, removalCause2));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                mo22456H();
                return null;
            } finally {
                unlock();
                mo22456H();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public boolean mo22466T(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                mo22457I(this.map.f4344G.mo22274a());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.mo22391d() != i || key == null || !this.map.f4355g.mo22143d(obj, key)) {
                        referenceEntry2 = referenceEntry2.mo22392e();
                    } else {
                        ValueReference b = referenceEntry2.mo22390b();
                        Object obj3 = b.get();
                        if (this.map.f4356o.mo22143d(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (obj3 == null && b.mo22372b()) {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, mo22471Y(referenceEntry, referenceEntry2, key, i, obj3, b, removalCause));
                        this.count--;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                mo22456H();
                return false;
            } finally {
                unlock();
                mo22456H();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: U */
        public void mo22467U(ReferenceEntry<K, V> referenceEntry) {
            mo22493l(referenceEntry.getKey(), referenceEntry.mo22391d(), referenceEntry.mo22390b().get(), referenceEntry.mo22390b().mo22375e(), RemovalCause.COLLECTED);
            this.writeQueue.remove(referenceEntry);
            this.accessQueue.remove(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        @GuardedBy
        /* renamed from: V */
        public boolean mo22468V(ReferenceEntry<K, V> referenceEntry, int i, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.mo22392e()) {
                if (referenceEntry3 == referenceEntry) {
                    this.modCount++;
                    atomicReferenceArray.set(length, mo22471Y(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.mo22390b().get(), referenceEntry3.mo22390b(), removalCause));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: W */
        public ReferenceEntry<K, V> mo22469W(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i = this.count;
            ReferenceEntry<K, V> e = referenceEntry2.mo22392e();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> g = mo22485g(referenceEntry, e);
                if (g != null) {
                    e = g;
                } else {
                    mo22467U(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.mo22392e();
            }
            this.count = i;
            return e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public boolean mo22470X(K k, int i, LoadingValueReference<K, V> loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.mo22391d() != i || key == null || !this.map.f4355g.mo22143d(k, key)) {
                        referenceEntry2 = referenceEntry2.mo22392e();
                    } else if (referenceEntry2.mo22390b() == loadingValueReference) {
                        if (loadingValueReference.mo22372b()) {
                            referenceEntry2.mo22399l(loadingValueReference.mo22442j());
                        } else {
                            atomicReferenceArray.set(length, mo22469W(referenceEntry, referenceEntry2));
                        }
                        return true;
                    }
                }
                unlock();
                mo22456H();
                return false;
            } finally {
                unlock();
                mo22456H();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: Y */
        public ReferenceEntry<K, V> mo22471Y(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            mo22493l(k, i, v, valueReference.mo22375e(), removalCause);
            this.writeQueue.remove(referenceEntry2);
            this.accessQueue.remove(referenceEntry2);
            if (!valueReference.mo22376f()) {
                return mo22469W(referenceEntry, referenceEntry2);
            }
            valueReference.mo22374d(null);
            return referenceEntry;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r15 = r12.mo22390b();
            r16 = r15.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r16 != null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r15.mo22372b() == false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9.modCount++;
            r10.set(r11, mo22471Y(r2, r12, r4, r19, r16, r15, com.google.common.cache.RemovalCause.f4451d));
            r9.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r9.modCount++;
            mo22493l(r18, r19, r16, r15.mo22375e(), com.google.common.cache.RemovalCause.f4450c);
            mo22482e0(r12, r18, r20, r7);
            mo22494m(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
            unlock();
            mo22456H();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
            return r16;
         */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo22472Z(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00a7 }
                com.google.common.base.Ticker r1 = r1.f4344G     // Catch:{ all -> 0x00a7 }
                long r7 = r1.mo22274a()     // Catch:{ all -> 0x00a7 }
                r9.mo22457I(r7)     // Catch:{ all -> 0x00a7 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.table     // Catch:{ all -> 0x00a7 }
                int r1 = r10.length()     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + -1
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch:{ all -> 0x00a7 }
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch:{ all -> 0x00a7 }
                r12 = r2
            L_0x0024:
                r13 = 0
                if (r12 == 0) goto L_0x006c
                java.lang.Object r4 = r12.getKey()     // Catch:{ all -> 0x00a7 }
                int r1 = r12.mo22391d()     // Catch:{ all -> 0x00a7 }
                if (r1 != r0) goto L_0x009f
                if (r4 == 0) goto L_0x009f
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00a7 }
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f4355g     // Catch:{ all -> 0x00a7 }
                r14 = r18
                boolean r1 = r1.mo22143d(r14, r4)     // Catch:{ all -> 0x00a7 }
                if (r1 == 0) goto L_0x00a1
                com.google.common.cache.LocalCache$ValueReference r15 = r12.mo22390b()     // Catch:{ all -> 0x00a7 }
                java.lang.Object r16 = r15.get()     // Catch:{ all -> 0x00a7 }
                if (r16 != 0) goto L_0x0073
                boolean r1 = r15.mo22372b()     // Catch:{ all -> 0x00a7 }
                if (r1 == 0) goto L_0x006c
                int r1 = r9.modCount     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + 1
                r9.modCount = r1     // Catch:{ all -> 0x00a7 }
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00a7 }
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.ReferenceEntry r0 = r1.mo22471Y(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a7 }
                int r1 = r9.count     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + -1
                r10.set(r11, r0)     // Catch:{ all -> 0x00a7 }
                r9.count = r1     // Catch:{ all -> 0x00a7 }
            L_0x006c:
                r17.unlock()
                r17.mo22456H()
                return r13
            L_0x0073:
                int r1 = r9.modCount     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + 1
                r9.modCount = r1     // Catch:{ all -> 0x00a7 }
                int r5 = r15.mo22375e()     // Catch:{ all -> 0x00a7 }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00a7 }
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.mo22493l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00a7 }
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00a7 }
                r9.mo22494m(r12)     // Catch:{ all -> 0x00a7 }
                r17.unlock()
                r17.mo22456H()
                return r16
            L_0x009f:
                r14 = r18
            L_0x00a1:
                com.google.common.cache.ReferenceEntry r12 = r12.mo22392e()     // Catch:{ all -> 0x00a7 }
                goto L_0x0024
            L_0x00a7:
                r0 = move-exception
                r17.unlock()
                r17.mo22456H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.mo22472Z(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22473a() {
            mo22476b0(this.map.f4344G.mo22274a());
            mo22478c0();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r16 = r13.mo22390b();
            r6 = r16.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r6 != null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r16.mo22372b() == false) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9.modCount++;
            r10.set(r12, mo22471Y(r2, r13, r4, r19, r6, r16, com.google.common.cache.RemovalCause.f4451d));
            r9.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
            if (r9.map.f4356o.mo22143d(r20, r6) == false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
            r9.modCount++;
            mo22493l(r18, r19, r6, r16.mo22375e(), com.google.common.cache.RemovalCause.f4450c);
            mo22482e0(r13, r18, r21, r7);
            mo22494m(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
            unlock();
            mo22456H();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            mo22461N(r13, r7);
         */
        /* renamed from: a0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo22474a0(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00b5 }
                com.google.common.base.Ticker r1 = r1.f4344G     // Catch:{ all -> 0x00b5 }
                long r7 = r1.mo22274a()     // Catch:{ all -> 0x00b5 }
                r9.mo22457I(r7)     // Catch:{ all -> 0x00b5 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.table     // Catch:{ all -> 0x00b5 }
                int r1 = r10.length()     // Catch:{ all -> 0x00b5 }
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch:{ all -> 0x00b5 }
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch:{ all -> 0x00b5 }
                r13 = r2
            L_0x0024:
                r14 = 0
                if (r13 == 0) goto L_0x0069
                java.lang.Object r4 = r13.getKey()     // Catch:{ all -> 0x00b5 }
                int r1 = r13.mo22391d()     // Catch:{ all -> 0x00b5 }
                if (r1 != r0) goto L_0x00ab
                if (r4 == 0) goto L_0x00ab
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00b5 }
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f4355g     // Catch:{ all -> 0x00b5 }
                r15 = r18
                boolean r1 = r1.mo22143d(r15, r4)     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x00ad
                com.google.common.cache.LocalCache$ValueReference r16 = r13.mo22390b()     // Catch:{ all -> 0x00b5 }
                java.lang.Object r6 = r16.get()     // Catch:{ all -> 0x00b5 }
                if (r6 != 0) goto L_0x0070
                boolean r1 = r16.mo22372b()     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x0069
                int r1 = r9.modCount     // Catch:{ all -> 0x00b5 }
                int r1 = r1 + r11
                r9.modCount = r1     // Catch:{ all -> 0x00b5 }
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00b5 }
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.ReferenceEntry r0 = r1.mo22471Y(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b5 }
                int r1 = r9.count     // Catch:{ all -> 0x00b5 }
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch:{ all -> 0x00b5 }
                r9.count = r1     // Catch:{ all -> 0x00b5 }
            L_0x0069:
                r17.unlock()
                r17.mo22456H()
                return r14
            L_0x0070:
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00b5 }
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f4356o     // Catch:{ all -> 0x00b5 }
                r3 = r20
                boolean r1 = r1.mo22143d(r3, r6)     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x00a7
                int r1 = r9.modCount     // Catch:{ all -> 0x00b5 }
                int r1 = r1 + r11
                r9.modCount = r1     // Catch:{ all -> 0x00b5 }
                int r5 = r16.mo22375e()     // Catch:{ all -> 0x00b5 }
                com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00b5 }
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.mo22493l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00b5 }
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00b5 }
                r9.mo22494m(r13)     // Catch:{ all -> 0x00b5 }
                r17.unlock()
                r17.mo22456H()
                return r11
            L_0x00a7:
                r9.mo22461N(r13, r7)     // Catch:{ all -> 0x00b5 }
                goto L_0x0069
            L_0x00ab:
                r15 = r18
            L_0x00ad:
                r3 = r20
                com.google.common.cache.ReferenceEntry r13 = r13.mo22392e()     // Catch:{ all -> 0x00b5 }
                goto L_0x0024
            L_0x00b5:
                r0 = move-exception
                r17.unlock()
                r17.mo22456H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.mo22474a0(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo22475b() {
            RemovalCause removalCause;
            if (this.count != 0) {
                lock();
                try {
                    mo22457I(this.map.f4344G.mo22274a());
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (ReferenceEntry referenceEntry = atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.mo22392e()) {
                            if (referenceEntry.mo22390b().mo22372b()) {
                                Object key = referenceEntry.getKey();
                                Object obj = referenceEntry.mo22390b().get();
                                if (key != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        mo22493l(key, referenceEntry.mo22391d(), obj, referenceEntry.mo22390b().mo22375e(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                mo22493l(key, referenceEntry.mo22391d(), obj, referenceEntry.mo22390b().mo22375e(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, (Object) null);
                    }
                    mo22479d();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    mo22456H();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public void mo22476b0(long j) {
            if (tryLock()) {
                try {
                    mo22491j();
                    mo22496p(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo22477c() {
            do {
            } while (this.keyReferenceQueue.poll() != null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public void mo22478c0() {
            if (!isHeldByCurrentThread()) {
                this.map.mo22364t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22479d() {
            if (this.map.mo22332G()) {
                mo22477c();
            }
            if (this.map.mo22333H()) {
                mo22481e();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
            r4 = mo22464Q(r5, r6, r10, true);
         */
        /* renamed from: d0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo22480d0(com.google.common.cache.ReferenceEntry<K, V> r4, K r5, int r6, V r7, long r8, com.google.common.cache.CacheLoader<? super K, V> r10) {
            /*
                r3 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r3.map
                boolean r0 = r0.mo22371z()
                if (r0 == 0) goto L_0x0027
                long r0 = r4.mo22400m()
                long r8 = r8 - r0
                com.google.common.cache.LocalCache<K, V> r0 = r3.map
                long r0 = r0.f4341D
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x0027
                com.google.common.cache.LocalCache$ValueReference r4 = r4.mo22390b()
                boolean r4 = r4.mo22376f()
                if (r4 != 0) goto L_0x0027
                r4 = 1
                java.lang.Object r4 = r3.mo22464Q(r5, r6, r10, r4)
                if (r4 == 0) goto L_0x0027
                return r4
            L_0x0027:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.mo22480d0(com.google.common.cache.ReferenceEntry, java.lang.Object, int, java.lang.Object, long, com.google.common.cache.CacheLoader):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo22481e() {
            do {
            } while (this.valueReferenceQueue.poll() != null);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: e0 */
        public void mo22482e0(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
            ValueReference<K, V> b = referenceEntry.mo22390b();
            int b2 = this.map.f4338A.mo22314b(k, v);
            Preconditions.m5399z(b2 >= 0, "Weights must be non-negative");
            referenceEntry.mo22399l(this.map.f4358s.mo22508e(this, referenceEntry, v, b2));
            mo22463P(referenceEntry, b2, j);
            b.mo22374d(v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo22483f(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    ReferenceEntry w = mo22502w(obj, i, this.map.f4344G.mo22274a());
                    if (w == null) {
                        return false;
                    }
                    if (w.mo22390b().get() != null) {
                        z = true;
                    }
                    mo22455G();
                    return z;
                }
                mo22455G();
                return false;
            } finally {
                mo22455G();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
            r1 = r14.mo22390b();
            r4 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
            if (r18 == r1) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            if (r4 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
            if (r1 == com.google.common.cache.LocalCache.f4336O) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
            mo22493l(r16, r17, r19, 0, com.google.common.cache.RemovalCause.f4450c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
            unlock();
            mo22456H();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r7.modCount++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
            if (r18.mo22372b() == false) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
            if (r4 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
            r1 = com.google.common.cache.RemovalCause.f4451d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
            r1 = com.google.common.cache.RemovalCause.f4450c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            mo22493l(r16, r17, r4, r18.mo22375e(), r1);
            r11 = r11 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            mo22482e0(r14, r16, r19, r8);
            r7.count = r11;
            mo22494m(r14);
         */
        /* renamed from: f0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo22484f0(K r16, int r17, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r18, V r19) {
            /*
                r15 = this;
                r7 = r15
                r0 = r16
                r3 = r17
                r15.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r7.map     // Catch:{ all -> 0x00cc }
                com.google.common.base.Ticker r1 = r1.f4344G     // Catch:{ all -> 0x00cc }
                long r8 = r1.mo22274a()     // Catch:{ all -> 0x00cc }
                r15.mo22457I(r8)     // Catch:{ all -> 0x00cc }
                int r1 = r7.count     // Catch:{ all -> 0x00cc }
                r10 = 1
                int r1 = r1 + r10
                int r2 = r7.threshold     // Catch:{ all -> 0x00cc }
                if (r1 <= r2) goto L_0x0021
                r15.mo22495n()     // Catch:{ all -> 0x00cc }
                int r1 = r7.count     // Catch:{ all -> 0x00cc }
                int r1 = r1 + r10
            L_0x0021:
                r11 = r1
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r12 = r7.table     // Catch:{ all -> 0x00cc }
                int r1 = r12.length()     // Catch:{ all -> 0x00cc }
                int r1 = r1 - r10
                r13 = r3 & r1
                java.lang.Object r1 = r12.get(r13)     // Catch:{ all -> 0x00cc }
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch:{ all -> 0x00cc }
                r14 = r1
            L_0x0032:
                if (r14 == 0) goto L_0x00b0
                java.lang.Object r2 = r14.getKey()     // Catch:{ all -> 0x00cc }
                int r4 = r14.mo22391d()     // Catch:{ all -> 0x00cc }
                if (r4 != r3) goto L_0x00a9
                if (r2 == 0) goto L_0x00a9
                com.google.common.cache.LocalCache<K, V> r4 = r7.map     // Catch:{ all -> 0x00cc }
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.f4355g     // Catch:{ all -> 0x00cc }
                boolean r2 = r4.mo22143d(r0, r2)     // Catch:{ all -> 0x00cc }
                if (r2 == 0) goto L_0x00a9
                com.google.common.cache.LocalCache$ValueReference r1 = r14.mo22390b()     // Catch:{ all -> 0x00cc }
                java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x00cc }
                r2 = r18
                if (r2 == r1) goto L_0x0072
                if (r4 != 0) goto L_0x005d
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r5 = com.google.common.cache.LocalCache.f4336O     // Catch:{ all -> 0x00cc }
                if (r1 == r5) goto L_0x005d
                goto L_0x0072
            L_0x005d:
                r5 = 0
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00cc }
                r1 = r15
                r2 = r16
                r3 = r17
                r4 = r19
                r1.mo22493l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00cc }
                r0 = 0
                r15.unlock()
                r15.mo22456H()
                return r0
            L_0x0072:
                int r1 = r7.modCount     // Catch:{ all -> 0x00cc }
                int r1 = r1 + r10
                r7.modCount = r1     // Catch:{ all -> 0x00cc }
                boolean r1 = r18.mo22372b()     // Catch:{ all -> 0x00cc }
                if (r1 == 0) goto L_0x0093
                if (r4 != 0) goto L_0x0082
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00cc }
                goto L_0x0084
            L_0x0082:
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00cc }
            L_0x0084:
                r6 = r1
                int r5 = r18.mo22375e()     // Catch:{ all -> 0x00cc }
                r1 = r15
                r2 = r16
                r3 = r17
                r1.mo22493l(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00cc }
                int r11 = r11 + -1
            L_0x0093:
                r1 = r15
                r2 = r14
                r3 = r16
                r4 = r19
                r5 = r8
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00cc }
                r7.count = r11     // Catch:{ all -> 0x00cc }
                r15.mo22494m(r14)     // Catch:{ all -> 0x00cc }
            L_0x00a2:
                r15.unlock()
                r15.mo22456H()
                return r10
            L_0x00a9:
                r2 = r18
                com.google.common.cache.ReferenceEntry r14 = r14.mo22392e()     // Catch:{ all -> 0x00cc }
                goto L_0x0032
            L_0x00b0:
                int r2 = r7.modCount     // Catch:{ all -> 0x00cc }
                int r2 = r2 + r10
                r7.modCount = r2     // Catch:{ all -> 0x00cc }
                com.google.common.cache.ReferenceEntry r14 = r15.mo22453E(r0, r3, r1)     // Catch:{ all -> 0x00cc }
                r1 = r15
                r2 = r14
                r3 = r16
                r4 = r19
                r5 = r8
                r1.mo22482e0(r2, r3, r4, r5)     // Catch:{ all -> 0x00cc }
                r12.set(r13, r14)     // Catch:{ all -> 0x00cc }
                r7.count = r11     // Catch:{ all -> 0x00cc }
                r15.mo22494m(r14)     // Catch:{ all -> 0x00cc }
                goto L_0x00a2
            L_0x00cc:
                r0 = move-exception
                r15.unlock()
                r15.mo22456H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.mo22484f0(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: g */
        public ReferenceEntry<K, V> mo22485g(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference<K, V> b = referenceEntry.mo22390b();
            V v = b.get();
            if (v == null && b.mo22372b()) {
                return null;
            }
            ReferenceEntry<K, V> e = this.map.f4345H.mo22422e(this, referenceEntry, referenceEntry2);
            e.mo22399l(b.mo22377g(this.valueReferenceQueue, v, e));
            return e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public void mo22486g0() {
            if (tryLock()) {
                try {
                    mo22491j();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: h */
        public void mo22487h() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.mo22365u((ReferenceEntry) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h0 */
        public void mo22488h0(long j) {
            if (tryLock()) {
                try {
                    mo22496p(j);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: i */
        public void mo22489i() {
            while (true) {
                ReferenceEntry poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i0 */
        public V mo22490i0(ReferenceEntry<K, V> referenceEntry, K k, ValueReference<K, V> valueReference) throws ExecutionException {
            if (valueReference.mo22376f()) {
                Preconditions.m5372C(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", k);
                try {
                    V h = valueReference.mo22379h();
                    if (h != null) {
                        mo22462O(referenceEntry, this.map.f4344G.mo22274a());
                        return h;
                    }
                    String valueOf = String.valueOf(k);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                    sb.append("CacheLoader returned null for key ");
                    sb.append(valueOf);
                    sb.append(".");
                    throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                } finally {
                    this.statsCounter.mo22277b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: j */
        public void mo22491j() {
            if (this.map.mo22332G()) {
                mo22487h();
            }
            if (this.map.mo22333H()) {
                mo22492k();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: k */
        public void mo22492k() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.mo22366v((ValueReference) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: l */
        public void mo22493l(K k, int i, V v, int i2, RemovalCause removalCause) {
            this.totalWeight -= (long) i2;
            if (removalCause.mo22547d()) {
                this.statsCounter.mo22278c();
            }
            if (this.map.f4342E != LocalCache.f4337P) {
                this.map.f4342E.offer(RemovalNotification.m5919a(k, v, removalCause));
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: m */
        public void mo22494m(ReferenceEntry<K, V> referenceEntry) {
            if (this.map.mo22342g()) {
                mo22489i();
                if (((long) referenceEntry.mo22390b().mo22375e()) <= this.maxSegmentWeight || mo22468V(referenceEntry, referenceEntry.mo22391d(), RemovalCause.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        ReferenceEntry y = mo22504y();
                        if (!mo22468V(y, y.mo22391d(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: n */
        public void mo22495n() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<ReferenceEntry<K, V>> F = mo22454F(length << 1);
                this.threshold = (F.length() * 3) / 4;
                int length2 = F.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    ReferenceEntry referenceEntry = atomicReferenceArray.get(i2);
                    if (referenceEntry != null) {
                        ReferenceEntry e = referenceEntry.mo22392e();
                        int d = referenceEntry.mo22391d() & length2;
                        if (e == null) {
                            F.set(d, referenceEntry);
                        } else {
                            ReferenceEntry referenceEntry2 = referenceEntry;
                            while (e != null) {
                                int d2 = e.mo22391d() & length2;
                                if (d2 != d) {
                                    referenceEntry2 = e;
                                    d = d2;
                                }
                                e = e.mo22392e();
                            }
                            F.set(d, referenceEntry2);
                            while (referenceEntry != referenceEntry2) {
                                int d3 = referenceEntry.mo22391d() & length2;
                                ReferenceEntry g = mo22485g(referenceEntry, F.get(d3));
                                if (g != null) {
                                    F.set(d3, g);
                                } else {
                                    mo22467U(referenceEntry);
                                    i--;
                                }
                                referenceEntry = referenceEntry.mo22392e();
                            }
                        }
                    }
                }
                this.table = F;
                this.count = i;
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: p */
        public void mo22496p(long j) {
            ReferenceEntry peek;
            ReferenceEntry peek2;
            mo22489i();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.mo22353n(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.mo22353n(peek2, j)) {
                            return;
                        }
                    } while (mo22468V(peek2, peek2.mo22391d(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (mo22468V(peek, peek.mo22391d(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public V mo22497q(Object obj, int i) {
            try {
                if (this.count != 0) {
                    long a = this.map.f4344G.mo22274a();
                    ReferenceEntry w = mo22502w(obj, i, a);
                    if (w == null) {
                        return null;
                    }
                    Object obj2 = w.mo22390b().get();
                    if (obj2 != null) {
                        mo22462O(w, a);
                        V d0 = mo22480d0(w, w.getKey(), i, obj2, a, this.map.f4347J);
                        mo22455G();
                        return d0;
                    }
                    mo22486g0();
                }
                mo22455G();
                return null;
            } finally {
                mo22455G();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public V mo22498r(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            ReferenceEntry u;
            Preconditions.m5392s(k);
            Preconditions.m5392s(cacheLoader);
            try {
                if (!(this.count == 0 || (u = mo22500u(k, i)) == null)) {
                    long a = this.map.f4344G.mo22274a();
                    Object x = mo22503x(u, a);
                    if (x != null) {
                        mo22462O(u, a);
                        this.statsCounter.mo22276a(1);
                        V d0 = mo22480d0(u, k, i, x, a, cacheLoader);
                        mo22455G();
                        return d0;
                    }
                    ValueReference b = u.mo22390b();
                    if (b.mo22376f()) {
                        V i0 = mo22490i0(u, k, b);
                        mo22455G();
                        return i0;
                    }
                }
                V D = mo22452D(k, i, cacheLoader);
                mo22455G();
                return D;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new ExecutionError((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                mo22455G();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V mo22499t(K r5, int r6, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r7, com.google.common.util.concurrent.ListenableFuture<V> r8) throws java.util.concurrent.ExecutionException {
            /*
                r4 = this;
                java.lang.Object r8 = com.google.common.util.concurrent.Uninterruptibles.m74365a(r8)     // Catch:{ all -> 0x003b }
                if (r8 == 0) goto L_0x0015
                com.google.common.cache.AbstractCache$StatsCounter r0 = r4.statsCounter     // Catch:{ all -> 0x0013 }
                long r1 = r7.mo22441a()     // Catch:{ all -> 0x0013 }
                r0.mo22280e(r1)     // Catch:{ all -> 0x0013 }
                r4.mo22484f0(r5, r6, r7, r8)     // Catch:{ all -> 0x0013 }
                return r8
            L_0x0013:
                r0 = move-exception
                goto L_0x003d
            L_0x0015:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x0013 }
                java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0013 }
                int r2 = r1.length()     // Catch:{ all -> 0x0013 }
                int r2 = r2 + 35
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0013 }
                r3.<init>(r2)     // Catch:{ all -> 0x0013 }
                java.lang.String r2 = "CacheLoader returned null for key "
                r3.append(r2)     // Catch:{ all -> 0x0013 }
                r3.append(r1)     // Catch:{ all -> 0x0013 }
                java.lang.String r1 = "."
                r3.append(r1)     // Catch:{ all -> 0x0013 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0013 }
                r0.<init>(r1)     // Catch:{ all -> 0x0013 }
                throw r0     // Catch:{ all -> 0x0013 }
            L_0x003b:
                r0 = move-exception
                r8 = 0
            L_0x003d:
                if (r8 != 0) goto L_0x004b
                com.google.common.cache.AbstractCache$StatsCounter r8 = r4.statsCounter
                long r1 = r7.mo22441a()
                r8.mo22279d(r1)
                r4.mo22470X(r5, r6, r7)
            L_0x004b:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.mo22499t(java.lang.Object, int, com.google.common.cache.LocalCache$LoadingValueReference, com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public ReferenceEntry<K, V> mo22500u(Object obj, int i) {
            for (ReferenceEntry<K, V> v = mo22501v(i); v != null; v = v.mo22392e()) {
                if (v.mo22391d() == i) {
                    K key = v.getKey();
                    if (key == null) {
                        mo22486g0();
                    } else if (this.map.f4355g.mo22143d(obj, key)) {
                        return v;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public ReferenceEntry<K, V> mo22501v(int i) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public ReferenceEntry<K, V> mo22502w(Object obj, int i, long j) {
            ReferenceEntry<K, V> u = mo22500u(obj, i);
            if (u == null) {
                return null;
            }
            if (!this.map.mo22353n(u, j)) {
                return u;
            }
            mo22488h0(j);
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public V mo22503x(ReferenceEntry<K, V> referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                mo22486g0();
                return null;
            }
            V v = referenceEntry.mo22390b().get();
            if (v == null) {
                mo22486g0();
                return null;
            } else if (!this.map.mo22353n(referenceEntry, j)) {
                return v;
            } else {
                mo22488h0(j);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy
        /* renamed from: y */
        public ReferenceEntry<K, V> mo22504y() {
            for (ReferenceEntry<K, V> referenceEntry : this.accessQueue) {
                if (referenceEntry.mo22390b().mo22375e() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo22505z(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.mo22340e()) {
                int i = this.threshold;
                if (((long) i) == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }
    }

    static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* renamed from: a */
        final ReferenceEntry<K, V> f4399a;

        SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f4399a = referenceEntry;
        }

        /* renamed from: b */
        public boolean mo22372b() {
            return true;
        }

        /* renamed from: c */
        public ReferenceEntry<K, V> mo22373c() {
            return this.f4399a;
        }

        /* renamed from: d */
        public void mo22374d(V v) {
        }

        /* renamed from: e */
        public int mo22375e() {
            return 1;
        }

        /* renamed from: f */
        public boolean mo22376f() {
            return false;
        }

        /* renamed from: g */
        public ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v, referenceEntry);
        }

        /* renamed from: h */
        public V mo22379h() {
            return get();
        }
    }

    enum Strength {
        STRONG {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Equivalence<Object> mo22507d() {
                return Equivalence.m5277c();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ValueReference<K, V> mo22508e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new StrongValueReference(v);
                }
                return new WeightedStrongValueReference(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Equivalence<Object> mo22507d() {
                return Equivalence.m5278f();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ValueReference<K, V> mo22508e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new SoftValueReference(segment.valueReferenceQueue, v, referenceEntry);
                }
                return new WeightedSoftValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Equivalence<Object> mo22507d() {
                return Equivalence.m5278f();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public <K, V> ValueReference<K, V> mo22508e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new WeakValueReference(segment.valueReferenceQueue, v, referenceEntry);
                }
                return new WeightedWeakValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Equivalence<Object> mo22507d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract <K, V> ValueReference<K, V> mo22508e(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i);
    }

    static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: g */
        volatile long f4404g = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: o */
        ReferenceEntry<K, V> f4405o = LocalCache.m5582q();
        @Weak

        /* renamed from: p */
        ReferenceEntry<K, V> f4406p = LocalCache.m5582q();

        StrongAccessEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> mo22393f() {
            return this.f4406p;
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo22396i() {
            return this.f4405o;
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
            this.f4406p = referenceEntry;
        }

        /* renamed from: n */
        public void mo22401n(long j) {
            this.f4404g = j;
        }

        /* renamed from: q */
        public long mo22402q() {
            return this.f4404g;
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
            this.f4405o = referenceEntry;
        }
    }

    static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        @Weak

        /* renamed from: A */
        ReferenceEntry<K, V> f4407A = LocalCache.m5582q();

        /* renamed from: g */
        volatile long f4408g = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: o */
        ReferenceEntry<K, V> f4409o = LocalCache.m5582q();
        @Weak

        /* renamed from: p */
        ReferenceEntry<K, V> f4410p = LocalCache.m5582q();

        /* renamed from: s */
        volatile long f4411s = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: z */
        ReferenceEntry<K, V> f4412z = LocalCache.m5582q();

        StrongAccessWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> mo22393f() {
            return this.f4410p;
        }

        /* renamed from: g */
        public ReferenceEntry<K, V> mo22394g() {
            return this.f4412z;
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo22396i() {
            return this.f4409o;
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
            this.f4410p = referenceEntry;
        }

        /* renamed from: k */
        public ReferenceEntry<K, V> mo22398k() {
            return this.f4407A;
        }

        /* renamed from: m */
        public long mo22400m() {
            return this.f4411s;
        }

        /* renamed from: n */
        public void mo22401n(long j) {
            this.f4408g = j;
        }

        /* renamed from: q */
        public long mo22402q() {
            return this.f4408g;
        }

        /* renamed from: r */
        public void mo22403r(long j) {
            this.f4411s = j;
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
            this.f4409o = referenceEntry;
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
            this.f4412z = referenceEntry;
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
            this.f4407A = referenceEntry;
        }
    }

    static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {

        /* renamed from: a */
        final K f4413a;

        /* renamed from: c */
        final int f4414c;

        /* renamed from: d */
        final ReferenceEntry<K, V> f4415d;

        /* renamed from: f */
        volatile ValueReference<K, V> f4416f = LocalCache.m5577D();

        StrongEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            this.f4413a = k;
            this.f4414c = i;
            this.f4415d = referenceEntry;
        }

        /* renamed from: b */
        public ValueReference<K, V> mo22390b() {
            return this.f4416f;
        }

        /* renamed from: d */
        public int mo22391d() {
            return this.f4414c;
        }

        /* renamed from: e */
        public ReferenceEntry<K, V> mo22392e() {
            return this.f4415d;
        }

        public K getKey() {
            return this.f4413a;
        }

        /* renamed from: l */
        public void mo22399l(ValueReference<K, V> valueReference) {
            this.f4416f = valueReference;
        }
    }

    static class StrongValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: a */
        final V f4417a;

        StrongValueReference(V v) {
            this.f4417a = v;
        }

        /* renamed from: b */
        public boolean mo22372b() {
            return true;
        }

        /* renamed from: c */
        public ReferenceEntry<K, V> mo22373c() {
            return null;
        }

        /* renamed from: d */
        public void mo22374d(V v) {
        }

        /* renamed from: e */
        public int mo22375e() {
            return 1;
        }

        /* renamed from: f */
        public boolean mo22376f() {
            return false;
        }

        /* renamed from: g */
        public ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public V get() {
            return this.f4417a;
        }

        /* renamed from: h */
        public V mo22379h() {
            return get();
        }
    }

    static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: g */
        volatile long f4418g = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: o */
        ReferenceEntry<K, V> f4419o = LocalCache.m5582q();
        @Weak

        /* renamed from: p */
        ReferenceEntry<K, V> f4420p = LocalCache.m5582q();

        StrongWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
        }

        /* renamed from: g */
        public ReferenceEntry<K, V> mo22394g() {
            return this.f4419o;
        }

        /* renamed from: k */
        public ReferenceEntry<K, V> mo22398k() {
            return this.f4420p;
        }

        /* renamed from: m */
        public long mo22400m() {
            return this.f4418g;
        }

        /* renamed from: r */
        public void mo22403r(long j) {
            this.f4418g = j;
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
            this.f4419o = referenceEntry;
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
            this.f4420p = referenceEntry;
        }
    }

    final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        ValueIterator(LocalCache localCache) {
            super();
        }

        public V next() {
            return mo22432c().getValue();
        }
    }

    interface ValueReference<K, V> {
        /* renamed from: b */
        boolean mo22372b();

        /* renamed from: c */
        ReferenceEntry<K, V> mo22373c();

        /* renamed from: d */
        void mo22374d(V v);

        /* renamed from: e */
        int mo22375e();

        /* renamed from: f */
        boolean mo22376f();

        /* renamed from: g */
        ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry);

        V get();

        /* renamed from: h */
        V mo22379h() throws ExecutionException;
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        public void clear() {
            LocalCache.this.clear();
        }

        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new ValueIterator(LocalCache.this);
        }

        public int size() {
            return LocalCache.this.size();
        }

        public Object[] toArray() {
            return LocalCache.m5576C(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.m5576C(this).toArray(eArr);
        }
    }

    static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: f */
        volatile long f4422f = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: g */
        ReferenceEntry<K, V> f4423g = LocalCache.m5582q();
        @Weak

        /* renamed from: o */
        ReferenceEntry<K, V> f4424o = LocalCache.m5582q();

        WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> mo22393f() {
            return this.f4424o;
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo22396i() {
            return this.f4423g;
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
            this.f4424o = referenceEntry;
        }

        /* renamed from: n */
        public void mo22401n(long j) {
            this.f4422f = j;
        }

        /* renamed from: q */
        public long mo22402q() {
            return this.f4422f;
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
            this.f4423g = referenceEntry;
        }
    }

    static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: f */
        volatile long f4425f = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: g */
        ReferenceEntry<K, V> f4426g = LocalCache.m5582q();
        @Weak

        /* renamed from: o */
        ReferenceEntry<K, V> f4427o = LocalCache.m5582q();

        /* renamed from: p */
        volatile long f4428p = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: s */
        ReferenceEntry<K, V> f4429s = LocalCache.m5582q();
        @Weak

        /* renamed from: z */
        ReferenceEntry<K, V> f4430z = LocalCache.m5582q();

        WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> mo22393f() {
            return this.f4427o;
        }

        /* renamed from: g */
        public ReferenceEntry<K, V> mo22394g() {
            return this.f4429s;
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo22396i() {
            return this.f4426g;
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
            this.f4427o = referenceEntry;
        }

        /* renamed from: k */
        public ReferenceEntry<K, V> mo22398k() {
            return this.f4430z;
        }

        /* renamed from: m */
        public long mo22400m() {
            return this.f4428p;
        }

        /* renamed from: n */
        public void mo22401n(long j) {
            this.f4425f = j;
        }

        /* renamed from: q */
        public long mo22402q() {
            return this.f4425f;
        }

        /* renamed from: r */
        public void mo22403r(long j) {
            this.f4428p = j;
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
            this.f4426g = referenceEntry;
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
            this.f4429s = referenceEntry;
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
            this.f4430z = referenceEntry;
        }
    }

    static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {

        /* renamed from: a */
        final int f4431a;

        /* renamed from: c */
        final ReferenceEntry<K, V> f4432c;

        /* renamed from: d */
        volatile ValueReference<K, V> f4433d = LocalCache.m5577D();

        WeakEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.f4431a = i;
            this.f4432c = referenceEntry;
        }

        /* renamed from: b */
        public ValueReference<K, V> mo22390b() {
            return this.f4433d;
        }

        /* renamed from: d */
        public int mo22391d() {
            return this.f4431a;
        }

        /* renamed from: e */
        public ReferenceEntry<K, V> mo22392e() {
            return this.f4432c;
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> mo22393f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public ReferenceEntry<K, V> mo22394g() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        /* renamed from: i */
        public ReferenceEntry<K, V> mo22396i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public void mo22397j(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: k */
        public ReferenceEntry<K, V> mo22398k() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public void mo22399l(ValueReference<K, V> valueReference) {
            this.f4433d = valueReference;
        }

        /* renamed from: m */
        public long mo22400m() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo22401n(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public long mo22402q() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: r */
        public void mo22403r(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: t */
        public void mo22404t(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* renamed from: a */
        final ReferenceEntry<K, V> f4434a;

        WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f4434a = referenceEntry;
        }

        /* renamed from: b */
        public boolean mo22372b() {
            return true;
        }

        /* renamed from: c */
        public ReferenceEntry<K, V> mo22373c() {
            return this.f4434a;
        }

        /* renamed from: d */
        public void mo22374d(V v) {
        }

        /* renamed from: e */
        public int mo22375e() {
            return 1;
        }

        /* renamed from: f */
        public boolean mo22376f() {
            return false;
        }

        /* renamed from: g */
        public ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v, referenceEntry);
        }

        /* renamed from: h */
        public V mo22379h() {
            return get();
        }
    }

    static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: f */
        volatile long f4435f = LocationRequestCompat.PASSIVE_INTERVAL;
        @Weak

        /* renamed from: g */
        ReferenceEntry<K, V> f4436g = LocalCache.m5582q();
        @Weak

        /* renamed from: o */
        ReferenceEntry<K, V> f4437o = LocalCache.m5582q();

        WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
        }

        /* renamed from: g */
        public ReferenceEntry<K, V> mo22394g() {
            return this.f4436g;
        }

        /* renamed from: k */
        public ReferenceEntry<K, V> mo22398k() {
            return this.f4437o;
        }

        /* renamed from: m */
        public long mo22400m() {
            return this.f4435f;
        }

        /* renamed from: r */
        public void mo22403r(long j) {
            this.f4435f = j;
        }

        /* renamed from: v */
        public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
            this.f4436g = referenceEntry;
        }

        /* renamed from: w */
        public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
            this.f4437o = referenceEntry;
        }
    }

    static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* renamed from: c */
        final int f4438c;

        WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.f4438c = i;
        }

        /* renamed from: e */
        public int mo22375e() {
            return this.f4438c;
        }

        /* renamed from: g */
        public ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v, referenceEntry, this.f4438c);
        }
    }

    static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* renamed from: c */
        final int f4439c;

        WeightedStrongValueReference(V v, int i) {
            super(v);
            this.f4439c = i;
        }

        /* renamed from: e */
        public int mo22375e() {
            return this.f4439c;
        }
    }

    static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* renamed from: c */
        final int f4440c;

        WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.f4440c = i;
        }

        /* renamed from: e */
        public int mo22375e() {
            return this.f4440c;
        }

        /* renamed from: g */
        public ValueReference<K, V> mo22377g(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v, referenceEntry, this.f4440c);
        }
    }

    static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: a */
        final ReferenceEntry<K, V> f4441a = new AbstractReferenceEntry<K, V>(this) {
            @Weak

            /* renamed from: a */
            ReferenceEntry<K, V> f4442a = this;
            @Weak

            /* renamed from: c */
            ReferenceEntry<K, V> f4443c = this;

            /* renamed from: g */
            public ReferenceEntry<K, V> mo22394g() {
                return this.f4442a;
            }

            /* renamed from: k */
            public ReferenceEntry<K, V> mo22398k() {
                return this.f4443c;
            }

            /* renamed from: m */
            public long mo22400m() {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }

            /* renamed from: r */
            public void mo22403r(long j) {
            }

            /* renamed from: v */
            public void mo22405v(ReferenceEntry<K, V> referenceEntry) {
                this.f4442a = referenceEntry;
            }

            /* renamed from: w */
            public void mo22406w(ReferenceEntry<K, V> referenceEntry) {
                this.f4443c = referenceEntry;
            }
        };

        WriteQueue() {
        }

        /* renamed from: c */
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.m5580c(referenceEntry.mo22398k(), referenceEntry.mo22394g());
            LocalCache.m5580c(this.f4441a.mo22398k(), referenceEntry);
            LocalCache.m5580c(referenceEntry, this.f4441a);
            return true;
        }

        public void clear() {
            ReferenceEntry<K, V> g = this.f4441a.mo22394g();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f4441a;
                if (g != referenceEntry) {
                    ReferenceEntry<K, V> g2 = g.mo22394g();
                    LocalCache.m5584s(g);
                    g = g2;
                } else {
                    referenceEntry.mo22405v(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f4441a;
                    referenceEntry2.mo22406w(referenceEntry2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).mo22394g() != NullEntry.INSTANCE;
        }

        /* renamed from: d */
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> g = this.f4441a.mo22394g();
            if (g == this.f4441a) {
                return null;
            }
            return g;
        }

        /* renamed from: f */
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> g = this.f4441a.mo22394g();
            if (g == this.f4441a) {
                return null;
            }
            remove(g);
            return g;
        }

        public boolean isEmpty() {
            return this.f4441a.mo22394g() == this.f4441a;
        }

        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
                /* access modifiers changed from: protected */
                /* renamed from: b */
                public ReferenceEntry<K, V> mo22419a(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> g = referenceEntry.mo22394g();
                    if (g == WriteQueue.this.f4441a) {
                        return null;
                    }
                    return g;
                }
            };
        }

        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry k = referenceEntry.mo22398k();
            ReferenceEntry g = referenceEntry.mo22394g();
            LocalCache.m5580c(k, g);
            LocalCache.m5584s(referenceEntry);
            return g != NullEntry.INSTANCE;
        }

        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> g = this.f4441a.mo22394g(); g != this.f4441a; g = g.mo22394g()) {
                i++;
            }
            return i;
        }
    }

    final class WriteThroughEntry implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f4445a;

        /* renamed from: c */
        V f4446c;

        WriteThroughEntry(K k, V v) {
            this.f4445a = k;
            this.f4446c = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f4445a.equals(entry.getKey()) || !this.f4446c.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f4445a;
        }

        public V getValue() {
            return this.f4446c;
        }

        public int hashCode() {
            return this.f4445a.hashCode() ^ this.f4446c.hashCode();
        }

        public V setValue(V v) {
            V put = LocalCache.this.put(this.f4445a, v);
            this.f4446c = v;
            return put;
        }

        public String toString() {
            String valueOf = String.valueOf(getKey());
            String valueOf2 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        Queue<RemovalNotification<K, V>> queue;
        this.f4354f = Math.min(cacheBuilder.mo22293h(), 65536);
        Strength m = cacheBuilder.mo22298m();
        this.f4357p = m;
        this.f4358s = cacheBuilder.mo22305t();
        this.f4355g = cacheBuilder.mo22297l();
        this.f4356o = cacheBuilder.mo22304s();
        long n = cacheBuilder.mo22299n();
        this.f4359z = n;
        this.f4338A = cacheBuilder.mo22307u();
        this.f4339B = cacheBuilder.mo22294i();
        this.f4340C = cacheBuilder.mo22295j();
        this.f4341D = cacheBuilder.mo22300o();
        RemovalListener<K1, V1> p = cacheBuilder.mo22301p();
        this.f4343F = p;
        if (p == CacheBuilder.NullListener.INSTANCE) {
            queue = m5581f();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.f4342E = queue;
        this.f4344G = cacheBuilder.mo22303r(mo22369x());
        this.f4345H = EntryFactory.m5646g(m, mo22330E(), mo22334I());
        this.f4346I = (AbstractCache.StatsCounter) cacheBuilder.mo22302q().get();
        this.f4347J = cacheLoader;
        int min = Math.min(cacheBuilder.mo22296k(), BasicMeasure.EXACTLY);
        if (mo22342g() && !mo22340e()) {
            min = (int) Math.min((long) min, n);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f4354f && (!mo22342g() || ((long) (i3 * 20)) <= this.f4359z)) {
            i4++;
            i3 <<= 1;
        }
        this.f4352c = 32 - i4;
        this.f4351a = i3 - 1;
        this.f4353d = mo22355p(i3);
        int i5 = min / i3;
        while (i2 < (i5 * i3 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (mo22342g()) {
            long j = this.f4359z;
            long j2 = (long) i3;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                Segment<K, V>[] segmentArr = this.f4353d;
                if (i < segmentArr.length) {
                    if (((long) i) == j4) {
                        j3--;
                    }
                    segmentArr[i] = mo22339d(i2, j3, (AbstractCache.StatsCounter) cacheBuilder.mo22302q().get());
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f4353d;
                if (i < segmentArr2.length) {
                    segmentArr2[i] = mo22339d(i2, -1, (AbstractCache.StatsCounter) cacheBuilder.mo22302q().get());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    static int m5575A(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static <E> ArrayList<E> m5576C(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.m27705a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: D */
    static <K, V> ValueReference<K, V> m5577D() {
        return f4336O;
    }

    /* renamed from: b */
    static <K, V> void m5579b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.mo22404t(referenceEntry2);
        referenceEntry2.mo22397j(referenceEntry);
    }

    /* renamed from: c */
    static <K, V> void m5580c(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.mo22405v(referenceEntry2);
        referenceEntry2.mo22406w(referenceEntry);
    }

    /* renamed from: f */
    static <E> Queue<E> m5581f() {
        return f4337P;
    }

    /* renamed from: q */
    static <K, V> ReferenceEntry<K, V> m5582q() {
        return NullEntry.INSTANCE;
    }

    /* renamed from: r */
    static <K, V> void m5583r(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry q = m5582q();
        referenceEntry.mo22404t(q);
        referenceEntry.mo22397j(q);
    }

    /* renamed from: s */
    static <K, V> void m5584s(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry q = m5582q();
        referenceEntry.mo22405v(q);
        referenceEntry.mo22406w(q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Segment<K, V> mo22329B(int i) {
        return this.f4353d[(i >>> this.f4352c) & this.f4351a];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo22330E() {
        return mo22331F() || mo22368w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo22331F() {
        return mo22345h() || mo22342g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo22332G() {
        return this.f4357p != Strength.STRONG;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo22333H() {
        return this.f4358s != Strength.STRONG;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo22334I() {
        return mo22335K() || mo22370y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo22335K() {
        return mo22346i();
    }

    public void clear() {
        for (Segment<K, V> b : this.f4353d) {
            b.mo22475b();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m = mo22352m(obj);
        return mo22329B(m).mo22483f(obj, m);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = this.f4344G.mo22274a();
        Segment<K, V>[] segmentArr = this.f4353d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            int length = segmentArr.length;
            int i2 = 0;
            while (i2 < length) {
                Segment<K, V> segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    ReferenceEntry referenceEntry = atomicReferenceArray.get(i4);
                    while (referenceEntry != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V x = segment.mo22503x(referenceEntry, a);
                        long j3 = a;
                        if (x != null && this.f4356o.mo22143d(obj2, x)) {
                            return true;
                        }
                        referenceEntry = referenceEntry.mo22392e();
                        segmentArr = segmentArr2;
                        a = j3;
                    }
                    long j4 = a;
                    Segment<K, V>[] segmentArr3 = segmentArr;
                }
                Segment<K, V>[] segmentArr4 = segmentArr;
                j2 += (long) segment.modCount;
                i2++;
                a = a;
            }
            long j5 = a;
            Segment<K, V>[] segmentArr5 = segmentArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            segmentArr = segmentArr5;
            a = j5;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Segment<K, V> mo22339d(int i, long j, AbstractCache.StatsCounter statsCounter) {
        return new Segment(this, i, j, statsCounter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo22340e() {
        return this.f4338A != CacheBuilder.OneWeigher.INSTANCE;
    }

    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f4350M;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f4350M = entrySet;
        return entrySet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo22342g() {
        return this.f4359z >= 0;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m = mo22352m(obj);
        return mo22329B(m).mo22497q(obj, m);
    }

    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo22345h() {
        return this.f4339B > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo22346i() {
        return this.f4340C > 0;
    }

    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f4353d;
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
    /* renamed from: j */
    public V mo22348j(K k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int m = mo22352m(Preconditions.m5392s(k));
        return mo22329B(m).mo22498r(k, m, cacheLoader);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public V mo22349k(ReferenceEntry<K, V> referenceEntry, long j) {
        V v;
        if (referenceEntry.getKey() == null || (v = referenceEntry.mo22390b().get()) == null || mo22353n(referenceEntry, j)) {
            return null;
        }
        return v;
    }

    public Set<K> keySet() {
        Set<K> set = this.f4348K;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f4348K = keySet;
        return keySet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public V mo22351l(K k) throws ExecutionException {
        return mo22348j(k, this.f4347J);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo22352m(Object obj) {
        return m5575A(this.f4355g.mo22144e(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo22353n(ReferenceEntry<K, V> referenceEntry, long j) {
        Preconditions.m5392s(referenceEntry);
        if (mo22345h() && j - referenceEntry.mo22402q() >= this.f4339B) {
            return true;
        }
        if (!mo22346i() || j - referenceEntry.mo22400m() < this.f4340C) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo22354o() {
        Segment<K, V>[] segmentArr = this.f4353d;
        long j = 0;
        for (Segment<K, V> segment : segmentArr) {
            j += (long) Math.max(0, segment.count);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Segment<K, V>[] mo22355p(int i) {
        return new Segment[i];
    }

    public V put(K k, V v) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        int m = mo22352m(k);
        return mo22329B(m).mo22458J(k, m, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        int m = mo22352m(k);
        return mo22329B(m).mo22458J(k, m, v, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m = mo22352m(obj);
        return mo22329B(m).mo22465R(obj, m);
    }

    public boolean replace(K k, V v, V v2) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v2);
        if (v == null) {
            return false;
        }
        int m = mo22352m(k);
        return mo22329B(m).mo22474a0(k, m, v, v2);
    }

    public int size() {
        return Ints.m73622k(mo22354o());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo22364t() {
        while (true) {
            RemovalNotification poll = this.f4342E.poll();
            if (poll != null) {
                try {
                    this.f4343F.mo22313b(poll);
                } catch (Throwable th) {
                    f4335N.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo22365u(ReferenceEntry<K, V> referenceEntry) {
        int d = referenceEntry.mo22391d();
        mo22329B(d).mo22459L(referenceEntry, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo22366v(ValueReference<K, V> valueReference) {
        ReferenceEntry<K, V> c = valueReference.mo22373c();
        int d = c.mo22391d();
        mo22329B(d).mo22460M(c.getKey(), d, valueReference);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f4349L;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.f4349L = values;
        return values;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo22368w() {
        return mo22345h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo22369x() {
        return mo22370y() || mo22368w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo22370y() {
        return mo22346i() || mo22371z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo22371z() {
        return this.f4341D > 0;
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m = mo22352m(obj);
        return mo22329B(m).mo22466T(obj, m, obj2);
    }

    public V replace(K k, V v) {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        int m = mo22352m(k);
        return mo22329B(m).mo22472Z(k, m, v);
    }
}
