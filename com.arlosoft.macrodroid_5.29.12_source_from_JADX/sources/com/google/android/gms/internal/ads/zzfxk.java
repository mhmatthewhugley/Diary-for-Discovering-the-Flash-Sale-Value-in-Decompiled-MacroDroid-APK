package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfxk implements Iterator {

    /* renamed from: a */
    final Iterator f36533a;

    zzfxk(Iterator it) {
        Objects.requireNonNull(it);
        this.f36533a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo46483a(Object obj);

    public final boolean hasNext() {
        return this.f36533a.hasNext();
    }

    public final Object next() {
        return mo46483a(this.f36533a.next());
    }

    public final void remove() {
        this.f36533a.remove();
    }
}
