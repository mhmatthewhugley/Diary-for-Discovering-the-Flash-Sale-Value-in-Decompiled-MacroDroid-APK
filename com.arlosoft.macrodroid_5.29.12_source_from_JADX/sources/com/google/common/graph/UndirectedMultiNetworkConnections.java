package com.google.common.graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    @LazyInit

    /* renamed from: b */
    private transient Reference<Multiset<N>> f17493b;

    /* renamed from: com.google.common.graph.UndirectedMultiNetworkConnections$1 */
    class C72001 extends MultiEdgesConnecting<Object> {

        /* renamed from: d */
        final /* synthetic */ Object f17494d;

        /* renamed from: f */
        final /* synthetic */ UndirectedMultiNetworkConnections f17495f;

        public int size() {
            return this.f17495f.m29566f().mo34601J1(this.f17494d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Multiset<N> m29566f() {
        Multiset<N> multiset = (Multiset) m29567g(this.f17493b);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset<N> m = HashMultiset.m27244m(this.f17392a.values());
        this.f17493b = new SoftReference(m);
        return m;
    }

    /* renamed from: g */
    private static <T> T m29567g(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: c */
    public Set<N> mo36828c() {
        return Collections.unmodifiableSet(m29566f().mo34642C());
    }
}
