package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzmt extends AbstractList implements RandomAccess, zzku {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzku f41736a;

    public zzmt(zzku zzku) {
        this.f41736a = zzku;
    }

    /* renamed from: X1 */
    public final void mo51478X1(zzje zzje) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final zzku mo51479b() {
        return this;
    }

    /* renamed from: e */
    public final List mo51481e() {
        return this.f41736a.mo51481e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzkt) this.f41736a).get(i);
    }

    public final Iterator iterator() {
        return new zzms(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzmr(this, i);
    }

    public final int size() {
        return this.f41736a.size();
    }

    /* renamed from: y */
    public final Object mo51484y(int i) {
        return this.f41736a.mo51484y(i);
    }
}
