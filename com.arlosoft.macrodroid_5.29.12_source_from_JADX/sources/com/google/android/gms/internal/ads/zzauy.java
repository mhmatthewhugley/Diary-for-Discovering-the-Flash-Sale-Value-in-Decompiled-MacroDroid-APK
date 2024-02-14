package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzauy {

    /* renamed from: g */
    private static final byte[] f25724g = new byte[4096];

    /* renamed from: a */
    private final zzazm f25725a;

    /* renamed from: b */
    private final long f25726b;

    /* renamed from: c */
    private long f25727c;

    /* renamed from: d */
    private byte[] f25728d = new byte[65536];

    /* renamed from: e */
    private int f25729e;

    /* renamed from: f */
    private int f25730f;

    public zzauy(zzazm zzazm, long j, long j2) {
        this.f25725a = zzazm;
        this.f25727c = j;
        this.f25726b = j2;
    }

    /* renamed from: j */
    private final int m42561j(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int e = this.f25725a.mo42283e(bArr, i + i3, i2 - i3);
            if (e != -1) {
                return i3 + e;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: k */
    private final int m42562k(byte[] bArr, int i, int i2) {
        int i3 = this.f25730f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f25728d, 0, bArr, i, min);
        m42565n(min);
        return min;
    }

    /* renamed from: l */
    private final int m42563l(int i) {
        int min = Math.min(this.f25730f, i);
        m42565n(min);
        return min;
    }

    /* renamed from: m */
    private final void m42564m(int i) {
        if (i != -1) {
            this.f25727c += (long) i;
        }
    }

    /* renamed from: n */
    private final void m42565n(int i) {
        int i2 = this.f25730f - i;
        this.f25730f = i2;
        this.f25729e = 0;
        byte[] bArr = this.f25728d;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f25728d = bArr2;
    }

    /* renamed from: a */
    public final int mo42093a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int k = m42562k(bArr, i, i2);
        if (k == 0) {
            k = m42561j(bArr, i, i2, 0, true);
        }
        m42564m(k);
        return k;
    }

    /* renamed from: b */
    public final int mo42094b(int i) throws IOException, InterruptedException {
        int l = m42563l(i);
        if (l == 0) {
            l = m42561j(f25724g, 0, Math.min(i, 4096), 0, true);
        }
        m42564m(l);
        return l;
    }

    /* renamed from: c */
    public final long mo42095c() {
        return this.f25726b;
    }

    /* renamed from: d */
    public final long mo42096d() {
        return this.f25727c;
    }

    /* renamed from: e */
    public final void mo42097e() {
        this.f25729e = 0;
    }

    /* renamed from: f */
    public final boolean mo42098f(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f25729e + i;
        int length = this.f25728d.length;
        if (i2 > length) {
            this.f25728d = Arrays.copyOf(this.f25728d, zzbar.m42989e(length + length, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f25730f - this.f25729e, i);
        while (min < i) {
            min = m42561j(this.f25728d, this.f25729e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f25729e + i;
        this.f25729e = i3;
        this.f25730f = Math.max(this.f25730f, i3);
        return true;
    }

    /* renamed from: g */
    public final boolean mo42099g(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo42098f(i2, false)) {
            return false;
        }
        System.arraycopy(this.f25728d, this.f25729e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: h */
    public final boolean mo42100h(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int k = m42562k(bArr, i, i2);
        while (k < i2 && k != -1) {
            k = m42561j(bArr, i, i2, k, z);
        }
        m42564m(k);
        return k != -1;
    }

    /* renamed from: i */
    public final boolean mo42101i(int i, boolean z) throws IOException, InterruptedException {
        int l = m42563l(i);
        while (l < i && l != -1) {
            l = m42561j(f25724g, -l, Math.min(i, l + 4096), l, false);
        }
        m42564m(l);
        return l != -1;
    }
}
