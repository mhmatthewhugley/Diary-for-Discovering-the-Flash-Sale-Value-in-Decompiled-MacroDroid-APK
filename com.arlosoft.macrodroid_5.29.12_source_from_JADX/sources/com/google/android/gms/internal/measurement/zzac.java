package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzac implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f41180a;

    /* renamed from: c */
    final /* synthetic */ Iterator f41181c;

    zzac(zzae zzae, Iterator it, Iterator it2) {
        this.f41180a = it;
        this.f41181c = it2;
    }

    public final boolean hasNext() {
        if (this.f41180a.hasNext()) {
            return true;
        }
        return this.f41181c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f41180a.hasNext()) {
            return new zzat(((Integer) this.f41180a.next()).toString());
        }
        if (this.f41181c.hasNext()) {
            return new zzat((String) this.f41181c.next());
        }
        throw new NoSuchElementException();
    }
}
