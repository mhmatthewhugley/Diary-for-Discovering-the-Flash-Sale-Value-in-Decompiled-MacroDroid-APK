package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public interface RangeSet<C extends Comparable> {
    /* renamed from: a */
    Set<Range<C>> mo35494a();
}
