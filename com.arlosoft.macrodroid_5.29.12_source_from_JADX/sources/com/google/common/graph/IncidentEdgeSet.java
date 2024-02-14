package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {

    /* renamed from: a */
    final N f17446a;

    /* renamed from: c */
    final BaseGraph<N> f17447c;

    IncidentEdgeSet(BaseGraph<N> baseGraph, N n) {
        this.f17447c = baseGraph;
        this.f17446a = n;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f17447c.mo36841d()) {
            if (!endpointPair.mo36887d()) {
                return false;
            }
            Object m = endpointPair.mo36892m();
            Object n = endpointPair.mo36893n();
            if ((!this.f17446a.equals(m) || !this.f17447c.mo36813a(this.f17446a).contains(n)) && (!this.f17446a.equals(n) || !this.f17447c.mo36840c(this.f17446a).contains(m))) {
                return false;
            }
            return true;
        } else if (endpointPair.mo36887d()) {
            return false;
        } else {
            Set<N> h = this.f17447c.mo36844h(this.f17446a);
            Object h2 = endpointPair.mo36889h();
            Object i = endpointPair.mo36890i();
            if ((!this.f17446a.equals(i) || !h.contains(h2)) && (!this.f17446a.equals(h2) || !h.contains(i))) {
                return false;
            }
            return true;
        }
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        if (this.f17447c.mo36841d()) {
            return (this.f17447c.mo36816i(this.f17446a) + this.f17447c.mo36815g(this.f17446a)) - (this.f17447c.mo36813a(this.f17446a).contains(this.f17446a) ? 1 : 0);
        }
        return this.f17447c.mo36844h(this.f17446a).size();
    }
}
