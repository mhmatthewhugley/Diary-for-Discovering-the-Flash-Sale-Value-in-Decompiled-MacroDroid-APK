package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    private static final Comparator<Comparable> f55861a = new Comparator<Comparable>() {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedHashTreeMap<K, V>.KeySet keySet;
    int modCount;
    int size;
    Node<K, V>[] table;
    int threshold;

    static final class AvlBuilder<K, V> {

        /* renamed from: a */
        private Node<K, V> f55862a;

        /* renamed from: b */
        private int f55863b;

        /* renamed from: c */
        private int f55864c;

        /* renamed from: d */
        private int f55865d;

        AvlBuilder() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo64111a(Node<K, V> node) {
            node.f55877d = null;
            node.f55875a = null;
            node.f55876c = null;
            node.f55883z = 1;
            int i = this.f55863b;
            if (i > 0) {
                int i2 = this.f55865d;
                if ((i2 & 1) == 0) {
                    this.f55865d = i2 + 1;
                    this.f55863b = i - 1;
                    this.f55864c++;
                }
            }
            node.f55875a = this.f55862a;
            this.f55862a = node;
            int i3 = this.f55865d + 1;
            this.f55865d = i3;
            int i4 = this.f55863b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f55865d = i3 + 1;
                this.f55863b = i4 - 1;
                this.f55864c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f55865d & i6) == i6) {
                    int i7 = this.f55864c;
                    if (i7 == 0) {
                        Node<K, V> node2 = this.f55862a;
                        Node<K, V> node3 = node2.f55875a;
                        Node<K, V> node4 = node3.f55875a;
                        node3.f55875a = node4.f55875a;
                        this.f55862a = node3;
                        node3.f55876c = node4;
                        node3.f55877d = node2;
                        node3.f55883z = node2.f55883z + 1;
                        node4.f55875a = node3;
                        node2.f55875a = node3;
                    } else if (i7 == 1) {
                        Node<K, V> node5 = this.f55862a;
                        Node<K, V> node6 = node5.f55875a;
                        this.f55862a = node6;
                        node6.f55877d = node5;
                        node6.f55883z = node5.f55883z + 1;
                        node5.f55875a = node6;
                        this.f55864c = 0;
                    } else if (i7 == 2) {
                        this.f55864c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo64112b(int i) {
            this.f55863b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f55865d = 0;
            this.f55864c = 0;
            this.f55862a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Node<K, V> mo64113c() {
            Node<K, V> node = this.f55862a;
            if (node.f55875a == null) {
                return node;
            }
            throw new IllegalStateException();
        }
    }

    static class AvlIterator<K, V> {

        /* renamed from: a */
        private Node<K, V> f55866a;

        AvlIterator() {
        }

        /* renamed from: a */
        public Node<K, V> mo64114a() {
            Node<K, V> node = this.f55866a;
            if (node == null) {
                return null;
            }
            Node<K, V> node2 = node.f55875a;
            node.f55875a = null;
            Node<K, V> node3 = node.f55877d;
            while (true) {
                Node<K, V> node4 = node2;
                node2 = node3;
                Node<K, V> node5 = node4;
                if (node2 != null) {
                    node2.f55875a = node5;
                    node3 = node2.f55876c;
                } else {
                    this.f55866a = node5;
                    return node;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo64115b(Node<K, V> node) {
            Node<K, V> node2 = null;
            while (node != null) {
                node.f55875a = node2;
                node2 = node;
                node = node.f55876c;
            }
            this.f55866a = node2;
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.mo64099e((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() {
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                /* renamed from: b */
                public Map.Entry<K, V> next() {
                    return mo64129a();
                }
            };
        }

        public boolean remove(Object obj) {
            Node e;
            if (!(obj instanceof Map.Entry) || (e = LinkedHashTreeMap.this.mo64099e((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.mo64103h(e, true);
            return true;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() {
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                public K next() {
                    return mo64129a().f55880o;
                }
            };
        }

        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.mo64104i(obj) != null;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    private abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: a */
        Node<K, V> f55871a;

        /* renamed from: c */
        Node<K, V> f55872c = null;

        /* renamed from: d */
        int f55873d;

        LinkedTreeMapIterator() {
            this.f55871a = LinkedHashTreeMap.this.header.f55878f;
            this.f55873d = LinkedHashTreeMap.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Node<K, V> mo64129a() {
            Node<K, V> node = this.f55871a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f55873d) {
                this.f55871a = node.f55878f;
                this.f55872c = node;
                return node;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f55871a != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            Node<K, V> node = this.f55872c;
            if (node != null) {
                LinkedHashTreeMap.this.mo64103h(node, true);
                this.f55872c = null;
                this.f55873d = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedHashTreeMap> cls = LinkedHashTreeMap.class;
    }

    public LinkedHashTreeMap() {
        this(f55861a);
    }

    /* renamed from: a */
    private void m78463a() {
        Node<K, V>[] b = m78464b(this.table);
        this.table = b;
        this.threshold = (b.length / 2) + (b.length / 4);
    }

    /* renamed from: b */
    static <K, V> Node<K, V>[] m78464b(Node<K, V>[] nodeArr) {
        int length = nodeArr.length;
        Node<K, V>[] nodeArr2 = new Node[(length * 2)];
        AvlIterator avlIterator = new AvlIterator();
        AvlBuilder avlBuilder = new AvlBuilder();
        AvlBuilder avlBuilder2 = new AvlBuilder();
        for (int i = 0; i < length; i++) {
            Node<K, V> node = nodeArr[i];
            if (node != null) {
                avlIterator.mo64115b(node);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Node a = avlIterator.mo64114a();
                    if (a == null) {
                        break;
                    } else if ((a.f55881p & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                avlBuilder.mo64112b(i2);
                avlBuilder2.mo64112b(i3);
                avlIterator.mo64115b(node);
                while (true) {
                    Node a2 = avlIterator.mo64114a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f55881p & length) == 0) {
                        avlBuilder.mo64111a(a2);
                    } else {
                        avlBuilder2.mo64111a(a2);
                    }
                }
                Node<K, V> node2 = null;
                nodeArr2[i] = i2 > 0 ? avlBuilder.mo64113c() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    node2 = avlBuilder2.mo64113c();
                }
                nodeArr2[i4] = node2;
            }
        }
        return nodeArr2;
    }

    /* renamed from: c */
    private boolean m78465c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    private void m78466g(Node<K, V> node, boolean z) {
        while (node != null) {
            Node<K, V> node2 = node.f55876c;
            Node<K, V> node3 = node.f55877d;
            int i = 0;
            int i2 = node2 != null ? node2.f55883z : 0;
            int i3 = node3 != null ? node3.f55883z : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node<K, V> node4 = node3.f55876c;
                Node<K, V> node5 = node3.f55877d;
                int i5 = node5 != null ? node5.f55883z : 0;
                if (node4 != null) {
                    i = node4.f55883z;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m78468k(node);
                } else {
                    m78469l(node3);
                    m78468k(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                Node<K, V> node6 = node2.f55876c;
                Node<K, V> node7 = node2.f55877d;
                int i7 = node7 != null ? node7.f55883z : 0;
                if (node6 != null) {
                    i = node6.f55883z;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m78469l(node);
                } else {
                    m78468k(node2);
                    m78469l(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                node.f55883z = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                node.f55883z = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f55875a;
        }
    }

    /* renamed from: j */
    private void m78467j(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f55875a;
        node.f55875a = null;
        if (node2 != null) {
            node2.f55875a = node3;
        }
        if (node3 == null) {
            int i = node.f55881p;
            Node<K, V>[] nodeArr = this.table;
            nodeArr[i & (nodeArr.length - 1)] = node2;
        } else if (node3.f55876c == node) {
            node3.f55876c = node2;
        } else {
            node3.f55877d = node2;
        }
    }

    /* renamed from: k */
    private void m78468k(Node<K, V> node) {
        Node<K, V> node2 = node.f55876c;
        Node<K, V> node3 = node.f55877d;
        Node<K, V> node4 = node3.f55876c;
        Node<K, V> node5 = node3.f55877d;
        node.f55877d = node4;
        if (node4 != null) {
            node4.f55875a = node;
        }
        m78467j(node, node3);
        node3.f55876c = node;
        node.f55875a = node3;
        int i = 0;
        int max = Math.max(node2 != null ? node2.f55883z : 0, node4 != null ? node4.f55883z : 0) + 1;
        node.f55883z = max;
        if (node5 != null) {
            i = node5.f55883z;
        }
        node3.f55883z = Math.max(max, i) + 1;
    }

    /* renamed from: l */
    private void m78469l(Node<K, V> node) {
        Node<K, V> node2 = node.f55876c;
        Node<K, V> node3 = node.f55877d;
        Node<K, V> node4 = node2.f55876c;
        Node<K, V> node5 = node2.f55877d;
        node.f55876c = node5;
        if (node5 != null) {
            node5.f55875a = node;
        }
        m78467j(node, node2);
        node2.f55877d = node;
        node.f55875a = node2;
        int i = 0;
        int max = Math.max(node3 != null ? node3.f55883z : 0, node5 != null ? node5.f55883z : 0) + 1;
        node.f55883z = max;
        if (node4 != null) {
            i = node4.f55883z;
        }
        node2.f55883z = Math.max(max, i) + 1;
    }

    /* renamed from: m */
    private static int m78470m(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        Node<K, V> node = this.header;
        Node<K, V> node2 = node.f55878f;
        while (node2 != node) {
            Node<K, V> node3 = node2.f55878f;
            node2.f55879g = null;
            node2.f55878f = null;
            node2 = node3;
        }
        node.f55879g = node;
        node.f55878f = node;
    }

    public boolean containsKey(Object obj) {
        return mo64101f(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Node<K, V> mo64098d(K k, boolean z) {
        int i;
        Node<K, V> node;
        Node<K, V> node2;
        int i2;
        Comparator<? super K> comparator2 = this.comparator;
        Node<K, V>[] nodeArr = this.table;
        int m = m78470m(k.hashCode());
        int length = (nodeArr.length - 1) & m;
        Node<K, V> node3 = nodeArr[length];
        if (node3 != null) {
            Comparable comparable = comparator2 == f55861a ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(node3.f55880o);
                } else {
                    i2 = comparator2.compare(k, node3.f55880o);
                }
                if (i2 == 0) {
                    return node3;
                }
                Node<K, V> node4 = i2 < 0 ? node3.f55876c : node3.f55877d;
                if (node4 == null) {
                    node = node3;
                    i = i2;
                    break;
                }
                node3 = node4;
            }
        } else {
            node = node3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node5 = this.header;
        if (node != null) {
            node2 = new Node<>(node, k, m, node5, node5.f55879g);
            if (i < 0) {
                node.f55876c = node2;
            } else {
                node.f55877d = node2;
            }
            m78466g(node, true);
        } else if (comparator2 != f55861a || (k instanceof Comparable)) {
            node2 = new Node<>(node, k, m, node5, node5.f55879g);
            nodeArr[length] = node2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            m78463a();
        }
        this.modCount++;
        return node2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Node<K, V> mo64099e(Map.Entry<?, ?> entry) {
        Node<K, V> f = mo64101f(entry.getKey());
        if (f != null && m78465c(f.f55882s, entry.getValue())) {
            return f;
        }
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.EntrySet entrySet2 = this.entrySet;
        if (entrySet2 != null) {
            return entrySet2;
        }
        LinkedHashTreeMap<K, V>.EntrySet entrySet3 = new EntrySet();
        this.entrySet = entrySet3;
        return entrySet3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Node<K, V> mo64101f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo64098d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        Node f = mo64101f(obj);
        if (f != null) {
            return f.f55882s;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo64103h(Node<K, V> node, boolean z) {
        int i;
        if (z) {
            Node<K, V> node2 = node.f55879g;
            node2.f55878f = node.f55878f;
            node.f55878f.f55879g = node2;
            node.f55879g = null;
            node.f55878f = null;
        }
        Node<K, V> node3 = node.f55876c;
        Node<K, V> node4 = node.f55877d;
        Node<K, V> node5 = node.f55875a;
        int i2 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                m78467j(node, node3);
                node.f55876c = null;
            } else if (node4 != null) {
                m78467j(node, node4);
                node.f55877d = null;
            } else {
                m78467j(node, (Node<K, V>) null);
            }
            m78466g(node5, false);
            this.size--;
            this.modCount++;
            return;
        }
        Node<K, V> b = node3.f55883z > node4.f55883z ? node3.mo64133b() : node4.mo64132a();
        mo64103h(b, false);
        Node<K, V> node6 = node.f55876c;
        if (node6 != null) {
            i = node6.f55883z;
            b.f55876c = node6;
            node6.f55875a = b;
            node.f55876c = null;
        } else {
            i = 0;
        }
        Node<K, V> node7 = node.f55877d;
        if (node7 != null) {
            i2 = node7.f55883z;
            b.f55877d = node7;
            node7.f55875a = b;
            node.f55877d = null;
        }
        b.f55883z = Math.max(i, i2) + 1;
        m78467j(node, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Node<K, V> mo64104i(Object obj) {
        Node<K, V> f = mo64101f(obj);
        if (f != null) {
            mo64103h(f, true);
        }
        return f;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.KeySet keySet2 = this.keySet;
        if (keySet2 != null) {
            return keySet2;
        }
        LinkedHashTreeMap<K, V>.KeySet keySet3 = new KeySet();
        this.keySet = keySet3;
        return keySet3;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        Node d = mo64098d(k, true);
        V v2 = d.f55882s;
        d.f55882s = v;
        return v2;
    }

    public V remove(Object obj) {
        Node i = mo64104i(obj);
        if (i != null) {
            return i.f55882s;
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? f55861a : comparator2;
        this.header = new Node<>();
        Node<K, V>[] nodeArr = new Node[16];
        this.table = nodeArr;
        this.threshold = (nodeArr.length / 2) + (nodeArr.length / 4);
    }

    static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        Node<K, V> f55875a;

        /* renamed from: c */
        Node<K, V> f55876c;

        /* renamed from: d */
        Node<K, V> f55877d;

        /* renamed from: f */
        Node<K, V> f55878f;

        /* renamed from: g */
        Node<K, V> f55879g;

        /* renamed from: o */
        final K f55880o;

        /* renamed from: p */
        final int f55881p;

        /* renamed from: s */
        V f55882s;

        /* renamed from: z */
        int f55883z;

        Node() {
            this.f55880o = null;
            this.f55881p = -1;
            this.f55879g = this;
            this.f55878f = this;
        }

        /* renamed from: a */
        public Node<K, V> mo64132a() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f55876c; node2 != null; node2 = node2.f55876c) {
                node = node2;
            }
            return node;
        }

        /* renamed from: b */
        public Node<K, V> mo64133b() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f55877d; node2 != null; node2 = node2.f55877d) {
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
                K r0 = r3.f55880o
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f55882s
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.Node.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f55880o;
        }

        public V getValue() {
            return this.f55882s;
        }

        public int hashCode() {
            K k = this.f55880o;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f55882s;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f55882s;
            this.f55882s = v;
            return v2;
        }

        public String toString() {
            return this.f55880o + "=" + this.f55882s;
        }

        Node(Node<K, V> node, K k, int i, Node<K, V> node2, Node<K, V> node3) {
            this.f55875a = node;
            this.f55880o = k;
            this.f55881p = i;
            this.f55883z = 1;
            this.f55878f = node2;
            this.f55879g = node3;
            node3.f55878f = this;
            node2.f55879g = this;
        }
    }
}
