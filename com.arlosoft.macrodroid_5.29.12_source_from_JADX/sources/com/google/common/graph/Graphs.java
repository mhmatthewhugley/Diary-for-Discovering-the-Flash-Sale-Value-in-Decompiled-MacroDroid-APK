package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
public final class Graphs {

    private enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    private static class TransposedGraph<N> extends ForwardingGraph<N> {

        /* renamed from: a */
        private final Graph<N> f17440a;

        /* renamed from: c */
        public Set<N> mo36840c(N n) {
            return mo36903q().mo36813a(n);
        }

        /* renamed from: g */
        public int mo36815g(N n) {
            return mo36903q().mo36816i(n);
        }

        /* renamed from: i */
        public int mo36816i(N n) {
            return mo36903q().mo36815g(n);
        }

        /* renamed from: k */
        public Set<EndpointPair<N>> mo36818k(N n) {
            return new IncidentEdgeSet<N>(this, n) {
                public Iterator<EndpointPair<N>> iterator() {
                    return Iterators.m27703J(TransposedGraph.this.mo36903q().mo36818k(this.f17446a).iterator(), new Function<EndpointPair<N>, EndpointPair<N>>() {
                        /* renamed from: a */
                        public EndpointPair<N> apply(EndpointPair<N> endpointPair) {
                            return EndpointPair.m29361j(TransposedGraph.this.mo36903q(), endpointPair.mo36890i(), endpointPair.mo36889h());
                        }
                    });
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public Graph<N> mo36903q() {
            return this.f17440a;
        }

        /* renamed from: a */
        public Set<N> m29438a(N n) {
            return mo36903q().mo36840c(n);
        }
    }

    private static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {

        /* renamed from: a */
        private final Network<N, E> f17443a;

        /* renamed from: c */
        public Set<N> mo36905c(N n) {
            return mo36912p().mo36813a(n);
        }

        /* renamed from: n */
        public EndpointPair<N> mo36911n(E e) {
            EndpointPair n = mo36912p().mo36911n(e);
            return EndpointPair.m29362k(this.f17443a, n.mo36890i(), n.mo36889h());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public Network<N, E> mo36912p() {
            return this.f17443a;
        }

        /* renamed from: a */
        public Set<N> m29447a(N n) {
            return mo36912p().mo36905c(n);
        }
    }

    private static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {

        /* renamed from: a */
        private final ValueGraph<N, V> f17444a;

        /* renamed from: c */
        public Set<N> mo36840c(N n) {
            return mo36914r().mo36813a(n);
        }

        /* renamed from: g */
        public int mo36815g(N n) {
            return mo36914r().mo36816i(n);
        }

        /* renamed from: i */
        public int mo36816i(N n) {
            return mo36914r().mo36815g(n);
        }

        /* renamed from: m */
        public V mo36913m(N n, N n2, V v) {
            return mo36914r().mo36913m(n2, n, v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public ValueGraph<N, V> mo36914r() {
            return this.f17444a;
        }

        /* renamed from: a */
        public Set<N> m29452a(N n) {
            return mo36914r().mo36840c(n);
        }
    }

    private Graphs() {
    }
}
