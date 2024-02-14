package com.google.cloud.datastore.core.number;

public final class NumberParts {

    /* renamed from: a */
    private final boolean f52905a;

    /* renamed from: b */
    private final int f52906b;

    /* renamed from: c */
    private final long f52907c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumberParts)) {
            return false;
        }
        NumberParts numberParts = (NumberParts) obj;
        if (this.f52905a == numberParts.f52905a && this.f52906b == numberParts.f52906b && this.f52907c == numberParts.f52907c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f52907c;
        return ((((this.f52905a ? 1 : 0) * true) + this.f52906b) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
