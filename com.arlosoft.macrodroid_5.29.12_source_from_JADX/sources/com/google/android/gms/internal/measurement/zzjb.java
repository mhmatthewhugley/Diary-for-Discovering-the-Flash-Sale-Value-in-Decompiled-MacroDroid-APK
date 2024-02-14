package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
class zzjb extends zzja {
    protected final byte[] zza;

    zzjb(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    /* renamed from: c */
    public byte mo51334c(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte mo51335d(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzje) || mo51336f() != ((zzje) obj).mo51336f()) {
            return false;
        }
        if (mo51336f() == 0) {
            return true;
        }
        if (!(obj instanceof zzjb)) {
            return obj.equals(this);
        }
        zzjb zzjb = (zzjb) obj;
        int n = mo51347n();
        int n2 = zzjb.mo51347n();
        if (n != 0 && n2 != 0 && n != n2) {
            return false;
        }
        int f = mo51336f();
        if (f > zzjb.mo51336f()) {
            int f2 = mo51336f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= zzjb.mo51336f()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzjb.zza;
            zzjb.mo51337u();
            int i = 0;
            int i2 = 0;
            while (i < f) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int f3 = zzjb.mo51336f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo51336f() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo51340h(int i, int i2, int i3) {
        return zzkn.m60541d(i, this.zza, 0, i3);
    }

    /* renamed from: i */
    public final zzje mo51341i(int i, int i2) {
        int m = zzje.m60357m(0, i2, mo51336f());
        if (m == 0) {
            return zzje.f41539a;
        }
        return new zziy(this.zza, 0, m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo51342j(Charset charset) {
        return new String(this.zza, 0, mo51336f(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo51343k(zziu zziu) throws IOException {
        ((zzjj) zziu).mo51351E(this.zza, 0, mo51336f());
    }

    /* renamed from: l */
    public final boolean mo51344l() {
        return zznd.m60886f(this.zza, 0, mo51336f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo51337u() {
        return 0;
    }
}
