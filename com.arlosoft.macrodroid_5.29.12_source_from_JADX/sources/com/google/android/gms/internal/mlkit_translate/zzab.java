package com.google.android.gms.internal.mlkit_translate;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzab extends zzam {

    /* renamed from: a */
    boolean f43085a;

    /* renamed from: c */
    final /* synthetic */ Object f43086c;

    zzab(Object obj) {
        this.f43086c = obj;
    }

    public final boolean hasNext() {
        return !this.f43085a;
    }

    public final Object next() {
        if (!this.f43085a) {
            this.f43085a = true;
            return this.f43086c;
        }
        throw new NoSuchElementException();
    }
}
