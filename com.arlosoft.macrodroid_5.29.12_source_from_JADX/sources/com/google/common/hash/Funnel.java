package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public interface Funnel<T> extends Serializable {
    /* renamed from: S */
    void mo36986S(@ParametricNullness T t, PrimitiveSink primitiveSink);
}
