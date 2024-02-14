package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzgps extends zzgpr {
    protected final byte[] zza;

    zzgps(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo47088B(Charset charset) {
        return new String(this.zza, mo47080a0(), mo47083m(), charset);
    }

    /* renamed from: D */
    public final ByteBuffer mo47089D() {
        return ByteBuffer.wrap(this.zza, mo47080a0(), mo47083m()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo47090F(zzgpl zzgpl) throws IOException {
        zzgpl.mo47074a(this.zza, mo47080a0(), mo47083m());
    }

    /* renamed from: I */
    public final boolean mo47091I() {
        int a0 = mo47080a0();
        return zzgun.m53479j(this.zza, a0, mo47083m() + a0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean mo47085Y(zzgpw zzgpw, int i, int i2) {
        if (i2 <= zzgpw.mo47083m()) {
            int i3 = i + i2;
            if (i3 > zzgpw.mo47083m()) {
                int m = zzgpw.mo47083m();
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + m);
            } else if (!(zzgpw instanceof zzgps)) {
                return zzgpw.mo47095w(i, i3).equals(mo47095w(0, i2));
            } else {
                zzgps zzgps = (zzgps) zzgpw;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzgps.zza;
                int a0 = mo47080a0() + i2;
                int a02 = mo47080a0();
                int a03 = zzgps.mo47080a0() + i;
                while (a02 < a0) {
                    if (bArr[a02] != bArr2[a03]) {
                        return false;
                    }
                    a02++;
                    a03++;
                }
                return true;
            }
        } else {
            int m2 = mo47083m();
            throw new IllegalArgumentException("Length too large: " + i2 + m2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public int mo47080a0() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpw) || mo47083m() != ((zzgpw) obj).mo47083m()) {
            return false;
        }
        if (mo47083m() == 0) {
            return true;
        }
        if (!(obj instanceof zzgps)) {
            return obj.equals(this);
        }
        zzgps zzgps = (zzgps) obj;
        int M = mo47103M();
        int M2 = zzgps.mo47103M();
        if (M == 0 || M2 == 0 || M == M2) {
            return mo47085Y(zzgps, 0, mo47083m());
        }
        return false;
    }

    /* renamed from: j */
    public byte mo47081j(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public byte mo47082k(int i) {
        return this.zza[i];
    }

    /* renamed from: m */
    public int mo47083m() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo47084n(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo47093t(int i, int i2, int i3) {
        return zzgro.m53026d(i, this.zza, mo47080a0() + i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo47094u(int i, int i2, int i3) {
        int a0 = mo47080a0() + i2;
        return zzgun.m53475f(i, this.zza, a0, i3 + a0);
    }

    /* renamed from: w */
    public final zzgpw mo47095w(int i, int i2) {
        int J = zzgpw.m52561J(i, i2, mo47083m());
        if (J == 0) {
            return zzgpw.f37012a;
        }
        return new zzgpp(this.zza, mo47080a0() + i, J);
    }

    /* renamed from: z */
    public final zzgqe mo47096z() {
        return zzgqe.m52706h(this.zza, mo47080a0(), mo47083m(), true);
    }
}
