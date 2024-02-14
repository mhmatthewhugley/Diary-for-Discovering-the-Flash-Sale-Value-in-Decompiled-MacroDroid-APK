package com.google.android.gms.internal.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzbs extends zzq<String> implements zzbr, RandomAccess {

    /* renamed from: d */
    private static final zzbs f45301d;

    /* renamed from: f */
    private static final zzbr f45302f;

    /* renamed from: c */
    private final List<Object> f45303c;

    static {
        zzbs zzbs = new zzbs();
        f45301d = zzbs;
        zzbs.mo53475h2();
        f45302f = zzbs;
    }

    public zzbs() {
        this(10);
    }

    /* renamed from: d */
    private static String m63379d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzw) {
            return ((zzw) obj).mo53671c();
        }
        return zzbd.m63347h((byte[]) obj);
    }

    /* renamed from: E */
    public final /* synthetic */ zzbh mo53396E(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f45303c);
            return new zzbs((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: N */
    public final /* bridge */ /* synthetic */ boolean mo53474N() {
        return super.mo53474N();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo53665c();
        this.f45303c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c0 */
    public final Object mo53491c0(int i) {
        return this.f45303c.get(i);
    }

    public final void clear() {
        mo53665c();
        this.f45303c.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f45303c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzw) {
            zzw zzw = (zzw) obj;
            String c = zzw.mo53671c();
            if (zzw.mo53310d()) {
                this.f45303c.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        String h = zzbd.m63347h(bArr);
        if (zzbd.m63346g(bArr)) {
            this.f45303c.set(i, h);
        }
        return h;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k0 */
    public final List<?> mo53492k0() {
        return Collections.unmodifiableList(this.f45303c);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo53665c();
        return m63379d(this.f45303c.set(i, (String) obj));
    }

    public final int size() {
        return this.f45303c.size();
    }

    /* renamed from: t0 */
    public final zzbr mo53493t0() {
        return mo53474N() ? new zzdt(this) : this;
    }

    public zzbs(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo53665c();
        if (collection instanceof zzbr) {
            collection = ((zzbr) collection).mo53492k0();
        }
        boolean addAll = this.f45303c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo53665c();
        Object remove = this.f45303c.remove(i);
        this.modCount++;
        return m63379d(remove);
    }

    private zzbs(ArrayList<Object> arrayList) {
        this.f45303c = arrayList;
    }
}
