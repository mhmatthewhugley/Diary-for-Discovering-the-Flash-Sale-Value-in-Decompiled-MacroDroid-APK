package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1 */
    class C71611 extends AbstractGraph<Object> {

        /* renamed from: a */
        final /* synthetic */ AbstractNetwork f17385a;

        /* renamed from: b */
        public Set<EndpointPair<Object>> mo36814b() {
            if (this.f17385a.mo36910l()) {
                return super.mo36814b();
            }
            return new AbstractSet<EndpointPair<Object>>() {
                public boolean contains(Object obj) {
                    if (!(obj instanceof EndpointPair)) {
                        return false;
                    }
                    EndpointPair endpointPair = (EndpointPair) obj;
                    if (!C71611.this.mo36820p(endpointPair) || !C71611.this.mo36843f().contains(endpointPair.mo36889h()) || !C71611.this.mo36813a(endpointPair.mo36889h()).contains(endpointPair.mo36890i())) {
                        return false;
                    }
                    return true;
                }

                public Iterator<EndpointPair<Object>> iterator() {
                    return Iterators.m27703J(C71611.this.f17385a.mo36904b().iterator(), new Function<Object, EndpointPair<Object>>() {
                        /* renamed from: a */
                        public EndpointPair<Object> apply(Object obj) {
                            return C71611.this.f17385a.mo36911n(obj);
                        }
                    });
                }

                public int size() {
                    return C71611.this.f17385a.mo36904b().size();
                }
            };
        }

        /* renamed from: c */
        public Set<Object> mo36840c(Object obj) {
            return this.f17385a.mo36905c(obj);
        }

        /* renamed from: d */
        public boolean mo36841d() {
            return this.f17385a.mo36906d();
        }

        /* renamed from: e */
        public boolean mo36842e() {
            return this.f17385a.mo36907e();
        }

        /* renamed from: f */
        public Set<Object> mo36843f() {
            return this.f17385a.mo36908f();
        }

        /* renamed from: h */
        public Set<Object> mo36844h(Object obj) {
            return this.f17385a.mo36909h(obj);
        }

        /* renamed from: a */
        public Set<Object> m29278a(Object obj) {
            return this.f17385a.mo36813a(obj);
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$2 */
    class C71642 implements Predicate<Object> {

        /* renamed from: a */
        final /* synthetic */ Object f17388a;

        /* renamed from: c */
        final /* synthetic */ Object f17389c;

        /* renamed from: d */
        final /* synthetic */ AbstractNetwork f17390d;

        public boolean apply(Object obj) {
            return this.f17390d.mo36911n(obj).mo36886c(this.f17388a).equals(this.f17389c);
        }
    }

    /* renamed from: o */
    private static <N, E> Map<E, EndpointPair<N>> m29275o(final Network<N, E> network) {
        return Maps.m28093h(network.mo36904b(), new Function<E, EndpointPair<N>>() {
            /* renamed from: a */
            public EndpointPair<N> apply(E e) {
                return Network.this.mo36911n(e);
            }
        });
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Iterable mo36813a(Object obj) {
        return mo36813a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (mo36906d() != network.mo36906d() || !mo36908f().equals(network.mo36908f()) || !m29275o(this).equals(m29275o(network))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return m29275o(this).hashCode();
    }

    public String toString() {
        boolean d = mo36906d();
        boolean l = mo36910l();
        boolean e = mo36907e();
        String valueOf = String.valueOf(mo36908f());
        String valueOf2 = String.valueOf(m29275o(this));
        StringBuilder sb = new StringBuilder(valueOf.length() + 87 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(d);
        sb.append(", allowsParallelEdges: ");
        sb.append(l);
        sb.append(", allowsSelfLoops: ");
        sb.append(e);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
