package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
}
