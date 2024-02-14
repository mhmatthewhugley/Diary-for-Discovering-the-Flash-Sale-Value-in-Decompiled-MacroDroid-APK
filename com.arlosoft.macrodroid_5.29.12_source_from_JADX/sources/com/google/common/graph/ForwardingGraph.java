package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class ForwardingGraph<N> extends AbstractGraph<N> {
    ForwardingGraph() {
    }

    /* renamed from: c */
    public Set<N> mo36840c(N n) {
        return mo36903q().mo36840c(n);
    }

    /* renamed from: d */
    public boolean mo36841d() {
        return mo36903q().mo36841d();
    }

    /* renamed from: e */
    public boolean mo36842e() {
        return mo36903q().mo36842e();
    }

    /* renamed from: f */
    public Set<N> mo36843f() {
        return mo36903q().mo36843f();
    }

    /* renamed from: g */
    public int mo36815g(N n) {
        return mo36903q().mo36815g(n);
    }

    /* renamed from: h */
    public Set<N> mo36844h(N n) {
        return mo36903q().mo36844h(n);
    }

    /* renamed from: i */
    public int mo36816i(N n) {
        return mo36903q().mo36816i(n);
    }

    /* renamed from: j */
    public int mo36817j(N n) {
        return mo36903q().mo36817j(n);
    }

    /* renamed from: k */
    public Set<EndpointPair<N>> mo36818k(N n) {
        return mo36903q().mo36818k(n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public long mo36819o() {
        return (long) mo36903q().mo36814b().size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract BaseGraph<N> mo36903q();

    /* renamed from: a */
    public Set<N> m29385a(N n) {
        return mo36903q().mo36813a(n);
    }
}
