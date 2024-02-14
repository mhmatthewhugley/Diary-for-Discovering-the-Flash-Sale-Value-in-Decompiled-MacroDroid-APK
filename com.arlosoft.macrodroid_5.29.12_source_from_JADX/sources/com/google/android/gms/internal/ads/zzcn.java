package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzcn {

    /* renamed from: a */
    public static final zzcn f29060a = new zzci();

    /* renamed from: b */
    public static final zzn f29061b = zzch.f28454a;

    protected zzcn() {
    }

    /* renamed from: a */
    public abstract int mo43599a(Object obj);

    /* renamed from: b */
    public abstract int mo43600b();

    /* renamed from: c */
    public abstract int mo43601c();

    /* renamed from: d */
    public abstract zzck mo43602d(int i, zzck zzck, boolean z);

    /* renamed from: e */
    public abstract zzcm mo43603e(int i, zzcm zzcm, long j);

    public final boolean equals(@Nullable Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcn)) {
            return false;
        }
        zzcn zzcn = (zzcn) obj;
        if (zzcn.mo43601c() == mo43601c() && zzcn.mo43600b() == mo43600b()) {
            zzcm zzcm = new zzcm();
            zzck zzck = new zzck();
            zzcm zzcm2 = new zzcm();
            zzck zzck2 = new zzck();
            for (int i = 0; i < mo43601c(); i++) {
                if (!mo43603e(i, zzcm, 0).equals(zzcn.mo43603e(i, zzcm2, 0))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo43600b(); i2++) {
                if (!mo43602d(i2, zzck, true).equals(zzcn.mo43602d(i2, zzck2, true))) {
                    return false;
                }
            }
            int g = mo44126g(true);
            if (g == zzcn.mo44126g(true) && (h = mo44127h(true)) == zzcn.mo44127h(true)) {
                while (g != h) {
                    int j = mo44130j(g, 0, true);
                    if (j != zzcn.mo44130j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract Object mo43604f(int i);

    /* renamed from: g */
    public int mo44126g(boolean z) {
        return mo44135o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo44127h(boolean z) {
        if (mo44135o()) {
            return -1;
        }
        return mo43601c() - 1;
    }

    public final int hashCode() {
        zzcm zzcm = new zzcm();
        zzck zzck = new zzck();
        int c = mo43601c() + Opcodes.RSUB_INT_LIT8;
        for (int i = 0; i < mo43601c(); i++) {
            c = (c * 31) + mo43603e(i, zzcm, 0).hashCode();
        }
        int b = (c * 31) + mo43600b();
        for (int i2 = 0; i2 < mo43600b(); i2++) {
            b = (b * 31) + mo43602d(i2, zzck, true).hashCode();
        }
        int g = mo44126g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = mo44130j(g, 0, true);
        }
        return b;
    }

    /* renamed from: i */
    public final int mo44129i(int i, zzck zzck, zzcm zzcm, int i2, boolean z) {
        int i3 = mo43602d(i, zzck, false).f28721c;
        if (mo43603e(i3, zzcm, 0).f28948n != i) {
            return i + 1;
        }
        int j = mo44130j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return mo43603e(j, zzcm, 0).f28947m;
    }

    /* renamed from: j */
    public int mo44130j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo44127h(z) ? mo44126g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo44127h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: k */
    public int mo44131k(int i, int i2, boolean z) {
        if (i == mo44126g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: l */
    public final Pair mo44132l(zzcm zzcm, zzck zzck, int i, long j) {
        Pair m = mo44133m(zzcm, zzck, i, j, 0);
        Objects.requireNonNull(m);
        return m;
    }

    @Nullable
    /* renamed from: m */
    public final Pair mo44133m(zzcm zzcm, zzck zzck, int i, long j, long j2) {
        zzdd.m47207a(i, 0, mo43601c());
        mo43603e(i, zzcm, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzcm.f28945k;
            j = 0;
        }
        int i2 = zzcm.f28947m;
        mo43602d(i2, zzck, false);
        while (i2 < zzcm.f28948n) {
            long j4 = zzck.f28723e;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = mo43602d(i4, zzck, false).f28723e;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        mo43602d(i2, zzck, true);
        long j6 = zzck.f28723e;
        long j7 = zzck.f28722d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = zzck.f28720b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public zzck mo44134n(Object obj, zzck zzck) {
        return mo43602d(mo43599a(obj), zzck, true);
    }

    /* renamed from: o */
    public final boolean mo44135o() {
        return mo43601c() == 0;
    }
}
