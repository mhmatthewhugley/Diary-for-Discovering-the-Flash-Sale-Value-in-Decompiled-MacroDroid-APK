package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzadr extends zzabn implements RandomAccess, zzads {

    /* renamed from: d */
    private static final zzadr f39765d;

    /* renamed from: f */
    public static final zzads f39766f;

    /* renamed from: c */
    private final List f39767c;

    static {
        zzadr zzadr = new zzadr(10);
        f39765d = zzadr;
        zzadr.zzb();
        f39766f = zzadr;
    }

    public zzadr() {
        this(10);
    }

    /* renamed from: f */
    private static String m56478f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzacc) {
            return ((zzacc) obj).mo48902B(zzadl.f39746b);
        }
        return zzadl.m56463g((byte[]) obj);
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzadk mo48877G(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f39767c);
            return new zzadr(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: V0 */
    public final void mo49107V0(zzacc zzacc) {
        mo48867c();
        this.f39767c.add(zzacc);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo48867c();
        this.f39767c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo48867c();
        if (collection instanceof zzads) {
            collection = ((zzads) collection).mo49110e();
        }
        boolean addAll = this.f39767c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final zzads mo49108b() {
        return mo48862a() ? new zzafs(this) : this;
    }

    public final void clear() {
        mo48867c();
        this.f39767c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.f39767c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzacc) {
            zzacc zzacc = (zzacc) obj;
            String B = zzacc.mo48902B(zzadl.f39746b);
            if (zzacc.mo48901n()) {
                this.f39767c.set(i, B);
            }
            return B;
        }
        byte[] bArr = (byte[]) obj;
        String g = zzadl.m56463g(bArr);
        if (zzadl.m56464h(bArr)) {
            this.f39767c.set(i, g);
        }
        return g;
    }

    /* renamed from: e */
    public final List mo49110e() {
        return Collections.unmodifiableList(this.f39767c);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo48867c();
        Object remove = this.f39767c.remove(i);
        this.modCount++;
        return m56478f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo48867c();
        return m56478f(this.f39767c.set(i, (String) obj));
    }

    public final int size() {
        return this.f39767c.size();
    }

    /* renamed from: y */
    public final Object mo49113y(int i) {
        return this.f39767c.get(i);
    }

    public zzadr(int i) {
        this.f39767c = new ArrayList(i);
    }

    private zzadr(ArrayList arrayList) {
        this.f39767c = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
