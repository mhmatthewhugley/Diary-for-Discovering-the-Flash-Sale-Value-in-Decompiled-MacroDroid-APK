package com.google.common.graph;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: a */
    final Map<E, N> f17392a;

    /* renamed from: a */
    public Set<N> mo36850a() {
        return mo36828c();
    }

    /* renamed from: b */
    public Set<N> mo36851b() {
        return mo36828c();
    }

    /* renamed from: d */
    public N mo36829d(E e) {
        N n = this.f17392a.get(e);
        Objects.requireNonNull(n);
        return n;
    }
}
