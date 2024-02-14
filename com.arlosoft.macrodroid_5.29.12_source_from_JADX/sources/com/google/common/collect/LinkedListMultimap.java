package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public transient int f16808A;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public transient Node<K, V> f16809o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient Node<K, V> f16810p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public transient Map<K, KeyList<K, V>> f16811s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public transient int f16812z;

    private class DistinctKeyIterator implements Iterator<K> {

        /* renamed from: a */
        final Set<K> f16819a;

        /* renamed from: c */
        Node<K, V> f16820c;

        /* renamed from: d */
        Node<K, V> f16821d;

        /* renamed from: f */
        int f16822f;

        private DistinctKeyIterator() {
            this.f16819a = Sets.m28726i(LinkedListMultimap.this.keySet().size());
            this.f16820c = LinkedListMultimap.this.f16809o;
            this.f16822f = LinkedListMultimap.this.f16808A;
        }

        /* renamed from: a */
        private void m27817a() {
            if (LinkedListMultimap.this.f16808A != this.f16822f) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            m27817a();
            return this.f16820c != null;
        }

        @ParametricNullness
        public K next() {
            Node<K, V> node;
            m27817a();
            Node<K, V> node2 = this.f16820c;
            if (node2 != null) {
                this.f16821d = node2;
                this.f16819a.add(node2.f16827a);
                do {
                    node = this.f16820c.f16829d;
                    this.f16820c = node;
                    if (node == null || this.f16819a.add(node.f16827a)) {
                    }
                    node = this.f16820c.f16829d;
                    this.f16820c = node;
                    break;
                } while (this.f16819a.add(node.f16827a));
                return this.f16821d.f16827a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m27817a();
            Preconditions.m5399z(this.f16821d != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.m27788D(this.f16821d.f16827a);
            this.f16821d = null;
            this.f16822f = LinkedListMultimap.this.f16808A;
        }
    }

    private static class KeyList<K, V> {

        /* renamed from: a */
        Node<K, V> f16824a;

        /* renamed from: b */
        Node<K, V> f16825b;

        /* renamed from: c */
        int f16826c = 1;

        KeyList(Node<K, V> node) {
            this.f16824a = node;
            this.f16825b = node;
            node.f16832o = null;
            node.f16831g = null;
        }
    }

    private static final class Node<K, V> extends AbstractMapEntry<K, V> {
        @ParametricNullness

        /* renamed from: a */
        final K f16827a;
        @ParametricNullness

        /* renamed from: c */
        V f16828c;

        /* renamed from: d */
        Node<K, V> f16829d;

        /* renamed from: f */
        Node<K, V> f16830f;

        /* renamed from: g */
        Node<K, V> f16831g;

        /* renamed from: o */
        Node<K, V> f16832o;

        Node(@ParametricNullness K k, @ParametricNullness V v) {
            this.f16827a = k;
            this.f16828c = v;
        }

        @ParametricNullness
        public K getKey() {
            return this.f16827a;
        }

        @ParametricNullness
        public V getValue() {
            return this.f16828c;
        }

        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            V v2 = this.f16828c;
            this.f16828c = v;
            return v2;
        }
    }

    private class NodeIterator implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: a */
        int f16833a;

        /* renamed from: c */
        Node<K, V> f16834c;

        /* renamed from: d */
        Node<K, V> f16835d;

        /* renamed from: f */
        Node<K, V> f16836f;

        /* renamed from: g */
        int f16837g;

        NodeIterator(int i) {
            this.f16837g = LinkedListMultimap.this.f16808A;
            int size = LinkedListMultimap.this.size();
            Preconditions.m5395v(i, size);
            if (i < size / 2) {
                this.f16834c = LinkedListMultimap.this.f16809o;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.f16836f = LinkedListMultimap.this.f16810p;
                this.f16833a = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.f16835d = null;
        }

        /* renamed from: b */
        private void m27818b() {
            if (LinkedListMultimap.this.f16808A != this.f16837g) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: a */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Node<K, V> next() {
            m27818b();
            Node<K, V> node = this.f16834c;
            if (node != null) {
                this.f16835d = node;
                this.f16836f = node;
                this.f16834c = node.f16829d;
                this.f16833a++;
                return node;
            }
            throw new NoSuchElementException();
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Node<K, V> previous() {
            m27818b();
            Node<K, V> node = this.f16836f;
            if (node != null) {
                this.f16835d = node;
                this.f16834c = node;
                this.f16836f = node.f16830f;
                this.f16833a--;
                return node;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: e */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo35701g(@ParametricNullness V v) {
            Preconditions.m5398y(this.f16835d != null);
            this.f16835d.f16828c = v;
        }

        public boolean hasNext() {
            m27818b();
            return this.f16834c != null;
        }

        public boolean hasPrevious() {
            m27818b();
            return this.f16836f != null;
        }

        public int nextIndex() {
            return this.f16833a;
        }

        public int previousIndex() {
            return this.f16833a - 1;
        }

        public void remove() {
            m27818b();
            Preconditions.m5399z(this.f16835d != null, "no calls to next() since the last call to remove()");
            Node<K, V> node = this.f16835d;
            if (node != this.f16834c) {
                this.f16836f = node.f16830f;
                this.f16833a--;
            } else {
                this.f16834c = node.f16829d;
            }
            LinkedListMultimap.this.m27789E(node);
            this.f16835d = null;
            this.f16837g = LinkedListMultimap.this.f16808A;
        }
    }

    LinkedListMultimap() {
        this(12);
    }

    /* renamed from: C */
    private List<V> m27787C(@ParametricNullness K k) {
        return Collections.unmodifiableList(Lists.m27834j(new ValueForKeyIterator(k)));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m27788D(@ParametricNullness K k) {
        Iterators.m27709e(new ValueForKeyIterator(k));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m27789E(Node<K, V> node) {
        Node<K, V> node2 = node.f16830f;
        if (node2 != null) {
            node2.f16829d = node.f16829d;
        } else {
            this.f16809o = node.f16829d;
        }
        Node<K, V> node3 = node.f16829d;
        if (node3 != null) {
            node3.f16830f = node2;
        } else {
            this.f16810p = node2;
        }
        if (node.f16832o == null && node.f16831g == null) {
            KeyList remove = this.f16811s.remove(node.f16827a);
            Objects.requireNonNull(remove);
            remove.f16826c = 0;
            this.f16808A++;
        } else {
            KeyList keyList = this.f16811s.get(node.f16827a);
            Objects.requireNonNull(keyList);
            keyList.f16826c--;
            Node<K, V> node4 = node.f16832o;
            if (node4 == null) {
                Node<K, V> node5 = node.f16831g;
                Objects.requireNonNull(node5);
                Node node6 = node5;
                keyList.f16824a = node5;
            } else {
                node4.f16831g = node.f16831g;
            }
            Node<K, V> node7 = node.f16831g;
            if (node7 == null) {
                Node<K, V> node8 = node.f16832o;
                Objects.requireNonNull(node8);
                Node node9 = node8;
                keyList.f16825b = node8;
            } else {
                node7.f16832o = node.f16832o;
            }
        }
        this.f16812z--;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f16811s = CompactLinkedHashMap.m26658e0();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : mo34445i()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* renamed from: y */
    public Node<K, V> m27798y(@ParametricNullness K k, @ParametricNullness V v, Node<K, V> node) {
        Node<K, V> node2 = new Node<>(k, v);
        if (this.f16809o == null) {
            this.f16810p = node2;
            this.f16809o = node2;
            this.f16811s.put(k, new KeyList(node2));
            this.f16808A++;
        } else if (node == null) {
            Node<K, V> node3 = this.f16810p;
            Objects.requireNonNull(node3);
            Node node4 = node3;
            node3.f16829d = node2;
            node2.f16830f = this.f16810p;
            this.f16810p = node2;
            KeyList keyList = this.f16811s.get(k);
            if (keyList == null) {
                this.f16811s.put(k, new KeyList(node2));
                this.f16808A++;
            } else {
                keyList.f16826c++;
                Node<K, V> node5 = keyList.f16825b;
                node5.f16831g = node2;
                node2.f16832o = node5;
                keyList.f16825b = node2;
            }
        } else {
            KeyList keyList2 = this.f16811s.get(k);
            Objects.requireNonNull(keyList2);
            keyList2.f16826c++;
            node2.f16830f = node.f16830f;
            node2.f16832o = node.f16832o;
            node2.f16829d = node;
            node2.f16831g = node;
            Node<K, V> node6 = node.f16832o;
            if (node6 == null) {
                keyList2.f16824a = node2;
            } else {
                node6.f16831g = node2;
            }
            Node<K, V> node7 = node.f16830f;
            if (node7 == null) {
                this.f16809o = node2;
            } else {
                node7.f16829d = node2;
            }
            node.f16830f = node2;
            node.f16832o = node2;
        }
        this.f16812z++;
        return node2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public List<V> mo34442f() {
        return new AbstractSequentialList<V>() {
            public ListIterator<V> listIterator(int i) {
                final NodeIterator nodeIterator = new NodeIterator(i);
                return new TransformedListIterator<Map.Entry<K, V>, V>(this, nodeIterator) {
                    /* access modifiers changed from: package-private */
                    @ParametricNullness
                    /* renamed from: c */
                    public V mo34726a(Map.Entry<K, V> entry) {
                        return entry.getValue();
                    }

                    public void set(@ParametricNullness V v) {
                        nodeIterator.mo35701g(v);
                    }
                };
            }

            public int size() {
                return LinkedListMultimap.this.f16812z;
            }
        };
    }

    /* renamed from: B */
    public List<Map.Entry<K, V>> mo34445i() {
        return (List) super.mo34445i();
    }

    /* renamed from: F */
    public List<V> mo35679F() {
        return (List) super.mo34629j();
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ boolean mo34625P(Object obj, Object obj2) {
        return super.mo34625P(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<K, Collection<V>> mo34436a() {
        return new Multimaps.AsMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<K> mo34438c() {
        return new Sets.ImprovedAbstractSet<K>() {
            public boolean contains(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            public Iterator<K> iterator() {
                return new DistinctKeyIterator();
            }

            public boolean remove(Object obj) {
                return !LinkedListMultimap.this.mo34426d(obj).isEmpty();
            }

            public int size() {
                return LinkedListMultimap.this.f16811s.size();
            }
        };
    }

    public void clear() {
        this.f16809o = null;
        this.f16810p = null;
        this.f16811s.clear();
        this.f16812z = 0;
        this.f16808A++;
    }

    public boolean containsKey(Object obj) {
        return this.f16811s.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo35679F().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Multiset<K> mo34441e() {
        return new Multimaps.Keys(this);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<K, V>> mo34443g() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.f16809o == null;
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ Multiset mo34630k() {
        return super.mo34630k();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        m27798y(k, v, (Node) null);
        return true;
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public int size() {
        return this.f16812z;
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
    public List<Map.Entry<K, V>> mo34437b() {
        return new AbstractSequentialList<Map.Entry<K, V>>() {
            public ListIterator<Map.Entry<K, V>> listIterator(int i) {
                return new NodeIterator(i);
            }

            public int size() {
                return LinkedListMultimap.this.f16812z;
            }
        };
    }

    private LinkedListMultimap(int i) {
        this.f16811s = Platform.m28534c(i);
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public List<V> m27807d(Object obj) {
        List<V> C = m27787C(obj);
        m27788D(obj);
        return C;
    }

    public List<V> get(@ParametricNullness final K k) {
        return new AbstractSequentialList<V>() {
            public ListIterator<V> listIterator(int i) {
                return new ValueForKeyIterator(k, i);
            }

            public int size() {
                KeyList keyList = (KeyList) LinkedListMultimap.this.f16811s.get(k);
                if (keyList == null) {
                    return 0;
                }
                return keyList.f16826c;
            }
        };
    }

    private class ValueForKeyIterator implements ListIterator<V> {
        @ParametricNullness

        /* renamed from: a */
        final K f16839a;

        /* renamed from: c */
        int f16840c;

        /* renamed from: d */
        Node<K, V> f16841d;

        /* renamed from: f */
        Node<K, V> f16842f;

        /* renamed from: g */
        Node<K, V> f16843g;

        ValueForKeyIterator(@ParametricNullness K k) {
            Node<K, V> node;
            this.f16839a = k;
            KeyList keyList = (KeyList) LinkedListMultimap.this.f16811s.get(k);
            if (keyList == null) {
                node = null;
            } else {
                node = keyList.f16824a;
            }
            this.f16841d = node;
        }

        public void add(@ParametricNullness V v) {
            this.f16843g = LinkedListMultimap.this.m27798y(this.f16839a, v, this.f16841d);
            this.f16840c++;
            this.f16842f = null;
        }

        public boolean hasNext() {
            return this.f16841d != null;
        }

        public boolean hasPrevious() {
            return this.f16843g != null;
        }

        @ParametricNullness
        @CanIgnoreReturnValue
        public V next() {
            Node<K, V> node = this.f16841d;
            if (node != null) {
                this.f16842f = node;
                this.f16843g = node;
                this.f16841d = node.f16831g;
                this.f16840c++;
                return node.f16828c;
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f16840c;
        }

        @ParametricNullness
        @CanIgnoreReturnValue
        public V previous() {
            Node<K, V> node = this.f16843g;
            if (node != null) {
                this.f16842f = node;
                this.f16841d = node;
                this.f16843g = node.f16832o;
                this.f16840c--;
                return node.f16828c;
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f16840c - 1;
        }

        public void remove() {
            Preconditions.m5399z(this.f16842f != null, "no calls to next() since the last call to remove()");
            Node<K, V> node = this.f16842f;
            if (node != this.f16841d) {
                this.f16843g = node.f16832o;
                this.f16840c--;
            } else {
                this.f16841d = node.f16831g;
            }
            LinkedListMultimap.this.m27789E(node);
            this.f16842f = null;
        }

        public void set(@ParametricNullness V v) {
            Preconditions.m5398y(this.f16842f != null);
            this.f16842f.f16828c = v;
        }

        public ValueForKeyIterator(@ParametricNullness K k, int i) {
            int i2;
            Node<K, V> node;
            Node<K, V> node2;
            KeyList keyList = (KeyList) LinkedListMultimap.this.f16811s.get(k);
            if (keyList == null) {
                i2 = 0;
            } else {
                i2 = keyList.f16826c;
            }
            Preconditions.m5395v(i, i2);
            if (i < i2 / 2) {
                if (keyList == null) {
                    node = null;
                } else {
                    node = keyList.f16824a;
                }
                this.f16841d = node;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                if (keyList == null) {
                    node2 = null;
                } else {
                    node2 = keyList.f16825b;
                }
                this.f16843g = node2;
                this.f16840c = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f16839a = k;
            this.f16842f = null;
        }
    }
}
