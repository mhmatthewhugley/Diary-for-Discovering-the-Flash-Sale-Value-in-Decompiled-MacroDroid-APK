package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.C14492g;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t */
/* compiled from: SmallSortedMap */
class C14527t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f63416a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C14527t<K, V>.c> f63417c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f63418d;

    /* renamed from: f */
    private boolean f63419f;

    /* renamed from: g */
    private volatile C14527t<K, V>.e f63420g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$a */
    /* compiled from: SmallSortedMap */
    static class C14528a extends C14527t<FieldDescriptorType, Object> {
        C14528a(int i) {
            super(i, (C14528a) null);
        }

        /* renamed from: m */
        public void mo73470m() {
            if (!mo73469l()) {
                for (int i = 0; i < mo73467i(); i++) {
                    Map.Entry h = mo73466h(i);
                    if (((C14492g.C14494b) h.getKey()).mo73384u()) {
                        h.setValue(Collections.unmodifiableList((List) h.getValue()));
                    }
                }
                for (Map.Entry entry : mo73468j()) {
                    if (((C14492g.C14494b) entry.getKey()).mo73384u()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C14527t.super.mo73470m();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C14527t.super.mo73471o((C14492g.C14494b) obj, obj2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b */
    /* compiled from: SmallSortedMap */
    private static class C14529b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f63421a = new C14530a();

        /* renamed from: b */
        private static final Iterable<Object> f63422b = new C14531b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$a */
        /* compiled from: SmallSortedMap */
        static class C14530a implements Iterator<Object> {
            C14530a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b */
        /* compiled from: SmallSortedMap */
        static class C14531b implements Iterable<Object> {
            C14531b() {
            }

            public Iterator<Object> iterator() {
                return C14529b.f63421a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m91090b() {
            return f63422b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$c */
    /* compiled from: SmallSortedMap */
    private class C14532c implements Comparable<C14527t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: a */
        private final K f63423a;

        /* renamed from: c */
        private V f63424c;

        C14532c(C14527t tVar, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: d */
        private boolean m91091d(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: b */
        public int compareTo(C14527t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* renamed from: e */
        public K getKey() {
            return this.f63423a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m91091d(this.f63423a, entry.getKey()) || !m91091d(this.f63424c, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f63424c;
        }

        public int hashCode() {
            K k = this.f63423a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f63424c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C14527t.this.m91077f();
            V v2 = this.f63424c;
            this.f63424c = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f63423a);
            String valueOf2 = String.valueOf(this.f63424c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        C14532c(K k, V v) {
            this.f63423a = k;
            this.f63424c = v;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$e */
    /* compiled from: SmallSortedMap */
    private class C14534e extends AbstractSet<Map.Entry<K, V>> {
        private C14534e() {
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C14527t.this.mo73471o((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C14527t.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C14527t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14533d(C14527t.this, (C14528a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C14527t.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C14527t.this.size();
        }

        /* synthetic */ C14534e(C14527t tVar, C14528a aVar) {
            this();
        }
    }

    /* synthetic */ C14527t(int i, C14528a aVar) {
        this(i);
    }

    /* renamed from: e */
    private int m91076e(K k) {
        int size = this.f63417c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f63417c.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f63417c.get(i2).getKey());
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
    /* renamed from: f */
    public void m91077f() {
        if (this.f63419f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private void m91078g() {
        m91077f();
        if (this.f63417c.isEmpty() && !(this.f63417c instanceof ArrayList)) {
            this.f63417c = new ArrayList(this.f63416a);
        }
    }

    /* renamed from: k */
    private SortedMap<K, V> m91079k() {
        m91077f();
        if (this.f63418d.isEmpty() && !(this.f63418d instanceof TreeMap)) {
            this.f63418d = new TreeMap();
        }
        return (SortedMap) this.f63418d;
    }

    /* renamed from: n */
    static <FieldDescriptorType extends C14492g.C14494b<FieldDescriptorType>> C14527t<FieldDescriptorType, Object> m91080n(int i) {
        return new C14528a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public V m91081p(int i) {
        m91077f();
        V value = this.f63417c.remove(i).getValue();
        if (!this.f63418d.isEmpty()) {
            Iterator it = m91079k().entrySet().iterator();
            this.f63417c.add(new C14532c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m91077f();
        if (!this.f63417c.isEmpty()) {
            this.f63417c.clear();
        }
        if (!this.f63418d.isEmpty()) {
            this.f63418d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m91076e(comparable) >= 0 || this.f63418d.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f63420g == null) {
            this.f63420g = new C14534e(this, (C14528a) null);
        }
        return this.f63420g;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = m91076e(comparable);
        if (e >= 0) {
            return this.f63417c.get(e).getValue();
        }
        return this.f63418d.get(comparable);
    }

    /* renamed from: h */
    public Map.Entry<K, V> mo73466h(int i) {
        return this.f63417c.get(i);
    }

    /* renamed from: i */
    public int mo73467i() {
        return this.f63417c.size();
    }

    /* renamed from: j */
    public Iterable<Map.Entry<K, V>> mo73468j() {
        return this.f63418d.isEmpty() ? C14529b.m91090b() : this.f63418d.entrySet();
    }

    /* renamed from: l */
    public boolean mo73469l() {
        return this.f63419f;
    }

    /* renamed from: m */
    public void mo73470m() {
        if (!this.f63419f) {
            this.f63418d = this.f63418d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f63418d);
            this.f63419f = true;
        }
    }

    /* renamed from: o */
    public V mo73471o(K k, V v) {
        m91077f();
        int e = m91076e(k);
        if (e >= 0) {
            return this.f63417c.get(e).setValue(v);
        }
        m91078g();
        int i = -(e + 1);
        if (i >= this.f63416a) {
            return m91079k().put(k, v);
        }
        int size = this.f63417c.size();
        int i2 = this.f63416a;
        if (size == i2) {
            C14532c remove = this.f63417c.remove(i2 - 1);
            m91079k().put(remove.getKey(), remove.getValue());
        }
        this.f63417c.add(i, new C14532c(k, v));
        return null;
    }

    public V remove(Object obj) {
        m91077f();
        Comparable comparable = (Comparable) obj;
        int e = m91076e(comparable);
        if (e >= 0) {
            return m91081p(e);
        }
        if (this.f63418d.isEmpty()) {
            return null;
        }
        return this.f63418d.remove(comparable);
    }

    public int size() {
        return this.f63417c.size() + this.f63418d.size();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$d */
    /* compiled from: SmallSortedMap */
    private class C14533d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f63426a;

        /* renamed from: c */
        private boolean f63427c;

        /* renamed from: d */
        private Iterator<Map.Entry<K, V>> f63428d;

        private C14533d() {
            this.f63426a = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m91094a() {
            if (this.f63428d == null) {
                this.f63428d = C14527t.this.f63418d.entrySet().iterator();
            }
            return this.f63428d;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f63427c = true;
            int i = this.f63426a + 1;
            this.f63426a = i;
            if (i < C14527t.this.f63417c.size()) {
                return (Map.Entry) C14527t.this.f63417c.get(this.f63426a);
            }
            return (Map.Entry) m91094a().next();
        }

        public boolean hasNext() {
            return this.f63426a + 1 < C14527t.this.f63417c.size() || m91094a().hasNext();
        }

        public void remove() {
            if (this.f63427c) {
                this.f63427c = false;
                C14527t.this.m91077f();
                if (this.f63426a < C14527t.this.f63417c.size()) {
                    C14527t tVar = C14527t.this;
                    int i = this.f63426a;
                    this.f63426a = i - 1;
                    Object unused = tVar.m91081p(i);
                    return;
                }
                m91094a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C14533d(C14527t tVar, C14528a aVar) {
            this();
        }
    }

    private C14527t(int i) {
        this.f63416a = i;
        this.f63417c = Collections.emptyList();
        this.f63418d = Collections.emptyMap();
    }
}
