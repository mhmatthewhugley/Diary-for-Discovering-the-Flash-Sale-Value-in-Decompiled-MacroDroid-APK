package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {

    /* renamed from: d */
    private final BaseGraph<N> f17430d;

    /* renamed from: f */
    private final Iterator<N> f17431f;

    /* renamed from: g */
    N f17432g;

    /* renamed from: o */
    Iterator<N> f17433o;

    private static final class Directed<N> extends EndpointPairIterator<N> {
        /* access modifiers changed from: protected */
        /* renamed from: g */
        public EndpointPair<N> mo34417a() {
            while (!this.f17433o.hasNext()) {
                if (!mo36900d()) {
                    return (EndpointPair) mo34418b();
                }
            }
            N n = this.f17432g;
            Objects.requireNonNull(n);
            return EndpointPair.m29363l(n, this.f17433o.next());
        }

        private Directed(BaseGraph<N> baseGraph) {
            super(baseGraph);
        }
    }

    private static final class Undirected<N> extends EndpointPairIterator<N> {

        /* renamed from: p */
        private Set<N> f17434p;

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public EndpointPair<N> mo34417a() {
            do {
                Objects.requireNonNull(this.f17434p);
                while (this.f17433o.hasNext()) {
                    N next = this.f17433o.next();
                    if (!this.f17434p.contains(next)) {
                        N n = this.f17432g;
                        Objects.requireNonNull(n);
                        return EndpointPair.m29364o(n, next);
                    }
                }
                this.f17434p.add(this.f17432g);
            } while (mo36900d());
            this.f17434p = null;
            return (EndpointPair) mo34418b();
        }

        private Undirected(BaseGraph<N> baseGraph) {
            super(baseGraph);
            this.f17434p = Sets.m28726i(baseGraph.mo36843f().size() + 1);
        }
    }

    /* renamed from: e */
    static <N> EndpointPairIterator<N> m29378e(BaseGraph<N> baseGraph) {
        return baseGraph.mo36841d() ? new Directed(baseGraph) : new Undirected(baseGraph);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo36900d() {
        Preconditions.m5398y(!this.f17433o.hasNext());
        if (!this.f17431f.hasNext()) {
            return false;
        }
        N next = this.f17431f.next();
        this.f17432g = next;
        this.f17433o = this.f17430d.mo36813a(next).iterator();
        return true;
    }

    private EndpointPairIterator(BaseGraph<N> baseGraph) {
        this.f17432g = null;
        this.f17433o = ImmutableSet.m27506F().iterator();
        this.f17430d = baseGraph;
        this.f17431f = baseGraph.mo36843f().iterator();
    }
}
