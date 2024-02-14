package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {

    /* renamed from: A */
    static final EmptyImmutableSetMultimap f16561A = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.m27352m(), 0, (Comparator) null);
    }

    private Object readResolve() {
        return f16561A;
    }
}
