package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzah */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzah extends zzao {

    /* renamed from: a */
    private final int f39888a;

    /* renamed from: c */
    private int f39889c;

    protected zzah(int i, int i2) {
        zzy.m58436b(i2, i, "index");
        this.f39888a = i;
        this.f39889c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo49257a(int i);

    public final boolean hasNext() {
        return this.f39889c < this.f39888a;
    }

    public final boolean hasPrevious() {
        return this.f39889c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f39889c;
            this.f39889c = i + 1;
            return mo49257a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f39889c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f39889c - 1;
            this.f39889c = i;
            return mo49257a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f39889c - 1;
    }
}
