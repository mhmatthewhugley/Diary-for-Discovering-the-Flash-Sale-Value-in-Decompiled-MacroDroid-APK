package com.google.protobuf;

import com.google.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f57074a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<SmallSortedMap<K, V>.Entry> f57075c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f57076d;

    /* renamed from: f */
    private boolean f57077f;

    /* renamed from: g */
    private volatile SmallSortedMap<K, V>.EntrySet f57078g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<K, V> f57079o;

    /* renamed from: p */
    private volatile SmallSortedMap<K, V>.DescendingEntrySet f57080p;

    private class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f57081a;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f57082c;

        private DescendingEntryIterator() {
            this.f57081a = SmallSortedMap.this.f57075c.size();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m81222a() {
            if (this.f57082c == null) {
                this.f57082c = SmallSortedMap.this.f57079o.entrySet().iterator();
            }
            return this.f57082c;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (m81222a().hasNext()) {
                return (Map.Entry) m81222a().next();
            }
            List b = SmallSortedMap.this.f57075c;
            int i = this.f57081a - 1;
            this.f57081a = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f57081a;
            return (i > 0 && i <= SmallSortedMap.this.f57075c.size()) || m81222a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new DescendingEntryIterator();
        }
    }

    private static class EmptySet {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f57085a = new Iterator<Object>() {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: b */
        private static final Iterable<Object> f57086b = new Iterable<Object>() {
            public Iterator<Object> iterator() {
                return EmptySet.f57085a;
            }
        };

        private EmptySet() {
        }

        /* renamed from: b */
        static <T> Iterable<T> m81225b() {
            return f57086b;
        }
    }

    private class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* renamed from: a */
        private final K f57087a;

        /* renamed from: c */
        private V f57088c;

        Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: d */
        private boolean m81226d(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: b */
        public int compareTo(SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        /* renamed from: e */
        public K getKey() {
            return this.f57087a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m81226d(this.f57087a, entry.getKey()) || !m81226d(this.f57088c, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f57088c;
        }

        public int hashCode() {
            K k = this.f57087a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f57088c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            SmallSortedMap.this.m81208g();
            V v2 = this.f57088c;
            this.f57088c = v;
            return v2;
        }

        public String toString() {
            return this.f57087a + "=" + this.f57088c;
        }

        Entry(K k, V v) {
            this.f57087a = k;
            this.f57088c = v;
        }
    }

    private class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f57090a;

        /* renamed from: c */
        private boolean f57091c;

        /* renamed from: d */
        private Iterator<Map.Entry<K, V>> f57092d;

        private EntryIterator() {
            this.f57090a = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m81229a() {
            if (this.f57092d == null) {
                this.f57092d = SmallSortedMap.this.f57076d.entrySet().iterator();
            }
            return this.f57092d;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f57091c = true;
            int i = this.f57090a + 1;
            this.f57090a = i;
            if (i < SmallSortedMap.this.f57075c.size()) {
                return (Map.Entry) SmallSortedMap.this.f57075c.get(this.f57090a);
            }
            return (Map.Entry) m81229a().next();
        }

        public boolean hasNext() {
            if (this.f57090a + 1 < SmallSortedMap.this.f57075c.size()) {
                return true;
            }
            if (SmallSortedMap.this.f57076d.isEmpty() || !m81229a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f57091c) {
                this.f57091c = false;
                SmallSortedMap.this.m81208g();
                if (this.f57090a < SmallSortedMap.this.f57075c.size()) {
                    SmallSortedMap smallSortedMap = SmallSortedMap.this;
                    int i = this.f57090a;
                    this.f57090a = i - 1;
                    Object unused = smallSortedMap.m81212s(i);
                    return;
                }
                m81229a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    private class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            SmallSortedMap.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return SmallSortedMap.this.size();
        }
    }

    /* renamed from: f */
    private int m81207f(K k) {
        int size = this.f57075c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f57075c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f57075c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m81208g() {
        if (this.f57077f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private void m81209i() {
        m81208g();
        if (this.f57075c.isEmpty() && !(this.f57075c instanceof ArrayList)) {
            this.f57075c = new ArrayList(this.f57074a);
        }
    }

    /* renamed from: n */
    private SortedMap<K, V> m81210n() {
        m81208g();
        if (this.f57076d.isEmpty() && !(this.f57076d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f57076d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f57079o = treeMap.descendingMap();
        }
        return (SortedMap) this.f57076d;
    }

    /* renamed from: q */
    static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> SmallSortedMap<FieldDescriptorType, Object> m81211q(int i) {
        return new SmallSortedMap<FieldDescriptorType, Object>(i) {
            /* renamed from: p */
            public void mo65399p() {
                if (!mo65398o()) {
                    for (int i = 0; i < mo65395k(); i++) {
                        Map.Entry j = mo65394j(i);
                        if (((FieldSet.FieldDescriptorLite) j.getKey()).mo65147u()) {
                            j.setValue(Collections.unmodifiableList((List) j.getValue()));
                        }
                    }
                    for (Map.Entry entry : mo65397m()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).mo65147u()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                SmallSortedMap.super.mo65399p();
            }

            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return SmallSortedMap.super.put((FieldSet.FieldDescriptorLite) obj, obj2);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public V m81212s(int i) {
        m81208g();
        V value = this.f57075c.remove(i).getValue();
        if (!this.f57076d.isEmpty()) {
            Iterator it = m81210n().entrySet().iterator();
            this.f57075c.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m81208g();
        if (!this.f57075c.isEmpty()) {
            this.f57075c.clear();
        }
        if (!this.f57076d.isEmpty()) {
            this.f57076d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m81207f(comparable) >= 0 || this.f57076d.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f57078g == null) {
            this.f57078g = new EntrySet();
        }
        return this.f57078g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int k = mo65395k();
        if (k != smallSortedMap.mo65395k()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo65394j(i).equals(smallSortedMap.mo65394j(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f57076d.equals(smallSortedMap.f57076d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = m81207f(comparable);
        if (f >= 0) {
            return this.f57075c.get(f).getValue();
        }
        return this.f57076d.get(comparable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo65392h() {
        if (this.f57080p == null) {
            this.f57080p = new DescendingEntrySet();
        }
        return this.f57080p;
    }

    public int hashCode() {
        int k = mo65395k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f57075c.get(i2).hashCode();
        }
        return mo65396l() > 0 ? i + this.f57076d.hashCode() : i;
    }

    /* renamed from: j */
    public Map.Entry<K, V> mo65394j(int i) {
        return this.f57075c.get(i);
    }

    /* renamed from: k */
    public int mo65395k() {
        return this.f57075c.size();
    }

    /* renamed from: l */
    public int mo65396l() {
        return this.f57076d.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> mo65397m() {
        if (this.f57076d.isEmpty()) {
            return EmptySet.m81225b();
        }
        return this.f57076d.entrySet();
    }

    /* renamed from: o */
    public boolean mo65398o() {
        return this.f57077f;
    }

    /* renamed from: p */
    public void mo65399p() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f57077f) {
            if (this.f57076d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f57076d);
            }
            this.f57076d = map;
            if (this.f57079o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f57079o);
            }
            this.f57079o = map2;
            this.f57077f = true;
        }
    }

    /* renamed from: r */
    public V put(K k, V v) {
        m81208g();
        int f = m81207f(k);
        if (f >= 0) {
            return this.f57075c.get(f).setValue(v);
        }
        m81209i();
        int i = -(f + 1);
        if (i >= this.f57074a) {
            return m81210n().put(k, v);
        }
        int size = this.f57075c.size();
        int i2 = this.f57074a;
        if (size == i2) {
            Entry remove = this.f57075c.remove(i2 - 1);
            m81210n().put(remove.getKey(), remove.getValue());
        }
        this.f57075c.add(i, new Entry(k, v));
        return null;
    }

    public V remove(Object obj) {
        m81208g();
        Comparable comparable = (Comparable) obj;
        int f = m81207f(comparable);
        if (f >= 0) {
            return m81212s(f);
        }
        if (this.f57076d.isEmpty()) {
            return null;
        }
        return this.f57076d.remove(comparable);
    }

    public int size() {
        return this.f57075c.size() + this.f57076d.size();
    }

    private SmallSortedMap(int i) {
        this.f57074a = i;
        this.f57075c = Collections.emptyList();
        this.f57076d = Collections.emptyMap();
        this.f57079o = Collections.emptyMap();
    }
}
