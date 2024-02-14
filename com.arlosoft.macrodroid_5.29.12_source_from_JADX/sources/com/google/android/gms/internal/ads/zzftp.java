package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzftp extends zzfxn {

    /* renamed from: a */
    private final int f36395a;

    /* renamed from: c */
    private int f36396c;

    protected zzftp(int i, int i2) {
        zzfsx.m50937b(i2, i, "index");
        this.f36395a = i;
        this.f36396c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo46188a(int i);

    public final boolean hasNext() {
        return this.f36396c < this.f36395a;
    }

    public final boolean hasPrevious() {
        return this.f36396c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f36396c;
            this.f36396c = i + 1;
            return mo46188a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f36396c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f36396c - 1;
            this.f36396c = i;
            return mo46188a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f36396c - 1;
    }
}
