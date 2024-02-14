package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
abstract class zzl<E> extends zzs<E> {

    /* renamed from: a */
    private final int f45481a;

    /* renamed from: c */
    private int f45482c;

    protected zzl(int i, int i2) {
        zzj.m63927b(i2, i, "index");
        this.f45481a = i;
        this.f45482c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo53697a(int i);

    public final boolean hasNext() {
        return this.f45482c < this.f45481a;
    }

    public final boolean hasPrevious() {
        return this.f45482c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f45482c;
            this.f45482c = i + 1;
            return mo53697a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f45482c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f45482c - 1;
            this.f45482c = i;
            return mo53697a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f45482c - 1;
    }
}
