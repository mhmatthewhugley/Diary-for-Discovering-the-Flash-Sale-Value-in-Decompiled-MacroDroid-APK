package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zzz extends zzak {

    /* renamed from: a */
    private final int f39313a;

    /* renamed from: c */
    private int f39314c;

    protected zzz(int i, int i2) {
        zzs.m55919b(i2, i, "index");
        this.f39313a = i;
        this.f39314c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo48630a(int i);

    public final boolean hasNext() {
        return this.f39314c < this.f39313a;
    }

    public final boolean hasPrevious() {
        return this.f39314c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f39314c;
            this.f39314c = i + 1;
            return mo48630a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f39314c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f39314c - 1;
            this.f39314c = i;
            return mo48630a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f39314c - 1;
    }
}
