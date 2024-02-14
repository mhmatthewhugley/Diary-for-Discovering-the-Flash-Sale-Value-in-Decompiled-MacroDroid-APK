package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {

    /* renamed from: a */
    private final boolean f17467a;

    /* renamed from: b */
    private final boolean f17468b;

    /* renamed from: c */
    final MapIteratorCache<N, GraphConnections<N, V>> f17469c;

    /* renamed from: d */
    long f17470d;

    /* renamed from: r */
    private final GraphConnections<N, V> m29527r(N n) {
        GraphConnections<N, V> d = this.f17469c.mo36922d(n);
        if (d != null) {
            return d;
        }
        Preconditions.m5392s(n);
        String valueOf = String.valueOf(n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 38);
        sb.append("Node ");
        sb.append(valueOf);
        sb.append(" is not an element of this graph.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: s */
    private final V m29528s(N n, N n2, V v) {
        V v2;
        GraphConnections d = this.f17469c.mo36922d(n);
        if (d == null) {
            v2 = null;
        } else {
            v2 = d.mo36859d(n2);
        }
        return v2 == null ? v : v2;
    }

    /* renamed from: c */
    public Set<N> mo36840c(N n) {
        return m29527r(n).mo36857b();
    }

    /* renamed from: d */
    public boolean mo36841d() {
        return this.f17467a;
    }

    /* renamed from: e */
    public boolean mo36842e() {
        return this.f17468b;
    }

    /* renamed from: f */
    public Set<N> mo36843f() {
        return this.f17469c.mo36925g();
    }

    /* renamed from: h */
    public Set<N> mo36844h(N n) {
        return m29527r(n).mo36858c();
    }

    /* renamed from: k */
    public Set<EndpointPair<N>> mo36818k(N n) {
        final GraphConnections r = m29527r(n);
        return new IncidentEdgeSet<N>(this, this, n) {
            public Iterator<EndpointPair<N>> iterator() {
                return r.mo36860e(this.f17446a);
            }
        };
    }

    /* renamed from: m */
    public V mo36913m(N n, N n2, V v) {
        return m29528s(Preconditions.m5392s(n), Preconditions.m5392s(n2), v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public long mo36819o() {
        return this.f17470d;
    }

    /* renamed from: a */
    public Set<N> m29530a(N n) {
        return m29527r(n).mo36856a();
    }
}
