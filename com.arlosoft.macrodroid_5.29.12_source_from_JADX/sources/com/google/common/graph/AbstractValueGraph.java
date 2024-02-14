package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractValueGraph<N, V> extends AbstractBaseGraph<N> implements ValueGraph<N, V> {

    /* renamed from: com.google.common.graph.AbstractValueGraph$1 */
    class C71661 extends AbstractGraph<Object> {

        /* renamed from: a */
        final /* synthetic */ AbstractValueGraph f17393a;

        /* renamed from: b */
        public Set<EndpointPair<Object>> mo36814b() {
            return this.f17393a.mo36814b();
        }

        /* renamed from: c */
        public Set<Object> mo36840c(Object obj) {
            return this.f17393a.mo36840c(obj);
        }

        /* renamed from: d */
        public boolean mo36841d() {
            return this.f17393a.mo36841d();
        }

        /* renamed from: e */
        public boolean mo36842e() {
            return this.f17393a.mo36842e();
        }

        /* renamed from: f */
        public Set<Object> mo36843f() {
            return this.f17393a.mo36843f();
        }

        /* renamed from: g */
        public int mo36815g(Object obj) {
            return this.f17393a.mo36815g(obj);
        }

        /* renamed from: h */
        public Set<Object> mo36844h(Object obj) {
            return this.f17393a.mo36844h(obj);
        }

        /* renamed from: i */
        public int mo36816i(Object obj) {
            return this.f17393a.mo36816i(obj);
        }

        /* renamed from: j */
        public int mo36817j(Object obj) {
            return this.f17393a.mo36817j(obj);
        }

        /* renamed from: a */
        public Set<Object> m29298a(Object obj) {
            return this.f17393a.mo36813a(obj);
        }
    }

    /* renamed from: q */
    private static <N, V> Map<EndpointPair<N>, V> m29290q(final ValueGraph<N, V> valueGraph) {
        return Maps.m28093h(valueGraph.mo36814b(), new Function<EndpointPair<N>, V>() {
            /* renamed from: a */
            public V apply(EndpointPair<N> endpointPair) {
                V m = ValueGraph.this.mo36913m(endpointPair.mo36889h(), endpointPair.mo36890i(), null);
                Objects.requireNonNull(m);
                return m;
            }
        });
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Iterable mo36813a(Object obj) {
        return mo36813a(obj);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Set mo36814b() {
        return super.mo36814b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueGraph)) {
            return false;
        }
        ValueGraph valueGraph = (ValueGraph) obj;
        if (mo36841d() != valueGraph.mo36841d() || !mo36843f().equals(valueGraph.mo36843f()) || !m29290q(this).equals(m29290q(valueGraph))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ int mo36815g(Object obj) {
        return super.mo36815g(obj);
    }

    public final int hashCode() {
        return m29290q(this).hashCode();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo36816i(Object obj) {
        return super.mo36816i(obj);
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ int mo36817j(Object obj) {
        return super.mo36817j(obj);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ Set mo36818k(Object obj) {
        return super.mo36818k(obj);
    }

    public String toString() {
        boolean d = mo36841d();
        boolean e = mo36842e();
        String valueOf = String.valueOf(mo36843f());
        String valueOf2 = String.valueOf(m29290q(this));
        StringBuilder sb = new StringBuilder(valueOf.length() + 59 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(d);
        sb.append(", allowsSelfLoops: ");
        sb.append(e);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
