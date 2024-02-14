package com.google.android.gms.internal.places;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzdt extends AbstractList<String> implements zzbr, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzbr f45389a;

    public zzdt(zzbr zzbr) {
        this.f45389a = zzbr;
    }

    /* renamed from: c0 */
    public final Object mo53491c0(int i) {
        return this.f45389a.mo53491c0(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f45389a.get(i);
    }

    public final Iterator<String> iterator() {
        return new zzdv(this);
    }

    /* renamed from: k0 */
    public final List<?> mo53492k0() {
        return this.f45389a.mo53492k0();
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzdw(this, i);
    }

    public final int size() {
        return this.f45389a.size();
    }

    /* renamed from: t0 */
    public final zzbr mo53493t0() {
        return this;
    }
}
