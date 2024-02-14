package com.google.common.graph;

import com.google.common.collect.BiMap;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class UndirectedNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    /* renamed from: c */
    public Set<N> mo36828c() {
        return Collections.unmodifiableSet(((BiMap) this.f17392a).values());
    }
}
