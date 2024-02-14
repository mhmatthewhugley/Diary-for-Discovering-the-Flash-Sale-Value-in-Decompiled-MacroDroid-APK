package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Count implements Serializable {
    private int value;

    public boolean equals(Object obj) {
        return (obj instanceof Count) && ((Count) obj).value == this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
