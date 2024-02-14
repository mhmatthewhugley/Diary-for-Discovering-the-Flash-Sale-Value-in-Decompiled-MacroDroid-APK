package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgrv extends zzgpg implements RandomAccess, zzgrw {

    /* renamed from: d */
    private static final zzgrv f37190d;

    /* renamed from: f */
    public static final zzgrw f37191f;

    /* renamed from: c */
    private final List f37192c;

    static {
        zzgrv zzgrv = new zzgrv(10);
        f37190d = zzgrv;
        zzgrv.zzb();
        f37191f = zzgrv;
    }

    public zzgrv() {
        this(10);
    }

    /* renamed from: f */
    private static String m53050f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpw) {
            return ((zzgpw) obj).mo47105c(zzgro.f37162b);
        }
        return zzgro.m53030h((byte[]) obj);
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzgrn mo47067G(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f37192c);
            return new zzgrv(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo47057c();
        this.f37192c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo47057c();
        if (collection instanceof zzgrw) {
            collection = ((zzgrw) collection).mo47379e();
        }
        boolean addAll = this.f37192c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final zzgrw mo47377b() {
        return mo47052a() ? new zzgud(this) : this;
    }

    public final void clear() {
        mo47057c();
        this.f37192c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f37192c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgpw) {
            zzgpw zzgpw = (zzgpw) obj;
            String c = zzgpw.mo47105c(zzgro.f37162b);
            if (zzgpw.mo47091I()) {
                this.f37192c.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        String h = zzgro.m53030h(bArr);
        if (zzgro.m53031i(bArr)) {
            this.f37192c.set(i, h);
        }
        return h;
    }

    /* renamed from: e */
    public final List mo47379e() {
        return Collections.unmodifiableList(this.f37192c);
    }

    /* renamed from: j1 */
    public final void mo47381j1(zzgpw zzgpw) {
        mo47057c();
        this.f37192c.add(zzgpw);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo47057c();
        Object remove = this.f37192c.remove(i);
        this.modCount++;
        return m53050f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo47057c();
        return m53050f(this.f37192c.set(i, (String) obj));
    }

    public final int size() {
        return this.f37192c.size();
    }

    /* renamed from: y */
    public final Object mo47383y(int i) {
        return this.f37192c.get(i);
    }

    public zzgrv(int i) {
        this.f37192c = new ArrayList(i);
    }

    private zzgrv(ArrayList arrayList) {
        this.f37192c = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
