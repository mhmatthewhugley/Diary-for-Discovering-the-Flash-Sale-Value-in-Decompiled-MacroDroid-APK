package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;

@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public interface SuccessorsFunction<N> {
    /* renamed from: a */
    Iterable<? extends N> mo36813a(N n);
}
