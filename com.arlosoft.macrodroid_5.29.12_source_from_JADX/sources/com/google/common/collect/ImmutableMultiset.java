package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    @LazyInit

    /* renamed from: c */
    private transient ImmutableList<E> f16688c;
    @LazyInit

    /* renamed from: d */
    private transient ImmutableSet<Multiset.Entry<E>> f16689d;

    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* renamed from: a */
        ObjectCountHashMap<E> f16693a;

        /* renamed from: b */
        boolean f16694b;

        /* renamed from: c */
        boolean f16695c;

        public Builder() {
            this(4);
        }

        /* renamed from: i */
        static <T> ObjectCountHashMap<T> m27456i(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).f17094f;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).f16425d;
            }
            return null;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder<E> mo35364a(E e) {
            return mo35476g(e, 1);
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public Builder<E> mo35475f(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f16693a);
            if (iterable instanceof Multiset) {
                Multiset<? extends E> d = Multisets.m28375d(iterable);
                ObjectCountHashMap<T> i = m27456i(d);
                if (i != null) {
                    ObjectCountHashMap<E> objectCountHashMap = this.f16693a;
                    objectCountHashMap.mo36248d(Math.max(objectCountHashMap.mo36246C(), i.mo36246C()));
                    for (int e = i.mo36249e(); e >= 0; e = i.mo36258s(e)) {
                        mo35476g(i.mo36252i(e), i.mo36253k(e));
                    }
                } else {
                    Set<Multiset.Entry<? extends E>> entrySet = d.entrySet();
                    ObjectCountHashMap<E> objectCountHashMap2 = this.f16693a;
                    objectCountHashMap2.mo36248d(Math.max(objectCountHashMap2.mo36246C(), entrySet.size()));
                    for (Multiset.Entry next : d.entrySet()) {
                        mo35476g(next.mo35049b(), next.getCount());
                    }
                }
            } else {
                super.mo35368b(iterable);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public Builder<E> mo35476g(E e, int i) {
            Objects.requireNonNull(this.f16693a);
            if (i == 0) {
                return this;
            }
            if (this.f16694b) {
                this.f16693a = new ObjectCountHashMap<>(this.f16693a);
                this.f16695c = false;
            }
            this.f16694b = false;
            Preconditions.m5392s(e);
            ObjectCountHashMap<E> objectCountHashMap = this.f16693a;
            objectCountHashMap.mo36260u(e, i + objectCountHashMap.mo36250f(e));
            return this;
        }

        /* renamed from: h */
        public ImmutableMultiset<E> mo35477h() {
            Objects.requireNonNull(this.f16693a);
            if (this.f16693a.mo36246C() == 0) {
                return ImmutableMultiset.m27444t();
            }
            if (this.f16695c) {
                this.f16693a = new ObjectCountHashMap<>(this.f16693a);
                this.f16695c = false;
            }
            this.f16694b = true;
            return new RegularImmutableMultiset(this.f16693a);
        }

        Builder(int i) {
            this.f16694b = false;
            this.f16695c = false;
            this.f16693a = ObjectCountHashMap.m28478c(i);
        }

        Builder(boolean z) {
            this.f16694b = false;
            this.f16695c = false;
            this.f16693a = null;
        }
    }

    private final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public Multiset.Entry<E> get(int i) {
            return ImmutableMultiset.this.mo34983q(i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (entry.getCount() > 0 && ImmutableMultiset.this.mo34601J1(entry.mo35049b()) == entry.getCount()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return ImmutableMultiset.this.mo34781j();
        }

        public int size() {
            return ImmutableMultiset.this.mo34642C().size();
        }

        /* access modifiers changed from: package-private */
        @GwtIncompatible
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    @GwtIncompatible
    static class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    ImmutableMultiset() {
    }

    /* renamed from: l */
    public static <E> ImmutableMultiset<E> m27442l(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.mo34781j()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.m28380i(iterable));
        builder.mo35475f(iterable);
        return builder.mo35477h();
    }

    /* renamed from: m */
    private ImmutableSet<Multiset.Entry<E>> m27443m() {
        return isEmpty() ? ImmutableSet.m27506F() : new EntrySet();
    }

    /* renamed from: t */
    public static <E> ImmutableMultiset<E> m27444t() {
        return RegularImmutableMultiset.f17093p;
    }

    /* renamed from: c */
    public ImmutableList<E> mo35029c() {
        ImmutableList<E> immutableList = this.f16688c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> c = super.mo35029c();
        this.f16688c = c;
        return c;
    }

    public boolean contains(Object obj) {
        return mo34601J1(obj) > 0;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        UnmodifiableIterator k = entrySet().iterator();
        while (k.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) k.next();
            Arrays.fill(objArr, i, entry.getCount() + i, entry.mo35049b());
            i += entry.getCount();
        }
        return i;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: e0 */
    public final int mo34603e0(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        return Multisets.m28377f(this, obj);
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: h1 */
    public final int mo34606h1(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int hashCode() {
        return Sets.m28723f(entrySet());
    }

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator k = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) {

            /* renamed from: a */
            int f16690a;

            /* renamed from: c */
            E f16691c;

            public boolean hasNext() {
                return this.f16690a > 0 || k.hasNext();
            }

            public E next() {
                if (this.f16690a <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) k.next();
                    this.f16691c = entry.mo35049b();
                    this.f16690a = entry.getCount();
                }
                this.f16690a--;
                E e = this.f16691c;
                Objects.requireNonNull(e);
                return e;
            }
        };
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: k1 */
    public final int mo34611k1(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public abstract ImmutableSet<E> mo34642C();

    /* renamed from: p */
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.f16689d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry<E>> m = m27443m();
        this.f16689d = m;
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract Multiset.Entry<E> mo34983q(int i);

    public String toString() {
        return entrySet().toString();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public abstract Object writeReplace();

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: z1 */
    public final boolean mo34613z1(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
