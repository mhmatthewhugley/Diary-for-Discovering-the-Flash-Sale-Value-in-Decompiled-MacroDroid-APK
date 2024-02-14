package com.google.android.gms.internal.icing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzdn extends zzbt<String> implements RandomAccess, zzdo {

    /* renamed from: d */
    private static final zzdn f40897d;

    /* renamed from: f */
    public static final zzdo f40898f;

    /* renamed from: c */
    private final List<Object> f40899c;

    static {
        zzdn zzdn = new zzdn(10);
        f40897d = zzdn;
        zzdn.zzb();
        f40898f = zzdn;
    }

    public zzdn() {
        this(10);
    }

    /* renamed from: f */
    private static String m58829f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzcf) {
            return ((zzcf) obj).mo50224n(zzdh.f40878a);
        }
        return zzdh.m58819d((byte[]) obj);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ zzdg mo50201A(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f40899c);
            return new zzdn((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo50190c();
        this.f40899c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo50190c();
        if (collection instanceof zzdo) {
            collection = ((zzdo) collection).mo50328e();
        }
        boolean addAll = this.f40899c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo50190c();
        this.f40899c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f40899c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzcf) {
            zzcf zzcf = (zzcf) obj;
            String n = zzcf.mo50224n(zzdh.f40878a);
            if (zzcf.mo50220k()) {
                this.f40899c.set(i, n);
            }
            return n;
        }
        byte[] bArr = (byte[]) obj;
        String d = zzdh.m58819d(bArr);
        if (zzdh.m58818c(bArr)) {
            this.f40899c.set(i, d);
        }
        return d;
    }

    /* renamed from: e */
    public final List<?> mo50328e() {
        return Collections.unmodifiableList(this.f40899c);
    }

    /* renamed from: g */
    public final zzdo mo50329g() {
        return zza() ? new zzfi(this) : this;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50190c();
        Object remove = this.f40899c.remove(i);
        this.modCount++;
        return m58829f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo50190c();
        return m58829f(this.f40899c.set(i, (String) obj));
    }

    public final int size() {
        return this.f40899c.size();
    }

    /* renamed from: x */
    public final Object mo50332x(int i) {
        return this.f40899c.get(i);
    }

    public zzdn(int i) {
        this.f40899c = new ArrayList(i);
    }

    private zzdn(ArrayList<Object> arrayList) {
        this.f40899c = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
