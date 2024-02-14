package com.google.common.graph;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: a */
    final Map<E, N> f17381a;

    /* renamed from: b */
    final Map<E, N> f17382b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f17383c;

    /* renamed from: com.google.common.graph.AbstractDirectedNetworkConnections$1 */
    class C71601 extends AbstractSet<Object> {

        /* renamed from: a */
        final /* synthetic */ AbstractDirectedNetworkConnections f17384a;

        /* renamed from: c */
        public UnmodifiableIterator<Object> iterator() {
            Iterable<T> iterable;
            if (this.f17384a.f17383c == 0) {
                iterable = Iterables.m27677d(this.f17384a.f17381a.keySet(), this.f17384a.f17382b.keySet());
            } else {
                iterable = Sets.m28732o(this.f17384a.f17381a.keySet(), this.f17384a.f17382b.keySet());
            }
            return Iterators.m27704K(iterable.iterator());
        }

        public boolean contains(Object obj) {
            return this.f17384a.f17381a.containsKey(obj) || this.f17384a.f17382b.containsKey(obj);
        }

        public int size() {
            return IntMath.m73473i(this.f17384a.f17381a.size(), this.f17384a.f17382b.size() - this.f17384a.f17383c);
        }
    }

    /* renamed from: c */
    public Set<N> mo36828c() {
        return Sets.m28732o(mo36851b(), mo36850a());
    }

    /* renamed from: d */
    public N mo36829d(E e) {
        N n = this.f17382b.get(e);
        Objects.requireNonNull(n);
        return n;
    }
}
