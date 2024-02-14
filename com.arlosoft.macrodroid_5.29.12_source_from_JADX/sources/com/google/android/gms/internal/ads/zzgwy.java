package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgwy implements Iterator {

    /* renamed from: a */
    int f37392a = 0;

    /* renamed from: c */
    final /* synthetic */ zzgwz f37393c;

    zzgwy(zzgwz zzgwz) {
        this.f37393c = zzgwz;
    }

    public final boolean hasNext() {
        return this.f37392a < this.f37393c.f37395a.size() || this.f37393c.f37396c.hasNext();
    }

    public final Object next() {
        if (this.f37392a < this.f37393c.f37395a.size()) {
            List list = this.f37393c.f37395a;
            int i = this.f37392a;
            this.f37392a = i + 1;
            return list.get(i);
        }
        zzgwz zzgwz = this.f37393c;
        zzgwz.f37395a.add(zzgwz.f37396c.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
