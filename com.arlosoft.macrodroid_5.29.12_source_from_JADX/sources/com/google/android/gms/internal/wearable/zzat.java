package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
class zzat extends zzas {
    protected final byte[] zza;

    zzat(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    /* renamed from: c */
    public byte mo53829c(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte mo53830d(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaw) || mo53831f() != ((zzaw) obj).mo53831f()) {
            return false;
        }
        if (mo53831f() == 0) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return obj.equals(this);
        }
        zzat zzat = (zzat) obj;
        int n = mo53841n();
        int n2 = zzat.mo53841n();
        if (n != 0 && n2 != 0 && n != n2) {
            return false;
        }
        int f = mo53831f();
        if (f > zzat.mo53831f()) {
            int f2 = mo53831f();
            throw new IllegalArgumentException("Length too large: " + f + f2);
        } else if (f <= zzat.mo53831f()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzat.zza;
            zzat.mo53832w();
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
            int f3 = zzat.mo53831f();
            throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
        }
    }

    /* renamed from: f */
    public int mo53831f() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo53834h(int i, int i2, int i3) {
        return zzcd.m64225d(i, this.zza, 0, i3);
    }

    /* renamed from: i */
    public final zzaw mo53835i(int i, int i2) {
        int m = zzaw.m64052m(0, i2, mo53831f());
        if (m == 0) {
            return zzaw.f45541a;
        }
        return new zzaq(this.zza, 0, m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo53836j(Charset charset) {
        return new String(this.zza, 0, mo53831f(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo53837k(zzam zzam) throws IOException {
        ((zzbb) zzam).mo53848E(this.zza, 0, mo53831f());
    }

    /* renamed from: l */
    public final boolean mo53838l() {
        return zzet.m64522e(this.zza, 0, mo53831f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo53832w() {
        return 0;
    }
}
