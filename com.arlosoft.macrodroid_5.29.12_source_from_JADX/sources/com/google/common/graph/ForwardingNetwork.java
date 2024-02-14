package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    ForwardingNetwork() {
    }

    /* renamed from: b */
    public Set<E> mo36904b() {
        return mo36912p().mo36904b();
    }

    /* renamed from: c */
    public Set<N> mo36905c(N n) {
        return mo36912p().mo36905c(n);
    }

    /* renamed from: d */
    public boolean mo36906d() {
        return mo36912p().mo36906d();
    }

    /* renamed from: e */
    public boolean mo36907e() {
        return mo36912p().mo36907e();
    }

    /* renamed from: f */
    public Set<N> mo36908f() {
        return mo36912p().mo36908f();
    }

    /* renamed from: h */
    public Set<N> mo36909h(N n) {
        return mo36912p().mo36909h(n);
    }

    /* renamed from: l */
    public boolean mo36910l() {
        return mo36912p().mo36910l();
    }

    /* renamed from: n */
    public EndpointPair<N> mo36911n(E e) {
        return mo36912p().mo36911n(e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract Network<N, E> mo36912p();

    /* renamed from: a */
    public Set<N> m29398a(N n) {
        return mo36912p().mo36813a(n);
    }
}
