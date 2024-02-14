package com.google.android.gms.internal.location;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
abstract class zzbo<E> extends zzbv<E> {

    /* renamed from: a */
    private final int f41128a;

    /* renamed from: c */
    private int f41129c;

    protected zzbo(int i, int i2) {
        zzbm.m59266b(i2, i, "index");
        this.f41128a = i;
        this.f41129c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo50594a(int i);

    public final boolean hasNext() {
        return this.f41129c < this.f41128a;
    }

    public final boolean hasPrevious() {
        return this.f41129c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f41129c;
            this.f41129c = i + 1;
            return mo50594a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f41129c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f41129c - 1;
            this.f41129c = i;
            return mo50594a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f41129c - 1;
    }
}
