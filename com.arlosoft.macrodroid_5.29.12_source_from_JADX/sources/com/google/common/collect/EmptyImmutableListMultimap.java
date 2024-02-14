package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {

    /* renamed from: s */
    static final EmptyImmutableListMultimap f16560s = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.m27352m(), 0);
    }

    private Object readResolve() {
        return f16560s;
    }
}
