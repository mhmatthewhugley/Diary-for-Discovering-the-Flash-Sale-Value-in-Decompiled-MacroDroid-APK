package com.google.android.gms.internal.mlkit_translate;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
abstract class zzm extends zzan {

    /* renamed from: a */
    private final int f44249a;

    /* renamed from: c */
    private int f44250c;

    protected zzm(int i, int i2) {
        zzj.m61889b(i2, i, "index");
        this.f44249a = i;
        this.f44250c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo52293a(int i);

    public final boolean hasNext() {
        return this.f44250c < this.f44249a;
    }

    public final boolean hasPrevious() {
        return this.f44250c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f44250c;
            this.f44250c = i + 1;
            return mo52293a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f44250c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f44250c - 1;
            this.f44250c = i;
            return mo52293a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f44250c - 1;
    }
}
