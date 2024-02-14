package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public interface Graph<N> extends BaseGraph<N> {
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

    /* renamed from: i */
    int mo36816i(N n);

    /* renamed from: k */
    Set<EndpointPair<N>> mo36818k(N n);
}
