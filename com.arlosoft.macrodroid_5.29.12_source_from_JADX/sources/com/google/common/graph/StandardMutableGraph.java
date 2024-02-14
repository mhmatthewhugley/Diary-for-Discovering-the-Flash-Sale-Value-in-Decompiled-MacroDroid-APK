package com.google.common.graph;

import com.google.common.graph.GraphConstants;

@ElementTypesAreNonnullByDefault
final class StandardMutableGraph<N> extends ForwardingGraph<N> implements MutableGraph<N> {

    /* renamed from: a */
    private final MutableValueGraph<N, GraphConstants.Presence> f17461a;

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public BaseGraph<N> mo36903q() {
        return this.f17461a;
    }
}
