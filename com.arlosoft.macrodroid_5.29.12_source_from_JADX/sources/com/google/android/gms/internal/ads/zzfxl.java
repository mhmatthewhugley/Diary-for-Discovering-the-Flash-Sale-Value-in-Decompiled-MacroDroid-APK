package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfxl extends zzfxk implements ListIterator {
    zzfxl(ListIterator listIterator) {
        super(listIterator);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f36533a).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f36533a).nextIndex();
    }

    public final Object previous() {
        return mo46483a(((ListIterator) this.f36533a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f36533a).previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
