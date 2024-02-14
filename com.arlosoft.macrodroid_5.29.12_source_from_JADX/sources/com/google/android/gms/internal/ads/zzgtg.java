package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgtg extends zzgpw {

    /* renamed from: f */
    static final int[] f37262f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.Motion.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzgpw zzd;
    /* access modifiers changed from: private */
    public final zzgpw zze;
    private final int zzf;
    private final int zzg;

    private zzgtg(zzgpw zzgpw, zzgpw zzgpw2) {
        this.zzd = zzgpw;
        this.zze = zzgpw2;
        int m = zzgpw.mo47083m();
        this.zzf = m;
        this.zzc = m + zzgpw2.mo47083m();
        this.zzg = Math.max(zzgpw.mo47086p(), zzgpw2.mo47086p()) + 1;
    }

    /* renamed from: a0 */
    static zzgpw m53231a0(zzgpw zzgpw, zzgpw zzgpw2) {
        if (zzgpw2.mo47083m() == 0) {
            return zzgpw;
        }
        if (zzgpw.mo47083m() == 0) {
            return zzgpw2;
        }
        int m = zzgpw.mo47083m() + zzgpw2.mo47083m();
        if (m < 128) {
            return m53232b0(zzgpw, zzgpw2);
        }
        if (zzgpw instanceof zzgtg) {
            zzgtg zzgtg = (zzgtg) zzgpw;
            if (zzgtg.zze.mo47083m() + zzgpw2.mo47083m() < 128) {
                return new zzgtg(zzgtg.zzd, m53232b0(zzgtg.zze, zzgpw2));
            } else if (zzgtg.zzd.mo47086p() > zzgtg.zze.mo47086p() && zzgtg.zzg > zzgpw2.mo47086p()) {
                return new zzgtg(zzgtg.zzd, new zzgtg(zzgtg.zze, zzgpw2));
            }
        }
        if (m >= m53233d0(Math.max(zzgpw.mo47086p(), zzgpw2.mo47086p()) + 1)) {
            return new zzgtg(zzgpw, zzgpw2);
        }
        return zzgtc.m53225a(new zzgtc((zzgtb) null), zzgpw, zzgpw2);
    }

    /* renamed from: b0 */
    private static zzgpw m53232b0(zzgpw zzgpw, zzgpw zzgpw2) {
        int m = zzgpw.mo47083m();
        int m2 = zzgpw2.mo47083m();
        byte[] bArr = new byte[(m + m2)];
        zzgpw.mo47106f(bArr, 0, 0, m);
        zzgpw2.mo47106f(bArr, 0, m, m2);
        return new zzgps(bArr);
    }

    /* renamed from: d0 */
    static int m53233d0(int i) {
        int[] iArr = f37262f;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo47088B(Charset charset) {
        return new String(mo47109i(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo47090F(zzgpl zzgpl) throws IOException {
        this.zzd.mo47090F(zzgpl);
        this.zze.mo47090F(zzgpl);
    }

    /* renamed from: I */
    public final boolean mo47091I() {
        int u = this.zzd.mo47094u(0, 0, this.zzf);
        zzgpw zzgpw = this.zze;
        if (zzgpw.mo47094u(u, 0, zzgpw.mo47083m()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final zzgpq mo47104O() {
        return new zzgta(this);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpw)) {
            return false;
        }
        zzgpw zzgpw = (zzgpw) obj;
        if (this.zzc != zzgpw.mo47083m()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int M = mo47103M();
        int M2 = zzgpw.mo47103M();
        if (M != 0 && M2 != 0 && M != M2) {
            return false;
        }
        zzgte zzgte = new zzgte(this, (zzgtd) null);
        zzgpr a = zzgte.next();
        zzgte zzgte2 = new zzgte(zzgpw, (zzgtd) null);
        zzgpr a2 = zzgte2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int m = a.mo47083m() - i;
            int m2 = a2.mo47083m() - i2;
            int min = Math.min(m, m2);
            if (i == 0) {
                z = a.mo47085Y(a2, i2, min);
            } else {
                z = a2.mo47085Y(a, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 < i4) {
                if (min == m) {
                    a = zzgte.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == m2) {
                    a2 = zzgte2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgta(this);
    }

    /* renamed from: j */
    public final byte mo47081j(int i) {
        zzgpw.m52569d(i, this.zzc);
        return mo47082k(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final byte mo47082k(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.mo47082k(i);
        }
        return this.zze.mo47082k(i - i2);
    }

    /* renamed from: m */
    public final int mo47083m() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo47084n(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.mo47084n(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.mo47084n(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.mo47084n(bArr, i, i2, i5);
            this.zze.mo47084n(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo47086p() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo47087q() {
        return this.zzc >= m53233d0(this.zzg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo47093t(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.mo47093t(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.mo47093t(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.mo47093t(this.zzd.mo47093t(i, i2, i5), 0, i3 - i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo47094u(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.mo47094u(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.mo47094u(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.mo47094u(this.zzd.mo47094u(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: w */
    public final zzgpw mo47095w(int i, int i2) {
        int J = zzgpw.m52561J(i, i2, this.zzc);
        if (J == 0) {
            return zzgpw.f37012a;
        }
        if (J == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.mo47095w(i, i2);
        }
        if (i >= i3) {
            return this.zze.mo47095w(i - i3, i2 - i3);
        }
        zzgpw zzgpw = this.zzd;
        return new zzgtg(zzgpw.mo47095w(i, zzgpw.mo47083m()), this.zze.mo47095w(0, i2 - this.zzf));
    }

    /* renamed from: z */
    public final zzgqe mo47096z() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        zzgte zzgte = new zzgte(this, (zzgtd) null);
        while (zzgte.hasNext()) {
            arrayList.add(zzgte.next().mo47089D());
        }
        int i = zzgqe.f37047e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgqa(arrayList, i2, true, (zzgpz) null);
        }
        return zzgqe.m52705g(new zzgrr(arrayList), 4096);
    }
}
