package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgj extends zzcn {

    /* renamed from: c */
    private final int f36875c;

    /* renamed from: d */
    private final zzuc f36876d;

    public zzgj(boolean z, zzuc zzuc, byte[] bArr) {
        this.f36876d = zzuc;
        this.f36875c = zzuc.mo48252c();
    }

    /* renamed from: w */
    private final int m52033w(int i, boolean z) {
        if (z) {
            return this.f36876d.mo48253d(i);
        }
        if (i >= this.f36875c - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: x */
    private final int m52034x(int i, boolean z) {
        if (z) {
            return this.f36876d.mo48254e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: a */
    public final int mo43599a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo46869p(obj2);
        if (p == -1 || (a = mo46874u(p).mo43599a(obj3)) == -1) {
            return -1;
        }
        return mo46872s(p) + a;
    }

    /* renamed from: d */
    public final zzck mo43602d(int i, zzck zzck, boolean z) {
        int q = mo46870q(i);
        int t = mo46873t(q);
        mo46874u(q).mo43602d(i - mo46872s(q), zzck, z);
        zzck.f28721c += t;
        if (z) {
            Object v = mo46875v(q);
            Object obj = zzck.f28720b;
            Objects.requireNonNull(obj);
            zzck.f28720b = Pair.create(v, obj);
        }
        return zzck;
    }

    /* renamed from: e */
    public final zzcm mo43603e(int i, zzcm zzcm, long j) {
        int r = mo46871r(i);
        int t = mo46873t(r);
        int s = mo46872s(r);
        mo46874u(r).mo43603e(i - t, zzcm, j);
        Object v = mo46875v(r);
        if (!zzcm.f28931o.equals(zzcm.f28935a)) {
            v = Pair.create(v, zzcm.f28935a);
        }
        zzcm.f28935a = v;
        zzcm.f28947m += s;
        zzcm.f28948n += s;
        return zzcm;
    }

    /* renamed from: f */
    public final Object mo43604f(int i) {
        int q = mo46870q(i);
        return Pair.create(mo46875v(q), mo46874u(q).mo43604f(i - mo46872s(q)));
    }

    /* renamed from: g */
    public final int mo44126g(boolean z) {
        if (this.f36875c == 0) {
            return -1;
        }
        int a = z ? this.f36876d.mo48250a() : 0;
        while (mo46874u(a).mo44135o()) {
            a = m52033w(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return mo46873t(a) + mo46874u(a).mo44126g(z);
    }

    /* renamed from: h */
    public final int mo44127h(boolean z) {
        int i = this.f36875c;
        if (i == 0) {
            return -1;
        }
        int b = z ? this.f36876d.mo48251b() : i - 1;
        while (mo46874u(b).mo44135o()) {
            b = m52034x(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return mo46873t(b) + mo46874u(b).mo44127h(z);
    }

    /* renamed from: j */
    public final int mo44130j(int i, int i2, boolean z) {
        int r = mo46871r(i);
        int t = mo46873t(r);
        int j = mo46874u(r).mo44130j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = m52033w(r, z);
        while (w != -1 && mo46874u(w).mo44135o()) {
            w = m52033w(w, z);
        }
        if (w != -1) {
            return mo46873t(w) + mo46874u(w).mo44126g(z);
        }
        if (i2 == 2) {
            return mo44126g(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo44131k(int i, int i2, boolean z) {
        int r = mo46871r(i);
        int t = mo46873t(r);
        int k = mo46874u(r).mo44131k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = m52034x(r, false);
        while (x != -1 && mo46874u(x).mo44135o()) {
            x = m52034x(x, false);
        }
        if (x != -1) {
            return mo46873t(x) + mo46874u(x).mo44127h(false);
        }
        return -1;
    }

    /* renamed from: n */
    public final zzck mo44134n(Object obj, zzck zzck) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo46869p(obj2);
        int t = mo46873t(p);
        mo46874u(p).mo44134n(obj3, zzck);
        zzck.f28721c += t;
        zzck.f28720b = obj;
        return zzck;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo46869p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo46870q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo46871r(int i);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo46872s(int i);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo46873t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract zzcn mo46874u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo46875v(int i);
}
