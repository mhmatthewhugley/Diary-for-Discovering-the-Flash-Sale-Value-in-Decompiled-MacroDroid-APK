package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzej extends AbstractList implements RandomAccess, zzck {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzck f45734a;

    public zzej(zzck zzck) {
        this.f45734a = zzck;
    }

    /* renamed from: U0 */
    public final void mo53965U0(zzaw zzaw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final zzck mo53966b() {
        return this;
    }

    /* renamed from: e */
    public final List mo53968e() {
        return this.f45734a.mo53968e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzcj) this.f45734a).get(i);
    }

    public final Iterator iterator() {
        return new zzei(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzeh(this, i);
    }

    public final int size() {
        return this.f45734a.size();
    }

    /* renamed from: y */
    public final Object mo53971y(int i) {
        return this.f45734a.mo53971y(i);
    }
}
