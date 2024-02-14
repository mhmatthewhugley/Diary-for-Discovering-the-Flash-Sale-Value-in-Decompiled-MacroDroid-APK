package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzts {

    /* renamed from: a */
    private final zzef f38566a = new zzef(32);

    /* renamed from: b */
    private zztr f38567b;

    /* renamed from: c */
    private zztr f38568c;

    /* renamed from: d */
    private zztr f38569d;

    /* renamed from: e */
    private long f38570e;

    /* renamed from: f */
    private final zzwi f38571f;

    public zzts(zzwi zzwi, byte[] bArr) {
        this.f38571f = zzwi;
        zztr zztr = new zztr(0, 65536);
        this.f38567b = zztr;
        this.f38568c = zztr;
        this.f38569d = zztr;
    }

    /* renamed from: i */
    private final int m55061i(int i) {
        zztr zztr = this.f38569d;
        if (zztr.f38564c == null) {
            zzwb b = this.f38571f.mo48339b();
            zztr zztr2 = new zztr(this.f38569d.f38563b, 65536);
            zztr.f38564c = b;
            zztr.f38565d = zztr2;
        }
        return Math.min(i, (int) (this.f38569d.f38563b - this.f38570e));
    }

    /* renamed from: j */
    private static zztr m55062j(zztr zztr, long j) {
        while (j >= zztr.f38563b) {
            zztr = zztr.f38565d;
        }
        return zztr;
    }

    /* renamed from: k */
    private static zztr m55063k(zztr zztr, long j, ByteBuffer byteBuffer, int i) {
        zztr j2 = m55062j(zztr, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.f38563b - j));
            byteBuffer.put(j2.f38564c.f38766a, j2.mo48218b(j), min);
            i -= min;
            j += (long) min;
            if (j == j2.f38563b) {
                j2 = j2.f38565d;
            }
        }
        return j2;
    }

    /* renamed from: l */
    private static zztr m55064l(zztr zztr, long j, byte[] bArr, int i) {
        zztr j2 = m55062j(zztr, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.f38563b - j));
            System.arraycopy(j2.f38564c.f38766a, j2.mo48218b(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == j2.f38563b) {
                j2 = j2.f38565d;
            }
        }
        return j2;
    }

    /* renamed from: m */
    private static zztr m55065m(zztr zztr, zzgi zzgi, zztu zztu, zzef zzef) {
        zztr zztr2;
        int i;
        zzgi zzgi2 = zzgi;
        zztu zztu2 = zztu;
        zzef zzef2 = zzef;
        if (zzgi.mo46832k()) {
            long j = zztu2.f38574b;
            zzef2.mo45227c(1);
            zztr l = m55064l(zztr, j, zzef.mo45232h(), 1);
            long j2 = j + 1;
            byte b = zzef.mo45232h()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            zzgf zzgf = zzgi2.f36860b;
            byte[] bArr = zzgf.f36756a;
            if (bArr == null) {
                zzgf.f36756a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztr2 = m55064l(l, j2, zzgf.f36756a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                zzef2.mo45227c(2);
                zztr2 = m55064l(zztr2, j3, zzef.mo45232h(), 2);
                j3 += 2;
                i = zzef.mo45247w();
            } else {
                i = 1;
            }
            int[] iArr = zzgf.f36759d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgf.f36760e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                zzef2.mo45227c(i2);
                zztr2 = m55064l(zztr2, j3, zzef.mo45232h(), i2);
                j3 += (long) i2;
                zzef2.mo45230f(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = zzef.mo45247w();
                    iArr4[i3] = zzef.mo45246v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztu2.f38573a - ((int) (j3 - zztu2.f38574b));
            }
            zzaao zzaao = zztu2.f38575c;
            int i4 = zzen.f34500a;
            zzgf.mo46770c(i, iArr2, iArr4, zzaao.f23742b, zzgf.f36756a, zzaao.f23741a, zzaao.f23743c, zzaao.f23744d);
            long j4 = zztu2.f38574b;
            int i5 = (int) (j3 - j4);
            zztu2.f38574b = j4 + ((long) i5);
            zztu2.f38573a -= i5;
        } else {
            zztr2 = zztr;
        }
        if (zzgi.mo46723e()) {
            zzef2.mo45227c(4);
            zztr l2 = m55064l(zztr2, zztu2.f38574b, zzef.mo45232h(), 4);
            int v = zzef.mo45246v();
            zztu2.f38574b += 4;
            zztu2.f38573a -= 4;
            zzgi2.mo46830i(v);
            zztr k = m55063k(l2, zztu2.f38574b, zzgi2.f36861c, v);
            zztu2.f38574b += (long) v;
            int i6 = zztu2.f38573a - v;
            zztu2.f38573a = i6;
            ByteBuffer byteBuffer = zzgi2.f36864f;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                zzgi2.f36864f = ByteBuffer.allocate(i6);
            } else {
                zzgi2.f36864f.clear();
            }
            return m55063k(k, zztu2.f38574b, zzgi2.f36864f, zztu2.f38573a);
        }
        zzgi2.mo46830i(zztu2.f38573a);
        return m55063k(zztr2, zztu2.f38574b, zzgi2.f36861c, zztu2.f38573a);
    }

    /* renamed from: n */
    private final void m55066n(int i) {
        long j = this.f38570e + ((long) i);
        this.f38570e = j;
        zztr zztr = this.f38569d;
        if (j == zztr.f38563b) {
            this.f38569d = zztr.f38565d;
        }
    }

    /* renamed from: a */
    public final int mo48222a(zzr zzr, int i, boolean z) throws IOException {
        int i2 = m55061i(i);
        zztr zztr = this.f38569d;
        int e = zzr.mo43927e(zztr.f38564c.f38766a, zztr.mo48218b(this.f38570e), i2);
        if (e != -1) {
            m55066n(e);
            return e;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final long mo48223b() {
        return this.f38570e;
    }

    /* renamed from: c */
    public final void mo48224c(long j) {
        zztr zztr;
        if (j != -1) {
            while (true) {
                zztr = this.f38567b;
                if (j < zztr.f38563b) {
                    break;
                }
                this.f38571f.mo48340c(zztr.f38564c);
                this.f38567b = this.f38567b.mo48219c();
            }
            if (this.f38568c.f38562a < zztr.f38562a) {
                this.f38568c = zztr;
            }
        }
    }

    /* renamed from: d */
    public final void mo48225d(zzgi zzgi, zztu zztu) {
        m55065m(this.f38568c, zzgi, zztu, this.f38566a);
    }

    /* renamed from: e */
    public final void mo48226e(zzgi zzgi, zztu zztu) {
        this.f38568c = m55065m(this.f38568c, zzgi, zztu, this.f38566a);
    }

    /* renamed from: f */
    public final void mo48227f() {
        zztr zztr = this.f38567b;
        if (zztr.f38564c != null) {
            this.f38571f.mo48341d(zztr);
            zztr.mo48219c();
        }
        this.f38567b.mo48221e(0, 65536);
        zztr zztr2 = this.f38567b;
        this.f38568c = zztr2;
        this.f38569d = zztr2;
        this.f38570e = 0;
        this.f38571f.mo48344g();
    }

    /* renamed from: g */
    public final void mo48228g() {
        this.f38568c = this.f38567b;
    }

    /* renamed from: h */
    public final void mo48229h(zzef zzef, int i) {
        while (i > 0) {
            int i2 = m55061i(i);
            zztr zztr = this.f38569d;
            zzef.mo45226b(zztr.f38564c.f38766a, zztr.mo48218b(this.f38570e), i2);
            i -= i2;
            m55066n(i2);
        }
    }
}
