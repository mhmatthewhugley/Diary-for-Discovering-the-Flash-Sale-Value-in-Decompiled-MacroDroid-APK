package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgud extends AbstractList implements RandomAccess, zzgrw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzgrw f37294a;

    public zzgud(zzgrw zzgrw) {
        this.f37294a = zzgrw;
    }

    /* renamed from: b */
    public final zzgrw mo47377b() {
        return this;
    }

    /* renamed from: e */
    public final List mo47379e() {
        return this.f37294a.mo47379e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzgrv) this.f37294a).get(i);
    }

    public final Iterator iterator() {
        return new zzguc(this);
    }

    /* renamed from: j1 */
    public final void mo47381j1(zzgpw zzgpw) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator listIterator(int i) {
        return new zzgub(this, i);
    }

    public final int size() {
        return this.f37294a.size();
    }

    /* renamed from: y */
    public final Object mo47383y(int i) {
        return this.f37294a.mo47383y(i);
    }
}
