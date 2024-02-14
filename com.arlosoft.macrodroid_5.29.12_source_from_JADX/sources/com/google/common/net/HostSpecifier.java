package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class HostSpecifier {

    /* renamed from: a */
    private final String f53062a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostSpecifier) {
            return this.f53062a.equals(((HostSpecifier) obj).f53062a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53062a.hashCode();
    }

    public String toString() {
        return this.f53062a;
    }
}
