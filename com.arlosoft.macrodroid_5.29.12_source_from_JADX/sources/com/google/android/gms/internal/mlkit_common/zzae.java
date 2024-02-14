package com.google.android.gms.internal.mlkit_common;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
abstract class zzae extends zzbc {

    /* renamed from: a */
    private final int f41931a;

    /* renamed from: c */
    private int f41932c;

    protected zzae(int i, int i2) {
        zzac.m61134b(i2, i, "index");
        this.f41931a = i;
        this.f41932c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo51718a(int i);

    public final boolean hasNext() {
        return this.f41932c < this.f41931a;
    }

    public final boolean hasPrevious() {
        return this.f41932c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f41932c;
            this.f41932c = i + 1;
            return mo51718a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f41932c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f41932c - 1;
            this.f41932c = i;
            return mo51718a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f41932c - 1;
    }
}
