package com.google.common.graph;

import com.google.common.collect.BiMap;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class DirectedNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    /* renamed from: a */
    public Set<N> mo36850a() {
        return Collections.unmodifiableSet(((BiMap) this.f17382b).values());
    }

    /* renamed from: b */
    public Set<N> mo36851b() {
        return Collections.unmodifiableSet(((BiMap) this.f17381a).values());
    }
}
