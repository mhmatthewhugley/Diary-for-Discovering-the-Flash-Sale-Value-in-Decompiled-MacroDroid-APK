package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {

    /* renamed from: a */
    private final boolean f17462a;

    /* renamed from: b */
    private final boolean f17463b;

    /* renamed from: c */
    private final boolean f17464c;

    /* renamed from: d */
    final MapIteratorCache<N, NetworkConnections<N, E>> f17465d;

    /* renamed from: e */
    final MapIteratorCache<E, N> f17466e;

    /* renamed from: b */
    public Set<E> mo36904b() {
        return this.f17466e.mo36925g();
    }

    /* renamed from: c */
    public Set<N> mo36905c(N n) {
        return mo36935p(n).mo36851b();
    }

    /* renamed from: d */
    public boolean mo36906d() {
        return this.f17462a;
    }

    /* renamed from: e */
    public boolean mo36907e() {
        return this.f17464c;
    }

    /* renamed from: f */
    public Set<N> mo36908f() {
        return this.f17465d.mo36925g();
    }

    /* renamed from: h */
    public Set<N> mo36909h(N n) {
        return mo36935p(n).mo36828c();
    }

    /* renamed from: l */
    public boolean mo36910l() {
        return this.f17463b;
    }

    /* renamed from: n */
    public EndpointPair<N> mo36911n(E e) {
        Object q = mo36936q(e);
        NetworkConnections d = this.f17465d.mo36922d(q);
        Objects.requireNonNull(d);
        return EndpointPair.m29362k(this, q, d.mo36829d(e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final NetworkConnections<N, E> mo36935p(N n) {
        NetworkConnections<N, E> d = this.f17465d.mo36922d(n);
        if (d != null) {
            return d;
        }
        Preconditions.m5392s(n);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", new Object[]{n}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final N mo36936q(E e) {
        N d = this.f17466e.mo36922d(e);
        if (d != null) {
            return d;
        }
        Preconditions.m5392s(e);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", new Object[]{e}));
    }

    /* renamed from: a */
    public Set<N> m29516a(N n) {
        return mo36935p(n).mo36850a();
    }
}
