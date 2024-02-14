package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcj extends zzah implements RandomAccess, zzck {

    /* renamed from: d */
    private static final zzcj f45654d;

    /* renamed from: f */
    public static final zzck f45655f;

    /* renamed from: c */
    private final List f45656c;

    static {
        zzcj zzcj = new zzcj(10);
        f45654d = zzcj;
        zzcj.zzb();
        f45655f = zzcj;
    }

    public zzcj() {
        this(10);
    }

    /* renamed from: f */
    private static String m64236f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaw) {
            return ((zzaw) obj).mo53843u(zzcd.f45635b);
        }
        return zzcd.m64229h((byte[]) obj);
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzcc mo53817G(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f45656c);
            return new zzcj(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: U0 */
    public final void mo53965U0(zzaw zzaw) {
        mo53807c();
        this.f45656c.add(zzaw);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo53807c();
        this.f45656c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo53807c();
        if (collection instanceof zzck) {
            collection = ((zzck) collection).mo53968e();
        }
        boolean addAll = this.f45656c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final zzck mo53966b() {
        return mo53802a() ? new zzej(this) : this;
    }

    public final void clear() {
        mo53807c();
        this.f45656c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f45656c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaw) {
            zzaw zzaw = (zzaw) obj;
            String u = zzaw.mo53843u(zzcd.f45635b);
            if (zzaw.mo53838l()) {
                this.f45656c.set(i, u);
            }
            return u;
        }
        byte[] bArr = (byte[]) obj;
        String h = zzcd.m64229h(bArr);
        if (zzcd.m64230i(bArr)) {
            this.f45656c.set(i, h);
        }
        return h;
    }

    /* renamed from: e */
    public final List mo53968e() {
        return Collections.unmodifiableList(this.f45656c);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo53807c();
        Object remove = this.f45656c.remove(i);
        this.modCount++;
        return m64236f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo53807c();
        return m64236f(this.f45656c.set(i, (String) obj));
    }

    public final int size() {
        return this.f45656c.size();
    }

    /* renamed from: y */
    public final Object mo53971y(int i) {
        return this.f45656c.get(i);
    }

    public zzcj(int i) {
        this.f45656c = new ArrayList(i);
    }

    private zzcj(ArrayList arrayList) {
        this.f45656c = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
