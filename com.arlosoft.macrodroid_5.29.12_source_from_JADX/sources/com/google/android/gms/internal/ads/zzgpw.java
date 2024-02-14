package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgpw implements Iterable, Serializable {

    /* renamed from: a */
    public static final zzgpw f37012a = new zzgps(zzgro.f37164d);

    /* renamed from: c */
    private static final Comparator f37013c = new zzgpn();

    /* renamed from: d */
    private static final zzgpv f37014d = new zzgpv((zzgpu) null);
    private int zzc = 0;

    static {
        int i = zzgph.f36995a;
    }

    zzgpw() {
    }

    /* renamed from: J */
    static int m52561J(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: P */
    public static zzgpt m52562P() {
        return new zzgpt(128);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzgpw m52563Q(java.lang.Iterable r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzgpw r3 = f37012a
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.zzgpw r3 = m52570l(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpw.m52563Q(java.lang.Iterable):com.google.android.gms.internal.ads.zzgpw");
    }

    /* renamed from: R */
    public static zzgpw m52564R(byte[] bArr) {
        return m52565T(bArr, 0, bArr.length);
    }

    /* renamed from: T */
    public static zzgpw m52565T(byte[] bArr, int i, int i2) {
        m52561J(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgps(bArr2);
    }

    /* renamed from: V */
    public static zzgpw m52566V(String str) {
        return new zzgps(str.getBytes(zzgro.f37162b));
    }

    /* renamed from: W */
    public static zzgpw m52567W(InputStream inputStream) throws IOException {
        zzgpw zzgpw;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zzgpw = null;
            } else {
                zzgpw = m52565T(bArr, 0, i2);
            }
            if (zzgpw == null) {
                return m52563Q(arrayList);
            }
            arrayList.add(zzgpw);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: X */
    static zzgpw m52568X(byte[] bArr) {
        return new zzgps(bArr);
    }

    /* renamed from: d */
    static void m52569d(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: l */
    private static zzgpw m52570l(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (zzgpw) it.next();
        } else {
            int i2 = i >>> 1;
            zzgpw l = m52570l(it, i2);
            zzgpw l2 = m52570l(it, i - i2);
            if (Integer.MAX_VALUE - l.mo47083m() >= l2.mo47083m()) {
                return zzgtg.m53231a0(l, l2);
            }
            int m = l.mo47083m();
            int m2 = l2.mo47083m();
            throw new IllegalArgumentException("ByteString would be too long: " + m + "+" + m2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract String mo47088B(Charset charset);

    /* renamed from: D */
    public abstract ByteBuffer mo47089D();

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo47090F(zzgpl zzgpl) throws IOException;

    /* renamed from: I */
    public abstract boolean mo47091I();

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final int mo47103M() {
        return this.zzc;
    }

    /* renamed from: O */
    public zzgpq iterator() {
        return new zzgpm(this);
    }

    /* renamed from: c */
    public final String mo47105c(Charset charset) {
        return mo47083m() == 0 ? "" : mo47088B(charset);
    }

    public abstract boolean equals(Object obj);

    @Deprecated
    /* renamed from: f */
    public final void mo47106f(byte[] bArr, int i, int i2, int i3) {
        m52561J(0, i3, mo47083m());
        m52561J(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo47084n(bArr, 0, i2, i3);
        }
    }

    /* renamed from: h */
    public final boolean mo47107h() {
        return mo47083m() == 0;
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int m = mo47083m();
            i = mo47093t(m, 0, m);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* renamed from: i */
    public final byte[] mo47109i() {
        int m = mo47083m();
        if (m == 0) {
            return zzgro.f37164d;
        }
        byte[] bArr = new byte[m];
        mo47084n(bArr, 0, 0, m);
        return bArr;
    }

    /* renamed from: j */
    public abstract byte mo47081j(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract byte mo47082k(int i);

    /* renamed from: m */
    public abstract int mo47083m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo47084n(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo47086p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract boolean mo47087q();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo47093t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo47083m());
        objArr[2] = mo47083m() <= 50 ? zzgtw.m53335a(this) : zzgtw.m53335a(mo47095w(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo47094u(int i, int i2, int i3);

    /* renamed from: w */
    public abstract zzgpw mo47095w(int i, int i2);

    /* renamed from: z */
    public abstract zzgqe mo47096z();
}
