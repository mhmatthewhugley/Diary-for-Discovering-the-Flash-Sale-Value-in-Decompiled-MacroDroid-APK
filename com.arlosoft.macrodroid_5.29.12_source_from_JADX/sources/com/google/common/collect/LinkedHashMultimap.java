package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 1;
    @VisibleForTesting

    /* renamed from: s */
    transient int f16792s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public transient ValueEntry<K, V> f16793z;

    @VisibleForTesting
    static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {
        ValueEntry<K, V> nextInValueBucket;
        ValueEntry<K, V> predecessorInMultimap;
        ValueSetLink<K, V> predecessorInValueSet;
        final int smearedValueHash;
        ValueEntry<K, V> successorInMultimap;
        ValueSetLink<K, V> successorInValueSet;

        ValueEntry(@ParametricNullness K k, @ParametricNullness V v, int i, ValueEntry<K, V> valueEntry) {
            super(k, v);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        /* renamed from: g */
        static <K, V> ValueEntry<K, V> m27762g() {
            return new ValueEntry<>((Object) null, (Object) null, 0, (ValueEntry) null);
        }

        /* renamed from: a */
        public ValueEntry<K, V> mo35659a() {
            ValueEntry<K, V> valueEntry = this.predecessorInMultimap;
            Objects.requireNonNull(valueEntry);
            ValueEntry valueEntry2 = valueEntry;
            return valueEntry;
        }

        /* renamed from: b */
        public ValueEntry<K, V> mo35660b() {
            ValueEntry<K, V> valueEntry = this.successorInMultimap;
            Objects.requireNonNull(valueEntry);
            ValueEntry valueEntry2 = valueEntry;
            return valueEntry;
        }

        /* renamed from: c */
        public ValueSetLink<K, V> mo35661c() {
            ValueSetLink<K, V> valueSetLink = this.predecessorInValueSet;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        /* renamed from: d */
        public ValueSetLink<K, V> mo35662d() {
            ValueSetLink<K, V> valueSetLink = this.successorInValueSet;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo35663e(Object obj, int i) {
            return this.smearedValueHash == i && com.google.common.base.Objects.m5349a(getValue(), obj);
        }

        /* renamed from: f */
        public void mo35664f(ValueSetLink<K, V> valueSetLink) {
            this.successorInValueSet = valueSetLink;
        }

        /* renamed from: h */
        public void mo35665h(ValueSetLink<K, V> valueSetLink) {
            this.predecessorInValueSet = valueSetLink;
        }

        /* renamed from: i */
        public void mo35666i(ValueEntry<K, V> valueEntry) {
            this.predecessorInMultimap = valueEntry;
        }

        /* renamed from: j */
        public void mo35667j(ValueEntry<K, V> valueEntry) {
            this.successorInMultimap = valueEntry;
        }
    }

    @VisibleForTesting
    final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {
        @ParametricNullness

        /* renamed from: a */
        private final K f16797a;
        @VisibleForTesting

        /* renamed from: c */
        ValueEntry<K, V>[] f16798c;

        /* renamed from: d */
        private int f16799d = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f16800f = 0;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public ValueSetLink<K, V> f16801g;

        /* renamed from: o */
        private ValueSetLink<K, V> f16802o;

        ValueSet(@ParametricNullness K k, int i) {
            this.f16797a = k;
            this.f16801g = this;
            this.f16802o = this;
            this.f16798c = new ValueEntry[Hashing.m27247a(i, 1.0d)];
        }

        /* renamed from: k */
        private int m27774k() {
            return this.f16798c.length - 1;
        }

        /* renamed from: l */
        private void m27775l() {
            if (Hashing.m27248b(this.f16799d, this.f16798c.length, 1.0d)) {
                int length = this.f16798c.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f16798c = valueEntryArr;
                int i = length - 1;
                for (ValueSetLink valueSetLink = this.f16801g; valueSetLink != this; valueSetLink = valueSetLink.mo35662d()) {
                    ValueEntry<K, V> valueEntry = (ValueEntry) valueSetLink;
                    int i2 = valueEntry.smearedValueHash & i;
                    valueEntry.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry;
                }
            }
        }

        public boolean add(@ParametricNullness V v) {
            int d = Hashing.m27250d(v);
            int k = m27774k() & d;
            ValueEntry<K, V> valueEntry = this.f16798c[k];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.mo35663e(v, d)) {
                    return false;
                }
            }
            ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.f16797a, v, d, valueEntry);
            LinkedHashMultimap.m27749W(this.f16802o, valueEntry3);
            LinkedHashMultimap.m27749W(valueEntry3, this);
            LinkedHashMultimap.m27748V(LinkedHashMultimap.this.f16793z.mo35659a(), valueEntry3);
            LinkedHashMultimap.m27748V(valueEntry3, LinkedHashMultimap.this.f16793z);
            this.f16798c[k] = valueEntry3;
            this.f16799d++;
            this.f16800f++;
            m27775l();
            return true;
        }

        /* renamed from: c */
        public ValueSetLink<K, V> mo35661c() {
            return this.f16802o;
        }

        public void clear() {
            Arrays.fill(this.f16798c, (Object) null);
            this.f16799d = 0;
            for (ValueSetLink<K, V> valueSetLink = this.f16801g; valueSetLink != this; valueSetLink = valueSetLink.mo35662d()) {
                LinkedHashMultimap.m27746T((ValueEntry) valueSetLink);
            }
            LinkedHashMultimap.m27749W(this, this);
            this.f16800f++;
        }

        public boolean contains(Object obj) {
            int d = Hashing.m27250d(obj);
            for (ValueEntry<K, V> valueEntry = this.f16798c[m27774k() & d]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.mo35663e(obj, d)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public ValueSetLink<K, V> mo35662d() {
            return this.f16801g;
        }

        /* renamed from: f */
        public void mo35664f(ValueSetLink<K, V> valueSetLink) {
            this.f16801g = valueSetLink;
        }

        /* renamed from: h */
        public void mo35665h(ValueSetLink<K, V> valueSetLink) {
            this.f16802o = valueSetLink;
        }

        public Iterator<V> iterator() {
            return new Iterator<V>() {

                /* renamed from: a */
                ValueSetLink<K, V> f16804a;

                /* renamed from: c */
                ValueEntry<K, V> f16805c;

                /* renamed from: d */
                int f16806d;

                {
                    this.f16804a = ValueSet.this.f16801g;
                    this.f16806d = ValueSet.this.f16800f;
                }

                /* renamed from: a */
                private void m27780a() {
                    if (ValueSet.this.f16800f != this.f16806d) {
                        throw new ConcurrentModificationException();
                    }
                }

                public boolean hasNext() {
                    m27780a();
                    return this.f16804a != ValueSet.this;
                }

                @ParametricNullness
                public V next() {
                    if (hasNext()) {
                        ValueEntry<K, V> valueEntry = (ValueEntry) this.f16804a;
                        V value = valueEntry.getValue();
                        this.f16805c = valueEntry;
                        this.f16804a = valueEntry.mo35662d();
                        return value;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    m27780a();
                    Preconditions.m5399z(this.f16805c != null, "no calls to next() since the last call to remove()");
                    ValueSet.this.remove(this.f16805c.getValue());
                    this.f16806d = ValueSet.this.f16800f;
                    this.f16805c = null;
                }
            };
        }

        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            int d = Hashing.m27250d(obj);
            int k = m27774k() & d;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f16798c[k]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.mo35663e(obj, d)) {
                    if (valueEntry == null) {
                        this.f16798c[k] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.m27747U(valueEntry2);
                    LinkedHashMultimap.m27746T(valueEntry2);
                    this.f16799d--;
                    this.f16800f++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        public int size() {
            return this.f16799d;
        }
    }

    private interface ValueSetLink<K, V> {
        /* renamed from: c */
        ValueSetLink<K, V> mo35661c();

        /* renamed from: d */
        ValueSetLink<K, V> mo35662d();

        /* renamed from: f */
        void mo35664f(ValueSetLink<K, V> valueSetLink);

        /* renamed from: h */
        void mo35665h(ValueSetLink<K, V> valueSetLink);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static <K, V> void m27746T(ValueEntry<K, V> valueEntry) {
        m27748V(valueEntry.mo35659a(), valueEntry.mo35660b());
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static <K, V> void m27747U(ValueSetLink<K, V> valueSetLink) {
        m27749W(valueSetLink.mo35661c(), valueSetLink.mo35662d());
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static <K, V> void m27748V(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.mo35667j(valueEntry2);
        valueEntry2.mo35666i(valueEntry);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static <K, V> void m27749W(ValueSetLink<K, V> valueSetLink, ValueSetLink<K, V> valueSetLink2) {
        valueSetLink.mo35664f(valueSetLink2);
        valueSetLink2.mo35665h(valueSetLink);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> g = ValueEntry.m27762g();
        this.f16793z = g;
        m27748V(g, g);
        this.f16792s = 2;
        int readInt = objectInputStream.readInt();
        Map e = Platform.m28536e(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            e.put(readObject, mo34448z(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) e.get(readObject2);
            Objects.requireNonNull(collection);
            collection.add(readObject3);
        }
        mo34434F(e);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (Object writeObject : keySet()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : mo34445i()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public Set<V> mo34431y() {
        return Platform.m28537f(this.f16792s);
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ boolean mo34625P(Object obj, Object obj2) {
        return super.mo34625P(obj, obj2);
    }

    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.f16793z;
        m27748V(valueEntry, valueEntry);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo34426d(Object obj) {
        return super.mo34426d(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<K, V>> mo34443g() {
        return new Iterator<Map.Entry<K, V>>() {

            /* renamed from: a */
            ValueEntry<K, V> f16794a;

            /* renamed from: c */
            ValueEntry<K, V> f16795c;

            {
                this.f16794a = LinkedHashMultimap.this.f16793z.mo35660b();
            }

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                if (hasNext()) {
                    ValueEntry<K, V> valueEntry = this.f16794a;
                    this.f16795c = valueEntry;
                    this.f16794a = valueEntry.mo35660b();
                    return valueEntry;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f16794a != LinkedHashMultimap.this.f16793z;
            }

            public void remove() {
                Preconditions.m5399z(this.f16795c != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap.this.remove(this.f16795c.getKey(), this.f16795c.getValue());
                this.f16795c = null;
            }
        };
    }

    public /* bridge */ /* synthetic */ Set get(@ParametricNullness Object obj) {
        return super.get(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterator<V> mo34444h() {
        return Maps.m28083Z(mo34443g());
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ Multiset mo34630k() {
        return super.mo34630k();
    }

    public Set<K> keySet() {
        return super.keySet();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.put(obj, obj2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: w */
    public /* bridge */ /* synthetic */ Map mo34430w() {
        return super.mo34430w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Collection<V> mo34448z(@ParametricNullness K k) {
        return new ValueSet(k, this.f16792s);
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> m27756i() {
        return super.mo34445i();
    }
}
