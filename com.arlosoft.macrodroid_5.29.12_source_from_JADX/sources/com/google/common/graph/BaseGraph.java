package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
interface BaseGraph<N> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    /* renamed from: a */
    Set<N> mo36813a(N n);

    /* renamed from: b */
    Set<EndpointPair<N>> mo36814b();

    /* renamed from: c */
    Set<N> mo36840c(N n);

    /* renamed from: d */
    boolean mo36841d();

    /* renamed from: e */
    boolean mo36842e();

    /* renamed from: f */
    Set<N> mo36843f();

    /* renamed from: g */
    int mo36815g(N n);

    /* renamed from: h */
    Set<N> mo36844h(N n);

    /* renamed from: i */
    int mo36816i(N n);

    /* renamed from: j */
    int mo36817j(N n);

    /* renamed from: k */
    Set<EndpointPair<N>> mo36818k(N n);
}
