package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {

    /* renamed from: a */
    static final UsingToStringOrdering f17328a = new UsingToStringOrdering();
    private static final long serialVersionUID = 0;

    private UsingToStringOrdering() {
    }

    private Object readResolve() {
        return f17328a;
    }

    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
