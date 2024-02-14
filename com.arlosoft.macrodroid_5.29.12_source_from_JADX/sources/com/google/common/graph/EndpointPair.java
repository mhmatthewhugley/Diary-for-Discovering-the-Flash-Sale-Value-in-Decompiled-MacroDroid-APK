package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@Immutable
@Beta
public abstract class EndpointPair<N> implements Iterable<N> {

    /* renamed from: a */
    private final N f17428a;

    /* renamed from: c */
    private final N f17429c;

    private static final class Ordered<N> extends EndpointPair<N> {
        /* renamed from: d */
        public boolean mo36887d() {
            return true;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (mo36887d() == endpointPair.mo36887d() && mo36892m().equals(endpointPair.mo36892m()) && mo36893n().equals(endpointPair.mo36893n())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.m5350b(mo36892m(), mo36893n());
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return EndpointPair.super.iterator();
        }

        /* renamed from: m */
        public N mo36892m() {
            return mo36889h();
        }

        /* renamed from: n */
        public N mo36893n() {
            return mo36890i();
        }

        public String toString() {
            String valueOf = String.valueOf(mo36892m());
            String valueOf2 = String.valueOf(mo36893n());
            StringBuilder sb = new StringBuilder(valueOf.length() + 6 + valueOf2.length());
            sb.append("<");
            sb.append(valueOf);
            sb.append(" -> ");
            sb.append(valueOf2);
            sb.append(">");
            return sb.toString();
        }

        private Ordered(N n, N n2) {
            super(n, n2);
        }
    }

    private static final class Unordered<N> extends EndpointPair<N> {
        /* renamed from: d */
        public boolean mo36887d() {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (mo36887d() != endpointPair.mo36887d()) {
                return false;
            }
            if (mo36889h().equals(endpointPair.mo36889h())) {
                return mo36890i().equals(endpointPair.mo36890i());
            }
            if (!mo36889h().equals(endpointPair.mo36890i()) || !mo36890i().equals(endpointPair.mo36889h())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return mo36889h().hashCode() + mo36890i().hashCode();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return EndpointPair.super.iterator();
        }

        /* renamed from: m */
        public N mo36892m() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        /* renamed from: n */
        public N mo36893n() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            String valueOf = String.valueOf(mo36889h());
            String valueOf2 = String.valueOf(mo36890i());
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb.append("[");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append("]");
            return sb.toString();
        }

        private Unordered(N n, N n2) {
            super(n, n2);
        }
    }

    /* renamed from: j */
    static <N> EndpointPair<N> m29361j(Graph<?> graph, N n, N n2) {
        return graph.mo36841d() ? m29363l(n, n2) : m29364o(n, n2);
    }

    /* renamed from: k */
    static <N> EndpointPair<N> m29362k(Network<?, ?> network, N n, N n2) {
        return network.mo36906d() ? m29363l(n, n2) : m29364o(n, n2);
    }

    /* renamed from: l */
    public static <N> EndpointPair<N> m29363l(N n, N n2) {
        return new Ordered(n, n2);
    }

    /* renamed from: o */
    public static <N> EndpointPair<N> m29364o(N n, N n2) {
        return new Unordered(n2, n);
    }

    /* renamed from: c */
    public final N mo36886c(N n) {
        if (n.equals(this.f17428a)) {
            return this.f17429c;
        }
        if (n.equals(this.f17429c)) {
            return this.f17428a;
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36 + valueOf2.length());
        sb.append("EndpointPair ");
        sb.append(valueOf);
        sb.append(" does not contain node ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public abstract boolean mo36887d();

    /* renamed from: f */
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.m27723s(this.f17428a, this.f17429c);
    }

    /* renamed from: h */
    public final N mo36889h() {
        return this.f17428a;
    }

    /* renamed from: i */
    public final N mo36890i() {
        return this.f17429c;
    }

    /* renamed from: m */
    public abstract N mo36892m();

    /* renamed from: n */
    public abstract N mo36893n();

    private EndpointPair(N n, N n2) {
        this.f17428a = Preconditions.m5392s(n);
        this.f17429c = Preconditions.m5392s(n2);
    }
}
