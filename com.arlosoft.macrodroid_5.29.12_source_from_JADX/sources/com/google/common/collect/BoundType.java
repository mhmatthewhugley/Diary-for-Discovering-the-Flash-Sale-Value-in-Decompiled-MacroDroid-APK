package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);
    
    final boolean inclusive;

    private BoundType(boolean z) {
        this.inclusive = z;
    }

    /* renamed from: d */
    static BoundType m26528d(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
