package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    /* renamed from: a */
    Set<N> mo36813a(N n);

    /* renamed from: b */
    Set<E> mo36904b();

    /* renamed from: c */
    Set<N> mo36905c(N n);

    /* renamed from: d */
    boolean mo36906d();

    /* renamed from: e */
    boolean mo36907e();

    /* renamed from: f */
    Set<N> mo36908f();

    /* renamed from: h */
    Set<N> mo36909h(N n);

    /* renamed from: l */
    boolean mo36910l();

    /* renamed from: n */
    EndpointPair<N> mo36911n(E e);
}
