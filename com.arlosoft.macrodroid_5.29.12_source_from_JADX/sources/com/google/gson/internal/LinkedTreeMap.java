package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    private static final Comparator<Comparable> f55884a = new Comparator<Comparable>() {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;

    class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public void clear() {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.mo64141c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() {
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                /* renamed from: b */
                public Map.Entry<K, V> next() {
                    return mo64168a();
                }
            };
        }

        public boolean remove(Object obj) {
            Node c;
            if (!(obj instanceof Map.Entry) || (c = LinkedTreeMap.this.mo64141c((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.mo64146f(c, true);
            return true;
        }

        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        public void clear() {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() {
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                public K next() {
                    return mo64168a().f55898o;
                }
            };
        }

        public boolean remove(Object obj) {
            return LinkedTreeMap.this.mo64147g(obj) != null;
        }

        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    private abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: a */
        Node<K, V> f55889a;

        /* renamed from: c */
        Node<K, V> f55890c = null;

        /* renamed from: d */
        int f55891d;

        LinkedTreeMapIterator() {
            this.f55889a = LinkedTreeMap.this.header.f55896f;
            this.f55891d = LinkedTreeMap.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Node<K, V> mo64168a() {
            Node<K, V> node = this.f55889a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.modCount == this.f55891d) {
                this.f55889a = node.f55896f;
                this.f55890c = node;
                return node;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f55889a != LinkedTreeMap.this.header;
        }

        public final void remove() {
            Node<K, V> node = this.f55890c;
            if (node != null) {
                LinkedTreeMap.this.mo64146f(node, true);
                this.f55890c = null;
                this.f55891d = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedTreeMap> cls = LinkedTreeMap.class;
    }

    public LinkedTreeMap() {
        this(f55884a);
    }

    /* renamed from: a */
    private boolean m78486a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m78487e(Node<K, V> node, boolean z) {
        while (node != null) {
            Node<K, V> node2 = node.f55894c;
            Node<K, V> node3 = node.f55895d;
            int i = 0;
            int i2 = node2 != null ? node2.f55900s : 0;
            int i3 = node3 != null ? node3.f55900s : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node<K, V> node4 = node3.f55894c;
                Node<K, V> node5 = node3.f55895d;
                int i5 = node5 != null ? node5.f55900s : 0;
                if (node4 != null) {
                    i = node4.f55900s;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m78489i(node);
                } else {
                    m78490j(node3);
                    m78489i(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                Node<K, V> node6 = node2.f55894c;
                Node<K, V> node7 = node2.f55895d;
                int i7 = node7 != null ? node7.f55900s : 0;
                if (node6 != null) {
                    i = node6.f55900s;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m78490j(node);
                } else {
                    m78489i(node2);
                    m78490j(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                node.f55900s = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                node.f55900s = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f55893a;
        }
    }

    /* renamed from: h */
    private void m78488h(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f55893a;
        node.f55893a = null;
        if (node2 != null) {
            node2.f55893a = node3;
        }
        if (node3 == null) {
            this.root = node2;
        } else if (node3.f55894c == node) {
            node3.f55894c = node2;
        } else {
            node3.f55895d = node2;
        }
    }

    /* renamed from: i */
    private void m78489i(Node<K, V> node) {
        Node<K, V> node2 = node.f55894c;
        Node<K, V> node3 = node.f55895d;
        Node<K, V> node4 = node3.f55894c;
        Node<K, V> node5 = node3.f55895d;
        node.f55895d = node4;
        if (node4 != null) {
            node4.f55893a = node;
        }
        m78488h(node, node3);
        node3.f55894c = node;
        node.f55893a = node3;
        int i = 0;
        int max = Math.max(node2 != null ? node2.f55900s : 0, node4 != null ? node4.f55900s : 0) + 1;
        node.f55900s = max;
        if (node5 != null) {
            i = node5.f55900s;
        }
        node3.f55900s = Math.max(max, i) + 1;
    }

    /* renamed from: j */
    private void m78490j(Node<K, V> node) {
        Node<K, V> node2 = node.f55894c;
        Node<K, V> node3 = node.f55895d;
        Node<K, V> node4 = node2.f55894c;
        Node<K, V> node5 = node2.f55895d;
        node.f55894c = node5;
        if (node5 != null) {
            node5.f55893a = node;
        }
        m78488h(node, node2);
        node2.f55895d = node;
        node.f55893a = node2;
        int i = 0;
        int max = Math.max(node3 != null ? node3.f55900s : 0, node5 != null ? node5.f55900s : 0) + 1;
        node.f55900s = max;
        if (node4 != null) {
            i = node4.f55900s;
        }
        node2.f55900s = Math.max(max, i) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Node<K, V> mo64140b(K k, boolean z) {
        int i;
        Node<K, V> node;
        Comparator<? super K> comparator2 = this.comparator;
        Node<K, V> node2 = this.root;
        if (node2 != null) {
            Comparable comparable = comparator2 == f55884a ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(node2.f55898o);
                } else {
                    i = comparator2.compare(k, node2.f55898o);
                }
                if (i == 0) {
                    return node2;
                }
                Node<K, V> node3 = i < 0 ? node2.f55894c : node2.f55895d;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node4 = this.header;
        if (node2 != null) {
            node = new Node<>(node2, k, node4, node4.f55897g);
            if (i < 0) {
                node2.f55894c = node;
            } else {
                node2.f55895d = node;
            }
            m78487e(node2, true);
        } else if (comparator2 != f55884a || (k instanceof Comparable)) {
            node = new Node<>(node2, k, node4, node4.f55897g);
            this.root = node;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.size++;
        this.modCount++;
        return node;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Node<K, V> mo64141c(Map.Entry<?, ?> entry) {
        Node<K, V> d = mo64144d(entry.getKey());
        if (d != null && m78486a(d.f55899p, entry.getValue())) {
            return d;
        }
        return null;
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        Node<K, V> node = this.header;
        node.f55897g = node;
        node.f55896f = node;
    }

    public boolean containsKey(Object obj) {
        return mo64144d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Node<K, V> mo64144d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo64140b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.EntrySet entrySet2 = this.entrySet;
        if (entrySet2 != null) {
            return entrySet2;
        }
        LinkedTreeMap<K, V>.EntrySet entrySet3 = new EntrySet();
        this.entrySet = entrySet3;
        return entrySet3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo64146f(Node<K, V> node, boolean z) {
        int i;
        if (z) {
            Node<K, V> node2 = node.f55897g;
            node2.f55896f = node.f55896f;
            node.f55896f.f55897g = node2;
        }
        Node<K, V> node3 = node.f55894c;
        Node<K, V> node4 = node.f55895d;
        Node<K, V> node5 = node.f55893a;
        int i2 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                m78488h(node, node3);
                node.f55894c = null;
            } else if (node4 != null) {
                m78488h(node, node4);
                node.f55895d = null;
            } else {
                m78488h(node, (Node<K, V>) null);
            }
            m78487e(node5, false);
            this.size--;
            this.modCount++;
            return;
        }
        Node<K, V> b = node3.f55900s > node4.f55900s ? node3.mo64172b() : node4.mo64171a();
        mo64146f(b, false);
        Node<K, V> node6 = node.f55894c;
        if (node6 != null) {
            i = node6.f55900s;
            b.f55894c = node6;
            node6.f55893a = b;
            node.f55894c = null;
        } else {
            i = 0;
        }
        Node<K, V> node7 = node.f55895d;
        if (node7 != null) {
            i2 = node7.f55900s;
            b.f55895d = node7;
            node7.f55893a = b;
            node.f55895d = null;
        }
        b.f55900s = Math.max(i, i2) + 1;
        m78488h(node, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Node<K, V> mo64147g(Object obj) {
        Node<K, V> d = mo64144d(obj);
        if (d != null) {
            mo64146f(d, true);
        }
        return d;
    }

    public V get(Object obj) {
        Node d = mo64144d(obj);
        if (d != null) {
            return d.f55899p;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedTreeMap<K, V>.KeySet keySet2 = this.keySet;
        if (keySet2 != null) {
            return keySet2;
        }
        LinkedTreeMap<K, V>.KeySet keySet3 = new KeySet();
        this.keySet = keySet3;
        return keySet3;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        Node b = mo64140b(k, true);
        V v2 = b.f55899p;
        b.f55899p = v;
        return v2;
    }

    public V remove(Object obj) {
        Node g = mo64147g(obj);
        if (g != null) {
            return g.f55899p;
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public LinkedTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.header = new Node<>();
        this.comparator = comparator2 == null ? f55884a : comparator2;
    }

    static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        Node<K, V> f55893a;

        /* renamed from: c */
        Node<K, V> f55894c;

        /* renamed from: d */
        Node<K, V> f55895d;

        /* renamed from: f */
        Node<K, V> f55896f;

        /* renamed from: g */
        Node<K, V> f55897g;

        /* renamed from: o */
        final K f55898o;

        /* renamed from: p */
        V f55899p;

        /* renamed from: s */
        int f55900s;

        Node() {
            this.f55898o = null;
            this.f55897g = this;
            this.f55896f = this;
        }

        /* renamed from: a */
        public Node<K, V> mo64171a() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f55894c; node2 != null; node2 = node2.f55894c) {
                node = node2;
            }
            return node;
        }

        /* renamed from: b */
        public Node<K, V> mo64172b() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f55895d; node2 != null; node2 = node2.f55895d) {
                node = node2;
            }
            return node;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f55898o
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f55899p
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.Node.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f55898o;
        }

        public V getValue() {
            return this.f55899p;
        }

        public int hashCode() {
            K k = this.f55898o;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f55899p;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f55899p;
            this.f55899p = v;
            return v2;
        }

        public String toString() {
            return this.f55898o + "=" + this.f55899p;
        }

        Node(Node<K, V> node, K k, Node<K, V> node2, Node<K, V> node3) {
            this.f55893a = node;
            this.f55898o = k;
            this.f55900s = 1;
            this.f55896f = node2;
            this.f55897g = node3;
            node3.f55896f = this;
            node2.f55897g = this;
        }
    }
}
