package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<K, V> f17448a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile transient Map.Entry<K, V> f17449b;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo36921c(Object obj) {
        return mo36923e(obj) != null || this.f17448a.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public V mo36922d(Object obj) {
        Preconditions.m5392s(obj);
        V e = mo36923e(obj);
        return e == null ? mo36924f(obj) : e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public V mo36923e(Object obj) {
        Map.Entry<K, V> entry = this.f17449b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final V mo36924f(Object obj) {
        Preconditions.m5392s(obj);
        return this.f17448a.get(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Set<K> mo36925g() {
        return new AbstractSet<K>() {
            /* renamed from: c */
            public UnmodifiableIterator<K> iterator() {
                final Iterator it = MapIteratorCache.this.f17448a.entrySet().iterator();
                return new UnmodifiableIterator<K>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public K next() {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry unused = MapIteratorCache.this.f17449b = entry;
                        return entry.getKey();
                    }
                };
            }

            public boolean contains(Object obj) {
                return MapIteratorCache.this.mo36921c(obj);
            }

            public int size() {
                return MapIteratorCache.this.f17448a.size();
            }
        };
    }
}
