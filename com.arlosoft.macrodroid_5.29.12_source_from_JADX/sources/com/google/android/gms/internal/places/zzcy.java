package com.google.android.gms.internal.places;

import java.util.ArrayList;
import java.util.List;

final class zzcy<E> extends zzq<E> {

    /* renamed from: d */
    private static final zzcy<Object> f45355d;

    /* renamed from: c */
    private final List<E> f45356c;

    static {
        zzcy<Object> zzcy = new zzcy<>(new ArrayList(0));
        f45355d = zzcy;
        zzcy.mo53475h2();
    }

    zzcy() {
        this(new ArrayList(10));
    }

    /* renamed from: d */
    public static <E> zzcy<E> m63525d() {
        return f45355d;
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f45356c);
            return new zzcy(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo53665c();
        this.f45356c.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f45356c.get(i);
    }

    public final E remove(int i) {
        mo53665c();
        E remove = this.f45356c.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo53665c();
        E e2 = this.f45356c.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f45356c.size();
    }

    private zzcy(List<E> list) {
        this.f45356c = list;
    }
}
