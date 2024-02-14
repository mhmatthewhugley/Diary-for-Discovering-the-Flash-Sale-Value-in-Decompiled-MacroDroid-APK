package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {
    AbstractBaseGraph() {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Iterable mo36813a(Object obj) {
        return mo36813a(obj);
    }

    /* renamed from: b */
    public Set<EndpointPair<N>> mo36814b() {
        return new AbstractSet<EndpointPair<N>>() {
            /* renamed from: c */
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.m29378e(AbstractBaseGraph.this);
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                if (!AbstractBaseGraph.this.mo36820p(endpointPair) || !AbstractBaseGraph.this.mo36843f().contains(endpointPair.mo36889h()) || !AbstractBaseGraph.this.mo36813a(endpointPair.mo36889h()).contains(endpointPair.mo36890i())) {
                    return false;
                }
                return true;
            }

            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            public int size() {
                return Ints.m73622k(AbstractBaseGraph.this.mo36819o());
            }
        };
    }

    /* renamed from: g */
    public int mo36815g(N n) {
        return mo36841d() ? mo36813a(n).size() : mo36817j(n);
    }

    /* renamed from: i */
    public int mo36816i(N n) {
        return mo36841d() ? mo36840c(n).size() : mo36817j(n);
    }

    /* renamed from: j */
    public int mo36817j(N n) {
        if (mo36841d()) {
            return IntMath.m73473i(mo36840c(n).size(), mo36813a(n).size());
        }
        Set h = mo36844h(n);
        return IntMath.m73473i(h.size(), (!mo36842e() || !h.contains(n)) ? 0 : 1);
    }

    /* renamed from: k */
    public Set<EndpointPair<N>> mo36818k(N n) {
        Preconditions.m5392s(n);
        Preconditions.m5385l(mo36843f().contains(n), "Node %s is not an element of this graph.", n);
        return new IncidentEdgeSet<N>(this, this, n) {
            /* access modifiers changed from: private */
            /* renamed from: i */
            public /* synthetic */ EndpointPair m29261i(Object obj) {
                return EndpointPair.m29363l(obj, this.f17446a);
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public /* synthetic */ EndpointPair m29262j(Object obj) {
                return EndpointPair.m29363l(this.f17446a, obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public /* synthetic */ EndpointPair m29263k(Object obj) {
                return EndpointPair.m29364o(this.f17446a, obj);
            }

            /* renamed from: h */
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                if (this.f17447c.mo36841d()) {
                    return Iterators.m27704K(Iterators.m27711g(Iterators.m27703J(this.f17447c.mo36840c(this.f17446a).iterator(), new C7201a(this)), Iterators.m27703J(Sets.m28718a(this.f17447c.mo36813a(this.f17446a), ImmutableSet.m27507I(this.f17446a)).iterator(), new C7202b(this))));
                }
                return Iterators.m27704K(Iterators.m27703J(this.f17447c.mo36844h(this.f17446a).iterator(), new C7203c(this)));
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public long mo36819o() {
        long j = 0;
        for (Object j2 : mo36843f()) {
            j += (long) mo36817j(j2);
        }
        Preconditions.m5398y((1 & j) == 0);
        return j >>> 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo36820p(EndpointPair<?> endpointPair) {
        return endpointPair.mo36887d() || !mo36841d();
    }
}
