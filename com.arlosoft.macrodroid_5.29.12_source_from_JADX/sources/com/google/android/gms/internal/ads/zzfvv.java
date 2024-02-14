package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfvv extends zzfxm {

    /* renamed from: a */
    boolean f36488a;

    /* renamed from: c */
    final /* synthetic */ Object f36489c;

    zzfvv(Object obj) {
        this.f36489c = obj;
    }

    public final boolean hasNext() {
        return !this.f36488a;
    }

    public final Object next() {
        if (!this.f36488a) {
            this.f36488a = true;
            return this.f36489c;
        }
        throw new NoSuchElementException();
    }
}
