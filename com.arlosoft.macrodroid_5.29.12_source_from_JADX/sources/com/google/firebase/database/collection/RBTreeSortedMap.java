package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class RBTreeSortedMap<K, V> extends ImmutableSortedMap<K, V> {

    /* renamed from: a */
    private LLRBNode<K, V> f5547a;

    /* renamed from: c */
    private Comparator<K> f5548c;

    /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
    private static class Builder<A, B, C> {

        /* renamed from: a */
        private final List<A> f5549a;

        /* renamed from: b */
        private final Map<B, C> f5550b;

        /* renamed from: c */
        private final ImmutableSortedMap.Builder.KeyTranslator<A, B> f5551c;

        /* renamed from: d */
        private LLRBValueNode<A, C> f5552d;

        /* renamed from: e */
        private LLRBValueNode<A, C> f5553e;

        /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
        static class Base1_2 implements Iterable<BooleanChunk> {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public long f5554a;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final int f5555c;

            public Base1_2(int i) {
                int i2 = i + 1;
                int floor = (int) Math.floor(Math.log((double) i2) / Math.log(2.0d));
                this.f5555c = floor;
                this.f5554a = (((long) Math.pow(2.0d, (double) floor)) - 1) & ((long) i2);
            }

            public Iterator<BooleanChunk> iterator() {
                return new Iterator<BooleanChunk>() {

                    /* renamed from: a */
                    private int f5556a;

                    {
                        this.f5556a = Base1_2.this.f5555c - 1;
                    }

                    /* renamed from: a */
                    public BooleanChunk next() {
                        BooleanChunk booleanChunk = new BooleanChunk();
                        booleanChunk.f5558a = (Base1_2.this.f5554a & ((long) (1 << this.f5556a))) == 0;
                        booleanChunk.f5559b = (int) Math.pow(2.0d, (double) this.f5556a);
                        this.f5556a--;
                        return booleanChunk;
                    }

                    public boolean hasNext() {
                        return this.f5556a >= 0;
                    }

                    public void remove() {
                    }
                };
            }
        }

        /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
        static class BooleanChunk {

            /* renamed from: a */
            public boolean f5558a;

            /* renamed from: b */
            public int f5559b;

            BooleanChunk() {
            }
        }

        private Builder(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator) {
            this.f5549a = list;
            this.f5550b = map;
            this.f5551c = keyTranslator;
        }

        /* renamed from: a */
        private LLRBNode<A, C> m7719a(int i, int i2) {
            if (i2 == 0) {
                return LLRBEmptyNode.m7669i();
            }
            if (i2 == 1) {
                A a = this.f5549a.get(i);
                return new LLRBBlackValueNode(a, m7722d(a), (LLRBNode) null, (LLRBNode) null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            LLRBNode a2 = m7719a(i, i3);
            LLRBNode a3 = m7719a(i4 + 1, i3);
            A a4 = this.f5549a.get(i4);
            return new LLRBBlackValueNode(a4, m7722d(a4), a2, a3);
        }

        /* renamed from: b */
        public static <A, B, C> RBTreeSortedMap<A, C> m7720b(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
            Builder builder = new Builder(list, map, keyTranslator);
            Collections.sort(list, comparator);
            Iterator<BooleanChunk> it = new Base1_2(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                BooleanChunk next = it.next();
                int i = next.f5559b;
                size -= i;
                if (next.f5558a) {
                    builder.m7721c(LLRBNode.Color.BLACK, i, size);
                } else {
                    builder.m7721c(LLRBNode.Color.BLACK, i, size);
                    int i2 = next.f5559b;
                    size -= i2;
                    builder.m7721c(LLRBNode.Color.RED, i2, size);
                }
            }
            LLRBNode lLRBNode = builder.f5552d;
            if (lLRBNode == null) {
                lLRBNode = LLRBEmptyNode.m7669i();
            }
            return new RBTreeSortedMap<>(lLRBNode, comparator);
        }

        /* renamed from: c */
        private void m7721c(LLRBNode.Color color, int i, int i2) {
            LLRBValueNode<A, C> lLRBValueNode;
            LLRBNode a = m7719a(i2 + 1, i - 1);
            A a2 = this.f5549a.get(i2);
            if (color == LLRBNode.Color.RED) {
                lLRBValueNode = new LLRBRedValueNode<>(a2, m7722d(a2), (LLRBNode) null, a);
            } else {
                lLRBValueNode = new LLRBBlackValueNode<>(a2, m7722d(a2), (LLRBNode) null, a);
            }
            if (this.f5552d == null) {
                this.f5552d = lLRBValueNode;
                this.f5553e = lLRBValueNode;
                return;
            }
            this.f5553e.mo23575t(lLRBValueNode);
            this.f5553e = lLRBValueNode;
        }

        /* renamed from: d */
        private C m7722d(A a) {
            return this.f5550b.get(this.f5551c.mo23551a(a));
        }
    }

    /* renamed from: m */
    public static <A, B, C> RBTreeSortedMap<A, C> m7708m(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        return Builder.m7720b(list, map, keyTranslator, comparator);
    }

    /* renamed from: n */
    public static <A, B> RBTreeSortedMap<A, B> m7709n(Map<A, B> map, Comparator<A> comparator) {
        return Builder.m7720b(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.m7653c(), comparator);
    }

    /* renamed from: o */
    private LLRBNode<K, V> m7710o(K k) {
        LLRBNode<K, V> lLRBNode = this.f5547a;
        while (!lLRBNode.isEmpty()) {
            int compare = this.f5548c.compare(k, lLRBNode.getKey());
            if (compare < 0) {
                lLRBNode = lLRBNode.mo23576a();
            } else if (compare == 0) {
                return lLRBNode;
            } else {
                lLRBNode = lLRBNode.mo23579e();
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo23533c(K k) {
        return m7710o(k) != null;
    }

    /* renamed from: d */
    public V mo23534d(K k) {
        LLRBNode o = m7710o(k);
        if (o != null) {
            return o.getValue();
        }
        return null;
    }

    /* renamed from: f */
    public Comparator<K> mo23535f() {
        return this.f5548c;
    }

    /* renamed from: h */
    public K mo23536h() {
        return this.f5547a.mo23584h().getKey();
    }

    /* renamed from: i */
    public K mo23537i() {
        return this.f5547a.mo23581g().getKey();
    }

    public boolean isEmpty() {
        return this.f5547a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new ImmutableSortedMapIterator(this.f5547a, null, this.f5548c, false);
    }

    /* renamed from: j */
    public ImmutableSortedMap<K, V> mo23540j(K k, V v) {
        return new RBTreeSortedMap(this.f5547a.mo23577c(k, v, this.f5548c).mo23580f(null, null, LLRBNode.Color.BLACK, (LLRBNode) null, (LLRBNode) null), this.f5548c);
    }

    /* renamed from: k */
    public Iterator<Map.Entry<K, V>> mo23541k(K k) {
        return new ImmutableSortedMapIterator(this.f5547a, k, this.f5548c, false);
    }

    /* renamed from: l */
    public ImmutableSortedMap<K, V> mo23542l(K k) {
        if (!mo23533c(k)) {
            return this;
        }
        return new RBTreeSortedMap(this.f5547a.mo23578d(k, this.f5548c).mo23580f(null, null, LLRBNode.Color.BLACK, (LLRBNode) null, (LLRBNode) null), this.f5548c);
    }

    public int size() {
        return this.f5547a.size();
    }

    private RBTreeSortedMap(LLRBNode<K, V> lLRBNode, Comparator<K> comparator) {
        this.f5547a = lLRBNode;
        this.f5548c = comparator;
    }
}
