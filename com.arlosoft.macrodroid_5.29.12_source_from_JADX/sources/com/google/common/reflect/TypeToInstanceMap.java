package com.google.common.reflect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
}
