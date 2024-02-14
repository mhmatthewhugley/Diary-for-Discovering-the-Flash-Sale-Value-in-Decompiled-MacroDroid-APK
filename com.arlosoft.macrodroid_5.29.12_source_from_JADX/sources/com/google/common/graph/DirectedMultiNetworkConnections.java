package com.google.common.graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class DirectedMultiNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    @LazyInit

    /* renamed from: d */
    private transient Reference<Multiset<N>> f17414d;
    @LazyInit

    /* renamed from: e */
    private transient Reference<Multiset<N>> f17415e;

    /* renamed from: com.google.common.graph.DirectedMultiNetworkConnections$1 */
    class C71781 extends MultiEdgesConnecting<Object> {

        /* renamed from: d */
        final /* synthetic */ Object f17416d;

        /* renamed from: f */
        final /* synthetic */ DirectedMultiNetworkConnections f17417f;

        public int size() {
            return this.f17417f.m29353i().mo34601J1(this.f17416d);
        }
    }

    /* renamed from: g */
    private static <T> T m29351g(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: h */
    private Multiset<N> m29352h() {
        Multiset<N> multiset = (Multiset) m29351g(this.f17414d);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset<N> m = HashMultiset.m27244m(this.f17381a.values());
        this.f17414d = new SoftReference(m);
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public Multiset<N> m29353i() {
        Multiset<N> multiset = (Multiset) m29351g(this.f17415e);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset<N> m = HashMultiset.m27244m(this.f17382b.values());
        this.f17415e = new SoftReference(m);
        return m;
    }

    /* renamed from: a */
    public Set<N> mo36850a() {
        return Collections.unmodifiableSet(m29353i().mo34642C());
    }

    /* renamed from: b */
    public Set<N> mo36851b() {
        return Collections.unmodifiableSet(m29352h().mo34642C());
    }
}
