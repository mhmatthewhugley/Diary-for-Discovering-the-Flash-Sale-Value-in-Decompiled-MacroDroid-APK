package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class ForwardingValueGraph<N, V> extends AbstractValueGraph<N, V> {
    ForwardingValueGraph() {
    }

    /* renamed from: c */
    public Set<N> mo36840c(N n) {
        return mo36914r().mo36840c(n);
    }

    /* renamed from: d */
    public boolean mo36841d() {
        return mo36914r().mo36841d();
    }

    /* renamed from: e */
    public boolean mo36842e() {
        return mo36914r().mo36842e();
    }

    /* renamed from: f */
    public Set<N> mo36843f() {
        return mo36914r().mo36843f();
    }

    /* renamed from: g */
    public int mo36815g(N n) {
        return mo36914r().mo36815g(n);
    }

    /* renamed from: h */
    public Set<N> mo36844h(N n) {
        return mo36914r().mo36844h(n);
    }

    /* renamed from: i */
    public int mo36816i(N n) {
        return mo36914r().mo36816i(n);
    }

    /* renamed from: j */
    public int mo36817j(N n) {
        return mo36914r().mo36817j(n);
    }

    /* renamed from: m */
    public V mo36913m(N n, N n2, V v) {
        return mo36914r().mo36913m(n, n2, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public long mo36819o() {
        return (long) mo36914r().mo36814b().size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract ValueGraph<N, V> mo36914r();

    /* renamed from: a */
    public Set<N> m29409a(N n) {
        return mo36914r().mo36813a(n);
    }
}
