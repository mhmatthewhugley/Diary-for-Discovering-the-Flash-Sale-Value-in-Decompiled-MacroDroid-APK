package com.google.android.gms.internal.icing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzfi extends AbstractList<String> implements RandomAccess, zzdo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzdo f40977a;

    public zzfi(zzdo zzdo) {
        this.f40977a = zzdo;
    }

    /* renamed from: e */
    public final List<?> mo50328e() {
        return this.f40977a.mo50328e();
    }

    /* renamed from: g */
    public final zzdo mo50329g() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzdn) this.f40977a).get(i);
    }

    public final Iterator<String> iterator() {
        return new zzfh(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzfg(this, i);
    }

    public final int size() {
        return this.f40977a.size();
    }

    /* renamed from: x */
    public final Object mo50332x(int i) {
        return this.f40977a.mo50332x(i);
    }
}
