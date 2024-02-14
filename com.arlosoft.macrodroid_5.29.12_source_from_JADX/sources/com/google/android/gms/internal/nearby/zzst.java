package com.google.android.gms.internal.nearby;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzst extends zzsy {

    /* renamed from: a */
    boolean f45109a;

    /* renamed from: c */
    final /* synthetic */ Object f45110c;

    zzst(Object obj) {
        this.f45110c = obj;
    }

    public final boolean hasNext() {
        return !this.f45109a;
    }

    public final Object next() {
        if (!this.f45109a) {
            this.f45109a = true;
            return this.f45110c;
        }
        throw new NoSuchElementException();
    }
}
