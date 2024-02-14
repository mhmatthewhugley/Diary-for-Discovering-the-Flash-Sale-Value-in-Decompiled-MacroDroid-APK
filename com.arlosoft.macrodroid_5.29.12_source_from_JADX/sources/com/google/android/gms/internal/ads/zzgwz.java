package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgwz extends AbstractList {

    /* renamed from: d */
    private static final zzgxa f37394d = zzgxa.m53636b(zzgwz.class);

    /* renamed from: a */
    final List f37395a;

    /* renamed from: c */
    final Iterator f37396c;

    public zzgwz(List list, Iterator it) {
        this.f37395a = list;
        this.f37396c = it;
    }

    public final Object get(int i) {
        if (this.f37395a.size() > i) {
            return this.f37395a.get(i);
        }
        if (this.f37396c.hasNext()) {
            this.f37395a.add(this.f37396c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new zzgwy(this);
    }

    public final int size() {
        zzgxa zzgxa = f37394d;
        zzgxa.mo47584a("potentially expensive size() call");
        zzgxa.mo47584a("blowup running");
        while (this.f37396c.hasNext()) {
            this.f37395a.add(this.f37396c.next());
        }
        return this.f37395a.size();
    }
}
