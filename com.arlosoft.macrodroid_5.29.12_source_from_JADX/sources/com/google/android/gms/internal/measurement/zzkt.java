package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzkt extends zzip implements RandomAccess, zzku {

    /* renamed from: d */
    private static final zzkt f41654d;

    /* renamed from: f */
    public static final zzku f41655f;

    /* renamed from: c */
    private final List f41656c;

    static {
        zzkt zzkt = new zzkt(10);
        f41654d = zzkt;
        zzkt.zzb();
        f41655f = zzkt;
    }

    public zzkt() {
        this(10);
    }

    /* renamed from: f */
    private static String m60556f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzje) {
            return ((zzje) obj).mo51348t(zzkn.f41635b);
        }
        return zzkn.m60544g((byte[]) obj);
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzkm mo51322G(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f41656c);
            return new zzkt(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: X1 */
    public final void mo51478X1(zzje zzje) {
        mo51312c();
        this.f41656c.add(zzje);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo51312c();
        this.f41656c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo51312c();
        if (collection instanceof zzku) {
            collection = ((zzku) collection).mo51481e();
        }
        boolean addAll = this.f41656c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final zzku mo51479b() {
        return mo51307a() ? new zzmt(this) : this;
    }

    public final void clear() {
        mo51312c();
        this.f41656c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f41656c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzje) {
            zzje zzje = (zzje) obj;
            String t = zzje.mo51348t(zzkn.f41635b);
            if (zzje.mo51344l()) {
                this.f41656c.set(i, t);
            }
            return t;
        }
        byte[] bArr = (byte[]) obj;
        String g = zzkn.m60544g(bArr);
        if (zzkn.m60545h(bArr)) {
            this.f41656c.set(i, g);
        }
        return g;
    }

    /* renamed from: e */
    public final List mo51481e() {
        return Collections.unmodifiableList(this.f41656c);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo51312c();
        Object remove = this.f41656c.remove(i);
        this.modCount++;
        return m60556f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo51312c();
        return m60556f(this.f41656c.set(i, (String) obj));
    }

    public final int size() {
        return this.f41656c.size();
    }

    /* renamed from: y */
    public final Object mo51484y(int i) {
        return this.f41656c.get(i);
    }

    public zzkt(int i) {
        this.f41656c = new ArrayList(i);
    }

    private zzkt(ArrayList arrayList) {
        this.f41656c = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
