package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingObject {
    protected ForwardingObject() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract Object mo22325Q();

    public String toString() {
        return mo22325Q().toString();
    }
}
