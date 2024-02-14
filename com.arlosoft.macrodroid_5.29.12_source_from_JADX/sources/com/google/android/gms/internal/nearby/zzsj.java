package com.google.android.gms.internal.nearby;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
abstract class zzsj extends zzsz {

    /* renamed from: a */
    private final int f45098a;

    /* renamed from: c */
    private int f45099c;

    protected zzsj(int i, int i2) {
        zzsg.m62984b(i2, i, "index");
        this.f45098a = i;
        this.f45099c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo53229a(int i);

    public final boolean hasNext() {
        return this.f45099c < this.f45098a;
    }

    public final boolean hasPrevious() {
        return this.f45099c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f45099c;
            this.f45099c = i + 1;
            return mo53229a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f45099c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f45099c - 1;
            this.f45099c = i;
            return mo53229a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f45099c - 1;
    }
}
