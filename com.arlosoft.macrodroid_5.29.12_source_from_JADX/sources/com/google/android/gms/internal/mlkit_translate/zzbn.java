package com.google.android.gms.internal.mlkit_translate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzbn extends zzbo implements Iterable {

    /* renamed from: a */
    private final List f43161a = new ArrayList();

    /* renamed from: d */
    public final void mo52097d(zzbo zzbo) {
        this.f43161a.add(zzbo);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof zzbn) && ((zzbn) obj).f43161a.equals(this.f43161a));
    }

    public final int hashCode() {
        return this.f43161a.hashCode();
    }

    public final Iterator iterator() {
        return this.f43161a.iterator();
    }
}
