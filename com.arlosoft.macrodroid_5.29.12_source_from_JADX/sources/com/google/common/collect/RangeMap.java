package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public interface RangeMap<K extends Comparable, V> {
    /* renamed from: a */
    Map<Range<K>, V> mo35481a();
}
