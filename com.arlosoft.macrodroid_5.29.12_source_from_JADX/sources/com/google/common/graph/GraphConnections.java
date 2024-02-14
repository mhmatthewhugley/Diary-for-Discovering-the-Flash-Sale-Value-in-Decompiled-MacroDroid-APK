package com.google.common.graph;

import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    /* renamed from: a */
    Set<N> mo36856a();

    /* renamed from: b */
    Set<N> mo36857b();

    /* renamed from: c */
    Set<N> mo36858c();

    /* renamed from: d */
    V mo36859d(N n);

    /* renamed from: e */
    Iterator<EndpointPair<N>> mo36860e(N n);
}
