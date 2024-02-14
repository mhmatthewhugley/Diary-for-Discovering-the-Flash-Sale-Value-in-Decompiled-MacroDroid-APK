package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    AbstractRangeSet() {
    }

    /* renamed from: b */
    public boolean mo34685b(C c) {
        return mo34686c(c) != null;
    }

    /* renamed from: c */
    public abstract Range<C> mo34686c(C c);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return mo35494a().equals(((RangeSet) obj).mo35494a());
        }
        return false;
    }

    public final int hashCode() {
        return mo35494a().hashCode();
    }

    public final String toString() {
        return mo35494a().toString();
    }
}
